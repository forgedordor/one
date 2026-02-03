package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfm {
    public final hum a = new hum(new dfh[16]);
    public long b;
    public final hox c;
    private final hox d;

    public dfm() {
        hsi hsiVar = hsi.a;
        this.d = new hpl(false, hsiVar);
        this.b = Long.MIN_VALUE;
        this.c = new hpl(true, hsiVar);
    }

    public final void a(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-318043801);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (hmlVarC.J((i2 & 3) != 2, i2 & 1)) {
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(null, hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            hox hoxVar = (hox) objS;
            if (((Boolean) this.c.a()).booleanValue() || ((Boolean) this.d.a()).booleanValue()) {
                hmlVarC.v(-144783432);
                boolean zF = hmlVarC.F(this);
                Object objS2 = hmwVar.S();
                if (zF || objS2 == obj) {
                    objS2 = new dfl(hoxVar, this, null);
                    hmwVar.af(objS2);
                }
                hob.g(this, (fdat) objS2, hmlVarC);
                hmwVar.ab();
            } else {
                hmlVarC.v(-143396709);
                hmwVar.ab();
            }
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dfg
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    this.a.a((hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void b(boolean z) {
        this.d.b(Boolean.valueOf(z));
    }
}
