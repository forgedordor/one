package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqoo extends dqsw {
    private boolean a;
    private boolean b;
    private byte c;

    @Override // defpackage.dqsw
    public final dqsx a() {
        if (this.c == 3) {
            return new dqop(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" withoutSqliteTransaction");
        }
        if ((this.c & 2) == 0) {
            sb.append(" deferredForeignKeyConstraints");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dqsw
    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    @Override // defpackage.dqsw
    public final void c(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }
}
