package defpackage;

import android.app.Notification;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxl extends caya {
    public final pzj a;
    public final caze b;
    public final int c;
    public final int d;
    public final long e;
    public final pza f;
    public final Notification g;
    public final elgm h;
    public final Duration i;
    public final boolean j;
    public final Optional k;

    public caxl(pzj pzjVar, caze cazeVar, int i, int i2, long j, pza pzaVar, Notification notification, elgm elgmVar, Duration duration, boolean z, Optional optional) {
        this.a = pzjVar;
        this.b = cazeVar;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = pzaVar;
        this.g = notification;
        this.h = elgmVar;
        this.i = duration;
        this.j = z;
        this.k = optional;
    }

    @Override // defpackage.caya
    public final int a() {
        return this.d;
    }

    @Override // defpackage.caya
    public final int b() {
        return this.c;
    }

    @Override // defpackage.caya
    public final long c() {
        return this.e;
    }

    @Override // defpackage.caya
    public final Notification d() {
        return this.g;
    }

    @Override // defpackage.caya
    public final pza e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        Notification notification;
        elgm elgmVar;
        Duration duration;
        if (obj == this) {
            return true;
        }
        if (obj instanceof caya) {
            caya cayaVar = (caya) obj;
            pzj pzjVar = this.a;
            if (pzjVar != null ? pzjVar.equals(cayaVar.f()) : cayaVar.f() == null) {
                if (this.b.equals(cayaVar.g()) && this.c == cayaVar.b() && this.d == cayaVar.a() && this.e == cayaVar.c() && this.f.equals(cayaVar.e()) && ((notification = this.g) != null ? notification.equals(cayaVar.d()) : cayaVar.d() == null) && ((elgmVar = this.h) != null ? elgmVar.equals(cayaVar.h()) : cayaVar.h() == null) && ((duration = this.i) != null ? duration.equals(cayaVar.i()) : cayaVar.i() == null) && this.j == cayaVar.k() && this.k.equals(cayaVar.j())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.caya
    public final pzj f() {
        return this.a;
    }

    @Override // defpackage.caya
    public final caze g() {
        return this.b;
    }

    @Override // defpackage.caya
    public final elgm h() {
        return this.h;
    }

    public final int hashCode() {
        pzj pzjVar = this.a;
        int iHashCode = ((((((pzjVar == null ? 0 : pzjVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        int i = this.d;
        long j = this.e;
        int iHashCode2 = ((((iHashCode ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f.hashCode();
        Notification notification = this.g;
        int iHashCode3 = ((iHashCode2 * 1000003) ^ (notification == null ? 0 : notification.hashCode())) * 1000003;
        elgm elgmVar = this.h;
        int iHashCode4 = (iHashCode3 ^ (elgmVar == null ? 0 : elgmVar.hashCode())) * 1000003;
        Duration duration = this.i;
        return ((((iHashCode4 ^ (duration != null ? duration.hashCode() : 0)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k.hashCode();
    }

    @Override // defpackage.caya
    public final Duration i() {
        return this.i;
    }

    @Override // defpackage.caya
    public final Optional j() {
        return this.k;
    }

    @Override // defpackage.caya
    public final boolean k() {
        return this.j;
    }

    public final String toString() {
        Optional optional = this.k;
        Duration duration = this.i;
        elgm elgmVar = this.h;
        Notification notification = this.g;
        pza pzaVar = this.f;
        caze cazeVar = this.b;
        return "ExecutionParameters{constraints=" + String.valueOf(this.a) + ", keepAliveStrategy=" + String.valueOf(cazeVar) + ", maxRowsPerBatch=" + this.c + ", maxAttemptsPerItem=" + this.d + ", retryDelayMillis=" + this.e + ", retryBackoffPolicy=" + String.valueOf(pzaVar) + ", foregroundServiceNotification=" + String.valueOf(notification) + ", legacyActionEnumForLogging=" + String.valueOf(elgmVar) + ", cadence=" + String.valueOf(duration) + ", optInForSchedulerMigration=" + this.j + ", foregroundServiceType=" + String.valueOf(optional) + "}";
    }
}
