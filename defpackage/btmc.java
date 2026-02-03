package defpackage;

import j$.time.Instant;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btmc extends dqye {
    public btmc() {
        super("remote_registrations_table");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btmb b() {
        ah();
        return new btmb(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(Instant instant) {
        if (instant == null) {
            this.a.putNull("guaranteed_fresh_as_of_timestamp");
        } else {
            this.a.put("guaranteed_fresh_as_of_timestamp", Long.valueOf(bart.a(instant)));
        }
    }

    public final void d(boolean z) {
        this.a.put("etouffee", Boolean.valueOf(z));
    }

    public final void e(boolean z) {
        int iIntValue = btmf.c().intValue();
        int iIntValue2 = btmf.c().intValue();
        if (iIntValue2 < 46000) {
            dqru.x("better_etouffee", iIntValue2);
        }
        if (iIntValue >= 46000) {
            this.a.put("better_etouffee", Boolean.valueOf(z));
        }
    }

    public final void f(Instant instant) {
        if (instant == null) {
            this.a.putNull("last_modified_timestamp");
        } else {
            this.a.put("last_modified_timestamp", Long.valueOf(bart.a(instant)));
        }
    }

    public final void g(btme btmeVar) {
        af(new btmd(btmeVar));
    }

    public final void h(Function function) {
        String[] strArr = btmf.a;
        af(new btmd((btme) function.apply(new btme())));
    }
}
