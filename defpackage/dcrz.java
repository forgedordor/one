package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcrz {
    private static final Duration b = Duration.ofMinutes(30);
    public final AtomicReference a;
    private final dclr c;

    public dcrz(Context context) {
        dcma dcmaVar = new dcma(context, new dcls("droidguard"));
        this.a = new AtomicReference(Instant.MIN);
        this.c = dcmaVar;
    }

    final synchronized void a(int i, defn defnVar, long j, long j2, long j3) {
        int i2;
        int i3;
        int i4;
        long j4;
        final Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        if (((Instant) this.a.get()).plus(b).isAfter(instantOfEpochMilli)) {
            return;
        }
        if (defnVar.m()) {
            j4 = j3;
            i4 = 0;
            i3 = 0;
        } else {
            if (((defv) defnVar).d) {
                i2 = 100;
            } else {
                Exception excH = defnVar.h();
                if (excH instanceof dcff) {
                    Status status = ((dcff) excH).a;
                    int i5 = status.g;
                    ConnectionResult connectionResult = status.j;
                    i3 = connectionResult != null ? connectionResult.c : -1;
                    i4 = i5;
                    j4 = j3;
                } else {
                    i2 = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                }
            }
            i4 = i2;
            i3 = -1;
            j4 = j3;
        }
        this.c.a(new TelemetryData(0, ekgb.r(new MethodInvocation(i, i4, i3, j, j2, null, null, 0, (int) j4)))).t(new defe() { // from class: dcry
            @Override // defpackage.defe
            public final void d(Exception exc) {
                ConnectionResult connectionResult2;
                if ((exc instanceof dcff) && (connectionResult2 = ((dcff) exc).a.j) != null && connectionResult2.c == 24) {
                    this.a.a.set(instantOfEpochMilli);
                }
            }
        });
    }
}
