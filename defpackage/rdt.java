package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdt extends fcyz implements fdat {
    int a;
    final /* synthetic */ rdx b;
    final /* synthetic */ rbr c;
    final /* synthetic */ rbv d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdt(rdx rdxVar, rbr rbrVar, rbv rbvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = rdxVar;
        this.c = rbrVar;
        this.d = rbvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((rdt) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdos fdosVar = (fdos) this.e;
            final rdr rdrVar = new rdr(fdosVar, this.b);
            rbr rbrVar = this.c;
            rbrVar.u(rdrVar, rdrVar, rbrVar, new Executor() { // from class: rbf
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            });
            final rbv rbvVar = this.d;
            fdae fdaeVar = new fdae() { // from class: rds
                @Override // defpackage.fdae
                public final Object invoke() {
                    rbvVar.l(rdrVar);
                    return fctx.a;
                }
            };
            this.a = 1;
            if (fdor.b(fdosVar, fdaeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        rdt rdtVar = new rdt(this.b, this.c, this.d, fcxyVar);
        rdtVar.e = obj;
        return rdtVar;
    }
}
