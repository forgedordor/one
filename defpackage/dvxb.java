package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxb extends dvxf {
    public final dvxj a;
    private final String b;

    public dvxb(String str, dvxj dvxjVar) {
        this.b = str;
        this.a = dvxjVar;
    }

    @Override // defpackage.dvxf
    public final dvxj a() {
        return this.a;
    }

    @Override // defpackage.dvxf
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvxf) {
            dvxf dvxfVar = (dvxf) obj;
            if (this.b.equals(dvxfVar.b()) && this.a.equals(dvxfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "LighterJobParameters{tag=" + this.b + ", lighterRetryPolicy=" + this.a.toString() + "}";
    }
}
