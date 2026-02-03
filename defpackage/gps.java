package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gps implements fdau {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ kfp c;
    final /* synthetic */ fdat d;
    final /* synthetic */ fdat e;
    final /* synthetic */ gxi f;
    final /* synthetic */ ikp g;
    final /* synthetic */ ebk h;

    public gps(String str, boolean z, kfp kfpVar, ebk ebkVar, fdat fdatVar, fdat fdatVar2, gxi gxiVar, ikp ikpVar) {
        this.a = str;
        this.b = z;
        this.c = kfpVar;
        this.h = ebkVar;
        this.d = fdatVar;
        this.e = fdatVar2;
        this.f = gxiVar;
        this.g = ikpVar;
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
            int i = iIntValue;
            String str = this.a;
            boolean z = this.b;
            kfp kfpVar = this.c;
            ebk ebkVar = this.h;
            fdat fdatVar2 = this.d;
            fdat fdatVar3 = this.e;
            gxi gxiVar = this.f;
            gpl.a.a(str, fdatVar, z, false, kfpVar, ebkVar, false, null, fdatVar2, fdatVar3, null, gxiVar, null, hxe.d(-656940872, new gpr(z, ebkVar, gxiVar, this.g), hmlVar), hmlVar, (i << 3) & 112, 14155776, 32768);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
