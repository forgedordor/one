package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjd {
    public bit a = null;
    private final Executor b;
    private final ana c;

    public bjd(Executor executor, ana anaVar) {
        this.b = executor;
        this.c = anaVar;
    }

    public final bit a(bit bitVar) {
        bit bitVar2 = this.a;
        this.a = bitVar;
        return bitVar2;
    }

    public final void b() {
        try {
            Executor executor = this.b;
            final ana anaVar = this.c;
            anaVar.getClass();
            executor.execute(new Runnable() { // from class: bjc
                @Override // java.lang.Runnable
                public final void run() {
                    anm anmVar = anaVar.b;
                    if (anmVar.A == 4 || anmVar.A == 5) {
                        anmVar.D(false);
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            bbs.d("CameraStateRegistry", "Unable to notify camera to open.", e);
        }
    }
}
