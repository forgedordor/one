package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhi {
    public static final void a(fdae fdaeVar, fdae fdaeVar2, hml hmlVar, final int i) {
        int i2;
        final fdae fdaeVar3;
        final fdae fdaeVar4;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-183550654);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 16 : 32;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar3 = fdaeVar;
            fdaeVar4 = fdaeVar2;
        } else {
            ecj ecjVar = ecr.e;
            ico icoVar = ics.e;
            ics icsVarD = egq.d(icoVar, 1.0f);
            ixm ixmVarA = egk.a(ecjVar, ibw.m, hmlVarC, 6);
            int iA = cvhb.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
            fdae fdaeVar5 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar5);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            egp egpVar = egp.a;
            dtdi.a(fdaeVar, egpVar.a(icoVar, 1.0f, true), false, null, null, null, null, null, cvgw.a, hmlVarC, (i4 & 14) | 805306368, 508);
            egt.a(egq.o(icoVar, 8.0f), hmlVarC);
            fdaeVar3 = fdaeVar;
            fdaeVar4 = fdaeVar2;
            dtdi.a(fdaeVar4, egpVar.a(icoVar, 1.0f, true), false, null, null, null, null, null, cvgw.b, hmlVarC, ((i4 >> 3) & 14) | 805306368, 508);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cvhg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar6 = fdaeVar3;
                    int i5 = i;
                    cvhi.a(fdaeVar6, fdaeVar4, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final djrr djrrVar, final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1734276709);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ico icoVar = ics.e;
            ics icsVarJ = efy.j(icoVar, 16.0f, 4.0f, 0.0f, 4.0f, 4);
            ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVarC, 48);
            int iA = cvhb.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            dtfn.a(djrs.b(djrrVar, hmlVarC), null, null, 0L, hmlVarC, 48, 12);
            egt.a(egq.o(icoVar, 16.0f), hmlVarC);
            hmlVar2 = hmlVarC;
            dthx.b(str, null, glz.a(hmlVarC).s, 0L, null, null, 0L, new khk(5), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).k, hmlVar2, (i2 >> 3) & 14, 0, 65018);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cvhe
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djrr djrrVar2 = djrrVar;
                    int i4 = i;
                    cvhi.b(djrrVar2, str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final fdvc fdvcVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(198220392);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdvcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            cvha cvhaVar = (cvha) hro.a(fdvcVar, hmlVarC).a();
            if (cvhaVar == null) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: cvhc
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            cvhi.c(fdvcVar, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            gvk.c(ehm.b(egq.c(ics.e, 1.0f), ehv.f(hmlVarC)), null, 0L, 0L, 0.0f, 0.0f, null, hxe.d(1193351405, new cvhh(cvhaVar), hmlVarC), hmlVarC, 126);
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: cvhd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cvhi.c(fdvcVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final edp edpVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1179349872);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(edpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            inz inzVarB = djrs.b(djrr.eS, hmlVarC);
            ico icoVar = ics.e;
            ics icsVarK = egq.k(icoVar, 32.0f);
            ibx ibxVar = ibw.k;
            dtfn.a(inzVarB, null, edp.a(icsVarK, ibxVar), glz.a(hmlVarC).s, hmlVarC, 48, 0);
            egt.a(egq.e(icoVar, 8.0f), hmlVarC);
            dthx.b(jqu.b(R.string.turn_off_rcs_title, hmlVarC), edp.a(icoVar, ibxVar), glz.a(hmlVarC).s, 0L, null, null, 0L, new khk(3), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).d, hmlVarC, 0, 0, 65016);
            egt.a(egq.e(icoVar, 24.0f), hmlVarC);
            dthx.b(jqu.b(R.string.turn_off_rcs_description, hmlVarC), null, glz.a(hmlVarC).s, 0L, null, null, 0L, new khk(5), 0L, 0, false, 0, 0, null, glz.d(hmlVarC).k, hmlVarC, 0, 0, 65018);
            hmlVarC = hmlVarC;
            egt.a(egq.e(icoVar, 8.0f), hmlVarC);
            b(djrr.at, jqu.b(R.string.high_quality_photos_video, hmlVarC), hmlVarC, 6);
            b(djrr.bz, jqu.b(R.string.rcs_group_chats, hmlVarC), hmlVarC, 6);
            b(djrr.ag, jqu.b(R.string.read_receipts, hmlVarC), hmlVarC, 6);
            b(djrr.cR, jqu.b(R.string.typing_indicators, hmlVarC), hmlVarC, 6);
            b(djrr.eX, jqu.b(R.string.messaging_with_wifi_data, hmlVarC), hmlVarC, 6);
            b(djrr.br, jqu.b(R.string.messaging_with_gemini, hmlVarC), hmlVarC, 6);
            egt.a(egq.e(icoVar, 24.0f), hmlVarC);
            ics icsVarD = efy.d(iex.a(dkr.c(icoVar, 1.0f, glz.a(hmlVarC).B, evn.b(12.0f)), evn.b(12.0f)), 16.0f);
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA = cvhb.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            b(djrr.bD, jqu.b(R.string.removed_in_30_days, hmlVarC), hmlVarC, 6);
            hmlVarC.n();
            egt.a(egq.e(icoVar, 24.0f), hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cvhf
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cvhi.d(edpVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
