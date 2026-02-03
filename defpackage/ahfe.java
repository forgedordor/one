package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahfe extends ahfj {
    public final int a;
    public final boolean b;
    public final int c;

    public ahfe(int i, int i2, boolean z) {
        this.a = i;
        this.c = i2;
        this.b = z;
    }

    @Override // defpackage.ahfj
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ahfj
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.ahfj
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahfj) {
            ahfj ahfjVar = (ahfj) obj;
            if (this.a == ahfjVar.a() && this.c == ahfjVar.c() && this.b == ahfjVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((((this.a ^ 1000003) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "SingleRegistrationCapabilityInfo{subId=" + this.a + ", capabilityStatus=" + Integer.toString(this.c - 1) + ", singleRegistrationCapable=" + this.b + "}";
    }
}
