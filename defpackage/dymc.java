package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dymc extends pdk {
    @Override // defpackage.pdk
    public final String a() {
        return "UPDATE OR ABORT `EducationState` SET `name` = ?,`enabled` = ?,`numEducationImpressions` = ?,`numEducationInteractions` = ?,`activatedTimestampMs` = ?,`lastImpressionTimestampMs` = ?,`lastInteractionTimestampMs` = ?,`educationCompleted` = ? WHERE `name` = ?";
    }

    @Override // defpackage.pdk
    public final /* bridge */ /* synthetic */ void b(pjl pjlVar, Object obj) {
        dylo dyloVar = (dylo) obj;
        String str = dyloVar.a;
        if (str == null) {
            pjlVar.f(1);
        } else {
            pjlVar.g(1, str);
        }
        pjlVar.e(2, dyloVar.b ? 1L : 0L);
        pjlVar.e(3, dyloVar.c);
        pjlVar.e(4, dyloVar.d);
        pjlVar.e(5, dyloVar.e);
        pjlVar.e(6, dyloVar.f);
        pjlVar.e(7, dyloVar.g);
        pjlVar.e(8, dyloVar.h ? 1L : 0L);
        if (str == null) {
            pjlVar.f(9);
        } else {
            pjlVar.g(9, str);
        }
    }
}
