package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnhl {
    public final dnih a;
    public final dnhq b;

    public dnhl(dnih dnihVar, dnhq dnhqVar) {
        dnihVar.getClass();
        dnhqVar.getClass();
        this.a = dnihVar;
        this.b = dnhqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnhl)) {
            return false;
        }
        dnhl dnhlVar = (dnhl) obj;
        return fdbq.f(this.a, dnhlVar.a) && fdbq.f(this.b, dnhlVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DraftController(textController=" + this.a + ", attachmentsController=" + this.b + ")";
    }
}
