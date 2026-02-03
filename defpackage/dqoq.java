package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqoq extends dqtc {
    public String a;
    public dqsb b;
    public String c;
    private boolean d;
    private byte e;

    @Override // defpackage.dqtc
    public final dqtd a() {
        String str;
        dqsb dqsbVar;
        if (this.e == 1 && (str = this.a) != null && (dqsbVar = this.b) != null) {
            return new dqor(str, this.d, dqsbVar, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" tableName");
        }
        if (this.e == 0) {
            sb.append(" exemptFromQueryPlanChecking");
        }
        if (this.b == null) {
            sb.append(" loggingTag");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dqtc
    public final void b(boolean z) {
        this.d = z;
        this.e = (byte) 1;
    }
}
