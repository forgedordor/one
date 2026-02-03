package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeaw implements fdat {
    final /* synthetic */ edxi a;
    final /* synthetic */ gun b;
    final /* synthetic */ Account c;
    final /* synthetic */ String d;
    final /* synthetic */ edvo e;
    final /* synthetic */ edvs f;

    public eeaw(edxi edxiVar, gun gunVar, Account account, String str, edvo edvoVar, edvs edvsVar) {
        this.a = edxiVar;
        this.b = gunVar;
        this.c = account;
        this.d = str;
        this.e = edvoVar;
        this.f = edvsVar;
    }

    public static final void b(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final void c(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Object obj3;
        final edxi edxiVar;
        gun gunVar;
        final hox hoxVar;
        hml hmlVar;
        edwx edwxVar;
        Object obj4;
        int i;
        Account account;
        add addVar;
        hox hoxVar2;
        edxi edxiVar2;
        String str;
        hml hmlVar2 = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar2.I()) {
            hmlVar2.s();
        } else {
            final edxi edxiVar3 = this.a;
            edwx edwxVar2 = (edwx) edxiVar3.e.a();
            Object[] objArr = new Object[0];
            hmlVar2.v(1849434622);
            Object objF = hmlVar2.f();
            Object obj5 = hmk.a;
            if (objF == obj5) {
                objF = new fdae() { // from class: eeag
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return new hpl(false, hsi.a);
                    }
                };
                hmlVar2.y(objF);
            }
            hmlVar2.o();
            final hox hoxVar3 = (hox) hxy.a(objArr, (fdae) objF, hmlVar2, 48);
            Object[] objArr2 = new Object[0];
            hmlVar2.v(1849434622);
            Object objF2 = hmlVar2.f();
            if (objF2 == obj5) {
                objF2 = new fdae() { // from class: eeal
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return new hpl(false, hsi.a);
                    }
                };
                hmlVar2.y(objF2);
            }
            hmlVar2.o();
            final hox hoxVar4 = (hox) hxy.a(objArr2, (fdae) objF2, hmlVar2, 48);
            hmlVar2.v(5004770);
            boolean zF = hmlVar2.F(edxiVar3);
            Object objF3 = hmlVar2.f();
            if (zF || objF3 == obj5) {
                objF3 = new fdae() { // from class: eeam
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        edxiVar3.f.f(true);
                        return fctx.a;
                    }
                };
                hmlVar2.y(objF3);
            }
            fdae fdaeVar = (fdae) objF3;
            hmlVar2.o();
            final String strB = jqu.b(R.string.pqe_banner_offline, hmlVar2);
            Object objF4 = hmlVar2.f();
            if (objF4 == obj5) {
                objF4 = hob.a(fcyi.a, hmlVar2);
                hmlVar2.y(objF4);
            }
            final fdjx fdjxVar = (fdjx) objF4;
            hmlVar2.v(-1224400529);
            final gun gunVar2 = this.b;
            boolean zD = hmlVar2.D(gunVar2) | hmlVar2.F(edxiVar3) | hmlVar2.D(hoxVar3) | hmlVar2.F(fdjxVar) | hmlVar2.D(strB);
            Object objF5 = hmlVar2.f();
            if (zD || objF5 == obj5) {
                obj3 = new fdae() { // from class: eean
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        gun gunVar3 = gunVar2;
                        guk gukVarA = gunVar3.a();
                        if (gukVarA != null) {
                            gukVarA.a();
                        }
                        if (((edwi) edxiVar3.a).i.a()) {
                            eeaw.b(hoxVar3, true);
                        } else {
                            fdil.d(fdjxVar, null, null, new eeav(gunVar3, strB, null), 3);
                        }
                        return fctx.a;
                    }
                };
                edxiVar = edxiVar3;
                gunVar = gunVar2;
                hoxVar = hoxVar3;
                hmlVar2.y(obj3);
            } else {
                hoxVar = hoxVar3;
                obj3 = objF5;
                edxiVar = edxiVar3;
                gunVar = gunVar2;
            }
            fdae fdaeVar2 = (fdae) obj3;
            hmlVar2.o();
            String strB2 = jqu.b(R.string.pqe_uploading_photo, hmlVar2);
            hmlVar2.v(5004770);
            boolean zD2 = hmlVar2.D(hoxVar);
            Object objF6 = hmlVar2.f();
            if (zD2 || objF6 == obj5) {
                objF6 = new fdae() { // from class: eeao
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        eeaw.b(hoxVar, false);
                        return fctx.a;
                    }
                };
                hmlVar2.y(objF6);
            }
            fdae fdaeVar3 = (fdae) objF6;
            hmlVar2.o();
            hmlVar2.v(-1081499869);
            aeo aeoVar = new aeo();
            hmlVar2.v(5004770);
            boolean zF2 = hmlVar2.F(edxiVar);
            Object objF7 = hmlVar2.f();
            if (zF2 || objF7 == obj5) {
                objF7 = new fdap() { // from class: edzn
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj6) {
                        adh adhVar = (adh) obj6;
                        adhVar.getClass();
                        Intent intent = adhVar.b;
                        String stringExtra = intent != null ? intent.getStringExtra("result.updatedProfileName") : null;
                        if (stringExtra != null && !fdgn.H(stringExtra)) {
                            edxi edxiVar4 = edxiVar;
                            fdil.d(edxiVar4.b, null, null, new edxe(edxiVar4, stringExtra, null), 3);
                        }
                        return fctx.a;
                    }
                };
                hmlVar2.y(objF7);
            }
            hmlVar2.o();
            final add addVarA = acr.a(aeoVar, (fdap) objF7, hmlVar2);
            hmlVar2.o();
            add addVarE = eeax.e(edxiVar, fdaeVar3, false, hmlVar2);
            gun gunVar3 = gunVar;
            final add addVarE2 = eeax.e(edxiVar, fdaeVar3, true, hmlVar2);
            hmlVar2.v(-1633490746);
            boolean zF3 = hmlVar2.F(addVarA);
            final Account account2 = this.c;
            boolean zF4 = zF3 | hmlVar2.F(account2);
            Object objF8 = hmlVar2.f();
            if (zF4 || objF8 == obj5) {
                objF8 = new fdae() { // from class: eeac
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        addVarA.c(eeax.a(account2, etzq.PROFILE_NAME_EDIT_SCREEN, fcwa.c(new fcti("source", "profile_primitive"))));
                        return fctx.a;
                    }
                };
                hmlVar2.y(objF8);
            }
            fdae fdaeVar4 = (fdae) objF8;
            hmlVar2.o();
            ico icoVar = ics.e;
            ics icsVarB = cyi.b(egq.u(egq.d(icoVar, 1.0f), 228.0f, 0.0f, 2));
            String str2 = this.d;
            edvo edvoVar = this.e;
            edvs edvsVar = this.f;
            ixm ixmVarA = edl.a(ecr.e, ibw.k, hmlVar2, 54);
            long jB = hmg.b(hmlVar2);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar2.N();
            ics icsVarB2 = icj.b(hmlVar2, icsVarB);
            final hox hoxVar5 = hoxVar;
            fdae fdaeVar5 = jbb.a;
            hmlVar2.M();
            hmlVar2.x();
            if (hmlVar2.H()) {
                hmlVar2.j(fdaeVar5);
            } else {
                hmlVar2.z();
            }
            int i2 = (int) j;
            hsk.b(hmlVar2, ixmVarA, jbb.e);
            hsk.b(hmlVar2, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar2.H() || !fdbq.f(hmlVar2.f(), Integer.valueOf(i2))) {
                Integer numValueOf = Integer.valueOf(i2);
                hmlVar2.y(numValueOf);
                hmlVar2.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar2, icsVarB2, jbb.c);
            if (edwxVar2 instanceof edwv) {
                hmlVar2.v(-2076635879);
                hmlVar = hmlVar2;
                dtgm.a(null, 0L, 0.0f, 0L, 0, 0.0f, hmlVar, 0, 63);
                hmlVar.o();
            } else if (edwxVar2 instanceof edws) {
                hmlVar2.v(-2076501525);
                edws edwsVar = (edws) edwxVar2;
                eeax.c(edwsVar.a, edwsVar.b, fdaeVar2, fdaeVar4, true, true, true, null, null, hmlVar2, 1794048, 384);
                hmlVar = hmlVar2;
                hmlVar.v(-1224400529);
                boolean zD3 = hmlVar.D(gunVar3) | hmlVar.F(addVarE) | hmlVar.F(account2) | hmlVar.F(edwxVar2) | hmlVar.D(str2);
                Object objF9 = hmlVar.f();
                if (zD3 || objF9 == obj5) {
                    eeap eeapVar = new eeap(gunVar3, addVarE, account2, edwxVar2, str2, null);
                    hmlVar.y(eeapVar);
                    objF9 = eeapVar;
                }
                hmlVar.o();
                hob.g(true, (fdat) objF9, hmlVar);
                hmlVar.o();
            } else if (edwxVar2 instanceof edwr) {
                hmlVar2.v(-2075473286);
                guk gukVarA = gunVar3.a();
                if (gukVarA != null) {
                    gukVarA.a();
                }
                dtfn.a(jqq.a(R.drawable.gs_warning_vd_theme_24, hmlVar2, 0), null, egq.k(icoVar, 100.0f), glz.a(hmlVar2).A, hmlVar2, 432, 0);
                egt.a(egq.e(icoVar, 16.0f), hmlVar2);
                final edxi edxiVar4 = edxiVar;
                dthx.b(jqu.b(R.string.pqe_something_went_wrong, hmlVar2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVar2, 0, 0, 131070);
                hmlVar = hmlVar2;
                egt.a(egq.e(icoVar, 16.0f), hmlVar);
                if (edvoVar.b()) {
                    hmlVar.v(-2074993158);
                    ecye.a(241556, hxe.d(-1104436909, new eear(edxiVar4, account2), hmlVar), hmlVar, 54);
                    hmlVar.o();
                } else {
                    hmlVar.v(-2074721133);
                    hmlVar.v(-1633490746);
                    boolean zF5 = hmlVar.F(edxiVar4) | hmlVar.F(account2);
                    Object objF10 = hmlVar.f();
                    if (zF5 || objF10 == obj5) {
                        objF10 = new fdae() { // from class: eead
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                edxiVar4.a(account2);
                                return fctx.a;
                            }
                        };
                        hmlVar.y(objF10);
                    }
                    hmlVar.o();
                    dtdi.c((fdae) objF10, null, false, null, null, null, null, edxr.b, hmlVar, 805306368, 510);
                    hmlVar.o();
                }
                hmlVar.o();
            } else {
                edxi edxiVar5 = edxiVar;
                if (edwxVar2 instanceof edww) {
                    hmlVar2.v(-2074498398);
                    edww edwwVar = (edww) edwxVar2;
                    eeax.c(edwwVar.a, edwwVar.b, fdaeVar2, fdaeVar4, true, true, true, null, null, hmlVar2, 1794048, 384);
                    hmlVar = hmlVar2;
                    hmlVar.v(-1633490746);
                    boolean zD4 = hmlVar.D(gunVar3) | hmlVar.D(strB2);
                    Object objF11 = hmlVar.f();
                    if (zD4 || objF11 == obj5) {
                        objF11 = new eeas(gunVar3, strB2, null);
                        hmlVar.y(objF11);
                    }
                    hmlVar.o();
                    hob.g(true, (fdat) objF11, hmlVar);
                    hmlVar.o();
                } else {
                    if (!(edwxVar2 instanceof edwu)) {
                        hmlVar2.v(-898268902);
                        hmlVar2.o();
                        throw new fctg();
                    }
                    hmlVar2.v(-2073834905);
                    edwu edwuVar = (edwu) edwxVar2;
                    eeax.c(edwuVar.a, edwuVar.b, fdaeVar2, fdaeVar4, edwuVar.c, false, edwuVar.h, edwuVar.d, fdaeVar, hmlVar2, 196608, 0);
                    hmlVar = hmlVar2;
                    hmlVar.v(-898168982);
                    if (((Boolean) hoxVar4.a()).booleanValue()) {
                        hmlVar.v(5004770);
                        boolean zD5 = hmlVar.D(hoxVar4);
                        Object objF12 = hmlVar.f();
                        if (zD5 || objF12 == obj5) {
                            objF12 = new fdae() { // from class: eeae
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    eeaw.c(hoxVar4, false);
                                    return fctx.a;
                                }
                            };
                            hmlVar.y(objF12);
                        }
                        hmlVar.o();
                        edxiVar2 = edxiVar5;
                        obj4 = obj5;
                        hoxVar2 = hoxVar4;
                        edwxVar = edwxVar2;
                        i = 5004770;
                        addVar = addVarE;
                        str = str2;
                        account = account2;
                        dtcp.a((fdae) objF12, hxe.d(-774967481, new eeau(hoxVar4), hmlVar), null, null, null, null, edxr.d, null, 0L, 0.0f, 0L, 0L, 0L, null, hmlVar, 1572912, 0, 16316);
                        hmlVar = hmlVar;
                    } else {
                        edwxVar = edwxVar2;
                        obj4 = obj5;
                        i = 5004770;
                        account = account2;
                        addVar = addVarE;
                        hoxVar2 = hoxVar4;
                        edxiVar2 = edxiVar5;
                        str = str2;
                    }
                    hmlVar.o();
                    if (((Boolean) hoxVar5.a()).booleanValue()) {
                        Uri uri = edwuVar.g;
                        boolean z = edwuVar.f;
                        boolean z2 = ((Boolean) edvoVar.b.a()).booleanValue() ? edwuVar.e : true;
                        hmlVar.v(i);
                        final hox hoxVar6 = hoxVar2;
                        boolean zD6 = hmlVar.D(hoxVar6);
                        Object objF13 = hmlVar.f();
                        Object obj6 = obj4;
                        if (zD6 || objF13 == obj6) {
                            objF13 = new fdae() { // from class: eeaf
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    eeaw.c(hoxVar6, true);
                                    return fctx.a;
                                }
                            };
                            hmlVar.y(objF13);
                        }
                        fdae fdaeVar6 = (fdae) objF13;
                        hmlVar.o();
                        hmlVar.v(-1746271574);
                        final add addVar2 = addVar;
                        final Account account3 = account;
                        final String str3 = str;
                        boolean zF6 = hmlVar.F(addVar2) | hmlVar.F(account3) | hmlVar.D(str3);
                        Object objF14 = hmlVar.f();
                        if (zF6 || objF14 == obj6) {
                            objF14 = new fdap() { // from class: eeah
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj7) {
                                    etzq etzqVar = (etzq) obj7;
                                    etzqVar.getClass();
                                    fcxe fcxeVar = new fcxe();
                                    fcxeVar.put("hostSurface", "pqe");
                                    fcxeVar.put("cau", "true");
                                    fcxeVar.put("hostId", str3);
                                    addVar2.c(eeax.a(account3, etzqVar, fcwa.b(fcxeVar)));
                                    return fctx.a;
                                }
                            };
                            hmlVar.y(objF14);
                        }
                        fdap fdapVar = (fdap) objF14;
                        hmlVar.o();
                        hmlVar.v(-1746271574);
                        boolean zF7 = hmlVar.F(addVarE2) | hmlVar.F(account3) | hmlVar.D(str3);
                        Object objF15 = hmlVar.f();
                        if (zF7 || objF15 == obj6) {
                            objF15 = new fdap() { // from class: eeai
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj7) {
                                    etzq etzqVar = (etzq) obj7;
                                    etzqVar.getClass();
                                    fcxe fcxeVar = new fcxe();
                                    fcxeVar.put("hostSurface", "pqe");
                                    fcxeVar.put("cau", "true");
                                    fcxeVar.put("hostId", str3);
                                    addVarE2.c(eeax.a(account3, etzqVar, fcwa.b(fcxeVar)));
                                    return fctx.a;
                                }
                            };
                            hmlVar.y(objF15);
                        }
                        fdap fdapVar2 = (fdap) objF15;
                        hmlVar.o();
                        hmlVar.v(-1633490746);
                        final edxi edxiVar6 = edxiVar2;
                        boolean zD7 = hmlVar.D(hoxVar5) | hmlVar.F(edxiVar6);
                        Object objF16 = hmlVar.f();
                        if (zD7 || objF16 == obj6) {
                            objF16 = new fdap() { // from class: eeaj
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj7) {
                                    Uri uri2 = (Uri) obj7;
                                    uri2.getClass();
                                    eeaw.b(hoxVar5, false);
                                    edxi edxiVar7 = edxiVar6;
                                    fdil.d(edxiVar7.c, null, null, new edxh(edxiVar7, uri2, null), 3);
                                    return fctx.a;
                                }
                            };
                            hmlVar.y(objF16);
                        }
                        fdap fdapVar3 = (fdap) objF16;
                        hmlVar.o();
                        hmlVar.v(-1746271574);
                        final edwx edwxVar3 = edwxVar;
                        boolean zD8 = hmlVar.D(hoxVar5) | hmlVar.F(edxiVar6) | hmlVar.F(edwxVar3);
                        Object objF17 = hmlVar.f();
                        if (zD8 || objF17 == obj6) {
                            objF17 = new fdae() { // from class: eeak
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    eeaw.b(hoxVar5, false);
                                    Uri uri2 = ((edwu) edwxVar3).g;
                                    edxi edxiVar7 = edxiVar6;
                                    fdil.d(edxiVar7.c, null, null, new edxg(edxiVar7, uri2, null), 3);
                                    return fctx.a;
                                }
                            };
                            hmlVar.y(objF17);
                        }
                        hmlVar.o();
                        hml hmlVar3 = hmlVar;
                        edzd.d(fdaeVar6, fdaeVar3, fdapVar, fdapVar2, z, edvsVar, fdapVar3, uri, (fdae) objF17, z2, hmlVar3, 0);
                        hmlVar = hmlVar3;
                    }
                    hmlVar.o();
                }
            }
            hmlVar.n();
        }
        return fctx.a;
    }
}
