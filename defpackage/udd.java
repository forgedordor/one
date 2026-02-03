package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udd {
    private final udk a;

    public udd(fcsu fcsuVar, Executor executor) {
        fcsuVar.getClass();
        executor.getClass();
        this.a = new udk(fcsuVar, new udg(ellf.BUGLE_ADD_CONTACT), executor);
    }

    public final void a(final int i) {
        if (i == 0) {
            throw null;
        }
        this.a.b(new fdap() { // from class: udc
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                elgq elgqVar = (elgq) obj;
                elgqVar.getClass();
                elgqVar.a(i);
                elgqVar.b(3);
                return fctx.a;
            }
        });
    }
}
