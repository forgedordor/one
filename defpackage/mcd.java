package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcd {
    private final mar a;

    public mcd(mar marVar) {
        this.a = marVar;
    }

    public final boolean a(int i) {
        return this.a.c(i);
    }

    public final boolean b(int... iArr) {
        for (int i : iArr) {
            if (this.a.c(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mcd) {
            return this.a.equals(((mcd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
