package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvxk {
    public final ekgb a;

    public cvxk(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvxk) && fdbq.f(this.a, ((cvxk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EncryptionUiData(actions=" + this.a + ")";
    }
}
