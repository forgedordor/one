package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcg implements fdat {
    final /* synthetic */ gru a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ fdat d;
    final /* synthetic */ jyq e;
    final /* synthetic */ fdat f;
    final /* synthetic */ fdat g;
    final /* synthetic */ fdat h;
    final /* synthetic */ egc i;

    public gcg(gru gruVar, boolean z, boolean z2, fdat fdatVar, jyq jyqVar, fdat fdatVar2, fdat fdatVar3, fdat fdatVar4, egc egcVar) {
        this.a = gruVar;
        this.b = z;
        this.c = z2;
        this.d = fdatVar;
        this.e = jyqVar;
        this.f = fdatVar2;
        this.g = fdatVar3;
        this.h = fdatVar4;
        this.i = egcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (hmlVar.J((iIntValue & 3) != 2, iIntValue & 1)) {
            gru gruVar = this.a;
            boolean z = this.b;
            boolean z2 = this.c;
            gcj.d(this.d, this.e, !z ? gruVar.f : !z2 ? gruVar.b : gruVar.k, this.f, this.g, this.h, !z ? gruVar.g : !z2 ? gruVar.c : gruVar.l, !z ? gruVar.h : !z2 ? gruVar.d : gruVar.m, this.i, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
