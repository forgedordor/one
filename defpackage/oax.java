package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oax {
    public ekgb a;
    public int b;
    private final mcv c;
    private final oca d;
    private boolean e;

    public oax(oay oayVar) {
        this.a = oayVar.a;
        this.c = oayVar.b;
        this.d = oayVar.c;
        this.b = oayVar.d;
        this.e = oayVar.e;
    }

    public final oay a() {
        ekgb ekgbVar = this.a;
        int i = this.b;
        boolean z = false;
        if (this.e && i == 0) {
            z = true;
        }
        boolean z2 = z;
        return new oay(ekgbVar, this.c, this.d, i, z2);
    }

    public oax(obv obvVar, obv... obvVarArr) {
        ekfw ekfwVar = new ekfw();
        ekfwVar.h(obvVar);
        ekfwVar.i(obvVarArr);
        ekgb ekgbVarG = ekfwVar.g();
        mee.b(!ekgbVarG.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
        this.a = ekgb.n(ekgbVarG);
        this.c = mcv.a;
        this.d = oca.a;
    }
}
