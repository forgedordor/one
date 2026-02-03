package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityThroughputListener;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fggq extends NetworkQualityThroughputListener {
    private final NetworkQualityThroughputListener a;

    public fggq(NetworkQualityThroughputListener networkQualityThroughputListener) {
        super(networkQualityThroughputListener.getExecutor());
        this.a = networkQualityThroughputListener;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fggq)) {
            return false;
        }
        return this.a.equals(((fggq) obj).a);
    }

    @Override // org.chromium.net.NetworkQualityThroughputListener
    public final Executor getExecutor() {
        return this.a.getExecutor();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // org.chromium.net.NetworkQualityThroughputListener
    public final void onThroughputObservation(int i, long j, int i2) {
        this.a.onThroughputObservation(i, j, i2);
    }
}
