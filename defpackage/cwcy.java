package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwcy {
    public static final void a(final dbs dbsVar, final cwcv cwcvVar, final cyg cygVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        final dbs dbsVar2;
        final cyg cygVar2;
        ics icsVarA;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1794834812);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dbsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(cwcvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(cygVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            dbsVar2 = dbsVar;
            cygVar2 = cygVar;
        } else {
            if (cwcvVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: cwcw
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            dbs dbsVar3 = dbsVar;
                            cyg cygVar3 = cygVar;
                            cwcy.a(dbsVar3, null, cygVar3, icsVar, (hml) obj, hpy.a(i | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            hmlVarC.v(-1740587225);
            if (cwcvVar.b.a) {
                dbsVar2 = dbsVar;
                cygVar2 = cygVar;
                icsVarA = icsVar;
            } else {
                ico icoVar = ics.e;
                dbr dbrVarB = dbsVar.b("photoSelector_0", hmlVarC);
                dba dbaVarA = dbq.a();
                den denVar = cwco.a;
                den denVar2 = cwco.a;
                dbsVar2 = dbsVar;
                ics icsVarC = dbsVar2.c(icoVar, dbrVarB, cygVar, dae.l(dea.c(500, 0, denVar2, 2), 2), dae.m(dea.c(150, 0, denVar2, 2), 2), dcr.d, dbaVarA, dbp.a, dcr.c);
                cygVar2 = cygVar;
                icsVarA = icsVar.a(icsVarC);
            }
            dkri dkriVar = cwcvVar.a;
            ((hmw) hmlVarC).ab();
            dkqr.h(dkriVar, dihi.a(dkl.a(iex.a(icsVarA, evn.b(24.0f)), glz.a(hmlVarC).I, ikj.a), jqu.b(R.string.conversation_icon, hmlVarC), true), hmlVarC, 0);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: cwcx
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbs dbsVar3 = dbsVar2;
                    cwcv cwcvVar2 = cwcvVar;
                    cyg cygVar3 = cygVar2;
                    cwcy.a(dbsVar3, cwcvVar2, cygVar3, icsVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
