package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcid implements defb {
    private final dchp a;
    private final int b;
    private final dcgl c;
    private final long d;
    private final long e;

    public dcid(dchp dchpVar, int i, dcgl dcglVar, long j, long j2) {
        this.a = dchpVar;
        this.b = i;
        this.c = dcglVar;
        this.d = j;
        this.e = j2;
    }

    public static ConnectionTelemetryConfiguration b(dchl dchlVar, BaseGmsClient baseGmsClient, int i) {
        int[] iArr;
        int[] iArr2;
        ConnectionInfo connectionInfo = baseGmsClient.q;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo == null ? null : connectionInfo.d;
        if (connectionTelemetryConfiguration == null || !connectionTelemetryConfiguration.b || ((iArr = connectionTelemetryConfiguration.d) != null ? !dcmv.b(iArr, i) : !((iArr2 = connectionTelemetryConfiguration.f) == null || !dcmv.b(iArr2, i))) || dchlVar.h >= connectionTelemetryConfiguration.e) {
            return null;
        }
        return connectionTelemetryConfiguration;
    }

    @Override // defpackage.defb
    public final void a(defn defnVar) {
        dchl dchlVarB;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        dchp dchpVar = this.a;
        if (dchpVar.h()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = dcll.a().a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) && (dchlVarB = dchpVar.b(this.c)) != null) {
                Object obj = dchlVarB.b;
                if (obj instanceof BaseGmsClient) {
                    BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                    long j3 = this.d;
                    int i6 = 0;
                    boolean z = j3 > 0;
                    int i7 = baseGmsClient.l;
                    if (rootTelemetryConfiguration != null) {
                        z &= rootTelemetryConfiguration.c;
                        boolean zG = baseGmsClient.G();
                        i = rootTelemetryConfiguration.d;
                        i3 = rootTelemetryConfiguration.e;
                        i2 = rootTelemetryConfiguration.a;
                        if (zG && !baseGmsClient.q()) {
                            ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(dchlVarB, baseGmsClient, this.b);
                            if (connectionTelemetryConfigurationB == null) {
                                return;
                            }
                            boolean z2 = connectionTelemetryConfigurationB.c && j3 > 0;
                            i3 = connectionTelemetryConfigurationB.e;
                            z = z2;
                        }
                    } else {
                        i = 5000;
                        i2 = 0;
                        i3 = 100;
                    }
                    int iElapsedRealtime = -1;
                    if (defnVar.m()) {
                        i5 = 0;
                    } else if (((defv) defnVar).d) {
                        i6 = -1;
                        i5 = 100;
                    } else {
                        Exception excH = defnVar.h();
                        if (excH instanceof dcff) {
                            Status status = ((dcff) excH).a;
                            i4 = status.g;
                            ConnectionResult connectionResult = status.j;
                            if (connectionResult != null) {
                                i5 = i4;
                                i6 = connectionResult.c;
                            }
                        } else {
                            i4 = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                        }
                        i5 = i4;
                        i6 = -1;
                    }
                    if (z) {
                        long j4 = this.e;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                        j = j3;
                        j2 = jCurrentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    Handler handler = dchpVar.o;
                    handler.sendMessage(handler.obtainMessage(18, new dcie(new MethodInvocation(this.b, i5, i6, j, j2, null, null, i7, iElapsedRealtime), i2, i, i3)));
                }
            }
        }
    }
}
