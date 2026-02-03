package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dpil extends ea implements dpcg {
    static final /* synthetic */ fdeh[] aI;
    public static final ekrg aJ;
    public static final dnce aK;
    public final dpim aL;
    public eony aM;
    public fcsu aN;
    public fdjx aO;
    public Optional aP;
    public Optional aQ;
    public final fctc aR;
    public fdae aS;
    public Instant aT;
    protected fdae aU;
    private final fdcz ah;
    private Instant ai;
    private final Integer sF;
    private final fctc sG;
    private final fdcz sL;
    private final fctc sM;
    private final fctc sN;
    private final fctc sO;

    static {
        fdbv fdbvVar = new fdbv(dpil.class, "configurationOverride", "getConfigurationOverride()Lcom/google/android/libraries/compose/ui/fragment/HugoFragmentConfiguration;", 0);
        int i = fdcj.a;
        aI = new fdeh[]{fdbvVar, new fdbv(dpil.class, "isUiReady", "isUiReady()Z", 0)};
        aJ = ekrg.c("com/google/android/libraries/compose/ui/fragment/HugoFragment");
        aK = new dnce(0L);
    }

    public dpil() {
        this(null, null);
    }

    @Override // defpackage.ea
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.M(layoutInflater, viewGroup, bundle);
        Integer num = this.sF;
        if (num == null) {
            throw new IllegalArgumentException("No layoutId provided despite no onCreateView override.");
        }
        View viewGE = gE(num.intValue(), viewGroup);
        viewGE.getClass();
        return viewGE;
    }

    public final dngc bA() {
        return (dngc) this.sO.a();
    }

    public final dpim bB() {
        return (dpim) this.sN.a();
    }

    public final dpim bC() {
        if (!gC()) {
            return (dpim) this.sM.a();
        }
        dpim dpimVarBD = bD();
        return dpimVarBD != null ? dpimVarBD : bB();
    }

    public final dpim bD() {
        return (dpim) this.sL.c(aI[0]);
    }

    public final eony bE() {
        eony eonyVar = this.aM;
        if (eonyVar != null) {
            return eonyVar;
        }
        fdbq.c("timeSource");
        return null;
    }

    public final Duration bF() {
        Duration durationBetween = Duration.between(this.ai, this.aT);
        durationBetween.getClass();
        return durationBetween;
    }

    public final fdae bG() {
        fdae fdaeVar = this.aU;
        if (fdaeVar != null) {
            return fdaeVar;
        }
        fdbq.c("draftController");
        return null;
    }

    public final fdjx bH() {
        fdjx fdjxVar = this.aO;
        if (fdjxVar != null) {
            return fdjxVar;
        }
        fdbq.c("uiScope");
        return null;
    }

    public final void bI(dpim dpimVar) {
        this.sL.d(aI[0], dpimVar);
    }

    public final boolean bJ() {
        return ((Boolean) this.sG.a()).booleanValue();
    }

    public final boolean bK() {
        return ((Boolean) this.ah.c(aI[1])).booleanValue();
    }

    public final void bL() {
        this.ah.d(aI[1], true);
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        Instant instantA = bE().a();
        instantA.getClass();
        this.ai = instantA;
    }

    public void gA(fdae fdaeVar) {
        this.aU = fdaeVar;
    }

    public void gB(dpim dpimVar) {
        ekrd ekrdVar = (ekrd) aJ.h().h("com/google/android/libraries/compose/ui/fragment/HugoFragment", "onConfigurationChangedAfterUiReady", 220, "HugoFragment.kt");
        int i = fdcj.a;
        ekrdVar.t("%s configuration has changed", new fdbi(getClass()).c());
    }

    public boolean gC() {
        return false;
    }

    public boolean gD() {
        return false;
    }

    public View gE(int i, ViewGroup viewGroup) {
        return K().inflate(i, viewGroup, false);
    }

    public dpil(Integer num, dpim dpimVar) {
        this.sF = num;
        this.aL = dpimVar;
        this.sG = fctd.a(new fdae() { // from class: dpia
            @Override // defpackage.fdae
            public final Object invoke() {
                Optional optional = this.a.aQ;
                if (optional == null) {
                    fdbq.c("enableHugoUiRevampOptional");
                    optional = null;
                }
                Boolean bool = (Boolean) fdct.a(optional, false);
                bool.booleanValue();
                return bool;
            }
        });
        this.sL = new dpij(this);
        this.aR = fctd.a(new fdae() { // from class: dpib
            @Override // defpackage.fdae
            public final Object invoke() {
                dpil dpilVar = this.a;
                if (dpilVar.gC()) {
                    return fdvf.a(dpilVar.bC());
                }
                throw new IllegalStateException("Check failed.");
            }
        });
        this.sM = fctd.a(new fdae() { // from class: dpic
            @Override // defpackage.fdae
            public final Object invoke() {
                dpil dpilVar = this.a;
                dpim dpimVarBD = dpilVar.bD();
                return dpimVarBD == null ? dpilVar.bB() : dpimVarBD;
            }
        });
        this.sN = fctd.a(new fdae() { // from class: dpid
            @Override // defpackage.fdae
            public final Object invoke() {
                dpil dpilVar = this.a;
                Optional optional = dpilVar.aP;
                if (optional == null) {
                    fdbq.c("providedConfiguration");
                    optional = null;
                }
                final fdap fdapVar = new fdap() { // from class: dpif
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        fcsu fcsuVar = (fcsu) obj;
                        ekrg ekrgVar = dpil.aJ;
                        fcsuVar.getClass();
                        return (dpim) fcsuVar.b();
                    }
                };
                Optional map = optional.map(new Function() { // from class: dpig
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ekrg ekrgVar = dpil.aJ;
                        return fdapVar.invoke(obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                map.getClass();
                dpim dpimVar2 = (dpim) fdct.a(map, dpilVar.aL);
                if (dpimVar2 != null) {
                    return dpimVar2;
                }
                Class<?> cls = dpilVar.getClass();
                int i = fdcj.a;
                throw new IllegalStateException("Configuration wasn't provided for " + new fdbi(cls).c() + ", which had no default value");
            }
        });
        this.sO = fctd.a(new fdae() { // from class: dpie
            @Override // defpackage.fdae
            public final Object invoke() {
                fcsu fcsuVar = this.a.aN;
                if (fcsuVar == null) {
                    fdbq.c("tracingProvider");
                    fcsuVar = null;
                }
                return (dngc) fcsuVar.b();
            }
        });
        this.ah = new dpik(false, this);
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.ai = instant;
        Instant instant2 = Instant.EPOCH;
        instant2.getClass();
        this.aT = instant2;
        P().c(new dpih());
    }
}
