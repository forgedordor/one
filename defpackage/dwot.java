package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwot extends dwsm {
    public final ejwi a;
    public final ejwi b;

    public dwot(ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
    }

    @Override // defpackage.dwsm
    public final ejwi a() {
        return this.a;
    }

    @Override // defpackage.dwsm
    public final ejwi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwsm) {
            dwsm dwsmVar = (dwsm) obj;
            if (this.a.equals(dwsmVar.a()) && this.b.equals(dwsmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.b;
        return "UserProperties{readReceiptOptIn=" + String.valueOf(this.a) + ", reviewPrivateReplyOptIn=" + String.valueOf(ejwiVar) + "}";
    }
}
