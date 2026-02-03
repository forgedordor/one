package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gut implements fdat {
    final /* synthetic */ fdat a;
    final /* synthetic */ fdat b;
    final /* synthetic */ fdat c;
    final /* synthetic */ jyq d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;

    public gut(fdat fdatVar, fdat fdatVar2, fdat fdatVar3, jyq jyqVar, long j, long j2) {
        this.a = fdatVar;
        this.b = fdatVar2;
        this.c = fdatVar3;
        this.d = jyqVar;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            hmlVar.v(-168976609);
            gvb.a(this.b, this.a, this.c, this.d, this.e, this.f, hmlVar, 0);
            hmlVar.o();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
