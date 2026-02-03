package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qam extends qap {
    public final pzs a;

    public qam(pzs pzsVar) {
        this.a = pzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((qam) obj).a);
    }

    public final int hashCode() {
        return 3462979 + this.a.hashCode();
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }

    public qam() {
        this(pzs.a);
    }
}
