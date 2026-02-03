package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ebma extends ebmd {
    protected String d;
    public String e;

    protected ebma() {
    }

    @Override // defpackage.ebmd
    public String c() {
        return this.d;
    }

    @Override // defpackage.ebmd
    public Object clone() {
        try {
            return new ebma(this.d);
        } catch (Exception e) {
            throw new RuntimeException(String.valueOf(e.getMessage()).concat(String.valueOf(this.d)));
        }
    }

    public String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebma)) {
            return false;
        }
        ebma ebmaVar = (ebma) obj;
        return ejwh.a(this.e, ebmaVar.e) && ejwh.a(this.d, ebmaVar.d);
    }

    public void h(String str) {
        throw new UnsupportedOperationException("setMethod should be overridden");
    }

    public int hashCode() {
        int iHashCode = !ejwk.c(this.e) ? this.e.hashCode() : 0;
        return !ejwk.c(this.d) ? (iHashCode * 37) + this.d.hashCode() : iHashCode;
    }

    public boolean l() {
        return this instanceof eblx;
    }

    public String toString() {
        return c();
    }

    public ebma(String str) throws ebml {
        try {
            this.d = str;
            this.e = str.substring(0, str.indexOf(":"));
        } catch (Exception unused) {
            throw new ebml("URI, Bad URI format");
        }
    }
}
