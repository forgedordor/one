package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpw implements fdau {
    final /* synthetic */ kew a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ kfp d;
    final /* synthetic */ boolean e;
    final /* synthetic */ fdat f;
    final /* synthetic */ fdat g;
    final /* synthetic */ fdat h;
    final /* synthetic */ fdat i;
    final /* synthetic */ gxi j;
    final /* synthetic */ ikp k;
    final /* synthetic */ ebk l;

    public gpw(kew kewVar, boolean z, boolean z2, kfp kfpVar, ebk ebkVar, boolean z3, fdat fdatVar, fdat fdatVar2, fdat fdatVar3, fdat fdatVar4, gxi gxiVar, ikp ikpVar) {
        this.a = kewVar;
        this.b = z;
        this.c = z2;
        this.d = kfpVar;
        this.l = ebkVar;
        this.e = z3;
        this.f = fdatVar;
        this.g = fdatVar2;
        this.h = fdatVar3;
        this.i = fdatVar4;
        this.j = gxiVar;
        this.k = ikpVar;
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
            kew kewVar = this.a;
            boolean z = this.b;
            boolean z2 = this.c;
            kfp kfpVar = this.d;
            ebk ebkVar = this.l;
            boolean z3 = this.e;
            fdat fdatVar2 = this.f;
            fdat fdatVar3 = this.g;
            fdat fdatVar4 = this.h;
            fdat fdatVar5 = this.i;
            gxi gxiVar = this.j;
            gpl.a.a(kewVar.a(), fdatVar, z, z2, kfpVar, ebkVar, z3, fdatVar2, fdatVar3, fdatVar4, fdatVar5, gxiVar, null, hxe.d(1409265477, new gpv(z, z3, ebkVar, gxiVar, this.k), hmlVar), hmlVar, (iIntValue << 3) & 112, 14155776, 32768);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
