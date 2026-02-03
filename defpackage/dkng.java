package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkng {
    private final boolean a;

    public dkng() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkng)) {
            return false;
        }
        boolean z = ((dkng) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "Flags(useRedesignedProgressBars=true)";
    }

    public /* synthetic */ dkng(byte[] bArr) {
        this.a = true;
    }
}
