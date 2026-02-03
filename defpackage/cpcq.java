package defpackage;

import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpcq implements rfg {
    private final fcsu a;
    private final Executor b;
    private final ejha c;

    public cpcq(fcsu fcsuVar, Executor executor, ejha ejhaVar) {
        this.a = fcsuVar;
        this.b = executor;
        this.c = ejhaVar;
    }

    @Override // defpackage.rfg
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.LOCAL;
    }

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, final rff rffVar) {
        rbhVar.getClass();
        eopy eopyVarC = ((ejly) this.a.b()).c(this.c);
        final fdap fdapVar = new fdap() { // from class: cpco
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                rff rffVar2 = rffVar;
                try {
                    rffVar2.c(((eopw) obj).a());
                } catch (Exception e) {
                    rffVar2.f(e);
                }
                return fctx.a;
            }
        };
        eopyVarC.m(new eopx() { // from class: cpcp
            @Override // defpackage.eopx
            public final void a(eopw eopwVar) {
                fdapVar.invoke(eopwVar);
            }
        }, this.b);
    }

    @Override // defpackage.rfg
    public final void d() {
    }

    @Override // defpackage.rfg
    public final void e() {
    }
}
