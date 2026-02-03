package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnpp extends ub {
    final /* synthetic */ dnpz c;

    public dnpp(dnpz dnpzVar) {
        this.c = dnpzVar;
    }

    @Override // defpackage.ub
    public final int b(int i) {
        dnpz dnpzVar = this.c;
        dnqr dnqrVar = dnpzVar.ag;
        if (dnqrVar == null || dnqrVar.I(i).b() != 1) {
            return 1;
        }
        dnqr dnqrVar2 = dnpzVar.ag;
        if (dnqrVar2 == null) {
            fdbq.c("currentAdapter");
            dnqrVar2 = null;
        }
        return dnqrVar2.h;
    }
}
