package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfz extends qga {
    public final int a;

    public qfz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qfz) && this.a == ((qfz) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.a + ')';
    }
}
