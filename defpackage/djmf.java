package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djmf {
    public static final void a(final djmy djmyVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        djmyVar.getClass();
        hml hmlVarC = hmlVar.c(-1263223211);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(djmyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = djmyVar instanceof djmj;
            ico icoVar = ics.e;
            if (z) {
                hmlVarC.v(1518242896);
                djkv.a(icoVar, (djmj) djmyVar, hmlVarC, (i3 >> 3) & 14);
                ((hmw) hmlVarC).ab();
            } else if (djmyVar instanceof djml) {
                hmlVarC.v(1518245017);
                djln.a(icoVar, (djml) djmyVar, hmlVarC, (i3 >> 3) & 14);
                ((hmw) hmlVarC).ab();
            } else if (djmyVar instanceof djmn) {
                hmlVarC.v(1518247153);
                djnb.a(icoVar, (djmn) djmyVar, hmlVarC, (i3 >> 3) & 14);
                ((hmw) hmlVarC).ab();
            } else if (djmyVar instanceof djmp) {
                hmlVarC.v(1518249074);
                djnj.a(icoVar, (djmp) djmyVar, hmlVarC, (i3 >> 3) & 14);
                ((hmw) hmlVarC).ab();
            } else if (djmyVar instanceof djmq) {
                hmlVarC.v(1518251092);
                djnl.a(icoVar, (djmq) djmyVar, hmlVarC, (i3 >> 3) & 14);
                ((hmw) hmlVarC).ab();
            } else if (djmyVar instanceof djmv) {
                hmlVarC.v(1518253271);
                djnw.a(icoVar, (djmv) djmyVar, hmlVarC, (i3 >> 3) & 14);
                ((hmw) hmlVarC).ab();
            } else {
                if (!(djmyVar instanceof djms)) {
                    hmlVarC.v(1518241957);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(1518255345);
                djno.a(icoVar, (djms) djmyVar, hmlVarC, (i3 >> 3) & 14);
                ((hmw) hmlVarC).ab();
            }
            icsVar = icoVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djme
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djmy djmyVar2 = djmyVar;
                    int i4 = i;
                    djmf.a(djmyVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
