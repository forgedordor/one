package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvd extends fcyz implements fdat {
    final /* synthetic */ ahwd a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvd(fcxy fcxyVar, ahwd ahwdVar) {
        super(2, fcxyVar);
        this.a = ahwdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahvd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        btqt btqtVarA = btqy.a();
        btqtVarA.A("RestoreWorkflowSettingsService#getAllRestoreExecutionsWaitingForAppUpdate");
        btqtVarA.s();
        btqtVarA.c(ahve.a);
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
        ahvd ahvdVar = new ahvd(fcxyVar, this.a);
        ahvdVar.b = obj;
        return ahvdVar;
    }
}
