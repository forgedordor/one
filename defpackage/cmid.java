package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmid implements cmir {
    final /* synthetic */ cmio a;

    public cmid(cmio cmioVar) {
        this.a = cmioVar;
    }

    @Override // defpackage.cmir
    public final eiju a() {
        cmio cmioVar = this.a;
        final cmit cmitVar = cmioVar.i;
        return eijx.f(new Runnable() { // from class: cmib
            @Override // java.lang.Runnable
            public final void run() {
                cmitVar.b();
            }
        }, cmioVar.c);
    }

    @Override // defpackage.cmir
    public final eiju b() {
        final cmio cmioVar = this.a;
        return eijx.g(new Callable() { // from class: cmic
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cmio cmioVar2 = cmioVar;
                return (evuh) cmioVar2.i.a().orElse(cmioVar2.g);
            }
        }, cmioVar.c);
    }

    @Override // defpackage.cmis
    public final void c() {
        this.a.i.c();
    }
}
