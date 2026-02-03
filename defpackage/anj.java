package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anj implements Runnable {
    public boolean a = false;
    final /* synthetic */ ank b;
    private final Executor c;

    public anj(ank ankVar, Executor executor) {
        this.b = ankVar;
        this.c = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.execute(new Runnable() { // from class: ani
            @Override // java.lang.Runnable
            public final void run() {
                anj anjVar = this.a;
                if (anjVar.a) {
                    return;
                }
                ank ankVar = anjVar.b;
                anm anmVar = ankVar.b;
                lcg.c(anmVar.A == 8 || anmVar.A == 7);
                if (ankVar.d()) {
                    anmVar.C(true);
                } else {
                    anmVar.D(true);
                }
            }
        });
    }
}
