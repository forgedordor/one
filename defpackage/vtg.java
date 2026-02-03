package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.conversation.input.compose.VideoTrimmerSource;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtg {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentInfoCreator");

    public static final emop a(vta vtaVar) {
        ejxm ejxmVar;
        vtaVar.getClass();
        emnc emncVarA = emnb.a((emoo) emop.a.createBuilder());
        Uri uri = null;
        if (vtaVar instanceof vsz) {
            vsz vszVar = (vsz) vtaVar;
            dltd dltdVarA = vszVar.a();
            dltc dltcVarFo = dltdVarA.fo();
            Class<?> cls = dltdVarA.getClass();
            int i = fdcj.a;
            vtz.c(emncVarA, dltcVarFo, new fdbi(cls));
            dltd dltdVarA2 = vszVar.a();
            if (dltdVarA2 instanceof dojr) {
                dojr dojrVar = (dojr) dltdVarA2;
                if (fdbq.f(dojrVar.g, dltl.a)) {
                    e(emncVarA, dojrVar);
                } else {
                    entz entzVarA = enty.a((empq) emqj.a.createBuilder());
                    entzVarA.h(dojrVar.d);
                    entzVarA.e(dojrVar.e);
                    entzVarA.f(dojn.a(dojrVar).a());
                    d(entzVarA, dojrVar);
                    emncVarA.c(entzVarA.a());
                }
            } else if (dltdVarA2 instanceof doju) {
                doju dojuVar = (doju) dltdVarA2;
                if (fdbq.f(dojuVar.f, dltl.a)) {
                    e(emncVarA, dojuVar);
                } else {
                    entz entzVarA2 = enty.a((empq) emqj.a.createBuilder());
                    entzVarA2.h(dojuVar.c);
                    entzVarA2.e(dojuVar.d);
                    entzVarA2.f(dojn.a(dojuVar).a());
                    int seconds = (int) dojuVar.g.getSeconds();
                    empq empqVar = entzVarA2.a;
                    empqVar.copyOnWrite();
                    emqj emqjVar = (emqj) empqVar.instance;
                    emqjVar.b |= 16;
                    emqjVar.h = seconds;
                    d(entzVarA2, dojuVar);
                    emncVarA.c(entzVarA2.a());
                }
            } else if (dltdVarA2 instanceof dojp) {
                dojp dojpVar = (dojp) dltdVarA2;
                if (fdbq.f(dojpVar.d, dltl.a)) {
                    e(emncVarA, dojpVar);
                } else {
                    emoq emoqVar = (emoq) emor.a.createBuilder();
                    emoqVar.getClass();
                    int seconds2 = (int) dojpVar.e.getSeconds();
                    emoqVar.copyOnWrite();
                    emor emorVar = (emor) emoqVar.instance;
                    emorVar.b |= 1;
                    emorVar.c = seconds2;
                    evsn evsnVarBuild = emoqVar.build();
                    evsnVarBuild.getClass();
                    emoo emooVar = emncVarA.a;
                    emooVar.copyOnWrite();
                    emop emopVar = (emop) emooVar.instance;
                    emopVar.f = (emor) evsnVarBuild;
                    emopVar.e = 207;
                }
            } else if (dltdVarA2 instanceof dlto) {
                e(emncVarA, (dlto) dltdVarA2);
            } else if (dltdVarA2 instanceof dnyz) {
                dnyz dnyzVar = (dnyz) dltdVarA2;
                if (!(vszVar instanceof vtc)) {
                    if (!(vszVar instanceof vtf)) {
                        throw new fctg();
                    }
                    uri = ((vtf) vszVar).a;
                    if (uri == null) {
                        throw new IllegalStateException("GifMedia missing selectedUri");
                    }
                }
                c(emncVarA, dnyzVar, uri);
            } else if (dltdVarA2 instanceof doyt) {
                doyt doytVar = (doyt) dltdVarA2;
                if (!(vszVar instanceof vtc)) {
                    if (!(vszVar instanceof vtf)) {
                        throw new fctg();
                    }
                    uri = ((vtf) vszVar).a;
                    if (uri == null) {
                        throw new IllegalStateException("StickerMedia missing selectedUri");
                    }
                }
                c(emncVarA, doytVar, uri);
            } else if (dltdVarA2 instanceof dnvg) {
                dnvg dnvgVar = (dnvg) dltdVarA2;
                entz entzVarA3 = enty.a((empq) emqj.a.createBuilder());
                entzVarA3.h(dnvgVar.g);
                entzVarA3.e(dnvgVar.h);
                entzVarA3.f(dojn.a(dnvgVar).a());
                d(entzVarA3, dnvgVar);
                emncVarA.c(entzVarA3.a());
            }
        } else {
            if (!(vtaVar instanceof vtd)) {
                throw new fctg();
            }
            vvo vvoVar = ((vtd) vtaVar).a;
            vtz.c(emncVarA, vvoVar.e, null);
            b(emncVarA, vvoVar.b, vvoVar.d);
        }
        if ((vtaVar instanceof vtf) && (ejxmVar = ((vtf) vtaVar).b) != null && ejxmVar.a) {
            evrj evrjVarD = evwy.d(ejxmVar.a(TimeUnit.MILLISECONDS));
            evrjVarD.getClass();
            emoo emooVar2 = emncVarA.a;
            emooVar2.copyOnWrite();
            emop emopVar2 = (emop) emooVar2.instance;
            emopVar2.i = evrjVarD;
            emopVar2.b |= 1;
        }
        vup vupVarB = vtaVar.b();
        if (vupVarB instanceof vup) {
            emph emphVar = (emph) empi.a.createBuilder();
            emphVar.getClass();
            boolean z = vupVarB.a;
            emphVar.copyOnWrite();
            empi empiVar = (empi) emphVar.instance;
            empiVar.b |= 1;
            empiVar.c = z;
            int i2 = vupVarB.b;
            emphVar.copyOnWrite();
            empi empiVar2 = (empi) emphVar.instance;
            empiVar2.b |= 2;
            empiVar2.d = i2;
            int i3 = vupVarB.c;
            emphVar.copyOnWrite();
            empi empiVar3 = (empi) emphVar.instance;
            empiVar3.b |= 4;
            empiVar3.e = i3;
            evsn evsnVarBuild2 = emphVar.build();
            evsnVarBuild2.getClass();
            emoo emooVar3 = emncVarA.a;
            emooVar3.copyOnWrite();
            emop emopVar3 = (emop) emooVar3.instance;
            emopVar3.h = (empi) evsnVarBuild2;
            emopVar3.g = 301;
        } else {
            if (vupVarB != null) {
                throw new fctg();
            }
            ekrw ekrwVarF = a.f();
            ekrwVarF.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentInfoCreator", "setCompressionInfo", 362, "AttachmentInfoCreator.kt")).t("No compression info to add for %s", vtaVar);
        }
        return emncVarA.a();
    }

    private static final void b(emnc emncVar, doig doigVar, Long l) {
        empf empfVar = (empf) empg.a.createBuilder();
        empfVar.getClass();
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue < 0) {
                throw new IllegalArgumentException(a.u(jLongValue, "File size is negative: "));
            }
            long jA = jLongValue != 0 ? jLongValue < 7500 ? 5000L : jLongValue < 2000000 ? vtb.a(jLongValue, 10000L) : jLongValue < 10000000 ? vtb.a(jLongValue, 100000L) : vtb.a(jLongValue, 1000000L) : 0L;
            empfVar.copyOnWrite();
            empg empgVar = (empg) empfVar.instance;
            empgVar.b |= 1;
            empgVar.c = jA;
        }
        String strA = doigVar.a();
        strA.getClass();
        empfVar.copyOnWrite();
        empg empgVar2 = (empg) empfVar.instance;
        empgVar2.b |= 2;
        empgVar2.d = strA;
        evsn evsnVarBuild = empfVar.build();
        evsnVarBuild.getClass();
        emoo emooVar = emncVar.a;
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emop emopVar2 = emop.a;
        emopVar.f = (empg) evsnVarBuild;
        emopVar.e = 208;
    }

    private static final void c(emnc emncVar, doav doavVar, Uri uri) {
        doau doauVar;
        Object next;
        String host;
        Object next2;
        boolean z = doavVar instanceof dnyz;
        if (!z && !(doavVar instanceof doyt)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (uri != null) {
            Iterator it = doavVar.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    next2 = it.next();
                    if (fdbq.f(((doau) next2).b, uri.toString())) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            doauVar = (doau) next2;
            if (doauVar == null) {
                throw new IllegalStateException(a.i(doavVar, uri, "Selected URI ", " not found in "));
            }
            if (!fdbq.f(doavVar.a(), doauVar.e)) {
                throw new IllegalStateException(a.i(doauVar, doavVar, "GifStickerMedia and selected variation source are not equal: ", ", "));
            }
        } else {
            doauVar = null;
        }
        entz entzVarA = enty.a((empq) emqj.a.createBuilder());
        if (doauVar != null) {
            entzVarA.h(doauVar.c);
            entzVarA.e(doauVar.d);
            entzVarA.f(dohn.b(doauVar).a());
        } else {
            Iterable iterableC = doavVar.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : iterableC) {
                String strA = dohn.b((doau) obj).a();
                Object arrayList = linkedHashMap.get(strA);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(strA, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int size = ((List) ((Map.Entry) next).getValue()).size();
                    while (true) {
                        Object next3 = it2.next();
                        int size2 = ((List) ((Map.Entry) next3).getValue()).size();
                        int i = size < size2 ? size2 : size;
                        if (size < size2) {
                            next = next3;
                        }
                        if (!it2.hasNext()) {
                            break;
                        } else {
                            size = i;
                        }
                    }
                }
            } else {
                next = null;
            }
            Map.Entry entry = (Map.Entry) next;
            String str = entry != null ? (String) entry.getKey() : null;
            if (str == null) {
                Objects.toString(doavVar);
                throw new IllegalStateException("No most common mime type found for ".concat(doavVar.toString()));
            }
            entzVarA.f(str);
        }
        if (z) {
            empz empzVar = (empz) emqa.a.createBuilder();
            empzVar.getClass();
            if (uri == null || (host = uri.getHost()) == null) {
                host = Uri.parse(((dnyz) doavVar).b).getHost();
            }
            if (host != null) {
                enub.b(host, empzVar);
            }
            entzVarA.d(enub.a(empzVar));
        } else if (doavVar instanceof doyt) {
            emqf emqfVar = (emqf) emqg.a.createBuilder();
            emqfVar.getClass();
            String strC = ebve.c(((doyt) doavVar).a);
            strC.getClass();
            emqfVar.copyOnWrite();
            emqg emqgVar = (emqg) emqfVar.instance;
            emqgVar.b |= 1;
            emqgVar.c = strC;
            entzVarA.g(enuc.a(emqfVar));
        }
        emncVar.c(entzVarA.a());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static final void d(entz entzVar, dojv dojvVar) {
        int i;
        String host;
        String str;
        Uri uri = Uri.parse(dojvVar.f());
        int i2 = 3;
        if (fdbq.f(uri.getScheme(), "content") && (host = uri.getHost()) != null && fdgn.t(host, "com.google.android.inputmethod.latin")) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 3 && fdbq.f(pathSegments.get(0), "content") && (str = pathSegments.get(1)) != null) {
                switch (str.hashCode()) {
                    case -1890252483:
                        if (str.equals("sticker")) {
                            emqf emqfVar = (emqf) emqg.a.createBuilder();
                            emqfVar.getClass();
                            entzVar.g(enuc.a(emqfVar));
                            return;
                        }
                        break;
                    case -1448896059:
                        if (str.equals("tenor_gif")) {
                            empz empzVar = (empz) emqa.a.createBuilder();
                            empzVar.getClass();
                            enub.b("tenor.com", empzVar);
                            entzVar.d(enub.a(empzVar));
                            return;
                        }
                        break;
                    case -102405906:
                        if (str.equals("bitmoji")) {
                            empo empoVar = (empo) empp.a.createBuilder();
                            empoVar.getClass();
                            evsn evsnVarBuild = empoVar.build();
                            evsnVarBuild.getClass();
                            empq empqVar = entzVar.a;
                            empqVar.copyOnWrite();
                            emqj emqjVar = (emqj) empqVar.instance;
                            emqj emqjVar2 = emqj.a;
                            emqjVar.d = (empp) evsnVarBuild;
                            emqjVar.c = 106;
                            return;
                        }
                        break;
                    case 102340:
                        if (str.equals("gif")) {
                            empz empzVar2 = (empz) emqa.a.createBuilder();
                            empzVar2.getClass();
                            entzVar.d(enub.a(empzVar2));
                            return;
                        }
                        break;
                    case 583427413:
                        if (str.equals("make_a_gif")) {
                            empz empzVar3 = (empz) emqa.a.createBuilder();
                            empzVar3.getClass();
                            empzVar3.copyOnWrite();
                            emqa.a((emqa) empzVar3.instance);
                            entzVar.d(enub.a(empzVar3));
                            return;
                        }
                        break;
                }
            }
        }
        dltc dltcVarFo = dojvVar.fo();
        if (dltcVarFo instanceof dmbs) {
            dmbs dmbsVar = (dmbs) dltcVarFo;
            if (!fdbq.f(dmbsVar, dmbp.a)) {
                if (!fdbq.f(dmbsVar, dmbr.a)) {
                    throw new fctg();
                }
                empv empvVar = (empv) empw.a.createBuilder();
                empvVar.getClass();
                entzVar.c(enua.a(empvVar));
                return;
            }
            empx empxVar = (empx) empy.a.createBuilder();
            empxVar.getClass();
            evsn evsnVarBuild2 = empxVar.build();
            evsnVarBuild2.getClass();
            empq empqVar2 = entzVar.a;
            empqVar2.copyOnWrite();
            emqj emqjVar3 = (emqj) empqVar2.instance;
            emqj emqjVar4 = emqj.a;
            emqjVar3.d = (empy) evsnVarBuild2;
            emqjVar3.c = 102;
            return;
        }
        if (!(dltcVarFo instanceof dmca)) {
            if (dltcVarFo instanceof VideoTrimmerSource) {
                emqh emqhVar = (emqh) emqi.a.createBuilder();
                emqhVar.getClass();
                evsn evsnVarBuild3 = emqhVar.build();
                evsnVarBuild3.getClass();
                empq empqVar3 = entzVar.a;
                empqVar3.copyOnWrite();
                emqj emqjVar5 = (emqj) empqVar3.instance;
                emqj emqjVar6 = emqj.a;
                emqjVar5.d = (emqi) evsnVarBuild3;
                emqjVar5.c = 108;
                return;
            }
            if (!(dltcVarFo instanceof dnvr)) {
                if (dltcVarFo instanceof dlsx) {
                    empv empvVar2 = (empv) empw.a.createBuilder();
                    empvVar2.getClass();
                    entzVar.c(enua.a(empvVar2));
                    return;
                } else if (dltcVarFo instanceof dltb) {
                    ekrw ekrwVarE = a.e();
                    ekrwVarE.X(eksq.a, "BugleComposeRow2");
                    ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentInfoCreator", "setVisualLocalMediaSource", 417, "AttachmentInfoCreator.kt")).t("Skipping MediaSource for %s", dltcVarFo);
                    return;
                } else {
                    ekrw ekrwVarI = a.i();
                    ekrwVarI.X(eksq.a, "BugleComposeRow2");
                    ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentInfoCreator", "setVisualLocalMediaSource", 420, "AttachmentInfoCreator.kt")).t("Cannot set MediaSource for unhandled LocalMedia source %s", dltcVarFo);
                    return;
                }
            }
            empt emptVar = (empt) empu.a.createBuilder();
            emptVar.getClass();
            boolean z = ((dnvr) dltcVarFo).c.b == 100;
            emptVar.copyOnWrite();
            empu empuVar = (empu) emptVar.instance;
            empuVar.b |= 1;
            empuVar.c = z;
            evsn evsnVarBuild4 = emptVar.build();
            evsnVarBuild4.getClass();
            empq empqVar4 = entzVar.a;
            empqVar4.copyOnWrite();
            emqj emqjVar7 = (emqj) empqVar4.instance;
            emqj emqjVar8 = emqj.a;
            emqjVar7.d = (empu) evsnVarBuild4;
            emqjVar7.c = 110;
            return;
        }
        dmca dmcaVar = (dmca) dltcVarFo;
        if (dojvVar instanceof dojr) {
            i = 2;
        } else {
            if (!(dojvVar instanceof doju)) {
                throw new IllegalStateException("Media must be Image or Video");
            }
            i = 3;
        }
        Duration duration = dojvVar instanceof doju ? ((doju) dojvVar).g : null;
        if (!(dmcaVar instanceof dmbx)) {
            if (!(dmcaVar instanceof dmbz)) {
                throw new fctg();
            }
            empr emprVar = (empr) emps.a.createBuilder();
            emprVar.getClass();
            emrl emrlVar = (emrl) emrt.a.createBuilder();
            emrlVar.getClass();
            enmp.c(i, emrlVar);
            enmp.b(4, emrlVar);
            entx.b(enmp.a(emrlVar), emprVar);
            entzVar.b(entx.a(emprVar));
            return;
        }
        empr emprVar2 = (empr) emps.a.createBuilder();
        emprVar2.getClass();
        emrl emrlVar2 = (emrl) emrt.a.createBuilder();
        emrlVar2.getClass();
        enmp.c(i, emrlVar2);
        dmbx dmbxVar = (dmbx) dmcaVar;
        int i3 = dmbxVar.e - 1;
        int i4 = i3 != 0 ? i3 != 1 ? 2 : 3 : 1;
        emrlVar2.copyOnWrite();
        emrt emrtVar = (emrt) emrlVar2.instance;
        emrtVar.d = i4 - 1;
        emrtVar.b |= 2;
        int i5 = dmbxVar.f - 1;
        int i6 = i5 != 0 ? i5 != 1 ? 3 : 2 : 1;
        emrlVar2.copyOnWrite();
        emrt emrtVar2 = (emrt) emrlVar2.instance;
        emrtVar2.e = i6 - 1;
        emrtVar2.b |= 4;
        boolean z2 = dmbxVar.b;
        emrlVar2.copyOnWrite();
        emrt emrtVar3 = (emrt) emrlVar2.instance;
        emrtVar3.b |= 8;
        emrtVar3.f = z2;
        if (duration != null) {
            int seconds = (int) duration.getSeconds();
            emrlVar2.copyOnWrite();
            emrt emrtVar4 = (emrt) emrlVar2.instance;
            emrtVar4.b |= 16;
            emrtVar4.g = seconds;
        }
        int iOrdinal = dmbxVar.a.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i2 = 2;
            } else {
                if (iOrdinal != 2) {
                    throw new fctg();
                }
                i2 = 5;
            }
        }
        enmp.b(i2, emrlVar2);
        String str2 = dmbxVar.d;
        if (str2 != null) {
            emrlVar2.copyOnWrite();
            emrt emrtVar5 = (emrt) emrlVar2.instance;
            emrtVar5.b |= 32;
            emrtVar5.h = str2;
        }
        entx.b(enmp.a(emrlVar2), emprVar2);
        entzVar.b(entx.a(emprVar2));
    }

    private static final void e(emnc emncVar, dltn dltnVar) {
        if (!le.y(dltnVar.b().a())) {
            b(emncVar, dltnVar.b(), Long.valueOf(dltnVar.a()));
            return;
        }
        emos emosVar = (emos) emou.a.createBuilder();
        emosVar.getClass();
        emosVar.copyOnWrite();
        emou emouVar = (emou) emosVar.instance;
        emouVar.c = 0;
        emouVar.b |= 4;
        evsn evsnVarBuild = emosVar.build();
        evsnVarBuild.getClass();
        emoo emooVar = emncVar.a;
        emooVar.copyOnWrite();
        emop emopVar = (emop) emooVar.instance;
        emop emopVar2 = emop.a;
        emopVar.f = (emou) evsnVarBuild;
        emopVar.e = 206;
    }
}
