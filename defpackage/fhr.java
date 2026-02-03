package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhr implements fdat {
    final /* synthetic */ jou a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ics d;
    final /* synthetic */ fih e;

    public fhr(jou jouVar, long j, boolean z, ics icsVar, fih fihVar) {
        this.a = jouVar;
        this.b = j;
        this.c = z;
        this.d = icsVar;
        this.e = fihVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            hnj.a(jmh.n.c(this.a), hxe.d(1260045569, new fhq(this.b, this.c, this.d, this.e), hmlVar), hmlVar, 56);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
