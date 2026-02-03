package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class frj implements fdau {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ kfp c;
    final /* synthetic */ fdat d;
    final /* synthetic */ fdat e;
    final /* synthetic */ ikp f;
    final /* synthetic */ ebk g;
    final /* synthetic */ foz h;

    public frj(String str, boolean z, kfp kfpVar, ebk ebkVar, fdat fdatVar, fdat fdatVar2, ikp ikpVar, foz fozVar) {
        this.a = str;
        this.b = z;
        this.c = kfpVar;
        this.g = ebkVar;
        this.d = fdatVar;
        this.e = fdatVar2;
        this.f = ikpVar;
        this.h = fozVar;
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
            String str = this.a;
            boolean z = this.b;
            kfp kfpVar = this.c;
            ebk ebkVar = this.g;
            fdat fdatVar2 = this.d;
            fdat fdatVar3 = this.e;
            ikp ikpVar = this.f;
            foz fozVar = this.h;
            fum.a.b(str, fdatVar, z, kfpVar, ebkVar, fdatVar2, fdatVar3, ikpVar, fozVar, null, hxe.d(-1118701585, new fri(z, ebkVar, fozVar, ikpVar), hmlVar), hmlVar, (iIntValue << 3) & 112, 221184);
        }
        return fctx.a;
    }
}
