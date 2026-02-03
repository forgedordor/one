package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjk extends acjq {
    private int a;
    private int b;
    private byte c;
    private acms d;

    @Override // defpackage.acjq
    public final acjr a() {
        if (this.c == 3 && this.d != null) {
            return new acjl(this.a, this.b, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" maxConversationCount");
        }
        if ((this.c & 2) == 0) {
            sb.append(" maxMessageCount");
        }
        if (this.d == null) {
            sb.append(" converter");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.acjq
    public final void b(acms acmsVar) {
        if (acmsVar == null) {
            throw new NullPointerException("Null converter");
        }
        this.d = acmsVar;
    }

    @Override // defpackage.acjq
    public final void c(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }

    @Override // defpackage.acjq
    public final void d(int i) {
        this.b = i;
        this.c = (byte) (this.c | 2);
    }
}
