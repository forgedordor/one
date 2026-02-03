package com.android.vcard;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardEntryCommitter implements VCardEntryHandler {
    public static final String LOG_TAG = "vCard";
    private final ContentResolver mContentResolver;
    private int mCounter;
    private final ArrayList<Uri> mCreatedUris = new ArrayList<>();
    private ArrayList<ContentProviderOperation> mOperationList;
    private long mTimeToCommit;

    public VCardEntryCommitter(ContentResolver contentResolver) {
        this.mContentResolver = contentResolver;
    }

    private Uri pushIntoContentResolver(ArrayList<ContentProviderOperation> arrayList) throws RemoteException, OperationApplicationException {
        ContentProviderResult contentProviderResult;
        try {
            ContentProviderResult[] contentProviderResultArrApplyBatch = this.mContentResolver.applyBatch("com.android.contacts", arrayList);
            if (contentProviderResultArrApplyBatch == null || contentProviderResultArrApplyBatch.length == 0 || (contentProviderResult = contentProviderResultArrApplyBatch[0]) == null) {
                return null;
            }
            return contentProviderResult.uri;
        } catch (OperationApplicationException | RemoteException e) {
            Log.e(LOG_TAG, String.format("%s: %s", e, e.getMessage()));
            return null;
        }
    }

    public ArrayList<Uri> getCreatedUris() {
        return this.mCreatedUris;
    }

    @Override // com.android.vcard.VCardEntryHandler
    public void onEnd() {
        ArrayList<ContentProviderOperation> arrayList = this.mOperationList;
        if (arrayList != null) {
            this.mCreatedUris.add(pushIntoContentResolver(arrayList));
        }
        String str = VCardConfig.DEFAULT_INTERMEDIATE_CHARSET;
    }

    @Override // com.android.vcard.VCardEntryHandler
    public void onEntryCreated(VCardEntry vCardEntry) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<ContentProviderOperation> arrayListConstructInsertOperations = vCardEntry.constructInsertOperations(this.mContentResolver, this.mOperationList);
        this.mOperationList = arrayListConstructInsertOperations;
        int i = this.mCounter + 1;
        this.mCounter = i;
        if (i >= 20) {
            this.mCreatedUris.add(pushIntoContentResolver(arrayListConstructInsertOperations));
            this.mCounter = 0;
            this.mOperationList = null;
        }
        this.mTimeToCommit += System.currentTimeMillis() - jCurrentTimeMillis;
    }

    @Override // com.android.vcard.VCardEntryHandler
    public void onStart() {
    }
}
