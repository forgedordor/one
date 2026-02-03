package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abrf extends abrh {
    public final int a;
    public final String b;
    public final abgl c;
    public final String d;
    public final evqs e;

    public abrf(int i, String str, abgl abglVar, String str2, evqs evqsVar) {
        this.a = i;
        this.b = str;
        this.c = abglVar;
        this.d = str2;
        this.e = evqsVar;
    }

    @Override // defpackage.abrh
    public final int a() {
        return this.a;
    }

    @Override // defpackage.abrh
    public final abgl b() {
        return this.c;
    }

    @Override // defpackage.abrh
    public final evqs c() {
        return this.e;
    }

    @Override // defpackage.abrh
    public final String d() {
        return this.d;
    }

    @Override // defpackage.abrh
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abrh) {
            abrh abrhVar = (abrh) obj;
            if (this.a == abrhVar.a() && this.b.equals(abrhVar.e()) && this.c.equals(abrhVar.b()) && this.d.equals(abrhVar.d()) && this.e.equals(abrhVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        evqs evqsVar = this.e;
        return "FailureNotificationParams{retryCount=" + this.a + ", replyText=" + this.b + ", dittoConversationId=" + this.c.toString() + ", conversationName=" + this.d + ", conversationReplyPayload=" + evqsVar.toString() + "}";
    }
}
