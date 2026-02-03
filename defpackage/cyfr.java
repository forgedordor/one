package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyfr extends fcyz implements fdat {
    final /* synthetic */ cyfu a;
    final /* synthetic */ eg b;
    final /* synthetic */ Intent c;
    final /* synthetic */ hox d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyfr(cyfu cyfuVar, eg egVar, Intent intent, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cyfuVar;
        this.b = egVar;
        this.c = intent;
        this.d = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyfr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        aeo aeoVar = new aeo();
        final hox hoxVar = this.d;
        adj adjVarB = this.b.h.b("recover_key_flow", aeoVar, new adi() { // from class: cyfq
            @Override // defpackage.adi
            public final void a(Object obj2) {
                int i = ((adh) obj2).a;
                cyfu.a.p(a.e(i, "Got activity result ", " for enroll key flow"));
                hoxVar.b(a.g(i, "Finished enroll key flow. \nResultCode: "));
            }
        });
        cyfu cyfuVar = this.a;
        cyfuVar.d = adjVarB;
        adj adjVar = cyfuVar.d;
        if (adjVar == null) {
            fdbq.c("setNewLskfLauncher");
            adjVar = null;
        }
        adjVar.c(this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cyfr(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
