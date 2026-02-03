package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctmw implements ctmp {
    public final String a;
    public final djyu b;
    public final String c;
    private final ctmw d;

    public ctmw(String str, djyu djyuVar, String str2) {
        str.getClass();
        this.a = str;
        this.b = djyuVar;
        this.c = str2;
        this.d = this;
    }

    @Override // defpackage.ctmp
    public final ctmw a() {
        return this.d;
    }

    @Override // defpackage.ctmp
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctmw)) {
            return false;
        }
        ctmw ctmwVar = (ctmw) obj;
        return fdbq.f(this.a, ctmwVar.a) && fdbq.f(this.b, ctmwVar.b) && fdbq.f(this.c, ctmwVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ContactUiData(id=" + this.a + ", itemUiData=" + this.b + ", header=" + this.c + ")";
    }
}
