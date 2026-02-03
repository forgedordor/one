package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbnv extends fcyz implements fdap {
    int a;
    final /* synthetic */ fduj b;
    final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbnv(fduj fdujVar, Set set, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = fdujVar;
        this.c = set;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cbnu cbnuVar = new cbnu(this.b, this.c);
            this.a = 1;
            obj = fdtc.a(cbnuVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        long jLongValue = ((Number) obj).longValue();
        cqbd cqbdVarC = cbod.a.c();
        cqbdVarC.I("At least one item in the tranche was cancelled before execution completed");
        cqbdVarC.z("workItemId", jLongValue);
        cqbdVarC.r();
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cbnv(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
