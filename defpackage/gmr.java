package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmr implements fdat {
    final /* synthetic */ fdat a;
    final /* synthetic */ gmi b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ego d;
    final /* synthetic */ fdat e;

    public gmr(fdat fdatVar, gmi gmiVar, boolean z, ego egoVar, fdat fdatVar2) {
        this.a = fdatVar;
        this.b = gmiVar;
        this.c = z;
        this.d = egoVar;
        this.e = fdatVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (hmlVar.J((iIntValue & 3) != 2, iIntValue & 1)) {
            fdat fdatVar = this.a;
            if (fdatVar != null) {
                hmlVar.v(-864613189);
                gmi gmiVar = this.b;
                hnj.a(gea.a.c(new ije(this.c ? gmiVar.b : gmiVar.e)), hxe.d(1241781204, new gmp(fdatVar), hmlVar), hmlVar, 56);
                hmlVar.o();
            } else {
                hmlVar.v(-864292215);
                hmlVar.o();
            }
            gmi gmiVar2 = this.b;
            hnj.a(gea.a.c(new ije(this.c ? gmiVar2.a : gmiVar2.d)), hxe.d(-893579015, new gmq(this.d, fdatVar, this.e), hmlVar), hmlVar, 56);
            hmlVar.v(-863072055);
            hmlVar.o();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
