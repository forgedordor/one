package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccx implements lcj {
    private final String a;
    private final int b;
    private final bwi c;
    private final cbi d;
    private final bkg e;

    public ccx(String str, int i, bwi bwiVar, cbi cbiVar, bkg bkgVar) {
        this.a = str;
        this.b = i;
        this.c = bwiVar;
        this.d = cbiVar;
        this.e = bkgVar;
    }

    @Override // defpackage.lcj
    public final /* bridge */ /* synthetic */ Object a() {
        bbs.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        bwi bwiVar = this.c;
        bkg bkgVar = this.e;
        int iA = bkgVar.a();
        cbi cbiVar = this.d;
        int iA2 = ccw.a(iA, cbiVar.e(), bkgVar.b(), cbiVar.f(), bkgVar.e(), ((bwl) bwiVar).c);
        cdo cdoVarG = cdp.g();
        cdoVarG.g(this.a);
        cdoVarG.h(this.b);
        cdoVarG.i();
        cdoVarG.e(cbiVar.e());
        cdoVarG.d(cbiVar.d());
        cdoVarG.f(cbiVar.f());
        cdoVarG.c(iA2);
        return cdoVarG.b();
    }
}
