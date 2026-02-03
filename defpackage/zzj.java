package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzj {
    public static final void a(final zzh zzhVar, hml hmlVar, final int i) {
        int i2;
        fdae fdaeVar;
        dkdm dkdkVar;
        String strB;
        String str;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1384654243);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(zzhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarF = efy.f(ics.e, 8.0f, 24.0f, 8.0f, 16.0f);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarF);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdae fdaeVar3 = zzhVar.a;
            hmlVarC.v(1187185480);
            if (fdaeVar3 != null) {
                dkef.a(new dkeg(jqu.b(R.string.message_actions_turn_on_data_setting, hmlVarC), null, null, null, null, new dkdk(djrr.dG), null, fdaeVar3, 94), null, hmlVarC, 0, 2);
            }
            hmwVar.ab();
            hmlVarC.v(1187195788);
            fdae fdaeVar4 = zzhVar.e;
            if (fdaeVar4 != null && (str = zzhVar.j) != null) {
                dkef.a(new dkeg(jqu.c(R.string.message_actions_call_recipient, new Object[]{str}, hmlVarC), null, null, null, null, new dkdk(djrr.T), null, fdaeVar4, 94), null, hmlVarC, 0, 2);
            }
            hmwVar.ab();
            hmlVarC.v(1187209528);
            if (zzhVar.l && (fdaeVar = zzhVar.b) != null) {
                boolean z = zzhVar.h;
                fdae fdaeVar5 = (z || zzhVar.i) ? null : fdaeVar;
                if (z || zzhVar.i) {
                    dkdkVar = dkdj.a;
                } else {
                    dkdkVar = new dkdk(zzhVar.g ? djrr.dB : djrr.dA);
                }
                dkdm dkdmVar = dkdkVar;
                if (zzhVar.f) {
                    hmlVarC.v(-1697842712);
                    if (z) {
                        hmlVarC.v(-1697824205);
                        strB = jqu.b(R.string.message_actions_still_sending_as_rcs, hmlVarC);
                        hmwVar.ab();
                    } else if (zzhVar.i) {
                        hmlVarC.v(-1697686906);
                        String str2 = zzhVar.j;
                        if (str2 != null) {
                            strB = jqu.c(R.string.message_actions_delivers_when_recipient_online, new Object[]{str2}, hmlVarC);
                            hmwVar.ab();
                        } else {
                            hmwVar.ab();
                            hmwVar.ab();
                        }
                    } else {
                        hmlVarC.v(-1697197478);
                        strB = jqu.b(R.string.message_actions_resend_as_rcs, hmlVarC);
                        hmwVar.ab();
                    }
                    hmwVar.ab();
                } else {
                    hmlVarC.v(-1697073695);
                    if (z) {
                        hmlVarC.v(-1697038758);
                        strB = jqu.b(R.string.message_actions_still_sending, hmlVarC);
                        hmwVar.ab();
                    } else {
                        hmlVarC.v(-1696937791);
                        strB = jqu.b(R.string.message_actions_resend, hmlVarC);
                        hmwVar.ab();
                    }
                    hmwVar.ab();
                }
                dkef.a(new dkeg(strB, null, null, null, null, dkdmVar, null, fdaeVar5, 94), null, hmlVarC, 0, 2);
            }
            hmwVar.ab();
            fdae fdaeVar6 = zzhVar.c;
            hmlVarC.v(1187263961);
            if (fdaeVar6 != null) {
                boolean z2 = zzhVar.k;
                dkef.a(new dkeg(jqu.b(true != z2 ? R.string.message_actions_resend_as_fallback_no_connection : R.string.message_actions_resend_as_fallback, hmlVarC), null, null, null, null, new dkdk(djrr.dA, "SMS"), null, true != z2 ? null : fdaeVar6, 94), null, hmlVarC, 0, 2);
            }
            hmwVar.ab();
            fdae fdaeVar7 = zzhVar.d;
            hmlVarC.v(1187282260);
            if (fdaeVar7 != null) {
                dkef.a(new dkeg(jqu.b(true != zzhVar.h ? R.string.message_actions_delete : R.string.message_actions_stop_sending_and_delete, hmlVarC), null, null, null, null, new dkdk(djrr.aG), null, fdaeVar7, 94), null, hmlVarC, 0, 2);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zzi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    zzj.a(zzhVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
