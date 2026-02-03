package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aohd extends fcyz implements fdat {
    final /* synthetic */ aohh a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aohd(fcxy fcxyVar, aohh aohhVar) {
        super(2, fcxyVar);
        this.a = aohhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aohd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("toProfilesTableBindData");
        bsbx bsbxVar = new bsbx();
        aohh aohhVar = this.a;
        bsbxVar.b(new aohe(aohhVar));
        bsboVarE.k(new bsbt(bsbxVar));
        ekgb ekgbVarZ = bsboVarE.b().z();
        ekgbVarZ.getClass();
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) fcva.N(ekgbVarZ);
        bindData.getClass();
        return anur.a(bindData);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aohd aohdVar = new aohd(fcxyVar, this.a);
        aohdVar.b = obj;
        return aohdVar;
    }
}
