package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbm implements esrw {
    private static final fbrb a;
    private ListenableFuture b;
    private final dtbl c;

    static {
        fbqx fbqxVar = fbrg.c;
        int i = fbrb.d;
        a = new fbqw("Cookie", fbqxVar);
    }

    public dtbm(dtbl dtblVar) {
        dtblVar.getClass();
        this.c = dtblVar;
    }

    @Override // defpackage.esrw
    public final estb a(esrs esrsVar) {
        ListenableFuture listenableFuture = this.b;
        if (listenableFuture != null) {
            try {
                Object objQ = eork.q(listenableFuture);
                objQ.getClass();
                String str = (String) objQ;
                if (!fdbq.f(str, "")) {
                    esrsVar.a.h(a, a.v(str, "NID="));
                }
            } catch (Exception unused) {
            }
        }
        return estb.a;
    }

    @Override // defpackage.esrw
    public final estb b(esrs esrsVar) {
        ListenableFuture listenableFutureA = this.c.a();
        this.b = listenableFutureA;
        return estb.c(listenableFutureA);
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb c() {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final /* synthetic */ estb e() {
        return estb.a;
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.esrw
    public final /* synthetic */ void d(esrr esrrVar) {
    }
}
