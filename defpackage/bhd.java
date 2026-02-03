package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhd extends bjo {
    public final String a;
    private final Class b;
    private final Object c;

    public bhd(String str, Class cls, Object obj) {
        this.a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.b = cls;
        this.c = obj;
    }

    @Override // defpackage.bjo
    public final Class a() {
        return this.b;
    }

    @Override // defpackage.bjo
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.bjo
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bjo) {
            bjo bjoVar = (bjo) obj;
            if (this.a.equals(bjoVar.c()) && this.b.equals(bjoVar.a()) && ((obj2 = this.c) != null ? obj2.equals(bjoVar.b()) : bjoVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        Object obj = this.c;
        return (iHashCode * 1000003) ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=" + this.c + "}";
    }
}
