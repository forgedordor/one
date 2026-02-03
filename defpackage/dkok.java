package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkok {
    private final boolean a;

    public dkok() {
        this((char[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkok)) {
            return false;
        }
        boolean z = ((dkok) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "Flags(animateLastReadMarker=true)";
    }

    public dkok(byte[] bArr) {
        this.a = true;
    }

    public /* synthetic */ dkok(char[] cArr) {
        this((byte[]) null);
    }
}
