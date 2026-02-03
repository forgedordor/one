package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkbm {
    public final String a;
    public final djrr b;
    public final String c;

    public dkbm(String str, djrr djrrVar, String str2) {
        str.getClass();
        djrrVar.getClass();
        this.a = str;
        this.b = djrrVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkbm)) {
            return false;
        }
        dkbm dkbmVar = (dkbm) obj;
        return fdbq.f(this.a, dkbmVar.a) && this.b == dkbmVar.b && fdbq.f(this.c, dkbmVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SelectListItemOption(id=" + this.a + ", icon=" + this.b + ", text=" + this.c + ")";
    }
}
