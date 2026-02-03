package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddty {
    public static volatile ddty a;
    public static final Object b = new Object();
    final AtomicLong c = new AtomicLong(-1);
    private final dclr d;

    public ddty(Context context) {
        this.d = new dcma(context, new dcls("module:cronet_dynamite"));
    }

    final synchronized void a(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.c;
        if (atomicLong.get() != -1 && SystemClock.uptimeMillis() - atomicLong.get() <= 1800000) {
            return;
        }
        this.d.a(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, -1, j, j2, null, null, 368, i3)))).t(new defe() { // from class: ddtx
            @Override // defpackage.defe
            public final void d(Exception exc) {
                ConnectionResult connectionResult;
                if ((exc instanceof dcff) && (connectionResult = ((dcff) exc).a.j) != null && connectionResult.c == 24) {
                    this.a.c.set(SystemClock.elapsedRealtime());
                }
            }
        });
    }
}
