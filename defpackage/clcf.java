package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clcf implements cqae {
    final eygg a;
    public final Executor b;
    boolean c = false;
    boolean d = false;

    public clcf(eygg eyggVar, eosc eoscVar) {
        this.a = eyggVar;
        this.b = new eoss(eoscVar);
    }

    @Override // defpackage.cqae
    public final void a() {
        auvh.h(eijx.f(new Runnable() { // from class: clce
            @Override // java.lang.Runnable
            public final void run() {
                clcf clcfVar = this.a;
                clcfVar.d = true;
                if (clcfVar.c) {
                    ((clds) clcfVar.a.b()).a();
                }
            }
        }, this.b));
    }

    @Override // defpackage.cqae
    public final void b() {
        auvh.h(eijx.f(new Runnable() { // from class: clcb
            @Override // java.lang.Runnable
            public final void run() {
                clcf clcfVar = this.a;
                clcfVar.d = false;
                if (clcfVar.c) {
                    ((clds) clcfVar.a.b()).b();
                }
            }
        }, this.b));
    }
}
