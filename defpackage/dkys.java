package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkys implements fdau {
    final /* synthetic */ qrk a;
    final /* synthetic */ qrs b;

    public dkys(qrs qrsVar, qrk qrkVar) {
        this.b = qrsVar;
        this.a = qrkVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ((Number) obj).floatValue();
        hml hmlVar = (hml) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            qrs qrsVar = this.b;
            if (qrsVar.a() != null) {
                qrj.d(qrsVar.a(), dkzb.a(this.a), joj.a(egq.c(ics.e, 1.0f), "reaction"), 0, null, null, false, hmlVar, 384, 0);
            }
        }
        return fctx.a;
    }
}
