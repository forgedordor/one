package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ykh {
    public final boolean a;
    public final int b;

    public ykh() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykh)) {
            return false;
        }
        ykh ykhVar = (ykh) obj;
        return this.a == ykhVar.a && this.b == ykhVar.b;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b;
    }

    public final String toString() {
        return "Flags(splitTallText=" + this.a + ", stricterSplittingForTallTextMessagesLimit=" + this.b + ")";
    }

    public ykh(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public /* synthetic */ ykh(byte[] bArr) {
        this(false, 5000);
    }
}
