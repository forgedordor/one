package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eshu extends esia {
    public String a;
    public int b;
    private long c;
    private byte d;

    @Override // defpackage.esia
    public final esib a() {
        if (this.d == 1) {
            return new eshv(this.a, this.c, this.b);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    @Override // defpackage.esia
    public final void b(long j) {
        this.c = j;
        this.d = (byte) 1;
    }
}
