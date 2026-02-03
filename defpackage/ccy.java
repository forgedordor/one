package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccy implements lcj {
    private final String a;
    private final int b;
    private final bwi c;
    private final cbi d;

    public ccy(String str, int i, bwi bwiVar, cbi cbiVar) {
        this.a = str;
        this.b = i;
        this.c = bwiVar;
        this.d = cbiVar;
    }

    @Override // defpackage.lcj
    public final /* bridge */ /* synthetic */ Object a() {
        bbs.a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        cbi cbiVar = this.d;
        int iA = ccw.a(156000, cbiVar.e(), 2, cbiVar.f(), 48000, ((bwl) this.c).c);
        cdo cdoVarG = cdp.g();
        cdoVarG.g(this.a);
        cdoVarG.h(this.b);
        cdoVarG.i();
        cdoVarG.e(cbiVar.e());
        cdoVarG.d(cbiVar.d());
        cdoVarG.f(cbiVar.f());
        cdoVarG.c(iA);
        return cdoVarG.b();
    }
}
