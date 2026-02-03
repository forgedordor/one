package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjt {
    public static final void a(final long j, final jyq jyqVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-684938728);
        if (i3 == 0) {
            i2 = (true != hmlVarC.C(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(jyqVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            hpt hptVar = gyj.a;
            hnj.b(new hpu[]{gea.a.c(new ije(j)), hptVar.c(((jyq) hmlVarC.e(hptVar)).m(jyqVar))}, fdatVar, hmlVarC, ((i2 >> 3) & 112) | 8);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: hjs
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    long j2 = j;
                    jyq jyqVar2 = jyqVar;
                    hjt.a(j2, jyqVar2, fdatVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
