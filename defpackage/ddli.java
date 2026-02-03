package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddli extends ddlo {
    public int a;
    private String b;
    private byte c;
    private int d;

    public final void a() {
        this.b = "";
    }

    @Override // defpackage.ddlo
    public final void b() {
        this.c = (byte) 1;
    }

    @Override // defpackage.ddlo
    public final void c() {
        this.d = 1;
    }

    @Override // defpackage.ddlo
    public final void d() {
        if (this.c == 1 && this.b != null && this.a != 0 && this.d != 0) {
            int i = ddlj.a;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" fileOwner");
        }
        if (this.c == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.a == 0) {
            sb.append(" fileChecks");
        }
        if (this.d == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
