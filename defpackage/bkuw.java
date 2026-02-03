package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkuw extends dqws {
    public bkuw(String[] strArr) {
        super("rbm_business_info LEFT JOIN rbm_business_verifier_info ON (rbm_business_verifier_info.verifier_id=rbm_business_info.verifier_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bkuv b() {
        l();
        return new bkuv(this.a.a());
    }
}
