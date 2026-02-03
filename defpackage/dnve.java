package defpackage;

import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnve implements dnva {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/emotify/controller/EmotifyCreationLauncherImpl");
    public final dnvi b;
    public final fdjx c;
    public final dnwx d;
    public dnuz e;
    public fdae f;
    public adj g;
    public final abvd h;
    private final ea i;
    private dnwy j;
    private final agwc k;

    public dnve(ea eaVar, dnvi dnviVar, agwc agwcVar, Optional optional, Optional optional2, fdjx fdjxVar) {
        dnviVar.getClass();
        optional.getClass();
        fdjxVar.getClass();
        this.i = eaVar;
        this.b = dnviVar;
        this.k = agwcVar;
        this.c = fdjxVar;
        this.h = (abvd) fdct.b(optional);
        this.d = (dnwx) fdct.b(optional2);
        this.e = new dnuz(0.0f, false, 3);
    }

    @Override // defpackage.dnva
    public final void a(fdae fdaeVar, dnwy dnwyVar, dnuz dnuzVar) {
        dnwyVar.getClass();
        this.f = fdaeVar;
        this.j = dnwyVar;
        this.e = dnuzVar;
        if (this.g == null) {
            this.g = this.i.fg().h.b("inputKey", new dnup(), new dnvc(this));
        }
    }

    @Override // defpackage.dnva
    public final void b() {
        if (this.f == null) {
            throw new IllegalStateException("launch() called before bind().");
        }
        abvd abvdVar = this.h;
        if (abvdVar != null) {
            dnwy dnwyVar = this.j;
            if (dnwyVar == null) {
                fdbq.c("entryPoint");
                dnwyVar = null;
            }
            abvdVar.a(dnwyVar);
        }
        agwc agwcVar = this.k;
        fdap fdapVar = new fdap() { // from class: dnvb
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                String str = (String) obj;
                str.getClass();
                dnve dnveVar = this.a;
                adj adjVar = dnveVar.g;
                if (adjVar == null) {
                    fdbq.c("launcher");
                    adjVar = null;
                }
                dnuz dnuzVar = dnveVar.e;
                adjVar.a(new dnuq(str, dnuzVar.a, dnuzVar.b), null);
                return fctx.a;
            }
        };
        ea eaVar = agwcVar.a;
        fr frVarJ = eaVar.J();
        ea eaVarH = frVarJ.h("ReactionPickerFragment");
        if (eaVarH != null) {
            cg cgVar = new cg(frVarJ);
            cgVar.o(eaVarH);
            cgVar.c();
        }
        aaap aaapVar = (aaap) aaar.a.createBuilder();
        aaapVar.getClass();
        aaas.d(4, aaapVar);
        String strY = eaVar.Y(R.string.select_image_for_photomoji);
        strY.getClass();
        aaas.b(strY, aaapVar);
        aaao aaaoVarA = aabc.a(aaas.a(aaapVar));
        aaaoVarA.t(frVarJ, "ReactionPickerFragment");
        aaaoVarA.H().n = new fdae() { // from class: agwa
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
        aaaoVarA.H().m = new fdae() { // from class: agwb
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
        aaaoVarA.H().q = fdapVar;
    }
}
