package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwmn extends dwou {
    private boolean a;
    private byte b;

    @Override // defpackage.dwou
    public final dwov a() {
        if (this.b == 1) {
            return new dwmo(this.a);
        }
        throw new IllegalStateException("Missing required properties: blocked");
    }

    @Override // defpackage.dwou
    public final void b(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }
}
