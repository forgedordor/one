package defpackage;

import android.util.Range;
import android.util.Rational;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdc implements lcj {
    private final bwi a;
    private final Rational b;

    public cdc(bwi bwiVar, Rational rational) {
        this.a = bwiVar;
        this.b = rational;
    }

    @Override // defpackage.lcj
    public final /* bridge */ /* synthetic */ Object a() {
        bwi bwiVar = this.a;
        ccw.e(bwiVar);
        ccw.d(bwiVar);
        bwl bwlVar = (bwl) bwiVar;
        int i = bwlVar.g;
        if (i == -1) {
            bbs.a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            i = 1;
        } else {
            bbs.a("DefAudioResolver", a.g(0, "Using supplied AUDIO channel count: "));
        }
        Range range = bwlVar.f;
        cdg cdgVarC = ccw.c(range, bwi.b.equals(range) ? 44100 : ((Integer) range.getUpper()).intValue(), i, 5, this.b);
        StringBuilder sb = new StringBuilder("Using AUDIO sample rate resolved from AudioSpec: Capture sample rate: ");
        int i2 = cdgVarC.a;
        sb.append(i2);
        sb.append("Hz. Encode sample rate: ");
        int i3 = cdgVarC.b;
        sb.append(i3);
        sb.append("Hz.");
        bbs.a("DefAudioResolver", sb.toString());
        cbh cbhVarG = cbi.g();
        cbhVarG.d(5);
        cbhVarG.c(2);
        cbhVarG.f(i);
        cbhVarG.e(i2);
        cbhVarG.g(i3);
        return cbhVarG.b();
    }
}
