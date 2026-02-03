package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atuy extends atys {
    public final aufh a;
    public final int b;

    public atuy(aufh aufhVar, int i) {
        this.a = aufhVar;
        this.b = i;
    }

    @Override // defpackage.atys
    protected final int a() {
        return this.b;
    }

    @Override // defpackage.atys
    public final aufh b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atys) {
            atys atysVar = (atys) obj;
            if (this.a.equals(atysVar.b()) && this.b == atysVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "SinglePartIncomingChatMessageRequest{incomingChatMessageRequest=" + this.a.toString() + ", contentPartIndex=" + this.b + "}";
    }
}
