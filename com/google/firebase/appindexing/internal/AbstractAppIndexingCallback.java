package com.google.firebase.appindexing.internal;

import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.IAppIndexingCallback;
import defpackage.esao;
import defpackage.esbm;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class AbstractAppIndexingCallback extends IAppIndexingCallback.Stub {
    @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
    public void onGet(Status status, List<Thing> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
    public void onGetIndexableResponse(esbm esbmVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
    public void onSearch(Status status, esao[] esaoVarArr) {
        throw new UnsupportedOperationException();
    }
}
