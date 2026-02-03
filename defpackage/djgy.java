package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djgy {
    private final boolean a;

    public djgy() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djgy)) {
            return false;
        }
        boolean z = ((djgy) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        return "EmotiveInputUiData(isEnabled=true)";
    }

    public /* synthetic */ djgy(byte[] bArr) {
        this.a = true;
    }
}
