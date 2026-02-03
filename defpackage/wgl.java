package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgl {
    public final dijt a;

    public wgl(dijt dijtVar) {
        this.a = dijtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wgl) && fdbq.f(this.a, ((wgl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisabledComposeRowUiData(annotationUiData=" + this.a + ")";
    }
}
