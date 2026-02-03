package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcc extends efek {
    private boolean a;
    private byte b;

    @Override // defpackage.efek
    public final efel a() {
        if (this.b == 1) {
            return new efcd(this.a);
        }
        throw new IllegalStateException("Missing required properties: supportsSubjectManagement");
    }

    @Override // defpackage.efek
    public final void b(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }
}
