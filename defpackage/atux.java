package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atux extends atyr {
    private aufh a;
    private int b;
    private byte c;

    @Override // defpackage.atyr
    public final atys a() {
        aufh aufhVar;
        if (this.c == 1 && (aufhVar = this.a) != null) {
            return new atuy(aufhVar, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" incomingChatMessageRequest");
        }
        if (this.c == 0) {
            sb.append(" contentPartIndex");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.atyr
    public final void b(int i) {
        this.b = i;
        this.c = (byte) 1;
    }

    @Override // defpackage.atyr
    public final void c(aufh aufhVar) {
        if (aufhVar == null) {
            throw new NullPointerException("Null incomingChatMessageRequest");
        }
        this.a = aufhVar;
    }
}
