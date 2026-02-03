package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgz implements dwdy {
    private static final String a = "dwgz";

    @Override // defpackage.dwdy
    public final dwqo a(dwje dwjeVar, eysq eysqVar) {
        dvhv.c(a, "link preview type is not associated with any LighterContentType");
        return dwlc.b(evqs.b);
    }

    @Override // defpackage.dwdy
    public final eyso b(dwqw dwqwVar) {
        ejwi ejwiVarA = ejud.a;
        if (dwqwVar.h().a() == 3 && ((dwnt) dwqwVar.h().b()).a.equals("link_preview")) {
            ejwiVarA = dwgp.a(dwqwVar);
        }
        if (!ejwiVarA.g()) {
            dvhv.c(a, "Attempted to convert non-link preview message");
            eyso eysoVar = (eyso) eysq.a.createBuilder();
            eyrc eyrcVar = eyrc.UNKNOWN;
            eysoVar.copyOnWrite();
            ((eysq) eysoVar.instance).n = eyrcVar.a();
            return eysoVar;
        }
        Object objC = ejwiVarA.c();
        eyso eysoVar2 = (eyso) eysq.a.createBuilder();
        eyrc eyrcVar2 = eyrc.TEXT;
        eysoVar2.copyOnWrite();
        ((eysq) eysoVar2.instance).n = eyrcVar2.a();
        eytb eytbVar = (eytb) eytc.a.createBuilder();
        String str = ((dwhd) objC).a;
        eytbVar.copyOnWrite();
        eytc eytcVar = (eytc) eytbVar.instance;
        str.getClass();
        eytcVar.b = str;
        eysoVar2.copyOnWrite();
        eysq eysqVar = (eysq) eysoVar2.instance;
        eytc eytcVar2 = (eytc) eytbVar.build();
        eytcVar2.getClass();
        eysqVar.f = eytcVar2;
        eysqVar.e = 102;
        return eysoVar2;
    }
}
