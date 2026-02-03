package com.google.android.apps.messaging.multishare.viewmodel;

import defpackage.afnd;
import defpackage.fcsu;
import defpackage.lxd;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MultiShareViewModel extends lxd {
    public final fcsu a;
    public final fcsu b;

    public MultiShareViewModel(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) throws Exception {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        fz(new AutoCloseable() { // from class: afyv
            @Override // java.lang.AutoCloseable
            public final void close() {
                ((ajoy) this.a.b.b()).g();
            }
        });
        Object objB = fcsuVar3.b();
        objB.getClass();
        Iterator it = ((Iterable) objB).iterator();
        while (it.hasNext()) {
            ((afnd) it.next()).a();
        }
    }
}
