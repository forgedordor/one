package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dssl extends dsst {
    public String a;
    public ekgi b;
    public int c;
    private ekgp d;

    @Override // defpackage.dsst
    public final dssu a() {
        ekgi ekgiVar = this.b;
        if (ekgiVar != null) {
            this.d = ekgiVar.c();
        } else if (this.d == null) {
            this.d = ekoj.a;
        }
        int i = this.c;
        if (i != 0) {
            return new dssm(i, this.a, this.d);
        }
        throw new IllegalStateException("Missing required properties: promoType");
    }
}
