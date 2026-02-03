package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fak implements fdpm {
    final /* synthetic */ cuu a;
    final /* synthetic */ fal b;

    public fak(cuu cuuVar, fal falVar) {
        this.a = cuuVar;
        this.b = falVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        ebj ebjVar = (ebj) obj;
        if ((ebjVar instanceof ebh) || (ebjVar instanceof ebc) || (ebjVar instanceof ebm)) {
            this.a.h(ebjVar);
        } else if (ebjVar instanceof ebi) {
            this.a.g(((ebi) ebjVar).a);
        } else if (ebjVar instanceof ebd) {
            this.a.g(((ebd) ebjVar).a);
        } else if (ebjVar instanceof ebn) {
            this.a.g(((ebn) ebjVar).a);
        } else if (ebjVar instanceof ebl) {
            this.a.g(((ebl) ebjVar).a);
        }
        cuu cuuVar = this.a;
        Object[] objArr = cuuVar.b;
        int i = cuuVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            ebj ebjVar2 = (ebj) objArr[i3];
            if (ebjVar2 instanceof ebh) {
                i2 |= 2;
            } else if (ebjVar2 instanceof ebc) {
                i2 |= 1;
            } else if (ebjVar2 instanceof ebm) {
                i2 |= 4;
            }
        }
        this.b.b.i(i2);
        return fctx.a;
    }
}
