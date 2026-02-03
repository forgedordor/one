package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqj {
    public final iac a = new iac();

    public final void a(final dqb dqbVar, hml hmlVar, final int i) {
        int i2 = i & 6;
        hml hmlVarC = hmlVar.c(1320309496);
        int i3 = i2 == 0 ? (true != hmlVarC.D(dqbVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(this) ? 16 : 32;
        }
        if (hmlVarC.J((i3 & 19) != 18, i3 & 1)) {
            iac iacVar = this.a;
            int iA = iacVar.a();
            for (int i4 = 0; i4 < iA; i4++) {
                ((fdau) iacVar.get(i4)).a(dqbVar, hmlVarC, Integer.valueOf(i3 & 14));
            }
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dqh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dqj dqjVar = this.a;
                    int i5 = i;
                    dqjVar.a(dqbVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
