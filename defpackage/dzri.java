package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzri extends dzrk {
    public int a;
    public ejwi b = ejud.a;
    public byte c;
    public int d;
    private boolean e;

    @Override // defpackage.dzrk
    public final dzrl a() {
        int i;
        if (this.c == 3 && (i = this.d) != 0) {
            return new dzrj(i, this.a, this.e, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" batchSize");
        }
        if ((this.c & 2) == 0) {
            sb.append(" enableUrlAutoSanitization");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzrk
    public final dzrk b(int i) {
        this.d = i;
        return this;
    }

    @Override // defpackage.dzrk
    public final void c(boolean z) {
        this.e = z;
        this.c = (byte) (this.c | 2);
    }
}
