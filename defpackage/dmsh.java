package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmsh implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ float d;
    final /* synthetic */ dmrz e;
    final /* synthetic */ dmsb f;

    public dmsh(boolean z, boolean z2, boolean z3, float f, dmrz dmrzVar, dmsb dmsbVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = f;
        this.e = dmrzVar;
        this.f = dmsbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(1059550590);
            if ((this.a && this.b) || this.c) {
                gqs.d(idb.a(ics.e, 1.0f), 0L, 0.0f, 0L, 0, 0.0f, hmlVar, 6, 62);
                hmlVar = hmlVar;
            }
            hmlVar.o();
            ics icsVarA = ifi.a(idb.a(ics.e, 0.0f), this.d);
            dmrz dmrzVar = this.e;
            if (dmrzVar instanceof dmry) {
                hmlVar.v(-1513413024);
                inz inzVarA = jqq.a(((dmry) dmrzVar).a, hmlVar, 0);
                dmsb dmsbVar = this.f;
                gkd.a(inzVarA, dmsbVar.a, icsVarA, ije.d, hmlVar, 3072, 0);
                hmlVar.o();
            } else if (dmrzVar instanceof dmrx) {
                hmlVar.v(-1513180834);
                dnc.b(new iif(((dmrx) dmrzVar).a), this.f.a, icsVarA, null, null, hmlVar, 0, 248);
                hmlVar.o();
            } else {
                hmlVar.v(-1513010210);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}
