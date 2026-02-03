package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmrw {
    public final List a;
    public final boolean b;

    public dmrw() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmrw)) {
            return false;
        }
        dmrw dmrwVar = (dmrw) obj;
        return fdbq.f(this.a, dmrwVar.a) && this.b == dmrwVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "CameraEffectsState(effects=" + this.a + ", isInitializingEffect=" + this.b + ")";
    }

    public dmrw(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public /* synthetic */ dmrw(byte[] bArr) {
        this(fcvo.a, false);
    }
}
