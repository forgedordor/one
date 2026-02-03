package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avpr implements avpc {
    public static final cqce a;
    public static final ekrg b;
    public static final cczi c;
    public static final int d;
    public final fcsu e;
    public final eosc f;
    private final fcsu g;
    private final eosc h;
    private final dzuc i;

    static {
        cqce cqceVarG = cqce.g("Bugle", "ConversationMatcherCache");
        a = cqceVarG;
        b = ekrg.c("com/google/android/apps/messaging/shared/conversation/match/ConversationMatcherCache");
        cczi ccziVarH = cdag.h(cdag.b, "bcm_detailed_crash_log_on_moat", false);
        c = ccziVarH;
        d = 1;
        if (((Boolean) ccziVarH.e()).booleanValue()) {
            cqceVarG.p("Enabling monitoring for conversations and conversations cache table");
            String[] strArr = botm.a;
            dqrt.b("conversations", 1);
            String[] strArr2 = avrd.a;
            dqrt.b("conversation_matcher_cache", 1);
        }
    }

    public avpr(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2, dzuc dzucVar) {
        this.g = fcsuVar;
        this.e = fcsuVar2;
        this.f = eoscVar;
        this.h = eoscVar2;
        this.i = dzucVar;
    }

    public static ekgb u(final avpq avpqVar) {
        String[] strArr = avrd.a;
        avra avraVar = new avra(avrd.a);
        avraVar.A("findWithTwoQueries");
        avraVar.k(new avrb((avrc) new Function() { // from class: avpn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = ((avof) avpqVar).a;
                avrc avrcVar = (avrc) obj;
                cqce cqceVar = avpr.a;
                avrcVar.ap(new dqpj("conversation_matcher_cache.destination_key", 1, str));
                avrcVar.c(avpr.d);
                return avrcVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new avrc())));
        avqn avqnVar = (avqn) avraVar.b().q(avrd.b.d);
        try {
            ekgb ekgbVarC = avqnVar.c();
            avqnVar.close();
            return ekgbVarC;
        } catch (Throwable th) {
            try {
                avqnVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void v(String str, Optional optional) {
        if (optional.isEmpty()) {
            return;
        }
        x(new avof(str), ((bojh) optional.get()).C());
    }

    public static void w(ekgb ekgbVar, Optional optional) {
        if (optional.isEmpty()) {
            return;
        }
        x(avpq.b(ekgbVar), ((bojh) optional.get()).C());
    }

    private static void x(avpq avpqVar, ConversationIdType conversationIdType) {
        String[] strArr = avrd.a;
        avqb avqbVar = new avqb();
        avqbVar.c(((avof) avpqVar).a);
        avqbVar.d(d);
        avqbVar.b(conversationIdType);
        final avpy avpyVarA = avqbVar.a();
        final dqsy dqsyVarA = avrd.a();
        dqru.b(avrd.a(), "conversation_matcher_cache", avpyVarA, new Function() { // from class: avpv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarA.Q("conversation_matcher_cache", (dqst) obj, 4));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: avpw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    avpy avpyVar = avpyVarA;
                    avpyVar.a = l.longValue();
                    avpyVar.fN(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.avpc
    public final /* synthetic */ bojh a(alqm alqmVar, fcsu fcsuVar) {
        return avpb.a(this, alqmVar, fcsuVar);
    }

    @Override // defpackage.avpc
    public final bojh b(final String str, final fcsu fcsuVar) {
        ejwl.l(!ecem.g());
        bojh bojhVarT = t(new avof(str));
        return bojhVarT != null ? bojhVarT : (bojh) ((dqsn) this.g.b()).c("ConversationMatcherCache#findOrCreate1to1ConversationSync", new ejxr() { // from class: avpi
            @Override // defpackage.ejxr
            public final Object get() {
                avpc avpcVar = (avpc) this.a.e.b();
                String str2 = str;
                fcsu fcsuVar2 = fcsuVar;
                bojh bojhVarB = avpcVar.b(str2, fcsuVar2);
                avpr.v(str2, Optional.of(bojhVarB));
                Stream streamFilter = Collection.EL.stream(((bara) fcsuVar2.b()).g()).map(new Function() { // from class: avpl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ParticipantsTable.BindData) obj).T();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: avpm
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
                        cqce cqceVar = avpr.a;
                        return !ejwk.c((String) obj);
                    }
                });
                int i = ekgb.d;
                ekgb ekgbVar = (ekgb) streamFilter.collect(ekcv.a);
                if (!ekgbVar.isEmpty() && !str2.equals(ekgbVar.get(0))) {
                    avpr.w(ekgbVar, Optional.of(bojhVarB));
                }
                if (ekgbVar.size() != 1) {
                    cqbd cqbdVarE = avpr.a.e();
                    cqbdVarE.I("BCM: Normalized destination size is not 1 for 1:1 conversation");
                    cqbdVarE.A("destination", str2);
                    cqbdVarE.A("Normalized destination", ekgbVar.toString());
                    cqbdVarE.r();
                }
                return bojhVarB;
            }
        });
    }

    @Override // defpackage.avpc
    public final /* synthetic */ bojh c(java.util.Collection collection, fcsu fcsuVar) {
        return avpb.b(this, collection, fcsuVar);
    }

    @Override // defpackage.avpc
    public final bojh d(final ekgb ekgbVar, final fcsu fcsuVar) {
        ejwl.l(!ecem.g());
        bojh bojhVarT = t(avpq.b(ekgbVar));
        return bojhVarT != null ? bojhVarT : (bojh) ((dqsn) this.g.b()).c("ConversationMatcherCache#findOrCreateConversationSync", new ejxr() { // from class: avpg
            @Override // defpackage.ejxr
            public final Object get() {
                avpc avpcVar = (avpc) this.a.e.b();
                ekgb ekgbVar2 = ekgbVar;
                bojh bojhVarD = avpcVar.d(ekgbVar2, fcsuVar);
                avpr.w(ekgbVar2, Optional.of(bojhVarD));
                return bojhVarD;
            }
        });
    }

    @Override // defpackage.avpc
    public final /* synthetic */ eiju e(alqm alqmVar) {
        return avpb.c(this, alqmVar);
    }

    @Override // defpackage.avpc
    public final eiju f(final String str) {
        return eijx.g(new Callable() { // from class: avpd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.q(str);
            }
        }, this.f);
    }

    @Override // defpackage.avpc
    public final /* synthetic */ eiju g(String str) {
        return avpb.d(this, str);
    }

    @Override // defpackage.avpc
    public final eiju h(ekgb ekgbVar) {
        return ((avpc) this.e.b()).h(ekgbVar);
    }

    @Override // defpackage.avpc
    public final eiju i(alqm alqmVar, java.util.Collection collection) {
        return ((avpc) this.e.b()).i(alqmVar, collection);
    }

    @Override // defpackage.avpc
    public final eiju j(final ekgb ekgbVar) {
        return eijx.g(new Callable() { // from class: avpj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.t(avpq.b(ekgbVar));
            }
        }, this.f).i(new eooz() { // from class: avpk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                bojh bojhVar = (bojh) obj;
                if (bojhVar != null) {
                    return eijx.e(Optional.of(bojhVar));
                }
                final ekgb ekgbVar2 = ekgbVar;
                avpr avprVar = this.a;
                return ((avpc) avprVar.e.b()).j(ekgbVar2).h(new ejvr() { // from class: avpo
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Optional optional = (Optional) obj2;
                        avpr.w(ekgbVar2, optional);
                        return optional;
                    }
                }, avprVar.f);
            }
        }, this.h);
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
        return eijx.g(new Callable() { // from class: avph
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b(str, fcsuVar);
            }
        }, this.f);
    }

    @Override // defpackage.avpc
    public final /* synthetic */ Optional n(alqm alqmVar) {
        return avpb.g(this, alqmVar);
    }

    @Override // defpackage.avpc
    public final Optional o(String str) {
        avof avofVar = new avof(str);
        dzuc dzucVar = this.i;
        dzub dzubVarD = dzucVar.d();
        ConversationIdType conversationIdType = null;
        try {
            ekgb ekgbVarU = u(avofVar);
            if (((ekoe) ekgbVarU).c == 1) {
                ConversationIdType conversationIdType2 = (ConversationIdType) ekgbVarU.get(0);
                this.i.f(dzubVarD, new dzfh("ConversationMatcher#findCachedConversationId"), null, dzua.SUCCESS);
                conversationIdType = conversationIdType2;
            } else {
                dzucVar.f(dzubVarD, new dzfh("ConversationMatcher#findCachedConversationId"), null, dzua.SUCCESS);
            }
            if (conversationIdType != null) {
                return Optional.of(conversationIdType);
            }
            Optional optionalO = ((avpc) this.e.b()).o(str);
            if (optionalO.isPresent()) {
                x(new avof(str), (ConversationIdType) optionalO.get());
            }
            return optionalO;
        } catch (Throwable th) {
            this.i.f(dzubVarD, new dzfh("ConversationMatcher#findCachedConversationId"), null, dzua.SUCCESS);
            throw th;
        }
    }

    @Override // defpackage.avpc
    public final /* synthetic */ Optional p(alqm alqmVar) {
        return avpb.h(this, alqmVar);
    }

    @Override // defpackage.avpc
    public final Optional q(String str) {
        ejwl.l(!ecem.g());
        bojh bojhVarT = t(new avof(str));
        if (bojhVarT != null) {
            return Optional.of(bojhVarT);
        }
        Optional optionalQ = ((avpc) this.e.b()).q(str);
        v(str, optionalQ);
        return optionalQ;
    }

    @Override // defpackage.avpc
    public final /* synthetic */ Optional r(java.util.Collection collection) {
        return avpb.i(this, collection);
    }

    @Override // defpackage.avpc
    public final Optional s(ekgb ekgbVar) {
        ejwl.l(!ecem.g());
        bojh bojhVarT = t(avpq.b(ekgbVar));
        if (bojhVarT != null) {
            return Optional.of(bojhVarT);
        }
        Optional optionalS = ((avpc) this.e.b()).s(ekgbVar);
        w(ekgbVar, optionalS);
        return optionalS;
    }

    public final bojh t(final avpq avpqVar) {
        dzub dzubVarD = this.i.d();
        try {
            return (bojh) ((dqsn) this.g.b()).c("ConversationMatcherCache#findCachedConversation", new ejxr() { // from class: avpf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ejxr
                public final Object get() {
                    Object obj;
                    final ekgb ekgbVarU = avpr.u(avpqVar);
                    int i = ((ekoe) ekgbVarU).c;
                    boolean z = true;
                    if (i != 1) {
                        cqbd cqbdVarA = avpr.a.a();
                        cqbdVarA.I("BCM: Conversation not found in cache");
                        cqbdVarA.y("cacheEntry.size()", i);
                        cqbdVarA.r();
                        return null;
                    }
                    cqce cqceVar = avpr.a;
                    cqbd cqbdVarA2 = cqceVar.a();
                    cqbdVarA2.I("BCM: Returning conversation from cache");
                    int i2 = 0;
                    cqbdVarA2.c((ConversationIdType) ekgbVarU.get(0));
                    cqbdVarA2.r();
                    bojh bojhVar = (bojh) botm.j((ConversationIdType) ekgbVarU.get(0), new Function() { // from class: avpp
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bojh bojhVar2 = (bojh) obj2;
                            cqce cqceVar2 = avpr.a;
                            return bojhVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    if (bojhVar != null) {
                        return bojhVar;
                    }
                    if (((Boolean) avpr.c.e()).booleanValue()) {
                        ekrd ekrdVar = (ekrd) avpr.b.j();
                        ekrdVar.Z(eksk.MEDIUM);
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/conversation/match/ConversationMatcherCache", "printConversationsAndConversationsCacheEntry", 234, "ConversationMatcherCache.java")).t("BCM: Conversation found in cache but not found in ConversationsTable for conversation Id: %s", ekgbVarU.get(0));
                        cqbd cqbdVarE = cqceVar.e();
                        cqbdVarE.I("Printing conversations");
                        cqbdVarE.y("Cache size", 1);
                        cqbdVarE.r();
                        botb botbVarE = botm.e();
                        botbVarE.A("findWithTwoQueries2");
                        ekgb ekgbVarZ = botbVarE.b().z();
                        int size = ekgbVarZ.size();
                        int i3 = 0;
                        while (i3 < size) {
                            bojh bojhVar2 = (bojh) ekgbVarZ.get(i3);
                            String strValueOf = String.valueOf(bojhVar2.a);
                            String strValueOf2 = String.valueOf(bojhVar2.b);
                            String strValueOf3 = String.valueOf(bojhVar2.c);
                            String strValueOf4 = String.valueOf(bojhVar2.d);
                            boolean z2 = z;
                            String strValueOf5 = String.valueOf(bojhVar2.e);
                            int i4 = i2;
                            String strValueOf6 = String.valueOf(bojhVar2.f);
                            String strValueOf7 = String.valueOf(bojhVar2.g);
                            String strValueOf8 = String.valueOf(bojhVar2.h);
                            String strValueOf9 = String.valueOf(bojhVar2.i);
                            String strValueOf10 = String.valueOf(bojhVar2.j);
                            String strValueOf11 = String.valueOf(bojhVar2.k);
                            String strValueOf12 = String.valueOf(bojhVar2.l);
                            String strValueOf13 = String.valueOf(bojhVar2.m);
                            String strValueOf14 = String.valueOf(bojhVar2.n);
                            String strValueOf15 = String.valueOf(bojhVar2.o);
                            String strValueOf16 = String.valueOf(bojhVar2.p);
                            String strValueOf17 = String.valueOf(bojhVar2.q);
                            String strValueOf18 = String.valueOf(bojhVar2.r);
                            String strValueOf19 = String.valueOf(bojhVar2.s);
                            String strValueOf20 = String.valueOf(bojhVar2.t);
                            String strValueOf21 = String.valueOf(bojhVar2.u);
                            String strValueOf22 = String.valueOf(bojhVar2.v);
                            String strValueOf23 = String.valueOf(bojhVar2.w);
                            String strValueOf24 = String.valueOf(bojhVar2.x);
                            String strValueOf25 = String.valueOf(bojhVar2.y);
                            String strValueOf26 = String.valueOf(bojhVar2.z);
                            String strValueOf27 = String.valueOf(bojhVar2.A);
                            String strValueOf28 = String.valueOf(bojhVar2.B);
                            String strValueOf29 = String.valueOf(bojhVar2.C);
                            String strValueOf30 = String.valueOf(bojhVar2.D);
                            String strValueOf31 = String.valueOf(bojhVar2.E);
                            String strValueOf32 = String.valueOf(bojhVar2.F);
                            String strValueOf33 = String.valueOf(bojhVar2.G);
                            String strValueOf34 = String.valueOf(bojhVar2.H);
                            String strValueOf35 = String.valueOf(bojhVar2.I);
                            String strValueOf36 = String.valueOf(bojhVar2.J);
                            String strValueOf37 = String.valueOf(bojhVar2.K);
                            String strValueOf38 = String.valueOf(bojhVar2.L);
                            String strValueOf39 = String.valueOf(bojhVar2.M);
                            String strValueOf40 = String.valueOf(bojhVar2.N);
                            String strValueOf41 = String.valueOf(bojhVar2.O);
                            String strValueOf42 = String.valueOf(bojhVar2.P);
                            String strValueOf43 = String.valueOf(bojhVar2.Q);
                            String strValueOf44 = String.valueOf(bojhVar2.R);
                            String strValueOf45 = String.valueOf(bojhVar2.S);
                            String strValueOf46 = String.valueOf(bojhVar2.T);
                            String strValueOf47 = String.valueOf(bojhVar2.U);
                            String strValueOf48 = String.valueOf(bojhVar2.V);
                            String strValueOf49 = String.valueOf(bojhVar2.W);
                            String strValueOf50 = String.valueOf(bojhVar2.X);
                            String strValueOf51 = String.valueOf(bojhVar2.Y);
                            String strValueOf52 = String.valueOf(bojhVar2.Z);
                            String strValueOf53 = String.valueOf(bojhVar2.aa);
                            String strValueOf54 = String.valueOf(bojhVar2.ab);
                            byte[] bArr = bojhVar2.ac;
                            String strConcat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
                            String strValueOf55 = String.valueOf(bojhVar2.ad);
                            String strValueOf56 = String.valueOf(bojhVar2.ae);
                            String strValueOf57 = String.valueOf(bojhVar2.af);
                            String strValueOf58 = String.valueOf(bojhVar2.ag);
                            String strValueOf59 = String.valueOf(bojhVar2.ah);
                            String strValueOf60 = String.valueOf(bojhVar2.ai);
                            String strValueOf61 = String.valueOf(bojhVar2.aj);
                            String strValueOf62 = String.valueOf(bojhVar2.ak);
                            String strValueOf63 = String.valueOf(bojhVar2.al);
                            String strValueOf64 = String.valueOf(bojhVar2.am);
                            String strValueOf65 = String.valueOf(bojhVar2.an);
                            String strValueOf66 = String.valueOf(bojhVar2.ao);
                            String strValueOf67 = String.valueOf(bojhVar2.ap);
                            String strValueOf68 = String.valueOf(bojhVar2.aq);
                            String strValueOf69 = String.valueOf(bojhVar2.ar);
                            String strValueOf70 = String.valueOf(bojhVar2.as);
                            String strValueOf71 = String.valueOf(bojhVar2.at);
                            String strValueOf72 = String.valueOf(bojhVar2.au);
                            String strValueOf73 = String.valueOf(bojhVar2.av);
                            String strValueOf74 = String.valueOf(bojhVar2.aw);
                            String strValueOf75 = String.valueOf(bojhVar2.ax);
                            String strValueOf76 = String.valueOf(bojhVar2.ay);
                            Object[] objArr = new Object[77];
                            objArr[i4] = strValueOf;
                            objArr[z2 ? 1 : 0] = strValueOf2;
                            objArr[2] = strValueOf3;
                            objArr[3] = strValueOf4;
                            objArr[4] = strValueOf5;
                            objArr[5] = strValueOf6;
                            objArr[6] = strValueOf7;
                            objArr[7] = strValueOf8;
                            objArr[8] = strValueOf9;
                            objArr[9] = strValueOf10;
                            objArr[10] = strValueOf11;
                            objArr[11] = strValueOf12;
                            objArr[12] = strValueOf13;
                            objArr[13] = strValueOf14;
                            objArr[14] = strValueOf15;
                            objArr[15] = strValueOf16;
                            objArr[16] = strValueOf17;
                            objArr[17] = strValueOf18;
                            objArr[18] = strValueOf19;
                            objArr[19] = strValueOf20;
                            objArr[20] = strValueOf21;
                            objArr[21] = strValueOf22;
                            objArr[22] = strValueOf23;
                            objArr[23] = strValueOf24;
                            objArr[24] = strValueOf25;
                            objArr[25] = strValueOf26;
                            objArr[26] = strValueOf27;
                            objArr[27] = strValueOf28;
                            objArr[28] = strValueOf29;
                            objArr[29] = strValueOf30;
                            objArr[30] = strValueOf31;
                            objArr[31] = strValueOf32;
                            objArr[32] = strValueOf33;
                            objArr[33] = strValueOf34;
                            objArr[34] = strValueOf35;
                            objArr[35] = strValueOf36;
                            objArr[36] = strValueOf37;
                            objArr[37] = strValueOf38;
                            objArr[38] = strValueOf39;
                            objArr[39] = strValueOf40;
                            objArr[40] = strValueOf41;
                            objArr[41] = strValueOf42;
                            objArr[42] = strValueOf43;
                            objArr[43] = strValueOf44;
                            objArr[44] = strValueOf45;
                            objArr[45] = strValueOf46;
                            objArr[46] = strValueOf47;
                            objArr[47] = strValueOf48;
                            objArr[48] = strValueOf49;
                            objArr[49] = strValueOf50;
                            objArr[50] = strValueOf51;
                            objArr[51] = strValueOf52;
                            objArr[52] = strValueOf53;
                            objArr[53] = strValueOf54;
                            objArr[54] = strConcat;
                            objArr[55] = strValueOf55;
                            objArr[56] = strValueOf56;
                            objArr[57] = strValueOf57;
                            objArr[58] = strValueOf58;
                            objArr[59] = strValueOf59;
                            objArr[60] = strValueOf60;
                            objArr[61] = strValueOf61;
                            objArr[62] = strValueOf62;
                            objArr[63] = strValueOf63;
                            objArr[64] = strValueOf64;
                            objArr[65] = strValueOf65;
                            objArr[66] = strValueOf66;
                            objArr[67] = strValueOf67;
                            objArr[68] = strValueOf68;
                            objArr[69] = strValueOf69;
                            objArr[70] = strValueOf70;
                            objArr[71] = strValueOf71;
                            objArr[72] = strValueOf72;
                            objArr[73] = strValueOf73;
                            objArr[74] = strValueOf74;
                            objArr[75] = strValueOf75;
                            objArr[76] = strValueOf76;
                            cqceVar.m(String.format(Locale.US, "ConversationsTable [_id: %s, sms_thread_id: %s, name: %s, name_is_automatic: %s, subtitle: %s, latest_message_id: %s, snippet_text: %s, subject_text: %s, preview_uri: %s, preview_content_type: %s, show_draft: %s, draft_snippet_text: %s, draft_subject_text: %s, draft_preview_uri: %s, draft_preview_content_type: %s, etouffee_default: %s, archive_status: %s, sort_timestamp: %s, last_read_timestamp: %s, icon: %s, participant_contact_id: %s, normalized_participant_contact_id: %s, participant_lookup_key: %s, normalized_participant_lookup_key: %s, participant_normalized_destination: %s, participant_comparable_destination: %s, current_self_id: %s, current_my_identity_foreign_key: %s, destination_token: %s, participant_count: %s, notification_enabled: %s, notification_sound_uri: %s, notification_vibration: %s, include_email_addr: %s, sms_service_center: %s, participant_id_list: %s, normalized_participant_id_list: %s, source_type: %s, rcs_session_id: %s, join_state: %s, conv_type: %s, send_mode: %s, IS_ENTERPRISE: %s, has_ea2p_bot_recipient: %s, last_interactive_event_timestamp: %s, participant_display_destination: %s, normalized_participant_display_destination: %s, spam_warning_dismiss_status: %s, open_count: %s, last_logged_scooby_metadata_timestamp: %s, delete_timestamp: %s, cms_id: %s, rcs_group_id: %s, rcs_conference_uri: %s, tachygram_group_routing_info_token: %s, cms_most_recent_read_message_timestamp_ms: %s, rcs_subject_change_timestamp_ms: %s, rcs_session_allows_revocation: %s, rcs_group_capabilities: %s, awaiting_reverse_sync: %s, duplicate_of: %s, new_duplicate_of: %s, error_state: %s, cms_life_cycle: %s, rcs_group_self_msisdn: %s, recipient_offline_timestamp_ms: %s, rcs_group_last_sync_timestamp: %s, has_been_e2ee: %s, marked_as_unread: %s, custom_theme: %s, mms_group_upgrade_status: %s, mms_group_upgrade_retries: %s, encryption_protocol: %s, encryption_id: %s, cms_correlation_id: %s, rcs_group_icon_url: %s, unread_count: %s]", objArr));
                            i3++;
                            z = z2 ? 1 : 0;
                            i2 = i4;
                        }
                        boolean z3 = z;
                        int i5 = i2;
                        obj = null;
                        cqbd cqbdVarE2 = cqceVar.e();
                        cqbdVarE2.I("Printing Cache");
                        cqbdVarE2.y("Conversations row count", ekgbVarZ.size());
                        cqbdVarE2.r();
                        String[] strArr = avrd.a;
                        avra avraVar = new avra(avrd.a);
                        avraVar.A("findWithTwoQueries3");
                        ekgb ekgbVarZ2 = avraVar.b().z();
                        int size2 = ekgbVarZ2.size();
                        for (int i6 = i5; i6 < size2; i6++) {
                            avpy avpyVar = (avpy) ekgbVarZ2.get(i6);
                            String strValueOf77 = String.valueOf(avpyVar.a);
                            String strValueOf78 = String.valueOf(avpyVar.b);
                            String strValueOf79 = String.valueOf(avpyVar.c);
                            String strValueOf80 = String.valueOf(avpyVar.d);
                            Object[] objArr2 = new Object[4];
                            objArr2[i5] = strValueOf77;
                            objArr2[z3 ? 1 : 0] = strValueOf78;
                            objArr2[2] = strValueOf79;
                            objArr2[3] = strValueOf80;
                            cqceVar.m(String.format(Locale.US, "ConversationMatcherCacheTable [_id: %s, matcher_version: %s, destination_key: %s, conversation_id: %s]", objArr2));
                        }
                    } else {
                        obj = null;
                    }
                    String[] strArr2 = avrd.a;
                    avqu avquVar = new avqu();
                    avquVar.c(new Function() { // from class: avpe
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            avrc avrcVar = (avrc) obj2;
                            cqce cqceVar2 = avpr.a;
                            avrcVar.b((ConversationIdType) ekgbVarU.get(0));
                            avrcVar.c(avpr.d);
                            return avrcVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    avquVar.f("removeInvalidConversationFromCache");
                    avquVar.b().b();
                    return obj;
                }
            });
        } finally {
            this.i.f(dzubVarD, new dzfh("ConversationMatcher#findCachedConversation"), null, dzua.SUCCESS);
        }
    }
}
