package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class antb implements aokq {
    final /* synthetic */ ekgb a;
    final /* synthetic */ antf b;

    public antb(antf antfVar, ekgb ekgbVar) {
        this.a = ekgbVar;
        this.b = antfVar;
    }

    @Override // defpackage.aokq
    public final eiju a() {
        return this.b.q(this.a);
    }

    @Override // defpackage.aokq
    public final /* synthetic */ Object b() {
        eieu eieuVarK = eiiy.k("getRecipientsByMessagingIdentity");
        try {
            ekgp ekgpVarC = this.b.C(antf.n(this.a).z());
            eieuVarK.close();
            return ekgpVarC;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
