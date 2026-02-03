package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dylz extends pdm {
    @Override // defpackage.pdm
    public final String a() {
        return "INSERT OR IGNORE INTO `EducationState` (`name`,`enabled`,`numEducationImpressions`,`numEducationInteractions`,`activatedTimestampMs`,`lastImpressionTimestampMs`,`lastInteractionTimestampMs`,`educationCompleted`) VALUES (?,?,?,?,?,?,?,?)";
    }

    @Override // defpackage.pdm
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
    }
}
