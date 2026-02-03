package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuck {
    public static final void a(final cucx cucxVar, hml hmlVar, final int i) {
        int i2;
        cucxVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(3762328);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(cucxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (cucxVar.a) {
            if (cucxVar.d.a) {
                hmlVarC.v(414548235);
                dlbt dlbtVar = cucxVar.c;
                if (dlbtVar != null) {
                    dlcm.e(dlbtVar, joj.a(ics.e, "SimSelectorConversation"), hmlVarC, 48);
                }
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(414680140);
                dlcn dlcnVar = cucxVar.b;
                if (dlcnVar != null) {
                    dlcm.f(dlcnVar, joj.a(ics.e, "SimSelectorConversation"), hmlVarC, 48);
                }
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cucj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cuck.a(cucxVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
