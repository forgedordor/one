package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chdo extends chdq {
    public final int a;

    public chdo(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chdo) && this.a == ((chdo) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "PipelineResult(result=" + ((Object) cgyf.a(this.a)) + ")";
    }
}
