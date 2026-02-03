package defpackage;

import android.database.DatabaseUtils;
import android.util.Patterns;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aweh implements avpc, awcm {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher");
    static final cczi b = cdag.m(cdag.b, "use_guessed_min_match_value", false);
    static final cczi c = cdag.h(cdag.b, "crash_on_conversation_creation_mismatch", false);
    public final eosc d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    private final fcsu j;
    private final eosc k;
    private final eosc l;
    private final eygg m;
    private final dzuc n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;

    public aweh(fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, eygg eyggVar, fcsu fcsuVar2, dzuc dzucVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12) {
        this.j = fcsuVar;
        this.k = eoscVar;
        this.l = eoscVar2;
        this.d = eoscVar3;
        this.m = eyggVar;
        this.e = fcsuVar2;
        this.n = dzucVar;
        this.g = fcsuVar3;
        this.o = fcsuVar4;
        this.p = fcsuVar5;
        this.f = fcsuVar6;
        this.q = fcsuVar7;
        this.r = fcsuVar8;
        this.s = fcsuVar9;
        this.h = fcsuVar10;
        this.i = fcsuVar11;
        this.t = fcsuVar12;
    }

    public static String D(String str) {
        return str.length() <= 4 ? str : str.substring(str.length() - 4);
    }

    public static boolean H(ParticipantsTable.BindData bindData, String str, int i) {
        if (bindData.T() == null || !awcn.e(bindData.T(), str, i)) {
            return bindData.V() != null && awcn.e(bindData.V(), str, i);
        }
        return true;
    }

    private final eiju I() {
        return ((Boolean) b.e()).booleanValue() ? ((awfd) this.j.b()).a().h(new ejvr() { // from class: awdq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Integer.valueOf(aweh.v((Optional) obj));
            }
        }, eoqg.a) : awcn.b();
    }

    private final Optional J(bojh bojhVar, ekgb ekgbVar, int i, awch awchVar) {
        return K(bojhVar, ekgbVar, i, awchVar) ? Optional.ofNullable(botm.b(bojhVar.C())) : Optional.empty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean K(bojh bojhVar, ekgb ekgbVar, int i, awch awchVar) {
        boolean z;
        ParticipantsTable.BindData[] bindDataArr = (ParticipantsTable.BindData[]) bojhVar.aH("participants", new ParticipantsTable.BindData[0]);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        for (ParticipantsTable.BindData bindData : bindDataArr) {
            if (bindData.T() != null) {
                map.put(bindData.T(), bindData);
            }
            if (bindData.V() != null) {
                map.put(bindData.V(), bindData);
            }
        }
        int size = ekgbVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) ekgbVar.get(i2);
            if (map.containsKey(str)) {
                hashSet.add(str);
                hashSet2.add(((ParticipantsTable.BindData) map.get(str)).R());
            }
        }
        for (ParticipantsTable.BindData bindData2 : bindDataArr) {
            int size2 = ekgbVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str2 = (String) ekgbVar.get(i3);
                if (!hashSet.contains(str2) && H(bindData2, str2, i)) {
                    hashSet2.add(bindData2.R());
                    hashSet.add(str2);
                    if (!map.containsKey(str2)) {
                        map.put(str2, bindData2);
                    }
                }
            }
        }
        HashSet hashSet3 = new HashSet((Collection) DesugarArrays.stream(bindDataArr).map(new Function() { // from class: awdj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ParticipantsTable.BindData) obj).R();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b));
        int size3 = ekgbVar.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                z = true;
                break;
            }
            String str3 = (String) ekgbVar.get(i4);
            if (!hashSet.contains(str3)) {
                z = false;
                break;
            }
            hashSet.remove(str3);
            if (map.get(str3) != null) {
                hashSet3.remove(((ParticipantsTable.BindData) map.get(str3)).R());
            }
            i4++;
        }
        if (!hashSet3.isEmpty() || !hashSet.isEmpty() || !z) {
            return false;
        }
        ekgb ekgbVar2 = (ekgb) DesugarArrays.stream(bindDataArr).map(new Function() { // from class: awdk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ekrg ekrgVar = aweh.a;
                String strV = ((ParticipantsTable.BindData) obj).V();
                strV.getClass();
                return strV;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a);
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "Bugle");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "isMatchingConversation", 991, "TelephonyCompatibleMatcher.java");
        ConversationIdType conversationIdTypeC = bojhVar.C();
        awce awceVar = new awce(awchVar, ekgbVar2);
        int length = bindDataArr.length;
        ekrdVar.K("ConversationMatcher#findMatchingConversation returning conversation %s because phone numbers %s (%d) participants matched phone numbers %s (%d)", conversationIdTypeC, awceVar, Integer.valueOf(length), new awce(awchVar, ekgbVar), Integer.valueOf(ekgbVar.size()));
        if (length < ekgbVar.size()) {
            ((ains) this.o.b()).c("Bugle.TelephonyCompatibleMatcher.FindConversation.DuplicateDestinationsInQuery");
        }
        return true;
    }

    public static int v(Optional optional) {
        return (!optional.isPresent() || ((Integer) optional.get()).intValue() < 6) ? awcn.a() : ((Integer) optional.get()).intValue();
    }

    public static bosz w(Function function) {
        return x(function, new Function() { // from class: aweg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bopp boppVar = (bopp) obj;
                ekrg ekrgVar = aweh.a;
                return new bopq[]{boppVar.a, boppVar.O, boppVar.R};
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }).b();
    }

    public static botb x(Function function, Function function2) {
        botb botbVarE = botm.e();
        botbVarE.A("createQueryForConversationsWithAllParticipant");
        botbVarE.i(function);
        bopq bopqVar = botm.c.a;
        botbVarE.e(new bosy(bopqVar, false));
        botbVarE.f(function2);
        botbVarE.w(bopqVar);
        String[] strArr = boiv.a;
        boiq boiqVar = new boiq(boiv.a);
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.e(new Function() { // from class: awef
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brzh brzhVar = (brzh) obj;
                ekrg ekrgVar = aweh.a;
                return new brzi[]{brzhVar.a, brzhVar.f, brzhVar.g};
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        });
        bsbm bsbmVarB = bsboVarE.b();
        brzi brziVar = ParticipantsTable.c.a;
        boic boicVar = boiv.c;
        dqtr dqtrVarI = dqts.i(bsbmVarB, brziVar, boicVar.b);
        ((dqos) dqtrVarI).e = "participants";
        boiqVar.E(dqtrVarI.g());
        dqtr dqtrVarI2 = dqts.i(boiqVar.b(), boicVar.a, bopqVar);
        ((dqos) dqtrVarI2).e = "conversation_participants";
        botbVarE.E(dqtrVarI2.g());
        botbVarE.s();
        return botbVarE;
    }

    public static bsbo y(ekfn ekfnVar) {
        dqxl dqxlVar = new dqxl("$V IN ($R)", new Object[]{z(ParticipantsTable.c.f), (String) Collection.EL.stream(ekfnVar).distinct().map(new Function() { // from class: awee
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ekrg ekrgVar = aweh.a;
                return DatabaseUtils.sqlEscapeString((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(","))});
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("createQueryForRecipientsByDestinationSuffix");
        bsbx bsbxVar = new bsbx();
        bsbxVar.v(-2);
        bsbxVar.ar(dqxlVar);
        bsboVarE.g(bsbxVar);
        return bsboVarE;
    }

    public static dqxe z(dqpo dqpoVar) {
        return new dqxl("substr($V, -$V)", new Object[]{dqpoVar, 4});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ekgb A(ekgb ekgbVar, int i, awch awchVar, final ekhx ekhxVar, final int i2) {
        eieu eieuVarK = eiiy.k("BugleCompatibleConversationMatcher#findAllGroupConversationSyncInTransaction");
        try {
            ekrw ekrwVarG = a.g();
            ekrwVarG.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findAllConversationsSyncInTransaction", 906, "TelephonyCompatibleMatcher.java")).t("ConversationMatcher#findAllGroupConversationSyncInTransaction called with %s", new awce(awchVar, ekgbVar));
            int i3 = ekgb.d;
            final ekfw ekfwVar = new ekfw();
            bopr boprVar = (bopr) w(new Function() { // from class: awcs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    botl botlVar = (botl) obj;
                    ekrg ekrgVar = aweh.a;
                    int iIntValue = botm.g().intValue();
                    if (iIntValue < 10007) {
                        dqru.x("conv_type", iIntValue);
                    }
                    botlVar.ap(new dqpm("conversations.conv_type", 3, botl.as(ekhxVar), true));
                    botlVar.B(i2);
                    return botlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).p();
            try {
                ekqh it = boprVar.cX().iterator();
                while (it.hasNext()) {
                    J((bojh) it.next(), ekgbVar, i, awchVar).ifPresent(new Consumer() { // from class: awct
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ekfwVar.h((bojh) obj);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                ekgb ekgbVarG = ekfwVar.g();
                boprVar.close();
                eieuVarK.close();
                return ekgbVarG;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Optional B(final String str, final int i) {
        dzub dzubVarD = this.n.d();
        try {
            eieu eieuVarK = eiiy.k("BugleCompatibleConversationMatcher#getConversationId(recipient)");
            try {
                final String strB = ((crnb) this.r.b()).b();
                Optional optional = (Optional) ((dqsn) this.e.b()).c("BugleCompatibleConversationMatcher#getConversationId.txn", new ejxr() { // from class: awcu
                    /* JADX WARN: Code restructure failed: missing block: B:7:0x009d, code lost:
                    
                        r0 = r4.c();
                     */
                    @Override // defpackage.ejxr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object get() {
                        /*
                            Method dump skipped, instructions count: 285
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.awcu.get():java.lang.Object");
                    }
                });
                eieuVarK.close();
                return optional;
            } finally {
            }
        } finally {
            this.n.f(dzubVarD, new dzfh("TelephonyCompatibleMatcher#find1To1ConversationSync"), null, dzua.SUCCESS);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        r6 = r6.h();
        r6.X(r8, "Bugle");
        ((defpackage.ekrd) ((defpackage.ekrd) r6).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findGroupConversationSyncInTransaction", 871, "TelephonyCompatibleMatcher.java")).B("ConversationMatcher#findGroupConversationSyncInTransaction failed to find any conversations matching phone numbers %s (%d)", new defpackage.awce(r3, r18), r18.size());
        r15 = j$.util.Optional.empty();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.Optional C(defpackage.ekgb r18, int r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = "TelephonyCompatibleMatcher#findGroupConversationSync#withDuplicateHandling"
            int r3 = r0.size()
            r4 = 1
            if (r3 == r4) goto Le
            goto Lf
        Le:
            r4 = 0
        Lf:
            defpackage.ejwl.a(r4)
            fcsu r3 = r1.f
            dzuc r4 = r1.n
            dzub r5 = r4.d()
            java.lang.Object r3 = r3.b()
            awci r3 = (defpackage.awci) r3
            awch r3 = r3.a()
            ekrg r6 = defpackage.aweh.a
            ekrw r7 = r6.g()
            ekrz r8 = defpackage.eksq.a
            java.lang.String r9 = "Bugle"
            r7.X(r8, r9)
            ekrd r7 = (defpackage.ekrd) r7
            r10 = 842(0x34a, float:1.18E-42)
            java.lang.String r11 = "com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher"
            java.lang.String r12 = "findGroupConversationSyncInTransaction"
            java.lang.String r13 = "TelephonyCompatibleMatcher.java"
            ekrw r7 = r7.h(r11, r12, r10, r13)
            ekrd r7 = (defpackage.ekrd) r7
            awce r10 = new awce
            r10.<init>(r3, r0)
            java.lang.String r14 = "ConversationMatcher#findGroupConversationSyncInTransaction called with %s"
            r7.t(r14, r10)
            int r7 = r0.size()
            awcr r14 = new awcr     // Catch: java.lang.Throwable -> Lbd
            r14.<init>()     // Catch: java.lang.Throwable -> Lbd
            bosz r7 = w(r14)     // Catch: java.lang.Throwable -> Lbd
            dqqj r7 = r7.p()     // Catch: java.lang.Throwable -> Lbd
            bopr r7 = (defpackage.bopr) r7     // Catch: java.lang.Throwable -> Lbd
            ekgb r14 = r7.cX()     // Catch: java.lang.Throwable -> Lb2
            ekqh r14 = r14.iterator()     // Catch: java.lang.Throwable -> Lb2
        L66:
            boolean r15 = r14.hasNext()     // Catch: java.lang.Throwable -> Lb2
            if (r15 == 0) goto L82
            java.lang.Object r15 = r14.next()     // Catch: java.lang.Throwable -> Lb2
            bojh r15 = (defpackage.bojh) r15     // Catch: java.lang.Throwable -> Lb2
            r10 = r19
            j$.util.Optional r15 = r1.J(r15, r0, r10, r3)     // Catch: java.lang.Throwable -> Lb2
            boolean r16 = r15.isPresent()     // Catch: java.lang.Throwable -> Lb2
            if (r16 == 0) goto L66
        L7e:
            r7.close()     // Catch: java.lang.Throwable -> Lbd
            goto La6
        L82:
            ekrw r6 = r6.h()     // Catch: java.lang.Throwable -> Lb2
            r6.X(r8, r9)     // Catch: java.lang.Throwable -> Lb2
            ekrd r6 = (defpackage.ekrd) r6     // Catch: java.lang.Throwable -> Lb2
            r8 = 871(0x367, float:1.22E-42)
            ekrw r6 = r6.h(r11, r12, r8, r13)     // Catch: java.lang.Throwable -> Lb2
            ekrd r6 = (defpackage.ekrd) r6     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r8 = "ConversationMatcher#findGroupConversationSyncInTransaction failed to find any conversations matching phone numbers %s (%d)"
            awce r9 = new awce     // Catch: java.lang.Throwable -> Lb2
            r9.<init>(r3, r0)     // Catch: java.lang.Throwable -> Lb2
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb2
            r6.B(r8, r9, r0)     // Catch: java.lang.Throwable -> Lb2
            j$.util.Optional r15 = j$.util.Optional.empty()     // Catch: java.lang.Throwable -> Lb2
            goto L7e
        La6:
            dzfh r0 = new dzfh
            r0.<init>(r2)
            dzua r2 = defpackage.dzua.SUCCESS
            r3 = 0
            r4.f(r5, r0, r3, r2)
            return r15
        Lb2:
            r0 = move-exception
            r3 = r0
            r7.close()     // Catch: java.lang.Throwable -> Lb8
            goto Lbc
        Lb8:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lbd
        Lbc:
            throw r3     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r0 = move-exception
            dzuc r3 = r1.n
            dzfh r4 = new dzfh
            r4.<init>(r2)
            dzua r2 = defpackage.dzua.SUCCESS
            r6 = 0
            r3.f(r5, r4, r6, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aweh.C(ekgb, int):j$.util.Optional");
    }

    public final String E(String str) {
        int iO;
        int iO2;
        if (str.contains("@")) {
            str.getClass();
            if (fdgn.G(str, "<", false) && fdgn.G(str, ">", false) && (iO = fdgn.O(str, "<", 0, false, 6)) <= (iO2 = fdgn.O(str, ">", 0, false, 6))) {
                String strSubstring = str.substring(iO + 1, iO2);
                strSubstring.getClass();
                if (Patterns.EMAIL_ADDRESS.matcher(strSubstring).matches()) {
                    return strSubstring;
                }
            }
        }
        return str;
    }

    public final void F(ekgb ekgbVar, final bojh bojhVar, awch awchVar) {
        bojh bojhVar2 = (bojh) w(new Function() { // from class: awcv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                ekrg ekrgVar = aweh.a;
                botlVar.r(bojhVar.C());
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).l();
        bojhVar2.getClass();
        int size = ekgbVar.size();
        if (K(bojhVar2, ekgbVar, u(), awchVar)) {
            return;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "checkConversationCorrectness", 451, "TelephonyCompatibleMatcher.java")).D("ConversationMatcher#checkConversationCorrectness thinks it created conversation %s for %s, but that doesn't exist", bojhVar.C(), new awce(awchVar, ekgbVar));
        ((ains) this.o.b()).e("Bugle.TelephonyCompatibleMatcher.FindOrCreateConversation.ConversationMismatch.Count", size != 1 ? 2 : 1);
        avor avorVar = (avor) this.q.b();
        ConversationIdType conversationIdTypeC = bojhVar.C();
        if (((Boolean) avos.e.e()).booleanValue()) {
            awch awchVarA = ((awci) avorVar.c.b()).a();
            ekgb ekgbVarN = ekgb.n(((bakt) avorVar.b.b()).K(conversationIdTypeC));
            Stream map = Collection.EL.stream(ekgbVarN).filter(new Predicate() { // from class: avol
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
                    return ((ParticipantsTable.BindData) obj).M() != null;
                }
            }).map(new Function() { // from class: avom
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String strM = ((ParticipantsTable.BindData) obj).M();
                    strM.getClass();
                    return strM;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            Collector collector = ekcv.a;
            ekgb ekgbVar2 = (ekgb) map.collect(collector);
            ekgb ekgbVar3 = (ekgb) Collection.EL.stream(ekgbVarN).filter(new Predicate() { // from class: avon
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
                    return ((ParticipantsTable.BindData) obj).T() != null;
                }
            }).map(new Function() { // from class: avoo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String strT = ((ParticipantsTable.BindData) obj).T();
                    strT.getClass();
                    return strT;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(collector);
            ekgb ekgbVar4 = (ekgb) Collection.EL.stream(ekgbVarN).filter(new Predicate() { // from class: avop
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
                    return ((ParticipantsTable.BindData) obj).V() != null;
                }
            }).map(new Function() { // from class: avoq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String strT = ((ParticipantsTable.BindData) obj).T();
                    strT.getClass();
                    return strT;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(collector);
            ekrd ekrdVar = (ekrd) avor.a.j();
            ekrdVar.Z(eksk.FULL);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/conversation/match/ConversationDetailsLogger", "logAnonymousDestinationsForConversationCreationFailures", 73, "ConversationDetailsLogger.java")).J("BCM created a conversation but the query check couldn't find any conversation with matching destinations: Anonymized conversation destinations: [%s] newConversation Comparable Destinations: [%s] newConversation Normalized Destinations: [%s] newConversation Send Destinations: [%s]", avor.a(ekgbVar, awchVarA), avor.a(ekgbVar2, awchVarA), avor.a(ekgbVar3, awchVarA), avor.a(ekgbVar4, awchVarA));
        }
        if (((Boolean) c.e()).booleanValue()) {
            ejyb.c(false, "ConversationMatcher created a new conversation for a phone number, but the conversation doesn't actually match that phone number. Check logcat for \"BCM created a conversation but the query check couldn't find any conversation with\" for more details", new Object[0]);
        }
    }

    public final boolean G(String str, int i, String[] strArr, String str2) {
        for (String str3 : strArr) {
            if (str3 != null && ((awcn) this.m.b()).f(str3.trim(), str.trim(), i, str2) != 4) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.avpc
    public final /* synthetic */ bojh a(alqm alqmVar, fcsu fcsuVar) {
        return avpb.a(this, alqmVar, fcsuVar);
    }

    @Override // defpackage.avpc
    public final bojh b(final String str, final fcsu fcsuVar) {
        final awch awchVarA = ((awci) this.f.b()).a();
        return (bojh) ((dqsn) this.e.b()).c("TelephonyCompatibleMatcher#findOrCreate1to1ConversationSync", new ejxr() { // from class: aweb
            @Override // defpackage.ejxr
            public final Object get() {
                ekrg ekrgVar = aweh.a;
                ekrw ekrwVarG = ekrgVar.g();
                ekrz ekrzVar = eksq.a;
                ekrwVarG.X(ekrzVar, "Bugle");
                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findOrCreate1to1ConversationSync", 340, "TelephonyCompatibleMatcher.java");
                awch awchVar = awchVarA;
                String str2 = str;
                ekrdVar.t("ConversationMatcher#findOrCreate1to1ConversationSync called with %s", new awcc(awchVar, str2));
                aweh awehVar = this.a;
                Optional optionalQ = awehVar.q(str2);
                if (optionalQ.isPresent()) {
                    ekrw ekrwVarE = ekrgVar.e();
                    ekrwVarE.X(ekrzVar, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findOrCreate1to1ConversationSync", 346, "TelephonyCompatibleMatcher.java")).D("ConversationMatcher#findOrCreate1to1ConversationSync returning existing conversation %s for destination %s", ((bojh) optionalQ.get()).C(), new awcc(awchVar, str2));
                    return (bojh) optionalQ.get();
                }
                ConversationIdType conversationIdTypeL = ((bakt) awehVar.g.b()).l((bara) fcsuVar.b());
                bojh bojhVarC = botm.c(conversationIdTypeL);
                ekrw ekrwVarE2 = ekrgVar.e();
                ekrwVarE2.X(ekrzVar, "Bugle");
                ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findOrCreate1to1ConversationSync", 358, "TelephonyCompatibleMatcher.java")).D("ConversationMatcher#findOrCreate1to1ConversationSync found no conversation for %s, so created conversation %s", new awcc(awchVar, str2), conversationIdTypeL);
                if (!((apqr) awehVar.i.b()).a()) {
                    return bojhVarC;
                }
                awehVar.F(ekgb.r(str2), bojhVarC, awchVar);
                return bojhVarC;
            }
        });
    }

    @Override // defpackage.avpc
    public final /* synthetic */ bojh c(java.util.Collection collection, fcsu fcsuVar) {
        return avpb.b(this, collection, fcsuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.avpc
    public final bojh d(final ekgb ekgbVar, final fcsu fcsuVar) {
        if (ekgbVar.size() == 1) {
            return b((String) ekgbVar.get(0), fcsuVar);
        }
        final awch awchVarA = ((awci) this.f.b()).a();
        return (bojh) ((dqsn) this.e.b()).c("TelephonyCompatibleMatcher#findOrCreateConversationSync", new ejxr() { // from class: awdm
            @Override // defpackage.ejxr
            public final Object get() {
                final aweh awehVar = this.a;
                final int iU = awehVar.u();
                dqsn dqsnVar = (dqsn) awehVar.e.b();
                final ekgb ekgbVar2 = ekgbVar;
                Optional optional = (Optional) dqsnVar.c("TelephonyCompatibleMatcher#findGroupConversationSync", new ejxr() { // from class: awcq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return awehVar.C(ekgbVar2, iU);
                    }
                });
                boolean zIsPresent = optional.isPresent();
                awch awchVar = awchVarA;
                if (zIsPresent) {
                    ekrw ekrwVarE = aweh.a.e();
                    ekrwVarE.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findOrCreateConversationSync", 388, "TelephonyCompatibleMatcher.java")).D("ConversationMatcher#findOrCreateConversationSync returning existing conversation %s for destinations %s", ((bojh) optional.get()).C(), new awce(awchVar, ekgbVar2));
                    return (bojh) optional.get();
                }
                bara baraVar = (bara) fcsuVar.b();
                ConversationIdType conversationIdTypeL = ((bakt) awehVar.g.b()).l(baraVar);
                ejyb.a(!baraVar.t());
                bojh bojhVarC = botm.c(conversationIdTypeL);
                if (!baraVar.t() && ((apqr) awehVar.i.b()).a()) {
                    awehVar.F(ekgbVar2, bojhVarC, awchVar);
                }
                return bojhVarC;
            }
        });
    }

    @Override // defpackage.avpc
    public final /* synthetic */ eiju e(alqm alqmVar) {
        return avpb.c(this, alqmVar);
    }

    @Override // defpackage.avpc
    public final eiju f(final String str) {
        return I().h(new ejvr() { // from class: awcx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return this.a.B(str, ((Integer) obj).intValue());
            }
        }, this.l);
    }

    @Override // defpackage.avpc
    public final /* synthetic */ eiju g(String str) {
        return avpb.d(this, str);
    }

    @Override // defpackage.avpc
    public final eiju h(final ekgb ekgbVar) {
        final awch awchVarA = ((awci) this.f.b()).a();
        return I().h(new ejvr() { // from class: awec
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final Integer num = (Integer) obj;
                final aweh awehVar = this.a;
                dqsn dqsnVar = (dqsn) awehVar.e.b();
                final ekgb ekgbVar2 = ekgbVar;
                final awch awchVar = awchVarA;
                return (ekgb) dqsnVar.c("BugleCompatibleConversationMatcher#findAllConversations.txn", new ejxr() { // from class: awcp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        int iIntValue = num.intValue();
                        ekhx ekhxVarR = ekhx.r(1, 0);
                        aweh awehVar2 = awehVar;
                        awch awchVar2 = awchVar;
                        ekgb ekgbVar3 = ekgbVar2;
                        return awehVar2.A(ekgbVar3, iIntValue, awchVar2, ekhxVarR, ekgbVar3.size());
                    }
                });
            }
        }, this.l);
    }

    @Override // defpackage.avpc
    public final eiju i(alqm alqmVar, java.util.Collection collection) {
        final awch awchVarA = ((awci) this.f.b()).a();
        if (((ardy) this.p.b()).a()) {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h(alqmVar);
            ekfwVar.j(collection);
            collection = ekfwVar.g();
        }
        Stream map = Collection.EL.stream(collection).map(new Function() { // from class: awdo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ekrg ekrgVar = aweh.a;
                return ejwk.b(((alqm) obj).n());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = ekgb.d;
        final ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
        return I().h(new ejvr() { // from class: awdp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final Integer num = (Integer) obj;
                final aweh awehVar = this.a;
                dqsn dqsnVar = (dqsn) awehVar.e.b();
                final ekgb ekgbVar2 = ekgbVar;
                final awch awchVar = awchVarA;
                return (ekgb) dqsnVar.c("BugleCompatibleConversationMatcher#findAllRcsGroupConversations.txn", new ejxr() { // from class: awdi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        int iIntValue = num.intValue();
                        ekph ekphVar = new ekph(2);
                        aweh awehVar2 = awehVar;
                        awch awchVar2 = awchVar;
                        ekgb ekgbVar3 = ekgbVar2;
                        return awehVar2.A(ekgbVar3, iIntValue, awchVar2, ekphVar, ekgbVar3.size());
                    }
                });
            }
        }, this.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.avpc
    public final eiju j(final ekgb ekgbVar) {
        return ekgbVar.size() == 1 ? f((String) ekgbVar.get(0)) : I().h(new ejvr() { // from class: awdh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final Integer num = (Integer) obj;
                final aweh awehVar = this.a;
                dqsn dqsnVar = (dqsn) awehVar.e.b();
                final ekgb ekgbVar2 = ekgbVar;
                return (Optional) dqsnVar.c("BugleCompatibleConversationMatcher#findConversation.txn", new ejxr() { // from class: awdl
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return awehVar.C(ekgbVar2, num.intValue());
                    }
                });
            }
        }, this.l);
    }

    @Override // defpackage.avpc
    public final /* synthetic */ eiju k(java.util.Collection collection) {
        return avpb.e(this, collection);
    }

    @Override // defpackage.avpc
    public final /* synthetic */ eiju l(alqm alqmVar, fcsu fcsuVar) {
        return avpb.f(this, alqmVar, fcsuVar);
    }

    @Override // defpackage.avpc
    public final eiju m(final String str, final fcsu fcsuVar) {
        return eijx.g(new Callable() { // from class: awdx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b(str, fcsuVar);
            }
        }, this.l);
    }

    @Override // defpackage.avpc
    public final /* synthetic */ Optional n(alqm alqmVar) {
        return avpb.g(this, alqmVar);
    }

    @Override // defpackage.avpc
    public final Optional o(String str) {
        return q(str).map(new Function() { // from class: awed
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ekrg ekrgVar = aweh.a;
                return ((bojh) obj).C();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.avpc
    public final /* synthetic */ Optional p(alqm alqmVar) {
        return avpb.h(this, alqmVar);
    }

    @Override // defpackage.avpc
    public final Optional q(String str) {
        ejwl.l(!ecem.g());
        return B(str, u());
    }

    @Override // defpackage.avpc
    public final /* synthetic */ Optional r(java.util.Collection collection) {
        return avpb.i(this, collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.avpc
    public final Optional s(final ekgb ekgbVar) {
        ejwl.l(!ecem.g());
        if (ekgbVar.size() == 1) {
            return q((String) ekgbVar.get(0));
        }
        final int iU = u();
        return (Optional) ((dqsn) this.e.b()).c("BugleCompatibleConversationMatcher#findConversation.txn", new ejxr() { // from class: awea
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.C(ekgbVar, iU);
            }
        });
    }

    @Override // defpackage.awcm
    public final eiju t(final Set set) {
        if (set.isEmpty()) {
            return eijx.e(new HashMap());
        }
        if (((aoos) this.t.b()).a()) {
            return eijx.g(new Callable() { // from class: awdr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Set set2 = set;
                    if (set2.isEmpty()) {
                        return new HashMap();
                    }
                    final aweh awehVar = this.a;
                    ekgp ekgpVar = (ekgp) Collection.EL.stream(set2).filter(new Predicate() { // from class: awdb
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
                            ekrg ekrgVar = aweh.a;
                            return !ejwk.c(((alqm) obj).l());
                        }
                    }).collect(ekcv.b(new Function() { // from class: awdc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            String strL = ((alqm) obj).l();
                            strL.getClass();
                            return awehVar.E(strL);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: awdd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            alqm alqmVar = (alqm) obj;
                            ekrg ekrgVar = aweh.a;
                            return alqmVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new BinaryOperator() { // from class: awde
                        public final /* synthetic */ BiFunction andThen(Function function) {
                            return BiFunction$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            alqm alqmVar = (alqm) obj;
                            ekrw ekrwVarH = aweh.a.h();
                            ekrwVarH.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findParticipantsForDestinationsSync", 1222, "TelephonyCompatibleMatcher.java")).q("findRecipientsForDestinations duplicate search destinations; discarding duplicate.");
                            return alqmVar;
                        }
                    }));
                    int iU = awehVar.u();
                    ekgp ekgpVar2 = (ekgp) Collection.EL.stream(ekgpVar.keySet()).collect(ekcv.b(new awcw(), new awcy(), new BinaryOperator() { // from class: awdf
                        public final /* synthetic */ BiFunction andThen(Function function) {
                            return BiFunction$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            ekrg ekrgVar = aweh.a;
                            Stream streamConcat = Stream.CC.concat(Collection.EL.stream((ekgb) obj), Collection.EL.stream((ekgb) obj2));
                            int i = ekgb.d;
                            return (ekgb) streamConcat.collect(ekcv.a);
                        }
                    }));
                    bsbo bsboVarY = aweh.y(ekgpVar2.keySet());
                    bsboVarY.A("findRecipientsForDestinations");
                    brzj brzjVar = (brzj) bsboVarY.b().p();
                    try {
                        HashMap map = new HashMap();
                        brzjVar.di();
                        while (brzjVar.moveToNext()) {
                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) brzjVar.cQ();
                            String strT = bindData.T();
                            strT.getClass();
                            ekgb ekgbVar = (ekgb) ekgpVar2.get(aweh.D(strT));
                            if (ekgbVar != null) {
                                ekqh it = ekgbVar.iterator();
                                while (it.hasNext()) {
                                    String str = (String) it.next();
                                    alqm alqmVar = (alqm) ekgpVar.get(str);
                                    alqmVar.getClass();
                                    if (aweh.H(bindData, awehVar.E(alqmVar.j()), iU)) {
                                        alqm alqmVar2 = (alqm) ekgpVar.get(str);
                                        alqmVar2.getClass();
                                        ((List) Map.EL.computeIfAbsent(map, alqmVar2, new Function() { // from class: awdg
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj) {
                                                ekrg ekrgVar = aweh.a;
                                                return new ArrayList();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        })).add(bindData);
                                    }
                                }
                            }
                        }
                        brzjVar.close();
                        return map;
                    } catch (Throwable th) {
                        try {
                            brzjVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.k);
        }
        final ekgp ekgpVar = (ekgp) Collection.EL.stream(set).filter(new Predicate() { // from class: awds
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
                ekrg ekrgVar = aweh.a;
                return !ejwk.c(((alqm) obj).l());
            }
        }).collect(ekcv.b(new Function() { // from class: awdt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String strL = ((alqm) obj).l();
                strL.getClass();
                return this.a.E(strL);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: awdu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                alqm alqmVar = (alqm) obj;
                ekrg ekrgVar = aweh.a;
                return alqmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BinaryOperator() { // from class: awdv
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                alqm alqmVar = (alqm) obj;
                ekrw ekrwVarH = aweh.a.h();
                ekrwVarH.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/conversation/match/TelephonyCompatibleMatcher", "findParticipantsForDestinations", 1140, "TelephonyCompatibleMatcher.java")).q("findRecipientsForDestinations duplicate search destinations; discarding duplicate.");
                return alqmVar;
            }
        }));
        return I().i(new eooz() { // from class: awdw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ekgp ekgpVar2 = ekgpVar;
                final Integer num = (Integer) obj;
                final ekgp ekgpVar3 = (ekgp) Collection.EL.stream(ekgpVar2.keySet()).collect(ekcv.b(new awcw(), new awcy(), new BinaryOperator() { // from class: awcz
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj2, Object obj3) {
                        ekrg ekrgVar = aweh.a;
                        Stream streamConcat = Stream.CC.concat(Collection.EL.stream((ekgb) obj2), Collection.EL.stream((ekgb) obj3));
                        int i = ekgb.d;
                        return (ekgb) streamConcat.collect(ekcv.a);
                    }
                }));
                bsbo bsboVarY = aweh.y(ekgpVar3.keySet());
                bsboVarY.A("findRecipientsForDestinations");
                eijs eijsVarW = bsboVarY.b().w();
                final aweh awehVar = this.a;
                return eijsVarW.f(new eopo() { // from class: awda
                    @Override // defpackage.eopo
                    public final Object a(eopt eoptVar, Object obj2) {
                        brzj brzjVar = (brzj) obj2;
                        HashMap map = new HashMap();
                        brzjVar.di();
                        while (brzjVar.moveToNext()) {
                            ekgp ekgpVar4 = ekgpVar3;
                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) brzjVar.cQ();
                            String strT = bindData.T();
                            strT.getClass();
                            ekgb ekgbVar = (ekgb) ekgpVar4.get(aweh.D(strT));
                            if (ekgbVar != null) {
                                int size = ekgbVar.size();
                                for (int i = 0; i < size; i++) {
                                    Integer num2 = num;
                                    ekgp ekgpVar5 = ekgpVar2;
                                    aweh awehVar2 = awehVar;
                                    String str = (String) ekgbVar.get(i);
                                    alqm alqmVar = (alqm) ekgpVar5.get(str);
                                    alqmVar.getClass();
                                    if (aweh.H(bindData, awehVar2.E(alqmVar.j()), num2.intValue())) {
                                        alqm alqmVar2 = (alqm) ekgpVar5.get(str);
                                        alqmVar2.getClass();
                                        ((List) Map.EL.computeIfAbsent(map, alqmVar2, new Function() { // from class: awdn
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                ekrg ekrgVar = aweh.a;
                                                return new ArrayList();
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        })).add(bindData);
                                    }
                                }
                            }
                        }
                        return map;
                    }
                }, awehVar.d).h();
            }
        }, this.d);
    }

    public final int u() {
        return ((Boolean) b.e()).booleanValue() ? v(((awfd) this.j.b()).b()) : awcn.a();
    }
}
