package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cogw implements diep {
    private final diep a;

    public cogw(diep diepVar) {
        this.a = diepVar;
    }

    @Override // defpackage.diep
    public final long a() {
        return this.a.a();
    }

    @Override // defpackage.diep
    public final long b() {
        return this.a.b();
    }

    @Override // defpackage.diep
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.diep
    public final Duration d() {
        return this.a.d();
    }

    @Override // defpackage.diep
    public final Duration e() {
        return this.a.e();
    }

    @Override // defpackage.diep
    public final Instant f() {
        return this.a.f();
    }

    public final LocalDateTime g() {
        return f().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
