package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cuih implements fdat {
    final /* synthetic */ fdat a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdap c;
    final /* synthetic */ fdat d;
    final /* synthetic */ boolean e;
    final /* synthetic */ fdvc f;

    public cuih(fdat fdatVar, boolean z, fdap fdapVar, fdat fdatVar2, boolean z2, fdvc fdvcVar) {
        this.a = fdatVar;
        this.b = z;
        this.c = fdapVar;
        this.d = fdatVar2;
        this.e = z2;
        this.f = fdvcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            fdat fdatVar = this.a;
            if (fdatVar == null) {
                fdatVar = dlkk.a;
            }
            dlkk.c(new cuif(this.e), null, fdatVar, null, null, null, null, new cuig(this.f), null, asgl.a() ? false : this.b, this.c, true != asgo.a() ? 3 : 1, this.d, hmlVar, 0, 0, 378);
        }
        return fctx.a;
    }
}
