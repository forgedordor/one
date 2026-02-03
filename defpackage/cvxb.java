package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvxb {
    public final djvp a;
    public final int b;

    public cvxb(djvp djvpVar, int i) {
        this.a = djvpVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvxb)) {
            return false;
        }
        cvxb cvxbVar = (cvxb) obj;
        return fdbq.f(this.a, cvxbVar.a) && this.b == cvxbVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConversationActionUiData(data=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append((Object) (this.b != 1 ? "ERROR" : "PRIMARY"));
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ cvxb(djvp djvpVar) {
        this(djvpVar, 1);
    }
}
