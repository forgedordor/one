package defpackage;

import android.os.SystemClock;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deip implements degs {
    private final degs a;
    private final deiz b;

    public deip(degs degsVar, deiz deizVar) {
        this.a = degsVar;
        this.b = deizVar;
    }

    @Override // defpackage.degs
    public final Instant a() {
        degs degsVar = this.a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Instant instantA = degsVar.a();
        this.b.a(instantA != null ? 2 : 1, jCurrentTimeMillis, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - jElapsedRealtime));
        return instantA;
    }

    public final String toString() {
        deiz deizVar = this.b;
        return "TelemetryTrustedTimeClientImpl{delegate=" + this.a.toString() + ", trustedTimeTelemetryLogger=" + deizVar.toString() + "}";
    }
}
