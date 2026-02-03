package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djic {
    public final boolean a;

    public djic(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djic) && this.a == ((djic) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "ShortcutsInputUiData(isEnabled=" + this.a + ")";
    }

    public djic() {
        this(true);
    }
}
