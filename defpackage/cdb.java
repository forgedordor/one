package defpackage;

import android.util.Range;
import android.util.Rational;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdb implements lcj {
    private final bwi a;
    private final bkg b;
    private final Rational c;

    public cdb(bwi bwiVar, bkg bkgVar, Rational rational) {
        this.a = bwiVar;
        this.b = bkgVar;
        this.c = rational;
    }

    @Override // defpackage.lcj
    public final /* bridge */ /* synthetic */ Object a() {
        bwi bwiVar = this.a;
        ccw.e(bwiVar);
        ccw.d(bwiVar);
        bwl bwlVar = (bwl) bwiVar;
        int i = bwlVar.g;
        bkg bkgVar = this.b;
        int iB = bkgVar.b();
        if (i == -1) {
            bbs.a("AudioSrcAdPrflRslvr", a.g(iB, "Resolved AUDIO channel count from AudioProfile: "));
            i = iB;
        } else {
            bbs.a("AudioSrcAdPrflRslvr", a.z(0, iB, "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: ", ", Resolved Channel Count: ", "]"));
        }
        Range range = bwlVar.f;
        int iE = bkgVar.e();
        cdg cdgVarC = ccw.c(range, iE, i, 2, this.c);
        StringBuilder sb = new StringBuilder("Using resolved AUDIO sample rate or nearest supported from AudioProfile: Capture sample rate: ");
        int i2 = cdgVarC.a;
        sb.append(i2);
        sb.append("Hz. Encode sample rate: ");
        int i3 = cdgVarC.b;
        sb.append(i3);
        sb.append("Hz. [AudioProfile sample rate: ");
        sb.append(iE);
        sb.append("Hz]");
        bbs.a("AudioSrcAdPrflRslvr", sb.toString());
        cbh cbhVarG = cbi.g();
        cbhVarG.d(5);
        cbhVarG.c(2);
        cbhVarG.f(i);
        cbhVarG.e(i2);
        cbhVarG.g(i3);
        return cbhVarG.b();
    }
}
