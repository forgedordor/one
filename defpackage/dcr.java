package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcr {
    public static final dgi a = dea.b(0.0f, 400.0f, djm.a, 1);
    public static final dch c = new dch();
    public static final dcg d = new Object() { // from class: dcg
    };
    public static final cuz b = new cuz((byte[]) null);

    public static final void a(fdav fdavVar, hml hmlVar, int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1908320054);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdavVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (hmlVarC.J((i2 & 3) != 2, i2 & 1)) {
            ixj.a(hxe.d(2062852661, new dcp(fdavVar), hmlVarC), hmlVarC, 6);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new dcq(fdavVar, i);
        }
    }

    public static final void b(ics icsVar, fdau fdauVar, hml hmlVar, int i) {
        int i2 = i & 48;
        int i3 = i | 6;
        hml hmlVarC = hmlVar.c(646379026);
        if (i2 == 0) {
            i3 |= true != hmlVarC.F(fdauVar) ? 16 : 32;
        }
        if (hmlVarC.J((i3 & 19) != 18, i3 & 1)) {
            icsVar = ics.e;
            a(hxe.d(1948801580, new dci(fdauVar), hmlVarC), hmlVarC, 6);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new dcj(icsVar, fdauVar, i);
        }
    }
}
