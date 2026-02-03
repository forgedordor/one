package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlw implements fdpm {
    final /* synthetic */ fdcg a;
    final /* synthetic */ fdcg b;
    final /* synthetic */ fdcg c;
    final /* synthetic */ dly d;

    public dlw(fdcg fdcgVar, fdcg fdcgVar2, fdcg fdcgVar3, dly dlyVar) {
        this.a = fdcgVar;
        this.b = fdcgVar2;
        this.c = fdcgVar3;
        this.d = dlyVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        fdcg fdcgVar;
        int i;
        ebj ebjVar = (ebj) obj;
        boolean z = true;
        if (ebjVar instanceof ebm) {
            this.a.a++;
        } else {
            if ((ebjVar instanceof ebn) || (ebjVar instanceof ebl)) {
                fdcgVar = this.a;
            } else {
                if (ebjVar instanceof ebh) {
                    fdcgVar = this.b;
                } else if (ebjVar instanceof ebi) {
                    fdcgVar = this.b;
                } else if (ebjVar instanceof ebc) {
                    fdcgVar = this.c;
                } else if (ebjVar instanceof ebd) {
                    fdcgVar = this.c;
                }
                i = fdcgVar.a + 1;
                fdcgVar.a = i;
            }
            i = fdcgVar.a - 1;
            fdcgVar.a = i;
        }
        boolean z2 = false;
        boolean z3 = this.a.a > 0;
        boolean z4 = this.b.a > 0;
        boolean z5 = this.c.a > 0;
        dly dlyVar = this.d;
        if (dlyVar.a != z3) {
            dlyVar.a = z3;
            z2 = true;
        }
        if (dlyVar.b != z4) {
            dlyVar.b = z4;
        } else {
            z = z2;
        }
        if (dlyVar.c == z5) {
            if (z) {
            }
            return fctx.a;
        }
        dlyVar.c = z5;
        jbq.a(dlyVar);
        return fctx.a;
    }
}
