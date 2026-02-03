package defpackage;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcll {
    private static dcll b;
    private static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public RootTelemetryConfiguration a;

    private dcll() {
    }

    public static synchronized dcll a() {
        if (b == null) {
            b = new dcll();
        }
        return b;
    }

    public final synchronized void b(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.a = c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.a;
        if (rootTelemetryConfiguration2 != null) {
            if (rootTelemetryConfiguration2.a >= rootTelemetryConfiguration.a) {
                return;
            }
        }
        this.a = rootTelemetryConfiguration;
    }
}
