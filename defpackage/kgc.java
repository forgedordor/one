package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgc extends TextPaint {
    public int a;
    private ikb b;
    private khl c;
    private iko d;
    private ije e;
    private iiy f;
    private hsf g;
    private ihz h;
    private ina i;

    public kgc(float f) {
        super(1);
        this.density = f;
        this.c = khl.a;
        this.a = 3;
        this.d = iko.a;
    }

    private final ikb g() {
        ikb ikbVar = this.b;
        if (ikbVar != null) {
            return ikbVar;
        }
        iii iiiVar = new iii(this);
        this.b = iiiVar;
        return iiiVar;
    }

    private final void h() {
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void a(int i) {
        if (iis.b(i, this.a)) {
            return;
        }
        g().j(i);
        this.a = i;
    }

    public final void b(final iiy iiyVar, final long j, float f) {
        ihz ihzVar;
        if (iiyVar == null) {
            h();
            return;
        }
        if ((!fdbq.f(this.f, iiyVar) || (ihzVar = this.h) == null || !ihz.f(ihzVar.a, j)) && j != 9205357640488583168L) {
            this.f = iiyVar;
            this.h = new ihz(j);
            fdae fdaeVar = new fdae() { // from class: kgb
                @Override // defpackage.fdae
                public final Object invoke() {
                    return ((ikm) iiyVar).b(j);
                }
            };
            hxn hxnVar = hrp.a;
            this.g = new hnt(fdaeVar, null);
        }
        ikb ikbVarG = g();
        hsf hsfVar = this.g;
        ikbVarG.n(hsfVar != null ? (Shader) hsfVar.a() : null);
        this.e = null;
        kgd.a(this, f);
    }

    public final void c(long j) {
        ije ijeVar = this.e;
        if ((ijeVar != null && fcts.a(ijeVar.i, j)) || j == 16) {
            return;
        }
        this.e = new ije(j);
        setColor(ijg.b(j));
        h();
    }

    public final void d(ina inaVar) {
        if (inaVar == null || fdbq.f(this.i, inaVar)) {
            return;
        }
        this.i = inaVar;
        if (fdbq.f(inaVar, inc.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(inaVar instanceof ind)) {
            throw new fctg();
        }
        g().s(1);
        ind indVar = (ind) inaVar;
        g().r(indVar.a);
        g().q(indVar.b);
        g().p(indVar.d);
        g().o(indVar.c);
        g().t();
    }

    public final void e(iko ikoVar) {
        if (ikoVar == null || fdbq.f(this.d, ikoVar)) {
            return;
        }
        this.d = ikoVar;
        if (fdbq.f(ikoVar, iko.a)) {
            clearShadowLayer();
        } else {
            iko ikoVar2 = this.d;
            setShadowLayer(kgs.a(ikoVar2.d), Float.intBitsToFloat((int) (ikoVar2.c >> 32)), Float.intBitsToFloat((int) (this.d.c & 4294967295L)), ijg.b(this.d.b));
        }
    }

    public final void f(khl khlVar) {
        if (khlVar == null || fdbq.f(this.c, khlVar)) {
            return;
        }
        this.c = khlVar;
        setUnderlineText(khlVar.a(khl.b));
        setStrikeThruText(this.c.a(khl.c));
    }
}
