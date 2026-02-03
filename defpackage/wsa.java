package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsa {
    public final vvw a;
    public final vvw b;

    public wsa(vvw vvwVar, vvw vvwVar2) {
        vvwVar.getClass();
        this.a = vvwVar;
        this.b = vvwVar2;
    }

    public final boolean a(fdap fdapVar) {
        return !fdbq.f(fdapVar.invoke(this.a), fdapVar.invoke(this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsa)) {
            return false;
        }
        wsa wsaVar = (wsa) obj;
        return fdbq.f(this.a, wsaVar.a) && fdbq.f(this.b, wsaVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DraftDiff(curr=" + this.a + ", prev=" + this.b + ")";
    }
}
