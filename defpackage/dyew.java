package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyew extends dygq {
    public ejwi a;
    public ejwi b;
    private boolean c;
    private byte d;

    public dyew() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.b = ejudVar;
    }

    @Override // defpackage.dygq
    public final dygr a() {
        if (this.d == 1) {
            return new dyex(this.a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: hasCaptionStyle");
    }

    @Override // defpackage.dygq
    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }
}
