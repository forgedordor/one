package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drfl {
    public static final drfz a = new drfz();
    public final drfz b;
    public final drgd c;
    private final drfk d;

    public drfl(String str, drfz drfzVar, int i) {
        drgd drgdVar = new drgd(str);
        drfk drfkVar = new drfk(i);
        this.c = drgdVar;
        this.b = drfzVar;
        this.d = drfkVar;
    }

    @Deprecated
    public final int a() {
        return ((Integer) ((ejwt) this.d.a).a).intValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof drfl) {
            drfl drflVar = (drfl) obj;
            if (this.c.equals(drflVar.c) && this.b.equals(drflVar.b) && this.d.equals(drflVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return rvk.f(this.c, rvk.f(this.b, this.d.hashCode()));
    }

    public final String toString() {
        drfk drfkVar = this.d;
        drfz drfzVar = this.b;
        return "FifeModel{fifeUrl='" + this.c.toString() + "', fifeUrlOptions='" + drfzVar.toString() + "', accountInfo='" + drfkVar.toString() + "'}";
    }
}
