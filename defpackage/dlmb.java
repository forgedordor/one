package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlmb implements fdau {
    final /* synthetic */ dlmg a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ hcj e;

    public dlmb(dlmg dlmgVar, long j, long j2, long j3, hcj hcjVar) {
        this.a = dlmgVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = hcjVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hcf hcfVar = (hcf) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        hcfVar.getClass();
        hmlVar.v(479715767);
        hmlVar.o();
        hmlVar.v(479718152);
        dlmg dlmgVar = this.a;
        hwv hwvVarD = !dlmgVar.b.isEmpty() ? hxe.d(660737011, new dllz(dlmgVar, this.d, this.e), hmlVar) : null;
        hmlVar.o();
        float f = dtif.a;
        long j = this.b;
        long j2 = this.c;
        hmlVar.v(1001742709);
        gqx gqxVar = new gqx(j, j2, j2, dtdu.c(26, hmlVar));
        hmlVar.o();
        dtii.a(hcfVar, null, hwvVarD, 0L, 0.0f, null, gqxVar, 0.0f, 0.0f, hxe.d(-62543139, new dlma(dlmgVar), hmlVar), hmlVar, iIntValue & 14, 6);
        return fctx.a;
    }
}
