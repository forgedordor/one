package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dpxo extends dpil implements dpvx {
    static final /* synthetic */ fdeh[] aV;
    public boolean aW;
    public dpux aX;
    public int aY;
    protected dpuq aZ;
    private final fdcz sJ;
    private dpvw sK;

    static {
        fdbv fdbvVar = new fdbv(dpxo.class, "colors", "getColors()Lcom/google/android/libraries/compose/ui/composable/theme/HugoColors;", 0);
        int i = fdcj.a;
        aV = new fdeh[]{fdbvVar};
    }

    public dpxo() {
        this((Integer) null, 3);
    }

    public static final void bQ(dpvw dpvwVar, int i) {
        boolean zH = dpvwVar.h();
        dpvwVar.f(i);
        if (zH) {
            dpvwVar.k(false);
        }
    }

    public static /* synthetic */ void bR(dpxo dpxoVar) {
        dpvw dpvwVarGw = dpxoVar.gw();
        if (dpvwVarGw != null) {
            dpvwVarGw.k(true);
        }
    }

    public final dpux bM() {
        dpux dpuxVar = this.aX;
        if (dpuxVar != null) {
            return dpuxVar;
        }
        fdbq.c("renderingStrategy");
        return null;
    }

    public final void bN(dpvw dpvwVar) {
        int i = this.aY;
        if (i != 0) {
            bQ(dpvwVar, i);
            this.aY = 0;
        }
    }

    public final void bO(dpgl dpglVar) {
        this.sJ.d(aV[0], dpglVar);
    }

    public final dpuq bP() {
        dpuq dpuqVar = this.aZ;
        if (dpuqVar != null) {
            return dpuqVar;
        }
        fdbq.c("renderingStateHandler");
        return null;
    }

    public final void bS() {
        this.aW = true;
        dpgl dpglVar = (dpgl) this.sJ.c(aV[0]);
        if (dpglVar != null) {
            aZ(dpglVar);
        }
    }

    public dpvw gw() {
        dpvw dpvwVarS = this.sK;
        if (dpvwVarS == null) {
            dpvwVarS = s();
            if (dpvwVarS != null) {
                bN(dpvwVarS);
            }
            this.sK = dpvwVarS;
        }
        return dpvwVarS;
    }

    public void gx(dpuv dpuvVar) {
        dpuvVar.getClass();
    }

    public void gy() {
        bR(this);
    }

    public void gz(dpux dpuxVar, dpuq dpuqVar) {
        dpuxVar.getClass();
        dpuqVar.getClass();
        this.aX = dpuxVar;
        this.aZ = dpuqVar;
        bO(dpuxVar.k);
    }

    @Override // defpackage.ea
    public void l() {
        super.l();
        gw();
    }

    public abstract dpxe t();

    public dpxo(Integer num) {
        this(num, 2);
    }

    public dpxo(Integer num, dpxp dpxpVar) {
        super(num, dpxpVar);
        this.sJ = new dpxn(this);
    }

    public /* synthetic */ dpxo(Integer num, int i) {
        this(1 == (i & 1) ? null : num, (dpxp) null);
    }

    public void bf() {
    }

    public void bg() {
    }

    protected void aZ(dpgl dpglVar) {
    }
}
