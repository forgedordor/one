package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doex implements fdat {
    final /* synthetic */ fdvc a;
    final /* synthetic */ fdat b;

    public doex(fdvc fdvcVar, fdat fdatVar) {
        this.a = fdvcVar;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hsf hsfVarA = hro.a(this.a, hmlVar);
            int iOrdinal = ((doec) hro.a(((dofj) hsfVarA.a()).l, hmlVar).a()).ordinal();
            if (iOrdinal == 0) {
                hmlVar.v(31278632);
                hmlVar.o();
            } else if (iOrdinal == 1) {
                hmlVar.v(2079222770);
                doey.g(hsfVarA, hmlVar, 0);
                hmlVar.o();
            } else {
                if (iOrdinal != 2) {
                    hmlVar.v(2079216793);
                    hmlVar.o();
                    throw new fctg();
                }
                hmlVar.v(2079220712);
                this.b.a(hmlVar, 0);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}
