package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjn implements yjk {
    public final Optional a;
    private final ykx b;
    private final zlz c;
    private final zmo d;
    private final yjr e;
    private final zit f;
    private final zkl g;

    public yjn(ykx ykxVar, zlz zlzVar, zmo zmoVar, zkl zklVar, Optional optional, yjr yjrVar, zit zitVar) {
        yjrVar.getClass();
        zitVar.getClass();
        this.b = ykxVar;
        this.c = zlzVar;
        this.d = zmoVar;
        this.g = zklVar;
        this.a = optional;
        this.e = yjrVar;
        this.f = zitVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yit] */
    @Override // defpackage.yjk
    public final yit a(final yko ykoVar) throws IOException {
        yit yitVar;
        eieu eieuVarH = eiiy.h("MessageUiAdapterImpl#createUiData");
        try {
            yjr yjrVar = this.e;
            fdap fdapVar = new fdap() { // from class: yjl
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.fdap
                public final Object invoke(Object obj) throws IOException {
                    yjg yjgVar;
                    final fdjx fdjxVar = (fdjx) obj;
                    fdjxVar.getClass();
                    final yko ykoVar2 = ykoVar;
                    ymx ymxVar = ykoVar2.a;
                    ajlt ajltVarA = ymxVar.a();
                    eieu eieuVarH2 = eiiy.h("MessageUiAdapterImpl#createNewUiData");
                    try {
                        boolean z = ykoVar2.m;
                        final yjn yjnVar = this.a;
                        if (z) {
                            MessageId messageIdB = ymxVar.a().b();
                            ykm.a(ajltVarA);
                            yjh yjhVar = new yjh(messageIdB, new fdae() { // from class: yjm
                                @Override // defpackage.fdae
                                public final Object invoke() throws IOException {
                                    yjn yjnVar2 = yjnVar;
                                    fdjx fdjxVar2 = fdjxVar;
                                    yko ykoVar3 = ykoVar2;
                                    eieu eieuVarH3 = eiiy.h("MessageUiAdapterImpl#createNewUiData#lazy");
                                    try {
                                        auyl auylVarB = yjnVar2.b(fdjxVar2, ykoVar3);
                                        fczl.a(eieuVarH3, null);
                                        return auylVarB;
                                    } finally {
                                    }
                                }
                            });
                            yjt yjtVar = (yjt) fdct.b(yjnVar.a);
                            yjgVar = yjhVar;
                            if (yjtVar != null) {
                                yjtVar.a(yjhVar);
                                yjgVar = yjhVar;
                            }
                        } else {
                            eieu eieuVarH3 = eiiy.h("MessageUiAdapterImpl#createNewUiData#eager");
                            try {
                                yjg yjgVar2 = new yjg(ajltVarA.b(), Long.valueOf(ykm.a(ajltVarA)), yjnVar.b(fdjxVar, ykoVar2));
                                fczl.a(eieuVarH3, null);
                                yjgVar = yjgVar2;
                            } finally {
                            }
                        }
                        fczl.a(eieuVarH2, null);
                        return yjgVar;
                    } finally {
                    }
                }
            };
            MessageId messageIdB = ykoVar.a.a().b();
            yjrVar.e.add(messageIdB);
            yjp yjpVar = yjrVar.d;
            yjo yjoVar = (yjo) yjpVar.get(messageIdB);
            if (yjoVar == null || !yjoVar.a.equals(ykoVar)) {
                yjrVar.b.c.incrementAndGet();
                if (yjoVar == null) {
                    ((ekrd) yjr.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "getOrCreate", 74, "MessageUiDataCache.kt")).t("Cache miss. id = %s", messageIdB.a());
                } else {
                    ((ekrd) yjr.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "getOrCreate", 76, "MessageUiDataCache.kt")).t("Cache hit, but different arguments. id = %s", messageIdB.a());
                }
                fcyh fcyhVar = yjrVar.c;
                fdjx fdjxVarB = fdjy.b(fcyhVar.plus(new fdmt(fdlw.c(fcyhVar))));
                ((ekrd) yjr.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "getOrCreate", 84, "MessageUiDataCache.kt")).t("Creating message scope. id = %s", messageIdB.a());
                ?? Invoke = fdapVar.invoke(fdjxVarB);
                yjpVar.put(messageIdB, new yjo(ykoVar, Invoke, fdjxVarB));
                yitVar = Invoke;
            } else {
                ((ekrd) yjr.a.e().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "getOrCreate", 68, "MessageUiDataCache.kt")).t("Cache hit. id = %s", messageIdB.a());
                yjrVar.b.b.incrementAndGet();
                yitVar = yjoVar.b;
            }
            fczl.a(eieuVarH, null);
            return yitVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    public final auyl b(fdjx fdjxVar, yko ykoVar) throws Resources.NotFoundException {
        auyl auxqVar;
        Iterator it;
        dirx dirxVarA;
        final Object dlkxVar;
        ymx ymxVar = ykoVar.a;
        ajlt ajltVarA = ymxVar.a();
        amvr amvrVarG = ajltVarA.g();
        if (amvrVarG instanceof amwh) {
            final zlz zlzVar = this.c;
            final zkq zkqVar = new zkq(ajltVarA.b(), (amwh) amvrVarG, ymxVar);
            ekgb ekgbVarA = zkqVar.b.a();
            if (((ekoe) ekgbVarA).c > 1) {
                String strA = zkqVar.a.a();
                strA.getClass();
                ArrayList arrayList = new ArrayList(fcva.p(ekgbVarA, 10));
                ekqh it2 = ekgbVarA.iterator();
                while (it2.hasNext()) {
                    amwg amwgVar = (amwg) it2.next();
                    amwgVar.getClass();
                    arrayList.add(zlzVar.a(amwgVar));
                }
                dlkxVar = new dlkw(strA, arrayList);
            } else {
                String strA2 = zkqVar.a.a();
                strA2.getClass();
                Object objX = fcva.X(ekgbVarA);
                objX.getClass();
                dlkxVar = new dlkx(strA2, zlzVar.a((amwg) objX));
            }
            return new auxq(new fdae() { // from class: zkr
                @Override // defpackage.fdae
                public final Object invoke() {
                    zea zeaVar = zlzVar.i;
                    zkq zkqVar2 = zkqVar;
                    ymx ymxVar2 = zkqVar2.c;
                    return new zkm(zkqVar2.a, (dlky) dlkxVar, (dkol) zeaVar.b(ymxVar2, false, false).b());
                }
            });
        }
        if (amvrVarG instanceof amwj) {
            zmo zmoVar = this.d;
            zmc zmcVar = new zmc(ajltVarA.b(), (amwj) amvrVarG);
            return auyp.b(new zmj(zmoVar.g, zmcVar, zmoVar), new zmb(zmcVar.a, null, new fdae() { // from class: zme
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }, new fdae() { // from class: zmf
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            }));
        }
        if (!(amvrVarG instanceof amvw)) {
            if (!(amvrVarG instanceof amvb)) {
                if (!(amvrVarG instanceof zjl)) {
                    return this.b.a(fdjxVar, ykoVar);
                }
                final zjn zjnVar = new zjn(ajltVarA.b());
                return new auxq(new fdae() { // from class: zjo
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return new zjp(zjnVar.a);
                    }
                });
            }
            final zit zitVar = this.f;
            final zin zinVar = new zin(ajltVarA.b(), (amvb) amvrVarG);
            if (zitVar.h.a()) {
                amvb amvbVar = zinVar.b;
                if (amvbVar instanceof amty) {
                    final zjj zjjVar = zitVar.g;
                    final MessageId messageId = zinVar.a;
                    final amty amtyVar = (amty) amvbVar;
                    return new auxq(new fdae() { // from class: zja
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            final zjj zjjVar2 = zjjVar;
                            Context context = zjjVar2.b;
                            String string = context.getString(R.string.emergency_questionnaire_card_title);
                            string.getClass();
                            String string2 = context.getString(R.string.emergency_questionnaire_card_subtitle);
                            string2.getClass();
                            final amty amtyVar2 = amtyVar;
                            Set set = amtyVar2.a;
                            List list = zjk.g;
                            ArrayList arrayList2 = new ArrayList(fcva.p(list, 10));
                            fcue fcueVar = new fcue((fcuh) list);
                            while (fcueVar.hasNext()) {
                                zjk zjkVar = (zjk) fcueVar.next();
                                String strName = zjkVar.name();
                                String string3 = context.getString(zjkVar.i);
                                string3.getClass();
                                arrayList2.add(new dkbm(strName, zjkVar.h, string3));
                            }
                            return new ziu(null, new diyr(string, string2, fcva.b(new dkbn(set, arrayList2, new fdap() { // from class: ziy
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj) {
                                    String str = (String) obj;
                                    str.getClass();
                                    zjjVar2.f.a(amtyVar2, zjk.a(str));
                                    return fctx.a;
                                }
                            }))), messageId);
                        }
                    });
                }
            }
            if (zinVar.b.a() != 9) {
                return new auxq(new fdae() { // from class: zio
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dizb dizbVar;
                        dizb dizbVar2;
                        zin zinVar2 = zinVar;
                        int iA = zinVar2.b.a() - 1;
                        zit zitVar2 = zitVar;
                        switch (iA) {
                            case 0:
                                Context context = zitVar2.a;
                                String string = context.getString(R.string.demo_card_title);
                                string.getClass();
                                diyz diyzVar = new diyz(string);
                                String string2 = context.getString(R.string.demo_card_line_1);
                                string2.getClass();
                                dizbVar = new dizb(diyzVar, fcva.b(new djzh(string2, (djrr) null, (List) null, false, 30)), false, null, 28);
                                break;
                            case 1:
                                Context context2 = zitVar2.a;
                                String string3 = context2.getString(R.string.real_card_title);
                                string3.getClass();
                                diyz diyzVar2 = new diyz(string3);
                                String string4 = context2.getString(R.string.real_card_line_1);
                                string4.getClass();
                                String string5 = context2.getString(R.string.real_card_line_2);
                                string5.getClass();
                                String string6 = context2.getString(R.string.real_card_line_3);
                                string6.getClass();
                                dizbVar2 = new dizb(diyzVar2, fcva.g(new djzh(string4, djrr.aW, (List) null, false, 28), new djzh(string5, djrr.ek, (List) null, false, 28), new djzh(string6, djrr.ci, (List) null, false, 28)), false, null, 28);
                                dizbVar = dizbVar2;
                                break;
                            case 2:
                                Context context3 = zitVar2.a;
                                String string7 = context3.getString(R.string.real_card_end_success_title);
                                string7.getClass();
                                diyz diyzVar3 = new diyz(string7);
                                String str = zitVar2.b;
                                String string8 = context3.getString(R.string.end_emergency_success_dont_need_help_card_line_1, str);
                                string8.getClass();
                                String str2 = zitVar2.c;
                                String string9 = context3.getString(R.string.end_emergency_success_dont_need_help_card_line_2, str, zitVar2.a(str2));
                                string9.getClass();
                                djrr djrrVar = djrr.T;
                                String string10 = context3.getString(R.string.end_emergency_success_dont_need_help_card_line_2, str, str2);
                                string10.getClass();
                                String string11 = context3.getString(R.string.end_emergency_success_dont_need_help_card_line_3);
                                string11.getClass();
                                dizbVar2 = new dizb(diyzVar3, fcva.g(new djzh(string8, djrr.aW, (List) null, false, 28), new djzh(string9, djrrVar, zitVar2.b(string10), false, 20), new djzh(string11, djrr.dR, (List) null, false, 28)), false, null, 28);
                                dizbVar = dizbVar2;
                                break;
                            case 3:
                                Context context4 = zitVar2.a;
                                String string12 = context4.getString(R.string.real_card_end_success_title);
                                string12.getClass();
                                diyz diyzVar4 = new diyz(string12);
                                String string13 = context4.getString(R.string.end_emergency_success_still_need_help_card_line_1);
                                string13.getClass();
                                String str3 = zitVar2.b;
                                String str4 = zitVar2.c;
                                String string14 = context4.getString(R.string.end_emergency_success_still_need_help_card_line_2, str3, zitVar2.a(str4));
                                string14.getClass();
                                djrr djrrVar2 = djrr.T;
                                String string15 = context4.getString(R.string.end_emergency_success_still_need_help_card_line_2, str3, str4);
                                string15.getClass();
                                String string16 = context4.getString(R.string.end_emergency_success_still_need_help_card_line_3);
                                string16.getClass();
                                dizbVar = new dizb(diyzVar4, fcva.g(new djzh(string13, djrr.aW, (List) null, false, 28), new djzh(string14, djrrVar2, zitVar2.b(string15), false, 20), new djzh(string16, djrr.p, (List) null, false, 28)), false, null, 28);
                                break;
                            case 4:
                                Context context5 = zitVar2.a;
                                String string17 = context5.getString(R.string.real_card_end_failure_title);
                                string17.getClass();
                                diyz diyzVar5 = new diyz(string17);
                                String str5 = zitVar2.b;
                                String str6 = zitVar2.c;
                                String string18 = context5.getString(R.string.end_emergency_failure_dont_need_help_card_line_1, str5, zitVar2.a(str6));
                                string18.getClass();
                                djrr djrrVar3 = djrr.eS;
                                String string19 = context5.getString(R.string.end_emergency_failure_dont_need_help_card_line_1, str5, str6);
                                string19.getClass();
                                String string20 = context5.getString(R.string.end_emergency_failure_dont_need_help_card_line_2, str5);
                                string20.getClass();
                                String string21 = context5.getString(R.string.end_emergency_failure_dont_need_help_card_line_3);
                                string21.getClass();
                                dizbVar = new dizb(diyzVar5, fcva.g(new djzh(string18, djrrVar3, zitVar2.b(string19), true, 4), new djzh(string20, djrr.ac, (List) null, true, 12), new djzh(string21, djrr.p, (List) null, true, 12)), true, null, 24);
                                break;
                            case 5:
                                Context context6 = zitVar2.a;
                                String string22 = context6.getString(R.string.real_card_end_failure_title);
                                string22.getClass();
                                diyz diyzVar6 = new diyz(string22);
                                String string23 = context6.getString(R.string.end_emergency_failure_still_need_help_card_line_1);
                                string23.getClass();
                                String str7 = zitVar2.b;
                                String str8 = zitVar2.c;
                                String string24 = context6.getString(R.string.end_emergency_failure_still_need_help_card_line_2, str7, zitVar2.a(str8));
                                string24.getClass();
                                djrr djrrVar4 = djrr.T;
                                String string25 = context6.getString(R.string.end_emergency_failure_still_need_help_card_line_2, str7, str8);
                                string25.getClass();
                                String string26 = context6.getString(R.string.end_emergency_failure_still_need_help_card_line_3);
                                string26.getClass();
                                dizbVar = new dizb(diyzVar6, fcva.g(new djzh(string23, djrr.aW, (List) null, true, 12), new djzh(string24, djrrVar4, zitVar2.b(string25), true, 4), new djzh(string26, djrr.p, (List) null, true, 12)), true, null, 24);
                                break;
                            case 6:
                                Context context7 = zitVar2.a;
                                String string27 = context7.getString(R.string.real_card_end_unexpectedly_title);
                                string27.getClass();
                                diyz diyzVar7 = new diyz(string27);
                                String string28 = context7.getString(R.string.end_emergency_unexpected_card_line_1);
                                string28.getClass();
                                String str9 = zitVar2.b;
                                String str10 = zitVar2.c;
                                String string29 = context7.getString(R.string.end_emergency_unexpected_card_line_2, str9, zitVar2.a(str10));
                                string29.getClass();
                                djrr djrrVar5 = djrr.T;
                                String string30 = context7.getString(R.string.end_emergency_unexpected_card_line_2, str9, str10);
                                string30.getClass();
                                String string31 = context7.getString(R.string.end_emergency_unexpected_card_line_3);
                                string31.getClass();
                                dizbVar = new dizb(diyzVar7, fcva.g(new djzh(string28, djrr.aW, (List) null, true, 12), new djzh(string29, djrrVar5, zitVar2.b(string30), true, 4), new djzh(string31, djrr.p, (List) null, true, 12)), true, null, 24);
                                break;
                            case 7:
                                Context context8 = zitVar2.a;
                                String string32 = context8.getString(R.string.satellite_emergency_card_line_1);
                                string32.getClass();
                                String string33 = context8.getString(R.string.satellite_emergency_card_line_2);
                                string33.getClass();
                                List listG = fcva.g(new djzh(string32, djrr.p, (List) null, false, 28), new djzh(string33, djrr.ek, (List) null, false, 28));
                                String string34 = context8.getString(R.string.more_about_satellite_button);
                                string34.getClass();
                                dizbVar = new dizb(null, listG, false, new diys(string34, new zis(zitVar2.d)), 12);
                                break;
                            default:
                                dizbVar = null;
                                break;
                        }
                        return new ziu(dizbVar, null, zinVar2.a);
                    }
                });
            }
            zjj zjjVar2 = zitVar.g;
            final MessageId messageId2 = zinVar.a;
            bpdy bpdyVarA = bped.a("EmergencyQuestionnaireRepositoryImpl.getSelectedOptionForMessage");
            bpdyVarA.c(new Function() { // from class: ccwx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpec bpecVar = (bpec) obj;
                    bpecVar.b(ccxe.b(messageId2));
                    return bpecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            return auyp.b(new zjd(new ccxa(bmgj.a(bpdyVarA.b())), zjjVar2, messageId2), zjjVar2.a(null, messageId2));
        }
        zkl zklVar = this.g;
        zjx zjxVar = new zjx(ymxVar, ykoVar.b, ykoVar.c, ykoVar.d, ykoVar.e, ykoVar.v);
        ymx ymxVar2 = zjxVar.a;
        ajlt ajltVarA2 = ymxVar2.a();
        final amvw amvwVar = (amvw) ajltVarA2.g();
        dkgv dkgvVarB = ykm.b(ajltVarA2);
        String strA3 = zklVar.a.a(ajltVarA2);
        zqm zqmVar = zklVar.d;
        auyl auylVarB = auyp.b(fdqq.a(new zkd(zqmVar.a())), true);
        auyp.b(fdqq.a(new zkg(zqmVar.a(), zjxVar)), dkkq.c);
        fdci fdciVar = new fdci();
        ekgb ekgbVarA2 = amvwVar.a();
        ArrayList arrayList2 = new ArrayList(fcva.p(ekgbVarA2, 10));
        for (ekqh it3 = ekgbVarA2.iterator(); it3.hasNext(); it3 = it3) {
            amsv amsvVar = (amsv) it3.next();
            ysa ysaVar = zklVar.b;
            amsvVar.getClass();
            dkgv dkgvVar = dkgvVarB;
            dkgvVarB = dkgvVar;
            arrayList2.add(ysaVar.a(fdjxVar, new yrz(ajltVarA2, amsvVar, zjxVar.d.a, zjxVar.e, zjxVar.b, zjxVar.c, dkgvVar, strA3, zjxVar.f)));
        }
        fdciVar.a = arrayList2.toArray(new auyl[0]);
        String strC = amvwVar.c();
        if (strC != null && strC.length() > 0) {
            dkgv dkgvVar2 = dkgvVarB;
            dkgvVarB = dkgvVar2;
            fdciVar.a = fcur.h((Object[]) fdciVar.a, zklVar.b.a(fdjxVar, new yrz(ajltVarA2, new amwf() { // from class: zjz
                @Override // defpackage.amwf
                public final /* synthetic */ ekgb a() {
                    int i = ekgb.d;
                    return ekoe.a;
                }

                @Override // defpackage.amwf, defpackage.amvr
                public final /* synthetic */ String b() {
                    return "text/plain";
                }

                @Override // defpackage.amwf
                public final String c() {
                    return amvwVar.c();
                }
            }, zjxVar.d.a, zjxVar.e, zjxVar.b, zjxVar.c, dkgvVar2, strA3, zjxVar.f)));
        }
        zkl zklVar2 = zklVar;
        zka zkaVar = new zka(null, fdciVar, ajltVarA2, dkgvVarB, zklVar2, zjxVar);
        int i = fdsn.a;
        fdwg fdwgVar = new fdwg(zkaVar, auylVarB);
        boolean zBooleanValue = ((Boolean) ((auyn) auylVarB).a).booleanValue();
        Object[] objArr = (Object[]) fdciVar.a;
        auyl[] auylVarArr = (auyl[]) Arrays.copyOf(objArr, objArr.length);
        int length = auylVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                auxqVar = new auxq(new zkh(auylVarArr, ajltVarA2, dkgvVarB, zklVar2, zjxVar, zBooleanValue));
                break;
            }
            auyl auylVar = auylVarArr[i2];
            if (auylVar == null || (auylVar instanceof auxq)) {
                i2++;
                zjxVar = zjxVar;
                dkgvVarB = dkgvVarB;
                zBooleanValue = zBooleanValue;
                ymxVar2 = ymxVar2;
                zklVar2 = zklVar2;
            } else {
                auyl[] auylVarArr2 = (auyl[]) fcur.K(auylVarArr).toArray(new auyl[0]);
                boolean z = zBooleanValue;
                zjx zjxVar2 = zjxVar;
                zkk zkkVar = new zkk((fdpl[]) Arrays.copyOf(auylVarArr2, auylVarArr2.length), auylVarArr, ajltVarA2, dkgvVarB, zklVar2, zjxVar2, z);
                ajlt ajltVar = ajltVarA2;
                dkgv dkgvVar3 = dkgvVarB;
                zkl zklVar3 = zklVar2;
                int length2 = auylVarArr.length;
                ArrayList arrayList3 = new ArrayList(length2);
                for (int i3 = 0; i3 < length2; i3++) {
                    auyl auylVar2 = auylVarArr[i3];
                    arrayList3.add(auylVar2 != null ? auylVar2.b() : null);
                }
                int i4 = 0;
                dkgq[] dkgqVarArr = (dkgq[]) arrayList3.toArray(new dkgq[0]);
                MessageId messageIdB = ajltVar.b();
                List listK = fcur.K(dkgqVarArr);
                ArrayList arrayList4 = new ArrayList(fcva.p(listK, 10));
                Iterator it4 = listK.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        fcva.m();
                    }
                    dkgq dkgqVar = (dkgq) next;
                    String strA4 = messageIdB.a();
                    strA4.getClass();
                    List list = listK;
                    dkkh dkkhVarA = zjy.a(ymxVar2, i4, list.size());
                    ymx ymxVar3 = ymxVar2;
                    if (i4 == list.size() - 1) {
                        it = it4;
                        dirxVarA = yql.a(zklVar3.c, ajltVar, null, null, 30);
                    } else {
                        it = it4;
                        dirxVarA = null;
                    }
                    dkgu dkguVar = new dkgu(dkgvVar3, dkkhVarA, dirxVarA, 1913);
                    djrr djrrVar = ajltVar.w() ? djrr.cj : djrr.ck;
                    ajlt ajltVar2 = ajltVar;
                    ajltVar = ajltVar2;
                    arrayList4.add(new yki(new dkkr(strA4, fcva.b(djrrVar), new dkkp(zklVar3.e.a(), zklVar3.f.a(), zklVar3.g.a(), 3), dkguVar, 29360124), dkgqVar, ajltVar2, z, zjxVar2.f));
                    listK = list;
                    it4 = it;
                    i4 = i5;
                    ymxVar2 = ymxVar3;
                    zklVar3 = zklVar3;
                }
                auxqVar = auyp.b(zkkVar, new zjs(arrayList4, messageIdB, ykm.a(ajltVar)));
            }
        }
        return auyp.b(fdwgVar, auxqVar.b());
    }
}
