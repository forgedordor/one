package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahm {
    private final boolean a;

    public aahm(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aahm)) {
            return false;
        }
        boolean z = ((aahm) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(handleRbmAppBar=false)";
    }

    public aahm() {
        this(null);
    }
}
