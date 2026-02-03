package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddbm {
    public static final ddbn a = new ddbn("UdevsVerdict");
    public static final ddmm b = new ddmj();
    public final Executor c;
    public final ddag d;
    public final ddbs e;
    private final ddax f;

    public ddbm(Executor executor, ddax ddaxVar, ddag ddagVar, ddbs ddbsVar) {
        this.c = executor;
        this.f = ddaxVar;
        this.d = ddagVar;
        this.e = ddbsVar;
    }

    public static ejwi a(ejwi ejwiVar, ejwm ejwmVar) {
        return (ejwiVar.g() && ejwmVar.a(ejwiVar.c())) ? ejwiVar : ejud.a;
    }

    public final ListenableFuture b(final etzn etznVar) {
        final ddax ddaxVar = this.f;
        return eooq.f(eoqt.t(eork.n(new eooy() { // from class: ddaw
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ddaxVar.b.a.b(etznVar);
                return eorv.a;
            }
        }, ddaxVar.a)), new ejvr() { // from class: ddbh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ddbn ddbnVar = ddbm.a;
                return ejwi.j(etznVar);
            }
        }, this.c);
    }
}
