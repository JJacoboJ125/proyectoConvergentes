package com.example.lego.ui.home;

import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText = new MutableLiveData<>();;
    private final MutableLiveData<String> list = new MutableLiveData<>();;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String uid ="SaYBa1T4JvOwxoDMyqm2HLm6a113";
    CollectionReference collectionRef = db.collection("cargas");


    public HomeViewModel() {

            collectionRef.whereEqualTo("uid", uid)
                    .get()
                    .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                        @Override
                        public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                            if (!queryDocumentSnapshots.isEmpty()) {
                                for (DocumentSnapshot documentSnapshot : queryDocumentSnapshots) {
                                    String dato = documentSnapshot.getString("titulo");
                                    mText.setValue(dato);
                                }
                            } else {
                                mText.setValue("No has realizado ninguna solicitud de carga");
                            }
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                        }
                    });


    }

    public LiveData<String> getText() {
        return mText;
    }
}