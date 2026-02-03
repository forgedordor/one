package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egam extends egap {
    public ekgb a;
    private boolean b;
    private ekfw c;
    private ekgb d;
    private byte e;

    @Override // defpackage.egap
    public final egaq a() {
        ekfw ekfwVar = this.c;
        if (ekfwVar != null) {
            this.d = ekfwVar.g();
        } else if (this.d == null) {
            int i = ekgb.d;
            this.d = ekoe.a;
        }
        if (this.e == 1) {
            return new egan(this.b, this.d, this.a);
        }
        throw new IllegalStateException("Missing required properties: canSwitchAccounts");
    }

    @Override // defpackage.egap
    public final ekfw b() {
        if (this.c == null) {
            int i = ekgb.d;
            this.c = new ekfw();
        }
        return this.c;
    }

    @Override // defpackage.egap
    public final void c(boolean z) {
        this.b = z;
        this.e = (byte) 1;
    }
}
