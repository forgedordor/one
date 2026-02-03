package defpackage;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import j$.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeax {
    public static final Intent a(Account account, etzq etzqVar, Map map) {
        etzqVar.getClass();
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("extra.accountName", account.name);
        intent.putExtra("extra.screenId", etzqVar.rz);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Objects.toString(key);
            String strValueOf = String.valueOf(key);
            intent.putExtra("extra.screen.".concat(strValueOf), (String) entry.getValue());
        }
        return intent;
    }

    public static final void b(final etvj etvjVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1239336804);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(etvjVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else if (etvjVar == etvj.ENTERPRISE_CONTACT_ADMIN) {
            ico icoVar = ics.e;
            ics icsVarF = efy.f(egq.d(icoVar, 1.0f), 15.0f, 16.0f, 15.0f, 8.0f);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new fdap() { // from class: edzl
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        jtoVar.getClass();
                        jtk.u(jtoVar, "infoMessage");
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            ics icsVarC = jsh.c(icsVarF, false, (fdap) objS);
            ixm ixmVarA = egk.a(ecr.e, ibw.n, hmlVarC, 54);
            int iA = edzj.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
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
            ics icsVarJ = efy.j(icoVar, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            ioi ioiVar = fwg.a;
            if (ioiVar == null) {
                iog iogVar = new iog("Outlined.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                List list = ipr.a;
                ikt iktVar = new ikt(ije.a);
                ArrayList arrayList = new ArrayList(32);
                ioj.i(11.0f, 7.0f, arrayList);
                ioj.f(2.0f, arrayList);
                ioj.m(2.0f, arrayList);
                ioj.f(-2.0f, arrayList);
                ioj.b(arrayList);
                ioj.i(11.0f, 11.0f, arrayList);
                ioj.f(2.0f, arrayList);
                ioj.m(6.0f, arrayList);
                ioj.f(-2.0f, arrayList);
                ioj.b(arrayList);
                ioj.i(12.0f, 2.0f, arrayList);
                ioj.c(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f, arrayList);
                ioj.l(4.48f, 10.0f, 10.0f, 10.0f, arrayList);
                ioj.l(10.0f, -4.48f, 10.0f, -10.0f, arrayList);
                ioj.k(17.52f, arrayList);
                ioj.b(arrayList);
                ioj.i(12.0f, 20.0f, arrayList);
                ioj.d(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f, arrayList);
                ioj.l(3.59f, -8.0f, 8.0f, -8.0f, arrayList);
                ioj.l(8.0f, 3.59f, 8.0f, 8.0f, arrayList);
                ioj.l(-3.59f, 8.0f, -8.0f, 8.0f, arrayList);
                ioj.b(arrayList);
                iogVar.c(arrayList, 0, "", iktVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f);
                fwg.a = iogVar.a();
                ioiVar = fwg.a;
                ioiVar.getClass();
            }
            dtfn.b(ioiVar, null, icsVarJ, 0L, hmlVarC, 432, 8);
            hmlVar2 = hmlVarC;
            dthx.b(jqu.b(R.string.pqe_info_message_managed_organization, hmlVarC), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar2, 0, 0, 131070);
            hmlVar2.n();
        } else {
            hmlVar2 = hmlVarC;
            if (etvjVar != etvj.MESSAGE_UNDEFINED && etvjVar != etvj.NO_MESSAGE) {
                throw new fctg();
            }
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: edzm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    eeax.b(etvjVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf A[PHI: r9
      0x00cf: PHI (r9v17 int) = (r9v0 int), (r9v5 int), (r9v6 int) binds: [B:76:0x00cd, B:86:0x00e5, B:85:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r20, final java.lang.Object r21, final defpackage.fdae r22, final defpackage.fdae r23, final boolean r24, final boolean r25, final boolean r26, defpackage.etvj r27, defpackage.fdae r28, defpackage.hml r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeax.c(java.lang.String, java.lang.Object, fdae, fdae, boolean, boolean, boolean, etvj, fdae, hml, int, int):void");
    }

    public static final void d(final String str, fdae fdaeVar, boolean z, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        final fdae fdaeVar2;
        final boolean z2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-424859637);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            fdaeVar2 = fdaeVar;
            z2 = z;
            hmlVar2 = hmlVarC;
        } else {
            icc iccVar = ibw.n;
            ecj ecjVar = ecr.e;
            ico icoVar = ics.e;
            ics icsVarJ = efy.j(icoVar, 20.0f, 0.0f, 8.0f, 0.0f, 10);
            ixm ixmVarA = egk.a(ecjVar, iccVar, hmlVarC, 54);
            int iA = edzj.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            fdae fdaeVar3 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar3);
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
            dthx.b(str, egpVar.a(icoVar, 1.0f, false), glz.a(hmlVarC).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVarC).e, hmlVarC, i2 & 14, 3120, 55288);
            hmlVar2 = hmlVarC;
            fdaeVar2 = fdaeVar;
            z2 = z;
            ecye.a(228758, hxe.d(140180605, new edzw(fdaeVar2, z2), hmlVar2), hmlVar2, 54);
            hmlVar2.n();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: edzq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    fdae fdaeVar4 = fdaeVar2;
                    int i4 = i;
                    eeax.d(str2, fdaeVar4, z2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final /* synthetic */ add e(final edxi edxiVar, final fdae fdaeVar, final boolean z, hml hmlVar) {
        hmlVar.v(1107441342);
        aeo aeoVar = new aeo();
        hmlVar.v(-1746271574);
        boolean zD = hmlVar.D(fdaeVar) | hmlVar.F(edxiVar);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new fdap() { // from class: edzs
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    adh adhVar = (adh) obj;
                    adhVar.getClass();
                    Intent intent = adhVar.b;
                    String stringExtra = intent != null ? intent.getStringExtra("result.updatedPhotoUrl") : null;
                    edxi edxiVar2 = edxiVar;
                    if (stringExtra == null || fdgn.H(stringExtra)) {
                        fdil.d(edxiVar2.b, null, null, new edxc(edxiVar2, null), 3);
                    } else {
                        boolean z2 = z;
                        fdaeVar.invoke();
                        fdil.d(edxiVar2.b, null, null, new edxf(edxiVar2, stringExtra, z2, null), 3);
                    }
                    return fctx.a;
                }
            };
            hmlVar.y(objF);
        }
        hmlVar.o();
        add addVarA = acr.a(aeoVar, (fdap) objF, hmlVar);
        hmlVar.o();
        return addVarA;
    }

    public static final void f(final Object obj, final fdae fdaeVar, final boolean z, final boolean z2, final fdae fdaeVar2, edvo edvoVar, hml hmlVar, final int i) {
        Object obj2;
        int i2;
        final edvo edvoVar2;
        rdc rdcVar;
        final edvo edvoVar3;
        hml hmlVarC = hmlVar.c(-1272789563);
        if ((i & 6) == 0) {
            obj2 = obj;
            i2 = (true != hmlVarC.F(obj2) ? 2 : 4) | i;
        } else {
            obj2 = obj;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(fdaeVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((74899 & i2) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            edvoVar3 = edvoVar;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                edvoVar2 = (edvo) hmlVarC.e(edvu.a);
            } else {
                hmlVarC.s();
                edvoVar2 = edvoVar;
            }
            hmlVarC.l();
            ico icoVar = ics.e;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = edzj.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar3 = jbb.a;
            hmlVarC.x();
            int i3 = i2;
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar3);
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
            edf edfVar = edf.a;
            ics icsVarK = egq.k(iex.a(icoVar, evn.a), 170.0f);
            if (edvoVar2.b()) {
                fdat fdatVar2 = edxr.e;
                jtn jtnVar = rcy.b;
                rdcVar = new rdc(fdatVar2);
            } else {
                rdcVar = null;
            }
            rdc rdcVar2 = rdcVar;
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(edvoVar2) | ((i3 & 57344) == 16384);
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new fdap() { // from class: edzt
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        rbr rbrVar = (rbr) obj3;
                        rbrVar.getClass();
                        if (!edvoVar2.b()) {
                            return rbrVar;
                        }
                        rbr rbrVarA = rbrVar.a(new edzx(fdaeVar2));
                        rbrVarA.getClass();
                        return rbrVarA;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            edvoVar3 = edvoVar2;
            rcy.a(obj2, null, icsVarK, null, null, 0.0f, rdcVar2, null, (fdap) objS, hmlVarC, (i3 & 14) | 48, 376);
            ecye.a(228768, hxe.d(563709525, new eeab(z, fdaeVar, edfVar, z2), hmlVarC), hmlVarC, 54);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: edzk
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    Object obj5 = obj;
                    fdae fdaeVar4 = fdaeVar;
                    boolean z3 = z;
                    boolean z4 = z2;
                    fdae fdaeVar5 = fdaeVar2;
                    eeax.f(obj5, fdaeVar4, z3, z4, fdaeVar5, edvoVar3, (hml) obj3, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void g(final exwb exwbVar, final String str, final gun gunVar, final Account account, final edxi edxiVar, final dswt dswtVar, final edvs edvsVar, edvo edvoVar, hml hmlVar, final int i) {
        int i2;
        gun gunVar2;
        dswt dswtVar2;
        edvs edvsVar2;
        edvo edvoVar2;
        final edvo edvoVar3;
        exwbVar.getClass();
        str.getClass();
        gunVar.getClass();
        account.getClass();
        edxiVar.getClass();
        dswtVar.getClass();
        edvsVar.getClass();
        hml hmlVarC = hmlVar.c(173945028);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.B(exwbVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            gunVar2 = gunVar;
            i2 |= true != hmlVarC.D(gunVar2) ? 128 : 256;
        } else {
            gunVar2 = gunVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(account) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? hmlVarC.D(edxiVar) : hmlVarC.F(edxiVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            dswtVar2 = dswtVar;
            i2 |= true != hmlVarC.D(dswtVar2) ? 65536 : 131072;
        } else {
            dswtVar2 = dswtVar;
        }
        if ((1572864 & i) == 0) {
            edvsVar2 = edvsVar;
            i2 |= true != hmlVarC.F(edvsVar2) ? 524288 : 1048576;
        } else {
            edvsVar2 = edvsVar;
        }
        if ((12582912 & i) == 0) {
            i2 |= 4194304;
        }
        if ((4793491 & i2) == 4793490 && hmlVarC.I()) {
            hmlVarC.s();
            edvoVar3 = edvoVar;
        } else {
            int i3 = (-29360129) & i2;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                edvoVar2 = (edvo) hmlVarC.e(edvu.a);
            } else {
                hmlVarC.s();
                edvoVar2 = edvoVar;
            }
            hmlVarC.l();
            Map map = edzi.a;
            String str2 = (String) Map.EL.getOrDefault(edzi.a, exwbVar, "unkn");
            dsvb[] dsvbVarArr = {dswc.a(account.name), dtaa.a("profile_primitives_android")};
            evsl evslVar = ecxz.a;
            euqd euqdVar = (euqd) euqe.a.createBuilder();
            euqdVar.getClass();
            eupz eupzVar = (eupz) euqa.a.createBuilder();
            eupzVar.getClass();
            edvo edvoVar4 = edvoVar2;
            eurz eurzVar = (eurz) eusa.a.createBuilder();
            eurzVar.getClass();
            eurzVar.copyOnWrite();
            eusa eusaVar = (eusa) eurzVar.instance;
            eusaVar.c = exwbVar.cL;
            eusaVar.b |= 1;
            eurzVar.copyOnWrite();
            eusa eusaVar2 = (eusa) eurzVar.instance;
            eusaVar2.b |= 2;
            eusaVar2.d = str;
            eurzVar.copyOnWrite();
            eusa eusaVar3 = (eusa) eurzVar.instance;
            eusaVar3.e = 24;
            eusaVar3.b |= 4;
            evsn evsnVarBuild = eurzVar.build();
            evsnVarBuild.getClass();
            eupzVar.copyOnWrite();
            euqa euqaVar = (euqa) eupzVar.instance;
            euqaVar.c = (eusa) evsnVarBuild;
            euqaVar.b |= 2;
            evsn evsnVarBuild2 = eupzVar.build();
            evsnVarBuild2.getClass();
            euqdVar.copyOnWrite();
            euqe euqeVar = (euqe) euqdVar.instance;
            euqeVar.d = (euqa) evsnVarBuild2;
            euqeVar.c |= 1;
            evsn evsnVarBuild3 = euqdVar.build();
            evsnVarBuild3.getClass();
            dswtVar2.b(228769, new dsva[]{new dsva(evslVar, (euqe) evsnVarBuild3)}, dsvbVarArr, null, hxe.d(-831867538, new eeaw(edxiVar, gunVar2, account, str2, edvoVar4, edvsVar2), hmlVarC), hmlVarC, ((i3 << 9) & 234881024) | 12582918, 120);
            edvoVar3 = edvoVar4;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: edzr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    exwb exwbVar2 = exwbVar;
                    String str3 = str;
                    gun gunVar3 = gunVar;
                    Account account2 = account;
                    edxi edxiVar2 = edxiVar;
                    dswt dswtVar3 = dswtVar;
                    edvs edvsVar3 = edvsVar;
                    eeax.g(exwbVar2, str3, gunVar3, account2, edxiVar2, dswtVar3, edvsVar3, edvoVar3, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
