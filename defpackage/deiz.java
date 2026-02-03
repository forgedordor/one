package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deiz {
    public final AtomicLong a;
    private final dclr b;

    private deiz() {
        this.a = new AtomicLong(-1L);
        this.b = null;
    }

    public final synchronized void a(int i, long j, long j2, int i2) {
        AtomicLong atomicLong = this.a;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() == -1 || jElapsedRealtime - atomicLong.get() > TimeUnit.MINUTES.toMillis(30L)) {
            dclr dclrVar = this.b;
            if (dclrVar != null) {
                dclrVar.a(new TelemetryData(0, Arrays.asList(new MethodInvocation(29813, i, 0, j, j2, null, null, 0, i2)))).t(new defe() { // from class: deiy
                    @Override // defpackage.defe
                    public final void d(Exception exc) {
                        ConnectionResult connectionResult;
                        if ((exc instanceof dcff) && (connectionResult = ((dcff) exc).a.j) != null && connectionResult.c == 24) {
                            this.a.a.set(jElapsedRealtime);
                        }
                    }
                });
            }
        }
    }

    public deiz(Context context) {
        this.a = new AtomicLong(-1L);
        this.b = new dcma(context, new dcls("trusted_time"));
    }
}
