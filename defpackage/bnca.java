package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnca extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bnbz(this);
    }

    public final void b() {
        int iIntValue = bncb.c().intValue();
        if (iIntValue < 35020) {
            dqru.x("cms_id", iIntValue);
        }
        ap(new dqpn("cms.cms_id", 5));
    }

    public final void c(int i) {
        ap(new dqty("cms.key_index", 1, Integer.valueOf(i)));
    }

    public final void d(int i) {
        ap(new dqty("cms.key_index", 10, Integer.valueOf(i)));
    }

    public final void e(int i) {
        ap(new dqty("cms.key_type", 1, Integer.valueOf(i)));
    }
}
