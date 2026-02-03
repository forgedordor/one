package com.google.android.gms.learning.internal;

import android.util.Log;
import com.google.android.gms.learning.internal.IExampleStoreIteratorV2;
import defpackage.ddix;
import defpackage.ddkb;
import defpackage.ejwl;
import defpackage.ejya;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ExampleStoreQueryCallbackImpl$IteratorAdapter extends IExampleStoreIteratorV2.Stub {
    private final ddix a;
    private final ejya b;
    private final Object c = new Object();
    private boolean d = false;

    public ExampleStoreQueryCallbackImpl$IteratorAdapter(ddix ddixVar, ejya ejyaVar) {
        this.a = ddixVar;
        this.b = ejyaVar;
    }

    @Override // com.google.android.gms.learning.internal.IExampleStoreIteratorV2
    public void close() {
        synchronized (this.c) {
            if (this.d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.close called more than once");
            } else {
                this.d = true;
                this.a.close();
            }
        }
    }

    @Override // com.google.android.gms.learning.internal.IExampleStoreIteratorV2
    public void next(IExampleStoreIteratorCallbackV2 iExampleStoreIteratorCallbackV2) {
        ejwl.a(iExampleStoreIteratorCallbackV2 != null);
        synchronized (this.c) {
            if (this.d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.next called after close");
            } else {
                this.a.a(new ddkb(this, iExampleStoreIteratorCallbackV2, this.b));
            }
        }
    }

    @Override // com.google.android.gms.learning.internal.IExampleStoreIteratorV2
    public void request(int i) {
        synchronized (this.c) {
            if (this.d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.request called after close");
            } else {
                this.a.b();
            }
        }
    }
}
