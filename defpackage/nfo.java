package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfo {
    public final int a;
    public final boolean b;

    public nfo(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nfo nfoVar = (nfo) obj;
            if (this.a == nfoVar.a && this.b == nfoVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
