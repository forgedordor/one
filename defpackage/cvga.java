package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvga {
    private final boolean a;
    private final List b;

    public cvga(boolean z, List list) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvga)) {
            return false;
        }
        cvga cvgaVar = (cvga) obj;
        return this.a == cvgaVar.a && fdbq.f(this.b, cvgaVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RcsSimStatusesUiData(showRcsSimStatuses=" + this.a + ", rcsSimStatusUiData=" + this.b + ")";
    }
}
