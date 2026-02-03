package defpackage;

import j$.time.Instant;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsrd extends dqye {
    public bsrd() {
        super("pipeline_work");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsrc b() {
        ah();
        return new bsrc(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(Instant instant) {
        int iIntValue = bsrg.c().intValue();
        int iIntValue2 = bsrg.c().intValue();
        if (iIntValue2 < 60840) {
            dqru.x("execute_after_timestamp", iIntValue2);
        }
        if (iIntValue >= 60840) {
            if (instant == null) {
                this.a.putNull("execute_after_timestamp");
            } else {
                this.a.put("execute_after_timestamp", Long.valueOf(bart.a(instant)));
            }
        }
    }

    public final void d(dqxe dqxeVar) {
        ag("execution_attempt_count", dqxeVar);
    }

    public final void e(Function function) {
        String[] strArr = bsrg.a;
        af(new bsre((bsrf) function.apply(new bsrf())));
    }
}
