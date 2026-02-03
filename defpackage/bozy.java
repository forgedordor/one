package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bozy extends dqye {
    public bozy() {
        super("desktop");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bozx b() {
        ah();
        return new bozx(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(boolean z) {
        int iIntValue = bpab.c().intValue();
        int iIntValue2 = bpab.c().intValue();
        if (iIntValue2 < 58010) {
            dqru.x("is_active", iIntValue2);
        }
        if (iIntValue >= 58010) {
            this.a.put("is_active", Boolean.valueOf(z));
        }
    }

    public final void d(long j) {
        this.a.put("last_wakeup_time", Long.valueOf(j));
    }

    public final void e(String str) {
        int iIntValue = bpab.c().intValue();
        int iIntValue2 = bpab.c().intValue();
        if (iIntValue2 < 58010) {
            dqru.x("request_id", iIntValue2);
        }
        if (iIntValue >= 58010) {
            dqru.v(this.a, "request_id", str);
        }
    }

    public final void f(Function function) {
        String[] strArr = bpab.a;
        af(new bozz((bpaa) function.apply(new bpaa())));
    }
}
