package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atqt extends attu {
    public final boolean a;
    public final boolean b;

    public atqt(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.attu
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.attu
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof attu) {
            attu attuVar = (attu) obj;
            if (this.a == attuVar.a() && this.b == attuVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "UpdateResult{isSuccessful=" + this.a + ", shouldRefreshConversation=" + this.b + "}";
    }
}
