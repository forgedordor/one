package defpackage;

import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapp implements aiyu {
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private static final eksp c = eksp.c("MixedUpConvInspector");
    public static final cczv a = cdag.e(cdag.b, "maximum_number_of_conversation_collected", 5);
    public static final cczv b = cdag.e(cdag.b, "number_of_conversations_retrieved_limit", Alert.DURATION_SHOW_INDEFINITELY);

    public aapp(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        this.j = fcsuVar2;
        this.d = fcsuVar;
        this.g = fcsuVar3;
        this.f = fcsuVar5;
        this.e = fcsuVar6;
        this.h = fcsuVar4;
        this.i = fcsuVar7;
        this.k = fcsuVar8;
    }

    private final ekgb c(Collection collection, final awfh awfhVar, final awch awchVar) {
        if (collection == null || collection.isEmpty()) {
            int i = ekgb.d;
            return ekoe.a;
        }
        Stream map = Collection.EL.stream(collection).map(new Function() { // from class: aapk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                emuh emuhVar = ((awev) awfhVar.a(((bojh) obj).C())).a;
                cnqj cnqjVar = new cnqj(emuhVar.d);
                final emvp emvpVar = (emvp) emvq.a.createBuilder();
                Stream stream = Collection.EL.stream(this.a.a(cnqjVar));
                final awch awchVar2 = awchVar;
                Stream map2 = stream.map(new Function() { // from class: aapb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        cczv cczvVar = aapp.a;
                        return awfh.c(awchVar2.a((String) obj2));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                emvpVar.getClass();
                map2.forEach(new Consumer() { // from class: aapc
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        emvp emvpVar2 = emvpVar;
                        emub emubVar = (emub) obj2;
                        emvpVar2.copyOnWrite();
                        emvq emvqVar = (emvq) emvpVar2.instance;
                        emvq emvqVar2 = emvq.a;
                        emubVar.getClass();
                        evtg evtgVar = emvqVar.d;
                        if (!evtgVar.c()) {
                            emvqVar.d = evsn.mutableCopy(evtgVar);
                        }
                        emvqVar.d.add(emubVar);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                emvpVar.copyOnWrite();
                emvq emvqVar = (emvq) emvpVar.instance;
                emvqVar.c = emuhVar;
                emvqVar.b |= 1;
                return emvpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    private static String d(String str) {
        String strTrim = aamg.a.matcher(str).replaceAll("").trim();
        int length = strTrim.length() - aamg.b;
        return length > 0 ? strTrim.substring(length) : "";
    }

    private final void e(emvr emvrVar) {
        aapx aapxVar = (aapx) this.d.b();
        aaps aapsVar = new aaps();
        aapsVar.d(emvl.MIXED_UP_PARTICIPANT);
        aapsVar.c(new ConversationIdType(-1L));
        aapsVar.e = Optional.of((emvs) emvrVar.build());
        aapxVar.b(aapsVar.e());
        ((eksl) ((eksl) c.h()).h("com/google/android/apps/messaging/custodian/inspectors/mixedupparticipant/MixedUpParticipantInspector", "logReportError", 571, "MixedUpParticipantInspector.java")).q("logging Mixed Up Participant Info to clearcut completed successfully");
    }

    private final boolean f(String str, String str2) {
        boolean z;
        String strD = d(str);
        String strD2 = d(str2);
        if (strD.equals(strD2)) {
            return true;
        }
        int length = strD.length();
        int length2 = strD2 == null ? 0 : strD2.length();
        if (length == 0 || length2 == 0) {
            return false;
        }
        int i = length - 1;
        int i2 = length2 - 1;
        int i3 = 0;
        while (i >= 0 && i2 >= 0) {
            char cCharAt = strD.charAt(i);
            char cCharAt2 = strD2.charAt(i2);
            if (aamg.d(cCharAt)) {
                z = false;
            } else {
                i--;
                z = true;
            }
            if (!aamg.d(cCharAt2)) {
                i2--;
                z = true;
            }
            if (!z) {
                if (cCharAt2 != cCharAt) {
                    break;
                }
                i--;
                i2--;
                i3++;
            }
        }
        return i3 >= aamg.b;
    }

    private final int g(String str, String str2, awch awchVar) {
        fcsu fcsuVar = this.i;
        String strA = ((aamg) fcsuVar.b()).a(str, awchVar);
        String strA2 = ((aamg) fcsuVar.b()).a(str2, awchVar);
        if (strA == null && strA2 == null) {
            return 3;
        }
        return (strA == null || strA2 == null || !strA.equals(strA2)) ? 1 : 2;
    }

    public final ekgb a(cnqj cnqjVar) {
        Optional optionalAj = ((cmqj) this.g.b()).aj(cnqjVar);
        int i = ekgb.d;
        return (ekgb) Collection.EL.stream((ekgb) optionalAj.orElse(ekoe.a)).map(new Function() { // from class: aapi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((alqm) obj).n();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: aapj
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                cczv cczvVar = aapp.a;
                return !TextUtils.isEmpty((String) obj);
            }
        }).collect(ekcv.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141 A[PHI: r26 r27
      0x0141: PHI (r26v16 eieu) = (r26v15 eieu), (r26v20 eieu), (r26v20 eieu) binds: [B:67:0x01ef, B:47:0x013f, B:52:0x014e] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r27v5 eksp) = (r27v4 eksp), (r27v10 eksp), (r27v10 eksp) binds: [B:67:0x01ef, B:47:0x013f, B:52:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025f A[Catch: all -> 0x03e4, TryCatch #1 {all -> 0x03e4, blocks: (B:27:0x00f6, B:29:0x0108, B:32:0x0115, B:34:0x011e, B:39:0x0128, B:41:0x0131, B:68:0x01f1, B:77:0x0201, B:79:0x0217, B:80:0x021b, B:82:0x0231, B:83:0x023d, B:85:0x0253, B:86:0x025f, B:49:0x0144, B:51:0x014a, B:56:0x0158, B:63:0x0178, B:64:0x017c, B:66:0x01eb, B:87:0x0262, B:90:0x028c), top: B:137:0x00f6 }] */
    @Override // defpackage.aiyu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aapp.b():void");
    }
}
