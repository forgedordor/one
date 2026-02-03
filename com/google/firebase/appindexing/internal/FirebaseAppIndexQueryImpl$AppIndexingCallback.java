package com.google.firebase.appindexing.internal;

import com.google.android.gms.common.api.Status;
import defpackage.defr;
import defpackage.esbm;
import defpackage.esbw;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseAppIndexQueryImpl$AppIndexingCallback<R> extends AbstractAppIndexingCallback {
    private final defr a;
    private final Class b;

    public FirebaseAppIndexQueryImpl$AppIndexingCallback(defr<R> defrVar, Class<R> cls) {
        this.a = defrVar;
        this.b = cls;
    }

    @Override // com.google.firebase.appindexing.internal.AbstractAppIndexingCallback, com.google.firebase.appindexing.internal.IAppIndexingCallback
    public void onGetIndexableResponse(esbm esbmVar) {
        Thing thing;
        Status status = esbmVar.a;
        if (status.d() && ((thing = esbmVar.b) == null || this.b.isInstance(thing))) {
            this.a.b(this.b.cast(thing));
        } else {
            this.a.a(esbw.a(status, "GetIndexable error, please try again."));
        }
    }
}
