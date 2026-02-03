package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dda extends fdbr implements fdap {
    final /* synthetic */ ddb a;
    final /* synthetic */ iyl b;
    final /* synthetic */ long c;
    final /* synthetic */ ixp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dda(ddb ddbVar, iyl iylVar, long j, ixp ixpVar) {
        super(1);
        this.a = ddbVar;
        this.b = iylVar;
        this.c = j;
        this.d = ixpVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long jFloatToRawIntBits;
        iyk iykVar = (iyk) obj;
        ddb ddbVar = this.a;
        dba dbaVar = (dba) ddbVar.a.a();
        if (dbaVar == null) {
            iykVar.s(this.b, 0, 0, 0.0f);
        } else {
            long j = ddbVar.c;
            if (((int) (j >> 32)) == 0 || ((int) (j & 4294967295L)) == 0) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(1.0f);
                int i = iza.a;
                jFloatToRawIntBits = (Float.floatToRawIntBits(1.0f) & 4294967295L) | (jFloatToRawIntBits2 << 32);
            } else {
                jFloatToRawIntBits = dbaVar.a.a(kjh.d(j), kjh.d(this.c));
            }
            long jA = dbaVar.b.a((fdcu.b(((int) (ddbVar.c >> 32)) * Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) << 32) | (fdcu.b(((int) (ddbVar.c & 4294967295L)) * Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))) & 4294967295L), this.c, this.d.q());
            iyk.D(iykVar, this.b, kjb.a(jA), kjb.b(jA), new dcz(jFloatToRawIntBits), 4);
        }
        return fctx.a;
    }
}
