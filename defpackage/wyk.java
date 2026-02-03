package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyk implements amwf {
    private final String a;
    private final ekgb b;

    public wyk(String str, ekgb ekgbVar) {
        this.a = str;
        this.b = ekgbVar;
        if (str.length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // defpackage.amwf
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.amwf, defpackage.amvr
    public final /* synthetic */ String b() {
        return "text/plain";
    }

    @Override // defpackage.amwf
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyk)) {
            return false;
        }
        wyk wykVar = (wyk) obj;
        return fdbq.f(this.a, wykVar.a) && fdbq.f(this.b, wykVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Text(text=" + ((Object) cqcy.c(this.a)) + ")";
    }
}
