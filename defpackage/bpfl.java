package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpfl extends dqye {
    public bpfl() {
        super("emergency_sessions");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpfk b() {
        ah();
        return new bpfk(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(Instant instant) {
        if (instant == null) {
            this.a.putNull("end_timestamp");
        } else {
            this.a.put("end_timestamp", Long.valueOf(bart.a(instant)));
        }
    }

    public final void d(long j) {
        this.a.put("refill_duration_ms", Long.valueOf(j));
    }
}
