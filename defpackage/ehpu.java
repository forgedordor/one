package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehpu {
    public final Map a;
    public boolean b;

    public ehpu() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehpu)) {
            return false;
        }
        ehpu ehpuVar = (ehpu) obj;
        return fdbq.f(this.a, ehpuVar.a) && this.b == ehpuVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "StreamMixinState(flowIds=" + this.a + ", acceptingNewChannels=" + this.b + ")";
    }

    public /* synthetic */ ehpu(byte[] bArr) {
        this.a = new LinkedHashMap();
        this.b = true;
    }
}
