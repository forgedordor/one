package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzr extends dwan {
    public ejwi a;
    public ejwi b;
    private boolean c;
    private byte d;

    public dvzr() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.b = ejudVar;
    }

    @Override // defpackage.dwan
    public final dwao a() {
        if (this.d == 1) {
            return new dvzs(this.a, this.c, this.b);
        }
        throw new IllegalStateException("Missing required properties: syncBlockStatus");
    }

    @Override // defpackage.dwan
    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }
}
