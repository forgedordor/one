package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agew implements afzv {
    public final akz a;
    public final String b;

    public agew(akz akzVar, String str) {
        this.a = akzVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agew)) {
            return false;
        }
        agew agewVar = (agew) obj;
        return fdbq.f(this.a, agewVar.a) && fdbq.f(this.b, agewVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RbmWebviewCustomTab(customTabsIntent=" + this.a + ", webUri=" + this.b + ")";
    }
}
