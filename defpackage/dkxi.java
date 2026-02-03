package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkxi implements fdat {
    final /* synthetic */ dkxv a;
    final /* synthetic */ long b;

    public dkxi(dkxv dkxvVar, long j) {
        this.a = dkxvVar;
        this.b = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            egt.a(egq.e(icoVar, 16.0f), hmlVar);
            dkxv dkxvVar = this.a;
            dkxj.n(dkxvVar.f(), hmlVar, 0);
            long j = this.b;
            dkxj.t(j, hmlVar, 0);
            dkxj.h(dkxvVar.e(), hmlVar, 0);
            dkxj.o(j, hmlVar, 0);
            dkxj.f(dkxvVar.g(), hmlVar, 0);
            egt.a(egq.e(icoVar, 12.0f), hmlVar);
        }
        return fctx.a;
    }
}
