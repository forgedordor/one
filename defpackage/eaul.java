package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaul extends eavl {
    public eatj a;
    public String b;
    private long c;
    private deem d;
    private byte e;

    @Override // defpackage.eavl
    public final eavm a() {
        if (this.e == 1) {
            return new eaum(this.a, this.b, this.c, this.d);
        }
        throw new IllegalStateException("Missing required properties: utcTimeMillis");
    }

    @Override // defpackage.eavl
    public final void b(deem deemVar) {
        this.d = deemVar;
    }

    @Override // defpackage.eavl
    public final void c(long j) {
        this.c = j;
        this.e = (byte) 1;
    }
}
