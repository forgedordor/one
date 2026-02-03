package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpw {
    public final Object a;
    public final fdau b;

    public fpw(Object obj, fdau fdauVar) {
        this.a = obj;
        this.b = fdauVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpw)) {
            return false;
        }
        fpw fpwVar = (fpw) obj;
        return fdbq.f(this.a, fpwVar.a) && fdbq.f(this.b, fpwVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
