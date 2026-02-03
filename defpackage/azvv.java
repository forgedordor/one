package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azvv {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public azvv(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azvv)) {
            return false;
        }
        azvv azvvVar = (azvv) obj;
        return this.a == azvvVar.a && this.b == azvvVar.b && this.c == azvvVar.c;
    }

    public final int hashCode() {
        return (((azvu.a(this.a) * 31) + azvu.a(this.b)) * 31) + azvu.a(this.c);
    }

    public final String toString() {
        return "DatabaseRestoreConfig(enableBasicXmsMessageDeduplication=" + this.a + ", enableDuplicatePartMapping=" + this.b + ", throwDatabaseRestoreExceptions=" + this.c + ")";
    }
}
