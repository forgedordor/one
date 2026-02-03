package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wdq implements dpmh {
    public final arly a;
    private final wek b;
    private final Context c;
    private final fcsu d;
    private final fdae e;
    private final dpmi f;
    private final wre g;
    private final dmsq h;

    public wdq(wek wekVar, ahof ahofVar, wre wreVar, Context context, fcsu fcsuVar, dmsq dmsqVar, arly arlyVar, emsj emsjVar, fdae fdaeVar) {
        wekVar.getClass();
        ahofVar.getClass();
        wreVar.getClass();
        context.getClass();
        fcsuVar.getClass();
        emsjVar.getClass();
        this.b = wekVar;
        this.g = wreVar;
        this.c = context;
        this.d = fcsuVar;
        this.h = dmsqVar;
        this.a = arlyVar;
        this.e = fdaeVar;
        emsp emspVar = emsp.CAMERA_GALLERY;
        fdap fdapVar = new fdap() { // from class: wdb
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dltd dltdVar = (dltd) obj;
                dltdVar.getClass();
                boolean z = true;
                if (!(dltdVar.fo() instanceof dmca) && !(dltdVar.fo() instanceof dmbs)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        };
        ahoh ahohVar = ahofVar.a;
        ahkn ahknVar = ahohVar.a;
        this.f = new weq(ahknVar.b.hh, (cogw) ahknVar.cD.b(), (wre) ahohVar.c.z.b(), emspVar, fdapVar);
    }

    public static final hsf j(kio kioVar, hml hmlVar) {
        hmlVar.v(-1611894259);
        hsf hsfVarA = hsc.a(new kir(new efj(ehv.e(hmlVar), kioVar).a()), hmlVar);
        hmlVar.o();
        return hsfVarA;
    }

    public static final float k(dplt dpltVar, hml hmlVar) {
        hmlVar.v(2018824436);
        hpt hptVar = jmh.e;
        kio kioVar = (kio) hmlVar.e(hptVar);
        kio kioVar2 = (kio) hmlVar.e(hptVar);
        hmlVar.v(-1567425557);
        hsf hsfVarA = hsc.a(new kir(new efj(ehv.g(hmlVar), kioVar2).d()), hmlVar);
        hmlVar.o();
        float fEl = ((kioVar.el(kil.a(dpltVar.a())) - (kioVar.el(kil.b(dpltVar.a())) / 0.75f)) - ((kir) hsfVarA.a()).a) - ((kir) j((kio) hmlVar.e(hptVar), hmlVar).a()).a;
        float f = (-68.0f) + fEl;
        if (Float.compare(f, 48.0f) >= 0) {
            fEl = f;
        } else if (Float.compare(fEl, 48.0f) <= 0) {
            fEl = 48.0f;
        }
        hmlVar.o();
        return fEl;
    }

    @Override // defpackage.dpmh
    public final dpos a() {
        hpl hplVar = new hpl(false, hsi.a);
        return new dpos(wan.a, wan.b, new hxd(1284581716, true, new wdl(this, hplVar)), new hxd(1306065265, true, new wdo(this)), null, new hxd(1156831876, true, new wdp(this, hplVar)), wan.c, 33);
    }

    @Override // defpackage.dpmh
    public final /* synthetic */ Object b(final fdjx fdjxVar, final fdae fdaeVar) {
        final wek wekVar = this.b;
        dnhq dnhqVar = wekVar.c;
        dnhqVar.d();
        wee weeVar = new wee(wekVar.k.a);
        fdus fdusVar = fdur.b;
        fcvo fcvoVar = fcvo.a;
        fdvc fdvcVarB = fdtg.b(weeVar, fdjxVar, fdusVar, fcvoVar);
        final fduf fdufVarA = fdvf.a(false);
        fdae fdaeVar2 = new fdae() { // from class: wao
            @Override // defpackage.fdae
            public final Object invoke() {
                fdufVarA.f(true);
                return fctx.a;
            }
        };
        final was wasVar = wekVar.l;
        wat watVar = new wat(fdaeVar2, wasVar.b.a(fdjxVar, new fdap() { // from class: wap
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dojw dojwVar = (dojw) obj;
                dojwVar.getClass();
                dltc dltcVarFo = dojwVar.fo();
                doif doifVarM = dojwVar.m();
                was wasVar2 = wasVar;
                auvw.k(fdjxVar, null, null, new war(wasVar2, dojwVar, wasVar2.d.k(dltcVarFo, doifVarM), fdufVarA, null), 3);
                return fctx.a;
            }
        }, new fdap() { // from class: waq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fduf fdufVar;
                Object objC;
                Boolean bool;
                dmnr dmnrVar = (dmnr) obj;
                dmnrVar.getClass();
                if (!fdbq.f(dmnrVar, dmnr.a)) {
                    throw new fctg();
                }
                do {
                    fdufVar = fdufVarA;
                    objC = fdufVar.c();
                    bool = (Boolean) objC;
                    bool.booleanValue();
                } while (!fdufVar.g(objC, false));
                if (!bool.booleanValue()) {
                    fdaeVar.invoke();
                }
                return fctx.a;
            }
        }, true != wasVar.c.a() ? 3 : 2).a(), fdufVarA);
        wekVar.c(new wej(fdaeVar));
        fdlw.c(((fdxz) fdjxVar).a).hK(new fdap() { // from class: wdr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                wekVar.c(null);
                return fctx.a;
            }
        });
        dpqk dpqkVar = new dpqk(null, 0.0f, null);
        hsi hsiVar = hsi.a;
        final hpl hplVar = new hpl(dpqkVar, hsiVar);
        fdpl fdplVarA = hsb.a(new fdae() { // from class: wbx
            @Override // defpackage.fdae
            public final Object invoke() {
                return (dpqk) hplVar.a();
            }
        });
        wcf wcfVar = wekVar.e;
        wfk wfkVar = wcfVar.c;
        fdvc fdvcVarB2 = fdtg.b(fdud.b(new wca(wcfVar.b, wcfVar), fdplVarA, new wfb(new wey(((cmfo) wfkVar.f.b()).e()), wfkVar), new wcd(wcfVar.e), new wce(wcfVar, watVar, null)), fdjxVar, fdusVar, new wcg(null, wcfVar.a(), fcvoVar));
        fdvc fdvcVarC = auyf.c(fdvcVarB, fdjxVar, new fdap() { // from class: wds
            @Override // defpackage.fdap
            public final Object invoke(Object obj) throws Resources.NotFoundException {
                Object objA;
                List<web> list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (web webVar : list) {
                    fdjx fdjxVar2 = fdjxVar;
                    final wek wekVar2 = wekVar;
                    final dojv dojvVar = webVar.a;
                    final vvl vvlVar = webVar.b;
                    if (dojvVar instanceof dojr) {
                        dojr dojrVar = (dojr) dojvVar;
                        objA = dprx.a(new dprz(dojrVar.b, dojrVar, new fdae() { // from class: wdw
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                wek wekVar3 = wekVar2;
                                wekVar3.d(vvlVar);
                                wekVar3.c.e(dojvVar);
                                return fctx.a;
                            }
                        }, wekVar2.g.a(dojvVar), false, false, wea.a(wekVar2.b(), vvlVar), 48));
                    } else if (dojvVar instanceof doju) {
                        doju dojuVar = (doju) dojvVar;
                        objA = wekVar2.d.a(fdjxVar2, new dptm(dojuVar.b, dojuVar, new fdae() { // from class: wdx
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                wek wekVar3 = wekVar2;
                                wekVar3.d(vvlVar);
                                wekVar3.c.e(dojvVar);
                                return fctx.a;
                            }
                        }, wekVar2.g.a(dojvVar), false, true, wea.a(wekVar2.b(), vvlVar), 16));
                    } else {
                        ekrw ekrwVarI = wek.a.i();
                        ekrwVarI.X(eksq.a, "BugleComposeRow2");
                        ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendUiAdapter", "createUiData$lambda$7", 151, "DirectSendUiAdapter.kt")).t("Visual media %s not supported by direct send media viewer", dojvVar);
                        objA = null;
                    }
                    if (objA != null) {
                        arrayList.add(objA);
                    }
                }
                return arrayList;
            }
        });
        final wbb wbbVar = wekVar.b;
        wbv wbvVar = wbbVar.b;
        fdvc fdvcVarB3 = fdtg.b(new fdua(new wbo(wbvVar.b.a), fdqq.a(wbvVar.g), new wbp(wbvVar, null)), fdjxVar, fdusVar, wbvVar.a());
        final wcu wcuVar = (wcu) wbbVar.i.a();
        final fduf fdufVarA2 = fdvf.a(dpyw.a);
        final wct wctVar = new wct(new fdci(), fdufVarA2, wcuVar);
        fdvc fdvcVarA = avba.a(fdjxVar, fdusVar, fdvcVarB3, wbbVar.c.a(), auyf.c(fdufVarA2, fdjxVar, new fdap() { // from class: wcr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                final dpzj dpzjVar = (dpzj) obj;
                dpzjVar.getClass();
                boolean z = dpzjVar instanceof dpzh;
                djdi djdiVar = djdi.d;
                if (true != z) {
                    djdiVar = null;
                }
                djdi djdiVar2 = djdiVar;
                final fduf fdufVar = fdufVarA2;
                final wcu wcuVar2 = wcuVar;
                new djdm(djdiVar2, null, null, null, false, null, null, new fdap() { // from class: wcq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        Object dpzhVar;
                        djdi djdiVar3 = (djdi) obj2;
                        djdiVar3.getClass();
                        dpxe dpxeVar = dpxe.a;
                        if (djdiVar3.ordinal() != 3) {
                            ((ekrd) wcu.a.j().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter", "createUiDataFlow$lambda$4$lambda$2", 52, "DirectSendInputsUiAdapter.kt")).q("Non-emotive input clicked in direct send compose row.");
                        } else {
                            if (dpzjVar instanceof dpzh) {
                                dpzhVar = dpyw.a;
                            } else {
                                dpzhVar = new dpzh(fcva.b(new dpyz(dpxe.b, wcuVar2.d, 2)), null, null, 14);
                            }
                            fdufVar.f(dpzhVar);
                        }
                        return fctx.a;
                    }
                }, 254);
                return new wen(new dpdy(dpzjVar, wcuVar2.c, wctVar, false, 120));
            }
        }), ((eoth) ((aqhp) wbbVar.g).a.b()).a("bugle.enable_top_ui_data_in_direct_send_compose_row") ? ((wgt) wbbVar.h.a()).a(fdjxVar) : new auxs(wba.a), new fdav() { // from class: waz
            @Override // defpackage.fdav
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                djcv djcvVar = (djcv) obj;
                djew djewVar = (djew) obj2;
                wen wenVar = (wen) obj3;
                djcvVar.getClass();
                djewVar.getClass();
                wenVar.getClass();
                djev djevVar = djewVar.g;
                djcq djcqVar = wbb.a;
                djew djewVarA = djew.a(djewVar, null, null, null, null, null, false, djev.a(djevVar, false, 2), 63);
                wbb wbbVar2 = wbbVar;
                return new wau(new yby(new djcy(djcvVar, djcqVar, (djcw) obj4, djewVarA, new djcx(wbbVar2.e.a()), 48), new ybm(wbbVar2.f.a()), null), wenVar.b);
            }
        });
        ahob ahobVar = wekVar.j;
        boolean zA = wekVar.h.a();
        ahoh ahohVar = ahobVar.a;
        ahkn ahknVar = ahohVar.a;
        Context context = (Context) ahknVar.t.b();
        ahoi ahoiVar = ahohVar.c;
        ahkn ahknVar2 = ahoiVar.a;
        eyik eyikVar = ahknVar2.a.oQ;
        ahjr ahjrVar = ahoiVar.b;
        final dmvi dmviVar = new dmvi(context, new dmbd(eyikVar, ahoiVar.ck, ahjrVar.pS, ahoiVar.bj, ahjrVar.jY, ahknVar2.b.kd), new dncb(), (dlus) ahoiVar.bk.b(), (Executor) ahknVar.p.b(), Optional.of(ahoiVar.bd()), fdjxVar, zA);
        final fdvc fdvcVarC2 = auyf.c(fdvcVarB, fdjxVar, new fdap() { // from class: wdt
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(fcva.p(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((web) it.next()).a);
                }
                return arrayList;
            }
        });
        weh wehVar = new weh(fdvcVarB2);
        final wei weiVar = new wei(dnhqVar);
        final fdap fdapVar = new fdap() { // from class: wdu
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dojv dojvVar = (dojv) obj;
                dojvVar.getClass();
                wekVar.c.e(dojvVar);
                return fctx.a;
            }
        };
        return new wel(fdvcVarB2, hplVar, fdvcVarC, watVar, fdvcVarA, (!((eoth) ((aqoj) wekVar.i).a.b()).a("bugle.enable_embedded_picker") || (Build.VERSION.SDK_INT != 34 ? Build.VERSION.SDK_INT != 35 ? Build.VERSION.SDK_INT <= 35 : SdkExtensions.getExtensionVersion(34) < 15 : SdkExtensions.getExtensionVersion(34) < 16)) ? new dmvl(wehVar, fdvcVarC2, new fdap() { // from class: dmuq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Activity activity = (Activity) obj;
                activity.getClass();
                final dmvi dmviVar2 = dmviVar;
                dnbx dnbxVar = (dnbx) dmviVar2.k.a();
                final dmvc dmvcVar = weiVar;
                dncb.c(dmviVar2.b, activity, dnbxVar, new adi() { // from class: dmuu
                    @Override // defpackage.adi
                    public final void a(Object obj2) {
                        List list = (List) obj2;
                        list.getClass();
                        dmviVar2.a(list, new dmvf(dmvcVar));
                    }
                });
                return fctx.a;
            }
        }, new fdae() { // from class: dmur
            @Override // defpackage.fdae
            public final Object invoke() {
                dmviVar.b.a();
                return fctx.a;
            }
        }, (fdpl) dmviVar.h.a(), new fdap() { // from class: dmus
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dnhr dnhrVar;
                dojv dojvVar = (dojv) obj;
                dojvVar.getClass();
                boolean zContains = ((List) fdvcVarC2.c()).contains(dojvVar);
                dmvi dmviVar2 = dmviVar;
                fdil.d(dmviVar2.e, null, null, new dmvg(zContains, fdapVar, dojvVar, weiVar, (zContains || (dnhrVar = dmviVar2.j) == null) ? null : dnhrVar.l(dojvVar.fo(), dojvVar.m()), null), 3);
                return fctx.a;
            }
        }, dmviVar.f) : new dmvk(wehVar, fdvcVarC2, new hpl(false, hsiVar), aao$$ExternalSyntheticApiModelOutline4.m12m(dmviVar.i.a()), dmviVar.d, new fdap() { // from class: dmuz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                List list = (List) obj;
                list.getClass();
                dmviVar.a(list, new dmve(weiVar));
                return fctx.a;
            }
        }, new fdap() { // from class: dmva
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Object next;
                List list = (List) obj;
                list.getClass();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    fdvc fdvcVar = fdvcVarC2;
                    String string = ((Uri) it.next()).toString();
                    string.getClass();
                    Iterator it2 = ((Iterable) fdvcVar.c()).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (fdbq.f(((dojv) next).f(), string)) {
                            break;
                        }
                    }
                    dojv dojvVar = (dojv) next;
                    if (dojvVar != null) {
                        fdapVar.invoke(dojvVar);
                    } else {
                        ((ekrd) dmvi.a.i().h("com/google/android/libraries/compose/cameragallery/ui/gallery/GalleryUiAdapter", "getUiData$lambda$10", 124, "GalleryUiAdapter.kt")).q("Unselected media from Embedded Picker wasn't selected");
                    }
                }
                return fctx.a;
            }
        }, new fdap() { // from class: dmvb
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                th.getClass();
                ((ekrd) ((ekrd) dmvi.a.i()).g(th).h("com/google/android/libraries/compose/cameragallery/ui/gallery/GalleryUiAdapter", "getUiData$lambda$11", 129, "GalleryUiAdapter.kt")).q("Encountered Embedded Picker error");
                return fctx.a;
            }
        }, dmvj.a));
    }

    public final void c(final dmvm dmvmVar, final hox hoxVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-381431556);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(dmvmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(hoxVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(-1483496293);
            boolean z = ((Boolean) hoxVar.a()).booleanValue() && !wdj.a(hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            if (z) {
                hoxVar.b(false);
            }
            boolean zBooleanValue = ((Boolean) hoxVar.a()).booleanValue();
            dia diaVarC = dea.c(500, 0, new den(0.0f, 0.0f, 0.0f, 1.0f), 2);
            hmlVarC.v(1849434622);
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdap() { // from class: wdc
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        Integer num = (Integer) obj2;
                        num.intValue();
                        return num;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dap dapVarE = dae.e(diaVarC, (fdap) objS);
            dia diaVarC2 = dea.c(300, 0, new den(0.3f, 0.0f, 0.8f, 0.15f), 2);
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdap() { // from class: wdd
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        Integer num = (Integer) obj2;
                        num.intValue();
                        return num;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            cye.b(zBooleanValue, null, dapVarE, dae.h(diaVarC2, (fdap) objS2), null, hxe.d(-1660736044, new wdh(hoxVar, dmvmVar), hmlVarC), hmlVarC, 196608, 18);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: wde
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    wdq wdqVar = this.a;
                    dmvm dmvmVar2 = dmvmVar;
                    int i4 = i;
                    wdqVar.c(dmvmVar2, hoxVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void d(final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1790920377);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarK = egq.k(icoVar, 48.0f);
            long j = ije.d;
            ics icsVarA = dihi.a(dli.e(dkl.a(icsVarK, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.15f, ije.f(j)), evn.a), false, null, fdaeVar, 15), jqu.b(R.string.compose_icon_gallery_unselected_content_description, hmlVarC), true);
            ixm ixmVarA = ecz.a(ibw.e, false);
            long jB = hmg.b(hmlVarC);
            long j2 = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar2 = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar2);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j2;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            dtfn.a(djrs.b(djrr.i, hmlVarC), null, egq.k(icoVar, 24.0f), j, hmlVarC, 3504, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: wda
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    wdq wdqVar = this.a;
                    int i5 = i;
                    wdqVar.d(fdaeVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    @Override // defpackage.dpmi
    public final void e() {
        wek wekVar = this.b;
        if (((aqgr) wekVar.f.b()).a()) {
            wekVar.c.d();
        }
        wbv wbvVar = wekVar.b.b;
        String str = ((vvw) wbvVar.b.a.c()).a;
        if (str == null) {
            str = "";
        }
        wbvVar.e.k(str);
        this.h.b();
        this.f.e();
    }

    @Override // defpackage.dpmi
    public final void f() {
        weq weqVar = (weq) this.f;
        weqVar.b = weqVar.a.f();
        weqVar.c = weqVar.a();
        this.h.a();
        this.e.invoke();
    }

    public final void g() {
        ahax ahaxVar = (ahax) this.d.b();
        Context context = this.c;
        String string = context.getString(R.string.contains_attachments_error_message);
        string.getClass();
        String string2 = context.getString(R.string.contains_attachments_confirm);
        string2.getClass();
        ahaxVar.c(new djmj(string, null, null, null, false, false, new dktq(string2, new fdae() { // from class: wcz
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }), null, null, 446), true);
    }

    public final boolean h() {
        return wbw.a((vvw) this.g.a.c());
    }

    public final void i(final dpom dpomVar, final ics icsVar, final wel welVar, final float f, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 48;
        hml hmlVarC = hmlVar.c(-1800135112);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? hmlVarC.D(welVar) : hmlVarC.F(welVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.A(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.F(this) ? 8192 : 16384;
        }
        if ((i2 & 9361) == 9360 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean zL = l(welVar, hmlVarC);
            dia diaVarC = dea.c(500, 0, new den(0.2f, 0.0f, 0.0f, 1.0f), 2);
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new fdap() { // from class: wcw
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        Integer num = (Integer) obj2;
                        num.intValue();
                        return num;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dap dapVarE = dae.e(diaVarC, (fdap) objS);
            dia diaVarC2 = dea.c(1000, 0, new den(0.2f, 0.0f, 0.0f, 1.0f), 2);
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar.S();
            if (objS2 == obj) {
                objS2 = new fdap() { // from class: wcx
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        Integer num = (Integer) obj2;
                        num.intValue();
                        return num;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            cye.b(zL, null, dapVarE, dae.h(diaVarC2, (fdap) objS2), null, hxe.d(966194448, new wdi(icsVar, welVar, f), hmlVarC), hmlVarC, 196608, 18);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: wcy
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    wdq wdqVar = this.a;
                    dpom dpomVar2 = dpomVar;
                    ics icsVar2 = icsVar;
                    wel welVar2 = welVar;
                    wdqVar.i(dpomVar2, icsVar2, welVar2, f, (hml) obj2, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final boolean l(wel welVar, hml hmlVar) {
        hmlVar.v(634088478);
        hsf hsfVarA = hro.a(welVar.c, hmlVar);
        hsf hsfVarA2 = hro.a(this.h.b, hmlVar);
        hmlVar.v(-526320689);
        hmlVar.v(-526320755);
        hmlVar.v(-511575432);
        dpzj dpzjVar = ((wau) hro.a(welVar.d, hmlVar).a()).b.a;
        hmlVar.o();
        boolean z = true;
        boolean z2 = (dpzjVar instanceof dpyw) && !wdj.a(hmlVar);
        hmlVar.o();
        boolean z3 = z2 && !(wem.a(welVar, hmlVar) && ((dmso) hsfVarA2.a()).a());
        hmlVar.o();
        if (z3) {
            ((List) hsfVarA.a()).isEmpty();
        } else {
            z = false;
        }
        hmlVar.o();
        return z;
    }
}
