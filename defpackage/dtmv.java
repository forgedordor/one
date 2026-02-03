package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtmv extends dtvo {
    private int a;
    private byte b;

    @Override // defpackage.dtvo
    public final dtvp a() {
        if (this.b == 1) {
            return new dtmw(this.a);
        }
        throw new IllegalStateException("Missing required properties: removedFileGroupsCount");
    }

    @Override // defpackage.dtvo
    public final void b(int i) {
        this.a = i;
        this.b = (byte) 1;
    }
}
