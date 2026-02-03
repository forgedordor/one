package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ick extends icg {
    private final String b;
    private final Object c;

    public ick(String str, Object obj, fdau fdauVar) {
        super(fdauVar);
        this.b = str;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ick)) {
            return false;
        }
        ick ickVar = (ick) obj;
        return fdbq.f(this.b, ickVar.b) && fdbq.f(this.c, ickVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }
}
