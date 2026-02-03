package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ays extends bct {
    private final bcu a;

    public ays(bcu bcuVar) {
        this.a = bcuVar;
    }

    @Override // defpackage.bct
    public final bcu a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bct) {
            bct bctVar = (bct) obj;
            bctVar.b();
            if (this.a.equals(bctVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.a + "}";
    }

    @Override // defpackage.bct
    public final void b() {
    }
}
