package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmfo extends dqws {
    public bmfo(String[] strArr) {
        super("verified_sms_senders LEFT JOIN verified_sms_brands ON (verified_sms_brands.brand_id=verified_sms_senders.brand_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bmfn b() {
        l();
        return new bmfn(this.a.a());
    }
}
