package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnby extends dqye {
    public bnby() {
        super("cms");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bnbx b() {
        ah();
        return new bnbx(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(String str) {
        int iIntValue = bncb.c().intValue();
        int iIntValue2 = bncb.c().intValue();
        if (iIntValue2 < 42060) {
            dqru.x("cms_correlation_id", iIntValue2);
        }
        if (iIntValue >= 42060) {
            dqru.v(this.a, "cms_correlation_id", str);
        }
    }

    public final void d(String str) {
        int iIntValue = bncb.c().intValue();
        int iIntValue2 = bncb.c().intValue();
        if (iIntValue2 < 35020) {
            dqru.x("cms_id", iIntValue2);
        }
        if (iIntValue >= 35020) {
            dqru.v(this.a, "cms_id", str);
        }
    }

    public final void e(Function function) {
        String[] strArr = bncb.a;
        af(new bnbz((bnca) function.apply(new bnca())));
    }
}
