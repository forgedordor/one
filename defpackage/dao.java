package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dao extends day {
    public dhk a;
    public dhc b;
    public dhc c;
    public dhc d;
    public dap e;
    public dar f;
    public fdae g;
    public iby h;
    public czf i;
    private long j = -9223372034707292160L;
    private final fdap k;
    private final fdap l;

    public dao(dhk dhkVar, dhc dhcVar, dhc dhcVar2, dhc dhcVar3, dap dapVar, dar darVar, fdae fdaeVar, czf czfVar) {
        this.a = dhkVar;
        this.b = dhcVar;
        this.c = dhcVar2;
        this.d = dhcVar3;
        this.e = dapVar;
        this.f = darVar;
        this.g = fdaeVar;
        this.i = czfVar;
        kim.k(0, 0, 0, 15);
        this.k = new dam(this);
        this.l = new dan(this);
    }

    public final iby a() {
        cyo cyoVar;
        iby ibyVar;
        iby ibyVar2;
        if (this.a.d().d(cze.a, cze.b)) {
            cyo cyoVar2 = this.e.b().c;
            if (cyoVar2 != null && (ibyVar2 = cyoVar2.a) != null) {
                return ibyVar2;
            }
            cyoVar = this.f.b().c;
            if (cyoVar == null) {
                return null;
            }
        } else {
            cyo cyoVar3 = this.f.b().c;
            if (cyoVar3 != null && (ibyVar = cyoVar3.a) != null) {
                return ibyVar;
            }
            cyoVar = this.e.b().c;
            if (cyoVar == null) {
                return null;
            }
        }
        return cyoVar.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    @Override // defpackage.jcd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ixn b(defpackage.ixp r23, defpackage.ixk r24, long r25) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dao.b(ixp, ixk, long):ixn");
    }

    @Override // defpackage.icr
    public final void dU() {
        this.j = -9223372034707292160L;
    }
}
