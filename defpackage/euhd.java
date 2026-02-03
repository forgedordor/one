package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhd extends eulg {
    public ekfw a;
    private ekgb b;

    @Override // defpackage.eulg
    public final eulj a() {
        ekfw ekfwVar = this.a;
        if (ekfwVar != null) {
            this.b = ekfwVar.g();
        } else if (this.b == null) {
            int i = ekgb.d;
            this.b = ekoe.a;
        }
        return new euhe(this.b);
    }
}
