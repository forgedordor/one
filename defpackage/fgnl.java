package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgnl implements fgni {
    protected fgnl() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        fgni fgniVar = (fgni) obj;
        if (this == fgniVar) {
            return 0;
        }
        long millis = fgniVar.getMillis();
        long millis2 = getMillis();
        if (millis2 == millis) {
            return 0;
        }
        return millis2 < millis ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgni)) {
            return false;
        }
        fgni fgniVar = (fgni) obj;
        return getMillis() == fgniVar.getMillis() && fgot.d(a(), fgniVar.a());
    }

    public final int hashCode() {
        return ((int) (getMillis() ^ (getMillis() >>> 32))) + a().hashCode();
    }

    public final String toString() {
        return fgqc.a.a(this);
    }
}
