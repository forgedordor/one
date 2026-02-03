package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvt {
    public final jvs a;
    public final jvr b;

    public jvt(jvs jvsVar, jvr jvrVar) {
        this.a = jvsVar;
        this.b = jvrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvt)) {
            return false;
        }
        jvt jvtVar = (jvt) obj;
        return fdbq.f(this.b, jvtVar.b) && fdbq.f(this.a, jvtVar.a);
    }

    public final int hashCode() {
        jvs jvsVar = this.a;
        int iHashCode = jvsVar != null ? jvsVar.hashCode() : 0;
        jvr jvrVar = this.b;
        return (iHashCode * 31) + (jvrVar != null ? jvrVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public jvt() {
        this(null, new jvr((byte[]) null));
    }
}
