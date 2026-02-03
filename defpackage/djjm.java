package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djjm {
    public final int a;
    public final fdau b;

    public djjm(int i, fdau fdauVar) {
        this.a = i;
        this.b = fdauVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djjm)) {
            return false;
        }
        djjm djjmVar = (djjm) obj;
        return this.a == djjmVar.a && fdbq.f(this.b, djjmVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "VoiceInputErrorUiData(errorMessage=" + this.a + ", onError=" + this.b + ")";
    }
}
