package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbf extends fcyz implements fdat {
    private /* synthetic */ Object a;

    public tbf(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tbf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("getBugleDatabaseAssetInfo-messages");
        int iH = brdrVarD.b().h();
        botb botbVarE = botm.e();
        botbVarE.A("getBugleDatabaseAssetInfo-conversations");
        int iH2 = botbVarE.b().h();
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("getBugleDatabaseAssetInfo-parts");
        bsjeVarC.h(tbg.a);
        return new taa(iH, iH2, bsjeVarC.b().h());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tbf tbfVar = new tbf(fcxyVar);
        tbfVar.a = obj;
        return tbfVar;
    }
}
