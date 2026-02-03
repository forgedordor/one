package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwnn extends dwqi {
    private int a;
    private int b;
    private byte c;

    @Override // defpackage.dwqi
    public final dwqj a() {
        if (this.c == 3) {
            return new dwno(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" badge");
        }
        if ((this.c & 2) == 0) {
            sb.append(" profileLabelStyle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwqi
    public final void b(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }

    @Override // defpackage.dwqi
    public final void c(int i) {
        this.b = i;
        this.c = (byte) (this.c | 2);
    }
}
