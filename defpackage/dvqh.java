package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvqh extends dvqu {
    public final ejwi a;
    public final ejwi b;

    public dvqh(ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
    }

    @Override // defpackage.dvqu
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.dvqu
    public final ejwi b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvqu) {
            dvqu dvquVar = (dvqu) obj;
            if (this.a.equals(dvquVar.b()) && this.b.equals(dvquVar.a())) {
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
        return "ReceiveMessagesResult{tachyonMessage=" + String.valueOf(this.a) + ", ackId=" + String.valueOf(ejwiVar) + "}";
    }
}
