package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmh {
    public static final hpt a = new hsg(jlj.a);
    private static final hpt s = new hsg(jlk.a);
    private static final hpt t = new hsg(jlm.a);
    private static final hpt u = new hsg(jll.a);
    public static final hpt b = new hsg(jlo.a);
    public static final hpt c = new hsg(jln.a);
    public static final hpt d = new hsg(jlu.a);
    public static final hpt e = new hsg(jlq.a);
    public static final hpt f = new hsg(jlr.a);
    private static final hpt v = new hsg(jlt.a);
    public static final hpt g = new hsg(jls.a);
    public static final hpt h = new hsg(jlv.a);
    public static final hpt i = new hsg(jlw.a);
    public static final hpt j = new hsg(jlx.a);
    private static final hpt w = new hsg(jmb.a);
    public static final hpt k = new hsg(jma.a);
    public static final hpt l = new hsg(jmc.a);
    public static final hpt m = new hsg(jmd.a);
    public static final hpt n = new hsg(jme.a);
    public static final hpt o = new hsg(jmf.a);
    public static final hpt p = new hsg(jly.a);
    public static final hpt q = new hnz(hsi.a, jlz.a);
    public static final hpt r = new hsg(jlp.a);

    public static final void a(jfh jfhVar, jkp jkpVar, fdat fdatVar, hml hmlVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(1925803616);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? hmlVarC.D(jfhVar) : hmlVarC.F(jfhVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? hmlVarC.D(jkpVar) : hmlVarC.F(jkpVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if (hmlVarC.J((i3 & 147) != 146, i3 & 1)) {
            AndroidComposeView androidComposeView = (AndroidComposeView) jfhVar;
            hnj.b(new hpu[]{a.c(androidComposeView.t), s.c(androidComposeView.w), u.c(androidComposeView.x), t.c(androidComposeView.u), b.c(androidComposeView.y), c.c(androidComposeView.z), e.c(jfhVar.l()), f.c(androidComposeView.i), v.d(androidComposeView.V), g.d(jfhVar.k()), h.c(androidComposeView.K), i.c(androidComposeView.L), j.c(jfhVar.m()), w.c(androidComposeView.J), k.c(androidComposeView.U), l.c(androidComposeView.W), m.c(jkpVar), n.c(androidComposeView.m), o.c(androidComposeView.l), p.c(androidComposeView.aa), d.c(androidComposeView.ab)}, fdatVar, hmlVarC, ((i3 >> 3) & 112) | 8);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new jmg(jfhVar, jkpVar, fdatVar, i2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(a.a(str, "CompositionLocal ", " not present"));
    }
}
