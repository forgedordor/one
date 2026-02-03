package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axcr implements Runnable {
    final /* synthetic */ ekgb a;
    final /* synthetic */ axcv b;

    public axcr(ekgb ekgbVar, axcv axcvVar) {
        this.a = ekgbVar;
        this.b = axcvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ekqh it = this.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            String[] strArr = btyx.a;
            dqpd[] dqpdVarArrAH = bindData.aH("self_participants", new btxd[0]);
            dqpdVarArrAH.getClass();
            btxd btxdVar = (btxd) fcur.I(dqpdVarArrAH);
            String strO = btxdVar != null ? btxdVar.o() : null;
            axcm axcmVarI = this.b.a.i(bindData.r(), strO, null);
            bsbs bsbsVarF = ParticipantsTable.f();
            bsbsVarF.D(axcmVarI);
            bsbsVarF.e(bindData.R());
        }
    }
}
