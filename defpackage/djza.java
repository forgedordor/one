package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djza implements djvp {
    private final int a;

    public djza() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djza)) {
            return false;
        }
        int i = ((djza) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "ListItemDividerUiData(thickness=1)";
    }

    public /* synthetic */ djza(byte[] bArr) {
        this.a = 1;
    }
}
