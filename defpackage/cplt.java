package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cplt extends cpth {
    private ekgi a;
    private ekgp b;

    @Override // defpackage.cpth
    public final cpti a() {
        ekgp ekgpVarC;
        ekgi ekgiVar = this.a;
        if (ekgiVar == null) {
            if (this.b == null) {
                ekgpVarC = ekoj.a;
            }
            return new cplu(this.b);
        }
        ekgpVarC = ekgiVar.c();
        this.b = ekgpVarC;
        return new cplu(this.b);
    }

    @Override // defpackage.cpth
    public final ekgi b() {
        if (this.a == null) {
            this.a = new ekgi();
        }
        return this.a;
    }
}
