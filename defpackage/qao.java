package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qao extends qap {
    public final pzs a;

    public qao(pzs pzsVar) {
        this.a = pzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((qao) obj).a);
    }

    public final int hashCode() {
        return 3463041 + this.a.hashCode();
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }

    public qao() {
        this(pzs.a);
    }
}
