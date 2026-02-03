package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axcq extends fcyz implements fdat {
    final /* synthetic */ axcv a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axcq(fcxy fcxyVar, axcv axcvVar) {
        super(2, fcxyVar);
        this.a = axcvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axcq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("ParticipantsTableUpgrader-upgrade");
        bsboVarE.h(axcs.a);
        bsboVarE.h(axct.a);
        dqtr dqtrVarI = dqts.i(btyx.a().b(), btyx.c.h, ParticipantsTable.c.a);
        dqtrVarI.d(true);
        bsboVarE.H(dqtrVarI.g());
        ekgb ekgbVarZ = bsboVarE.b().z();
        ekgbVarZ.getClass();
        axcv axcvVar = this.a;
        axcvVar.b.d("ParticipantsTableUpgrader#upgrade", new axcr(ekgbVarZ, axcvVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axcq axcqVar = new axcq(fcxyVar, this.a);
        axcqVar.b = obj;
        return axcqVar;
    }
}
