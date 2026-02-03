package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djvo {
    public static final void a(final djvp djvpVar, final ics icsVar, hml hmlVar, final int i, final int i2) {
        int i3;
        hml hmlVar2;
        djvpVar.getClass();
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(-629176957);
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(djvpVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            if (i5 != 0) {
                icsVar = ics.e;
            }
            ics icsVar2 = icsVar;
            if (djvpVar instanceof djwc) {
                hmlVarC.v(951337237);
                djvz.d((djwc) djvpVar, icsVar2, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
                hmlVar2 = hmlVarC;
            } else if (djvpVar instanceof djyu) {
                hmlVarC.v(951339892);
                hmlVar2 = hmlVarC;
                djyg.e((djyu) djvpVar, icsVar2, null, null, hmlVar2, i3 & 112, 12);
                ((hmw) hmlVar2).ab();
            } else {
                hmlVar2 = hmlVarC;
                if (djvpVar instanceof djyx) {
                    hmlVar2.v(951342681);
                    djyw.a((djyx) djvpVar, icsVar2, hmlVar2, i3 & 112);
                    ((hmw) hmlVar2).ab();
                } else if (djvpVar instanceof djza) {
                    hmlVar2.v(951345460);
                    djyz.a((djza) djvpVar, icsVar2, hmlVar2, i3 & 112);
                    ((hmw) hmlVar2).ab();
                } else if (djvpVar instanceof djzh) {
                    hmlVar2.v(951347985);
                    djzg.a((djzh) djvpVar, icsVar2, null, hmlVar2, i3 & 112, 4);
                    hmlVar2 = hmlVar2;
                    ((hmw) hmlVar2).ab();
                } else if (djvpVar instanceof djzw) {
                    hmlVar2.v(951350648);
                    djzv.a((djzw) djvpVar, icsVar2, hmlVar2, i3 & 112, 0);
                    ((hmw) hmlVar2).ab();
                } else if (djvpVar instanceof dkao) {
                    hmlVar2.v(951353429);
                    dkan.e((dkao) djvpVar, icsVar2, hmlVar2, i3 & 112, 0);
                    ((hmw) hmlVar2).ab();
                } else if (djvpVar instanceof dkbn) {
                    hmlVar2.v(951356053);
                    dkbl.d((dkbn) djvpVar, icsVar2, hmlVar2, i3 & 112);
                    ((hmw) hmlVar2).ab();
                } else if (djvpVar instanceof dkbu) {
                    hmlVar2.v(951358576);
                    dkbt.a((dkbu) djvpVar, icsVar2, hmlVar2, i3 & 112);
                    ((hmw) hmlVar2).ab();
                } else if (djvpVar instanceof dkcd) {
                    hmlVar2.v(951361307);
                    dkcb.b((dkcd) djvpVar, icsVar2, hmlVar2, i3 & 112);
                    ((hmw) hmlVar2).ab();
                } else if (djvpVar instanceof dkcw) {
                    hmlVar2.v(951364018);
                    dkcv.e((dkcw) djvpVar, icsVar2, hmlVar2, i3 & 112);
                    ((hmw) hmlVar2).ab();
                } else if (djvpVar instanceof dkdh) {
                    hmlVar2.v(951366547);
                    dkdf.b((dkdh) djvpVar, icsVar2, hmlVar2, i3 & 112);
                    ((hmw) hmlVar2).ab();
                } else if (djvpVar instanceof dkep) {
                    hmlVar2.v(951369206);
                    dkeo.b((dkep) djvpVar, icsVar2, hmlVar2, i3 & 112);
                    ((hmw) hmlVar2).ab();
                } else if (djvpVar instanceof dkeg) {
                    hmlVar2.v(951371793);
                    dkef.a((dkeg) djvpVar, icsVar2, hmlVar2, i3 & 112, 0);
                    ((hmw) hmlVar2).ab();
                } else {
                    hmlVar2.v(-572197313);
                    ((hmw) hmlVar2).ab();
                }
            }
            icsVar = icsVar2;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djvn
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djvp djvpVar2 = djvpVar;
                    int i6 = i;
                    djvo.a(djvpVar2, icsVar, (hml) obj, hpy.a(i6 | 1), i2);
                    return fctx.a;
                }
            };
        }
    }
}
