package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eugt extends euid {
    public ekgb a;
    public String b;
    private boolean c;
    private byte d;

    @Override // defpackage.euid
    public final euih a() {
        ekgb ekgbVar;
        if (this.d == 1 && (ekgbVar = this.a) != null) {
            return new eugu(ekgbVar, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" conversationActions");
        }
        if (this.d == 0) {
            sb.append(" sensitive");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.euid
    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }
}
