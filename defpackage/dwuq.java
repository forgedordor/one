package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwuq extends dwvm {
    private int a;
    private float b;
    private byte c;

    @Override // defpackage.dwvm
    public final dwvn a() {
        if (this.c == 3) {
            return new dwur(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" lineColor");
        }
        if ((this.c & 2) == 0) {
            sb.append(" lineWidth");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwvm
    public final void b(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }

    @Override // defpackage.dwvm
    public final void c(float f) {
        this.b = f;
        this.c = (byte) (this.c | 2);
    }
}
