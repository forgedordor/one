package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxs implements fdau {
    final /* synthetic */ kew a;
    final /* synthetic */ boolean b;
    final /* synthetic */ kfp c;
    final /* synthetic */ boolean d;
    final /* synthetic */ fdat e;
    final /* synthetic */ fdat f;
    final /* synthetic */ fdat g;
    final /* synthetic */ ikp h;
    final /* synthetic */ gxi i;
    final /* synthetic */ ebk j;

    public gxs(kew kewVar, boolean z, kfp kfpVar, ebk ebkVar, boolean z2, fdat fdatVar, fdat fdatVar2, fdat fdatVar3, ikp ikpVar, gxi gxiVar) {
        this.a = kewVar;
        this.b = z;
        this.c = kfpVar;
        this.j = ebkVar;
        this.d = z2;
        this.e = fdatVar;
        this.f = fdatVar2;
        this.g = fdatVar3;
        this.h = ikpVar;
        this.i = gxiVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fdat fdatVar = (fdat) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.F(fdatVar) ? 2 : 4;
        }
        if (hmlVar.J((iIntValue & 19) != 18, iIntValue & 1)) {
            gxo.a.c(this.a.a(), fdatVar, this.b, true, this.c, this.j, this.d, this.e, this.f, this.g, this.h, this.i, null, null, hmlVar, (iIntValue << 3) & 112, 100663296, 196608);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
