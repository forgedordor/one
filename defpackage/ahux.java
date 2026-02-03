package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahux extends fcyz implements fdat {
    final /* synthetic */ ahwd a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahux(fcxy fcxyVar, ahwd ahwdVar) {
        super(2, fcxyVar);
        this.a = ahwdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahux) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        btqt btqtVarA = btqy.a();
        btqtVarA.A("RestoreWorkflowSettingsService#getAllActiveRestoreExecutions");
        btqtVarA.s();
        btqtVarA.c(new ahuy());
        ekgb<btor> ekgbVarZ = btqtVarA.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        for (btor btorVar : ekgbVarZ) {
            btorVar.getClass();
            arrayList.add(ahwd.y(btorVar));
        }
        return fcva.ao(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahux ahuxVar = new ahux(fcxyVar, this.a);
        ahuxVar.b = obj;
        return ahuxVar;
    }
}
