package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvc implements fdau {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ kfp c;
    final /* synthetic */ fdat d;
    final /* synthetic */ ikp e;
    final /* synthetic */ ebk f;
    final /* synthetic */ foz g;

    public fvc(String str, boolean z, kfp kfpVar, ebk ebkVar, fdat fdatVar, ikp ikpVar, foz fozVar) {
        this.a = str;
        this.b = z;
        this.c = kfpVar;
        this.f = ebkVar;
        this.d = fdatVar;
        this.e = ikpVar;
        this.g = fozVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fdat fdatVar = (fdat) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.F(fdatVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            fum.a.c(this.a, fdatVar, this.b, this.c, this.f, this.d, this.e, this.g, null, hmlVar, (iIntValue << 3) & 112, 24576);
        }
        return fctx.a;
    }
}
