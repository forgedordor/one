package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvpq {
    public final bvlj a;
    public final bvmq b;
    public final List c;
    public final bvpr d;

    public bvpq(bvlj bvljVar, bvmq bvmqVar, List list, bvpr bvprVar) {
        bvmqVar.getClass();
        list.getClass();
        bvprVar.getClass();
        this.a = bvljVar;
        this.b = bvmqVar;
        this.c = list;
        this.d = bvprVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvpq)) {
            return false;
        }
        bvpq bvpqVar = (bvpq) obj;
        return fdbq.f(this.a, bvpqVar.a) && fdbq.f(this.b, bvpqVar.b) && fdbq.f(this.c, bvpqVar.c) && this.d == bvpqVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "GaiaPairingSettingsUiData(devicePairingSettings=" + this.a + ", accountInfo=" + this.b + ", desktopItems=" + this.c + ", primaryDeviceStatus=" + this.d + ")";
    }
}
