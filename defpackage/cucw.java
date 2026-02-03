package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cucw {
    public final boolean a;

    public cucw() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cucw) && this.a == ((cucw) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableStartChatCoolRanchPhase3=" + this.a + ")";
    }

    public cucw(boolean z) {
        this.a = z;
    }

    public /* synthetic */ cucw(byte[] bArr) {
        this(false);
    }
}
