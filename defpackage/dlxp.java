package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlxp {
    public final boolean a;

    public dlxp() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlxp) && this.a == ((dlxp) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "AudioFlags(ignoreEmptyAudioOutputAfterRecording=" + this.a + ")";
    }

    public dlxp(boolean z) {
        this.a = z;
    }

    public /* synthetic */ dlxp(byte[] bArr) {
        this(false);
    }
}
