package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwis extends dwpx {
    public final dwpk a;
    public final dwpw b;

    public dwis(dwpk dwpkVar, dwpw dwpwVar) {
        if (dwpkVar == null) {
            throw new NullPointerException("Null owner");
        }
        this.a = dwpkVar;
        if (dwpwVar == null) {
            throw new NullPointerException("Null oneOfId");
        }
        this.b = dwpwVar;
    }

    @Override // defpackage.dwpx
    public final dwpk a() {
        return this.a;
    }

    @Override // defpackage.dwpx
    public final dwpw b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwpx) {
            dwpx dwpxVar = (dwpx) obj;
            if (this.a.equals(dwpxVar.a()) && this.b.equals(dwpxVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        dwpw dwpwVar = this.b;
        return "ConversationId{owner=" + this.a.toString() + ", oneOfId=" + dwpwVar.toString() + "}";
    }
}
