package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class antc implements aokq {
    final /* synthetic */ ekgb a;
    final /* synthetic */ antf b;

    public antc(antf antfVar, ekgb ekgbVar) {
        this.a = ekgbVar;
        this.b = antfVar;
    }

    @Override // defpackage.aokq
    public final eiju a() {
        eieu eieuVarK = eiiy.k("getAllRecipientsById");
        ekgb ekgbVar = this.a;
        final antf antfVar = this.b;
        try {
            eiju eijuVarH = antf.l(ekgbVar).x().h(new ejvr() { // from class: ansa
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return antfVar.B((ekgb) obj);
                }
            }, antfVar.b);
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aokq
    public final /* bridge */ /* synthetic */ Object b() {
        return this.b.B(antf.l(this.a).z());
    }
}
