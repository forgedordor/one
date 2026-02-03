package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyly extends pdm {
    @Override // defpackage.pdm
    public final String a() {
        return "INSERT OR IGNORE INTO `HighlightState` (`educationName`,`highlightId`,`numHighlightImpressions`,`numHighlightInteractions`,`highlightCompleted`) VALUES (?,?,?,?,?)";
    }

    @Override // defpackage.pdm
    public final /* bridge */ /* synthetic */ void b(pjl pjlVar, Object obj) {
        dylp dylpVar = (dylp) obj;
        String str = dylpVar.a;
        if (str == null) {
            pjlVar.f(1);
        } else {
            pjlVar.g(1, str);
        }
        String str2 = dylpVar.b;
        if (str2 == null) {
            pjlVar.f(2);
        } else {
            pjlVar.g(2, str2);
        }
        pjlVar.e(3, dylpVar.c);
        pjlVar.e(4, dylpVar.d);
        pjlVar.e(5, dylpVar.e ? 1L : 0L);
    }
}
