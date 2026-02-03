package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahin implements cspu {
    final /* synthetic */ ahjq a;

    public ahin(ahjq ahjqVar) {
        this.a = ahjqVar;
    }

    @Override // defpackage.cspu
    public final csps a(ParticipantsTable.BindData bindData) {
        ahjq ahjqVar = this.a;
        ahnh ahnhVar = ahjqVar.a.a;
        eyik eyikVar = ahnhVar.qi;
        eyik eyikVar2 = ahnhVar.Ar;
        ahjr ahjrVar = ahjqVar.b;
        return new csps(eyikVar, eyikVar2, ahjrVar.W, ahjrVar.F, ahjrVar.I, (dqsn) ahnhVar.qq.b(), (fdjx) ahnhVar.oS.b(), bindData);
    }
}
