package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class guu implements fdat {
    final /* synthetic */ fdat a;
    final /* synthetic */ fdat b;
    final /* synthetic */ fdat c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;

    public guu(fdat fdatVar, fdat fdatVar2, fdat fdatVar3, long j, long j2) {
        this.a = fdatVar;
        this.b = fdatVar2;
        this.c = fdatVar3;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            hnj.a(gyj.a.c(hct.a(2, hmlVar)), hxe.d(969655473, new gut(this.a, this.b, this.c, hct.a(10, hmlVar), this.d, this.e), hmlVar), hmlVar, 56);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
