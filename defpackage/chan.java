package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chan extends fcyz implements fdat {
    public chan(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new chan((fcxy) obj2).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bsra bsraVarA = bsrg.a();
        bsraVarA.A("PipelineWorkDatabaseOperations#getAllWorkItems");
        bsraVarA.s();
        ekgb<bspj> ekgbVarZ = bsraVarA.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        for (bspj bspjVar : ekgbVarZ) {
            bspjVar.getClass();
            arrayList.add(chak.a(bspjVar));
        }
        return arrayList;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chan(fcxyVar);
    }
}
