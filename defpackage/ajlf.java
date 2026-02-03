package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajlf extends Exception {
    public final int a;

    public ajlf() {
        super("Compose constraint violated because: SELFIDENTITY_UNAVAILABLE.");
        this.a = 2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ajlf) && ((ajlf) obj).a == this.a;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public ajlf(int i, String str) {
        super(str);
        this.a = i;
    }
}
