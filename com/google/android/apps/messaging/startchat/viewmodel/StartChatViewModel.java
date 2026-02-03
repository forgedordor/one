package com.google.android.apps.messaging.startchat.viewmodel;

import defpackage.cqce;
import defpackage.ctjd;
import defpackage.fcsu;
import defpackage.fdjx;
import defpackage.lxd;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StartChatViewModel extends lxd {
    public static final cqce a = cqce.g("BugleContacts", "StartChatViewModel");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;

    public StartChatViewModel(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fdjx fdjxVar, fcsu fcsuVar6) throws Exception {
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        fz(new AutoCloseable() { // from class: cuej
            @Override // java.lang.AutoCloseable
            public final void close() {
                ((ajoy) this.a.d.b()).g();
            }
        });
        Object objB = fcsuVar6.b();
        objB.getClass();
        Iterator it = ((Iterable) objB).iterator();
        while (it.hasNext()) {
            ((ctjd) it.next()).a();
        }
    }
}
