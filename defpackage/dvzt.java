package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzt extends dwap {
    private boolean a;
    private int b;
    private byte c;

    @Override // defpackage.dwap
    public final dwaq a() {
        if (this.c == 3) {
            return new dvzu(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" isSuccessful");
        }
        if ((this.c & 2) == 0) {
            sb.append(" conversationsDownloaded");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwap
    public final void b(int i) {
        this.b = i;
        this.c = (byte) (this.c | 2);
    }

    @Override // defpackage.dwap
    public final void c(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }
}
