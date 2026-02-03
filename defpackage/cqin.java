package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqin extends cqja {
    public String a;
    private long b;
    private byte c;

    @Override // defpackage.cqja
    public final cqjb a() {
        if (this.c == 1) {
            return new cqio(this.b, this.a);
        }
        throw new IllegalStateException("Missing required properties: id");
    }

    @Override // defpackage.cqja
    public final void b(long j) {
        this.b = j;
        this.c = (byte) 1;
    }
}
