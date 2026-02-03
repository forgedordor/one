package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drsj {
    public static final drsj a = new drsj();
    public static final drsj b = new drsj(null);
    public final Integer c = null;
    public final boolean d = false;

    private drsj() {
    }

    public final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        drsj drsjVar = (drsj) obj;
        return ejwh.a(this.c, drsjVar.c) && this.d == drsjVar.d;
    }

    public final int hashCode() {
        Integer num = this.c;
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        int i = true != this.d ? 0 : Integer.MIN_VALUE;
        num.intValue();
        return Integer.MAX_VALUE ^ i;
    }

    public final String toString() {
        if (equals(a)) {
            return "Disabled";
        }
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("metaVersion", this.c);
        ejwfVarB.h("replaceAll", this.d);
        return ejwfVarB.toString();
    }

    public drsj(byte[] bArr) {
    }
}
