package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etdp extends etdz {
    public etdn a;
    private boolean b;
    private byte c;

    @Override // defpackage.etdz
    public final etea a() {
        if (this.c == 1) {
            return new etdq(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: keepRawInput");
    }

    @Override // defpackage.etdz
    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }
}
