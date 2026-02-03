package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import android.util.Size;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.datamodel.action.PauseRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amdx implements alza, cqto {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository");
    public boolean A;
    public boolean B;
    public final fcsu C;
    private final cqtq D;
    private final amet E;
    private final anes F;
    private final anoj G;
    private final ejxr H;
    private final fcsu I;
    private final ejxr J;
    private final anpj K;
    private final anpj L;
    private final anpj M;
    private final ejxr N;
    private final fcsu O;
    private final fcsu P;
    private final fcsu Q;
    private final fcsu R;
    private final fcsu S;
    private amid T;
    private final amhr U;
    private final anpj V;
    private final ejxr W;
    private final Optional X;
    private final amhc Y;
    private final amhc Z;
    private final fcsu aa;
    private final fcsu ab;
    private final fcsu ac;
    private final fcsu ad;
    private final ejxr ae;
    private final fcsu af;
    private final fcsu ag;
    private final fcsu ah;
    private final fcsu ai;
    private final fcsu aj;
    private final fcsu ak;
    private final fcsu al;
    private final fcsu am;
    private final ConcurrentHashMap an = new ConcurrentHashMap();
    private final amds ao = new amds(this);
    private cquc ap;
    private final fcsu aq;
    public final eosc b;
    public final eosc c;
    public final ejxr d;
    public final fcsu e;
    public final ameq f;
    public final alyy g;
    public final alzg h;
    public final ejxr i;
    public final fcsu j;
    public final BugleConversationId k;
    public final fcsu l;
    public final fcsu m;
    public final eosc n;
    public final ejxr o;
    public final ankx p;
    public final fcsu q;
    public final fcsu r;
    public final fcsu s;
    public final ejxr t;
    public final boolean u;
    public final fcsu v;
    public final fcsu w;
    public final fcsu x;
    public final fcsu y;
    public final arkz z;

    public amdx(cqtp cqtpVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, final amli amliVar, final ankd ankdVar, amet ametVar, anes anesVar, fcsu fcsuVar, fcsu fcsuVar2, amer amerVar, alyz alyzVar, alzh alzhVar, final fcsu fcsuVar3, final fcsu fcsuVar4, fcsu fcsuVar5, anph anphVar, final alzw alzwVar, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, final fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, final fcsu fcsuVar14, amhr amhrVar, final aqkk aqkkVar, fcsu fcsuVar15, ankx ankxVar, final fcsu fcsuVar16, amhd amhdVar, Optional optional, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, final fcsu fcsuVar23, fcsu fcsuVar24, final fcsu fcsuVar25, fcsu fcsuVar26, fcsu fcsuVar27, fcsu fcsuVar28, fcsu fcsuVar29, fcsu fcsuVar30, fcsu fcsuVar31, anoj anojVar, fcsu fcsuVar32, fcsu fcsuVar33, fcsu fcsuVar34, fcsu fcsuVar35, fcsu fcsuVar36, fcsu fcsuVar37, final BugleConversationId bugleConversationId, final anpj anpjVar, final anpj anpjVar2, anpj anpjVar3, alxh alxhVar, final boolean z, final boolean z2, final alza alzaVar, arkz arkzVar, fcsu fcsuVar38) {
        this.D = cqtpVar.a(this);
        this.b = eoscVar;
        this.c = eoscVar2;
        this.n = eoscVar3;
        this.E = ametVar;
        this.F = anesVar;
        this.I = fcsuVar;
        this.e = fcsuVar2;
        this.v = fcsuVar32;
        this.am = fcsuVar34;
        this.al = fcsuVar33;
        this.w = fcsuVar35;
        this.z = arkzVar;
        this.C = fcsuVar38;
        this.x = fcsuVar36;
        this.g = alyzVar.a(z2);
        alyz alyzVar2 = (alyz) alzhVar.a.b();
        alyzVar2.getClass();
        eosc eoscVar4 = (eosc) alzhVar.b.b();
        eoscVar4.getClass();
        this.h = new alzg(alyzVar2, eoscVar4, this, z2);
        this.i = ejxx.a(new ejxr() { // from class: amaj
            @Override // defpackage.ejxr
            public final Object get() {
                Stream streamFilter = Collection.EL.stream((Set) fcsuVar3.b()).filter(new Predicate() { // from class: amcr
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
                        return ((ancm) obj).c();
                    }
                });
                int i = ekgb.d;
                return (ekgb) streamFilter.collect(ekcv.a);
            }
        });
        this.j = fcsuVar5;
        this.s = fcsuVar20;
        this.ab = fcsuVar21;
        this.J = ejxx.a(new ejxr() { // from class: amak
            @Override // defpackage.ejxr
            public final Object get() {
                Stream map = Collection.EL.stream((ekgb) this.a.i.get()).map(new Function() { // from class: amaz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ancm) obj).e();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                return (ekgb) map.collect(ekcv.a);
            }
        });
        this.U = amhrVar;
        this.u = z2;
        this.N = ejxx.a(new ejxr() { // from class: amal
            @Override // defpackage.ejxr
            public final Object get() {
                alza alzaVar2;
                if (aqkkVar.a() && (alzaVar2 = alzaVar) != null) {
                    return alzaVar2.e();
                }
                fcsu fcsuVar39 = fcsuVar4;
                amdx amdxVar = this.a;
                anca ancaVarA = ((ancb) fcsuVar39.b()).a(amdxVar);
                if (!((Boolean) ames.b.e()).booleanValue() || !z) {
                    ekrw ekrwVarH = amdx.a.h();
                    ekrwVarH.X(eksq.a, "BugleMapi");
                    ekrd ekrdVar = (ekrd) ekrwVarH;
                    ekrdVar.X(cqnc.t, amdxVar.k);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getPagerInstance", 507, "CoreBugleMessageRepository.java")).q("Using standard message pager (OMv1 disabled).");
                    return ancaVarA;
                }
                fcsu fcsuVar40 = fcsuVar9;
                ekrw ekrwVarH2 = amdx.a.h();
                ekrwVarH2.X(eksq.a, "BugleMapi");
                ekrd ekrdVar2 = (ekrd) ekrwVarH2;
                ekrdVar2.X(cqnc.t, amdxVar.k);
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getPagerInstance", 514, "CoreBugleMessageRepository.java")).q("Using optimistic message pager (OMv1 enabled).");
                return ((andg) fcsuVar40.b()).a(ancaVarA, amdxVar);
            }
        });
        this.k = bugleConversationId;
        this.K = anphVar.a(new anpl(anpjVar2, new ejvr() { // from class: amam
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                alzw alzwVar2 = alzwVar;
                ekgb ekgbVar = (ekgb) obj;
                anty antyVar = (anty) alzwVar2.a.b();
                antyVar.getClass();
                ekgbVar.getClass();
                return new alzv(antyVar, alzwVar2.b, ekgbVar);
            }
        }, eoscVar));
        this.L = anpjVar3;
        this.O = fcsuVar6;
        this.P = fcsuVar7;
        this.Q = fcsuVar8;
        this.l = fcsuVar10;
        this.R = fcsuVar11;
        this.m = fcsuVar12;
        this.S = fcsuVar13;
        this.X = optional;
        this.y = fcsuVar37;
        amhc amhcVarA = amhdVar.a();
        this.Y = amhcVarA;
        this.Z = amhdVar.a();
        Optional optionalOf = Optional.of(amhcVarA);
        Context context = (Context) amerVar.a.b();
        context.getClass();
        alxs alxsVar = (alxs) amerVar.b.b();
        alxsVar.getClass();
        fcsu fcsuVar39 = amerVar.c;
        amtw amtwVar = (amtw) amerVar.d.b();
        amtwVar.getClass();
        ekgp ekgpVar = (ekgp) amerVar.e.b();
        ekgpVar.getClass();
        fcsu fcsuVar40 = amerVar.f;
        fcsu fcsuVar41 = amerVar.g;
        fcsu fcsuVar42 = amerVar.h;
        ((ahly) amerVar.i.b()).getClass();
        ((ahlz) amerVar.j.b()).getClass();
        this.f = new ameq(context, alxsVar, fcsuVar39, amtwVar, ekgpVar, fcsuVar40, fcsuVar41, fcsuVar42, amerVar.k, z2, alxhVar, optionalOf);
        this.aa = fcsuVar17;
        this.o = ejxx.a(new ejxr() { // from class: aman
            @Override // defpackage.ejxr
            public final Object get() {
                amhf amhfVar = (amhf) fcsuVar14.b();
                cogw cogwVar = (cogw) amhfVar.a.b();
                cogwVar.getClass();
                cqtp cqtpVar2 = (cqtp) amhfVar.b.b();
                cqtpVar2.getClass();
                return new ameg(cogwVar, cqtpVar2, bugleConversationId);
            }
        });
        this.p = ankxVar;
        this.V = anpjVar;
        this.d = ejxx.a(new ejxr() { // from class: amao
            /* JADX WARN: Type inference failed for: r11v0, types: [eygg, java.lang.Object] */
            @Override // defpackage.ejxr
            public final Object get() {
                amli amliVar2 = amliVar;
                eosc eoscVar5 = (eosc) amliVar2.a.b();
                eoscVar5.getClass();
                ?? B = amliVar2.h.b();
                B.getClass();
                fcsu fcsuVar43 = amliVar2.i;
                BugleConversationId bugleConversationId2 = bugleConversationId;
                return new amlh(eoscVar5, amliVar2.b, amliVar2.c, amliVar2.d, amliVar2.e, amliVar2.f, amliVar2.g, B, fcsuVar43, bugleConversationId2, anpjVar, anpjVar2, this.a);
            }
        });
        this.H = ejxx.a(new ejxr() { // from class: amap
            @Override // defpackage.ejxr
            public final Object get() {
                alza alzaVar2;
                if (aqkkVar.a() && (alzaVar2 = alzaVar) != null) {
                    return alzaVar2.d();
                }
                amdx amdxVar = this.a;
                ankd ankdVar2 = ankdVar;
                boolean zBooleanValue = ((Boolean) ames.b.e()).booleanValue();
                final ejxr ejxrVar = amdxVar.d;
                final ejxr ejxrVar2 = amdxVar.o;
                if (zBooleanValue) {
                    Optional optionalOf2 = Optional.of(amdxVar);
                    ejxrVar2.getClass();
                    return ankdVar2.a(optionalOf2, new fcsu() { // from class: ambq
                        @Override // defpackage.fcsu
                        public final Object b() {
                            return (ajmp) ejxrVar2.get();
                        }
                    }, new fcsu() { // from class: ambr
                        @Override // defpackage.fcsu
                        public final Object b() {
                            return ((amky) ejxrVar.get()).a();
                        }
                    });
                }
                Optional optionalEmpty = Optional.empty();
                ejxrVar2.getClass();
                return ankdVar2.a(optionalEmpty, new fcsu() { // from class: ambq
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return (ajmp) ejxrVar2.get();
                    }
                }, new fcsu() { // from class: ambs
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return ((amky) ejxrVar.get()).a();
                    }
                });
            }
        });
        this.W = ejxx.a(new ejxr() { // from class: amaq
            @Override // defpackage.ejxr
            public final Object get() {
                anno annoVar = (anno) fcsuVar16.b();
                anpj anpjVarC = ((amky) this.a.d.get()).c();
                fdjx fdjxVar = (fdjx) annoVar.a.b();
                fdjxVar.getClass();
                fdjx fdjxVar2 = (fdjx) annoVar.b.b();
                fdjxVar2.getClass();
                bydb bydbVar = (bydb) annoVar.c.b();
                bydbVar.getClass();
                anpjVarC.getClass();
                return new annn(fdjxVar, fdjxVar2, bydbVar, annoVar.d, anpjVar, anpjVar2, anpjVarC);
            }
        });
        this.q = fcsuVar18;
        this.r = fcsuVar19;
        this.ac = fcsuVar22;
        this.t = ejxx.a(new ejxr() { // from class: amas
            @Override // defpackage.ejxr
            public final Object get() {
                return new amfr(z2);
            }
        });
        this.ad = fcsuVar24;
        this.ae = ejxx.a(new ejxr() { // from class: amat
            @Override // defpackage.ejxr
            public final Object get() {
                ((amfs) ((alzt) fcsuVar25.b()).a.b()).getClass();
                return new alzs(bugleConversationId, this.a, z2);
            }
        });
        this.af = fcsuVar26;
        this.aq = fcsuVar27;
        this.ag = fcsuVar28;
        this.ah = fcsuVar15;
        this.ai = fcsuVar29;
        this.aj = fcsuVar30;
        this.ak = fcsuVar31;
        this.M = anpjVar2;
        this.G = anojVar;
    }

    static MessageIdType af(MessageId messageId) {
        if (messageId instanceof amgc) {
            return ((amgc) messageId).c();
        }
        throw new IllegalStateException("Unsupported message id type.");
    }

    public static String ak(MessageId messageId) {
        if (messageId instanceof BugleMessageId) {
            return String.valueOf(((BugleMessageId) messageId).b());
        }
        throw new IllegalStateException("Unsupported message id type.");
    }

    private final eiju an(final dqxe dqxeVar, final boolean z) throws Throwable {
        eieu eieuVarK = eiiy.k("MessageRepository#getMessagesInternal");
        try {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleMapi");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.t, this.k);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getMessagesInternal", 1394, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository getMessagesInternal start");
            final ekgb ekgbVar = (ekgb) this.i.get();
            final eiju eijuVarG = eijx.g(new Callable() { // from class: alyc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ekgb ekgbVar2 = ekgbVar;
                    ekgbVar2.getClass();
                    String[] strArr = PartsTable.a;
                    String[] strArr2 = ParticipantsTable.a;
                    String[] strArr3 = buyx.a;
                    brdr brdrVarC = amgb.c("parts", "participants", "user_references", ekgbVar2, 16);
                    brdrVarC.A("+loadMessages");
                    int size = ekgbVar2.size();
                    for (int i = 0; i < size; i++) {
                        brdrVarC = ((ancm) ekgbVar2.get(i)).a(brdrVarC);
                    }
                    if (z) {
                        brdrVarC.d((brdo[]) amgh.a.c.toArray(new brdo[0]));
                    } else {
                        brdrVarC.d((brdo[]) amgh.a.b.toArray(new brdo[0]));
                    }
                    final dqxe dqxeVar2 = dqxeVar;
                    brdrVarC.h(new Function() { // from class: alyq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            brecVar.s(dqxeVar2);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brdrVarC.w(MessagesTable.c.a);
                    return brdrVarC.b().z();
                }
            }, this.g.a);
            final eiju eijuVarB = this.K.b();
            eieu eieuVarK2 = eiiy.k("MessageRepository#getSelfIdentitiesFuture");
            try {
                try {
                    final eiju eijuVarH = this.L.b().h(new ejvr() { // from class: ambt
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return (ekgp) Collection.EL.stream((ekgb) obj).collect(ekcv.a(new Function() { // from class: ambb
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((aoer) obj2).h().b();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: ambd
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return (aoer) obj2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }));
                        }
                    }, this.b);
                    eieuVarK2.close();
                    eieuVarK2 = eiiy.k("MessageRepository#getConversationPropertiesFuture");
                    try {
                        final eiju eijuVarB2 = this.V.b();
                        eieuVarK2.b(eijuVarB2);
                        eieuVarK2.close();
                        BugleConversationId bugleConversationId = this.k;
                        amdl amdlVar = new amdl("BugleMessagePagerQueries#loadMessages succeeded.", bugleConversationId, "BugleMessagePagerQueries#loadMessages failed.");
                        eoqg eoqgVar = eoqg.a;
                        eijuVarG.k(amdlVar, eoqgVar);
                        eijuVarB.k(new amdl("recipients#getAsync succeeded.", bugleConversationId, "recipients#getAsync failed."), eoqgVar);
                        eijuVarH.k(new amdl("getSelfIdentitiesFuture succeeded.", bugleConversationId, "getSelfIdentitiesFuture failed."), eoqgVar);
                        eijuVarB2.k(new amdl("getConversationPropertiesFuture succeeded.", bugleConversationId, "getConversationPropertiesFuture failed."), eoqgVar);
                        eiju eijuVarG2 = eiju.g(eika.d(eijuVarG, eijuVarB, eijuVarH, eijuVarB2).a(new Callable() { // from class: amdd
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:100:0x0402  */
                            /* JADX WARN: Removed duplicated region for block: B:101:0x0405  */
                            /* JADX WARN: Removed duplicated region for block: B:109:0x044f  */
                            /* JADX WARN: Removed duplicated region for block: B:143:0x0590  */
                            /* JADX WARN: Removed duplicated region for block: B:144:0x05ab  */
                            /* JADX WARN: Removed duplicated region for block: B:175:0x0685  */
                            /* JADX WARN: Removed duplicated region for block: B:183:0x0720  */
                            /* JADX WARN: Removed duplicated region for block: B:188:0x076b  */
                            /* JADX WARN: Removed duplicated region for block: B:256:0x079a A[SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x0258  */
                            /* JADX WARN: Removed duplicated region for block: B:66:0x028c  */
                            /* JADX WARN: Removed duplicated region for block: B:69:0x02a6  */
                            /* JADX WARN: Removed duplicated region for block: B:71:0x02b2  */
                            /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r4v16, types: [java.util.ArrayList, java.util.Collection] */
                            /* JADX WARN: Type inference failed for: r4v9 */
                            @Override // java.util.concurrent.Callable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object call() throws android.content.res.Resources.NotFoundException {
                                /*
                                    Method dump skipped, instructions count: 2480
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.amdd.call():java.lang.Object");
                            }
                        }, this.c));
                        eieuVarK.close();
                        return eijuVarG2;
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    eieuVarK.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final eiju ao(anhn anhnVar) {
        eieu eieuVarK = eiiy.k("MessageRepository#react");
        try {
            eiju eijuVarI = ((amky) this.d.get()).l(anhnVar).i(new eooz() { // from class: amdk
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.d().b((ajlx) obj);
                }
            }, eoqg.a);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju A(MessageId messageId) {
        eieu eieuVarK = eiiy.k("MessageRepository#markMessageAsRead");
        try {
            eiju eijuVarB = ((aypj) this.Q.b()).b(this.k.a, ((CoreBugleMessageId) messageId).a);
            eieuVarK.close();
            return eijuVarB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju B(MessageId messageId) {
        eieu eieuVarK = eiiy.k("MessageRepository#pauseFileTransfer");
        try {
            amya amyaVar = (amya) this.l.b();
            MessageIdType messageIdTypeAf = af(messageId);
            axsx axsxVar = (axsx) amyaVar.a.b();
            Context context = (Context) axsxVar.a.b();
            context.getClass();
            eosc eoscVar = (eosc) axsxVar.b.b();
            eoscVar.getClass();
            cohh cohhVar = (cohh) axsxVar.d.b();
            cohhVar.getClass();
            atgy atgyVar = (atgy) axsxVar.f.b();
            atgyVar.getClass();
            messageIdTypeAf.getClass();
            eiju eijuVarG = eiju.g(new PauseRcsFileTransferAction(context, eoscVar, axsxVar.c, cohhVar, axsxVar.e, atgyVar, messageIdTypeAf).s());
            eieuVarK.close();
            return eijuVarG;
        } finally {
        }
    }

    @Override // defpackage.ajmh
    public final eiju C(final MessageId messageId, String str, fhaz fhazVar) {
        eieu eieuVarK = eiiy.k("MessageRepository#remoteDeleteMessage");
        try {
            eiju eijuVarI = ((amky) this.d.get()).m(messageId, str, fhazVar).i(new eooz() { // from class: amch
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final amdx amdxVar = this.a;
                    final ajlx ajlxVar = (ajlx) obj;
                    eiju eijuVarB = amdxVar.d().b(ajlxVar);
                    if (!((arvt) amdxVar.x.b()).a()) {
                        return eijuVarB;
                    }
                    final MessageId messageId2 = messageId;
                    return eijuVarB.i(new eooz() { // from class: amcx
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final MessageId messageId3 = messageId2;
                            final ajlx ajlxVar2 = ajlxVar;
                            final amdx amdxVar2 = amdxVar;
                            return amdxVar2.ag(messageId3).h(new ejvr() { // from class: amcu
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    String str2 = (String) obj3;
                                    if (str2 != null) {
                                        ajlx ajlxVar3 = ajlxVar2;
                                        if (ajlxVar3 instanceof amzg) {
                                            amzg amzgVar = (amzg) ajlxVar3;
                                            if (amzgVar.d().q() != null) {
                                                anxd anxdVarQ = amzgVar.d().q();
                                                anxdVarQ.getClass();
                                                Map map = anxdVarQ.a;
                                                int size = map.size();
                                                Iterator it = map.values().iterator();
                                                int i = 0;
                                                while (it.hasNext()) {
                                                    if (((anyy) it.next()).k()) {
                                                        i++;
                                                    }
                                                }
                                                MessageId messageId4 = messageId3;
                                                ckcv ckcvVar = (ckcv) amdxVar2.y.b();
                                                auvw.k(ckcvVar.a, null, null, new ckcu(ckcvVar, messageId4, Long.parseLong(str2), i, size, null), 3);
                                            }
                                        }
                                    }
                                    return null;
                                }
                            }, amdxVar2.c);
                        }
                    }, amdxVar.c);
                }
            }, eoqg.a);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju D(MessageId messageId) {
        if (!(messageId instanceof BugleMessageId)) {
            return eijx.d(new IllegalArgumentException("BugleMessageId should be provided"));
        }
        final BugleMessageId bugleMessageId = (BugleMessageId) messageId;
        final eiju eijuVarV = v(messageId);
        final eiju eijuVarB = this.V.b();
        eijz eijzVarD = eika.d(eijuVarV, eijuVarB);
        eooy eooyVar = new eooy() { // from class: ambn
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ajlt ajltVar = (ajlt) eork.q(eijuVarV);
                ajts ajtsVar = (ajts) eork.q(eijuVarB);
                amdx amdxVar = this.a;
                if (ajltVar != null) {
                    return amdxVar.p.a(ajtsVar, ((ajmq) ajltVar.d()).c());
                }
                BugleMessageId bugleMessageId2 = bugleMessageId;
                ekrw ekrwVarJ = amdx.a.j();
                ekrwVarJ.X(eksq.a, "BugleMapi");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.X(cqnc.t, amdxVar.k);
                ekrdVar.X(cqnc.b, bugleMessageId2.c());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getMessageUsageStatisticsData", 1061, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository: Cannot resend, message not found.");
                return eijx.e(null);
            }
        };
        eosc eoscVar = this.b;
        return eiju.g(eiju.g(eijzVarD.b(eooyVar, eoscVar)).h(new ejvr() { // from class: ambz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                MessageUsageStatisticsData messageUsageStatisticsData = (MessageUsageStatisticsData) obj;
                if (messageUsageStatisticsData == null) {
                    return null;
                }
                ((ajpu) this.a.j.b()).e(bugleMessageId.c(), messageUsageStatisticsData);
                return null;
            }
        }, eoscVar));
    }

    @Override // defpackage.ajmh
    public final eiju E(final MessageId messageId) {
        return !(messageId instanceof CoreBugleMessageId) ? eijx.d(new IllegalArgumentException("CoreBugleMessageId should be provided")) : v(messageId).h(new ejvr() { // from class: ambx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (((ajlt) obj) == null) {
                    return null;
                }
                auvh.h(((anpp) this.a.s.b()).b(((CoreBugleMessageId) messageId).a, eljx.MANUAL_RETRY_FORCES_FALLBACK));
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.ajmh
    public final eiju F(final MessageId messageId) {
        eieu eieuVarK = eiiy.k("MessageRepository#resumeFileTransfer");
        try {
            eiju eijuVarI = v(messageId).i(new eooz() { // from class: amck
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Boolean boolValueOf;
                    amdx amdxVar = this.a;
                    MessageId messageId2 = messageId;
                    ajlt ajltVar = (ajlt) obj;
                    if (ajltVar != null) {
                        fcsu fcsuVar = amdxVar.r;
                        if (((Optional) fcsuVar.b()).isPresent()) {
                            amvr amvrVarG = ajltVar.g();
                            boolean z = false;
                            if (amvrVarG instanceof amsv) {
                                amyb amybVarFm = ((amsv) amvrVarG).fm();
                                if (amybVarFm instanceof amxq) {
                                    amxq amxqVar = (amxq) amybVarFm;
                                    if (amxqVar.d() && !amxqVar.f()) {
                                        z = true;
                                    }
                                    boolValueOf = Boolean.valueOf(z);
                                } else {
                                    boolValueOf = false;
                                }
                            } else {
                                boolValueOf = false;
                            }
                            if (boolValueOf.booleanValue()) {
                                bzqk bzqkVar = (bzqk) ((Optional) fcsuVar.b()).get();
                                BugleConversationId bugleConversationId = amdxVar.k;
                                bzqkVar.a(bugleConversationId.a, amdx.af(messageId2), amdx.ak(messageId2));
                                return eijx.e(null);
                            }
                        }
                    }
                    if (ajltVar == null || ajltVar.d().d() != 2) {
                        amya amyaVar = (amya) amdxVar.l.b();
                        return eiju.g(((aypl) amyaVar.b.b()).a(amdx.af(messageId2)).s());
                    }
                    amya amyaVar2 = (amya) amdxVar.l.b();
                    ((aypm) amyaVar2.c.b()).b(amdx.af(messageId2), null);
                    return eijx.e(null);
                }
            }, eoqg.a);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju G(ajmy ajmyVar) {
        if (!(ajmyVar instanceof amae)) {
            return eijx.d(new IllegalArgumentException(String.format("Expected BugleScheduledMessage not %s", ajmyVar.getClass())));
        }
        cmcx cmcxVar = (cmcx) this.X.get();
        String strN = ((amae) ajmyVar).a.c.n();
        strN.getClass();
        return cmcxVar.c(strN).h(new ejvr() { // from class: amah
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.ajmh
    public final eiju H(MessageId messageId) {
        eieu eieuVarK = eiiy.k("MessageRepository#transcribeAudioMessage");
        try {
            fcsu fcsuVar = this.R;
            if (!((Optional) fcsuVar.b()).isPresent()) {
                throw new IllegalStateException("AudioMessageTranscriber not provided.");
            }
            amjc amjcVar = (amjc) ((Optional) fcsuVar.b()).get();
            fcyi fcyiVar = fcyi.a;
            fdjz fdjzVar = fdjz.a;
            eiju eijuVarA = auvw.a(fdin.b(amjcVar.a, eicg.a(fcyiVar), fdjzVar, new amjb(null, amjcVar, messageId)));
            eieuVarK.close();
            return eijuVarA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju I(final MessageId messageId, final amvx amvxVar) {
        return eijx.f(new Runnable() { // from class: amdj
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = PartsTable.a;
                bsjh bsjhVar = new bsjh();
                bsjhVar.ap("CoreBugleMessageRepository#updateMediaDisplayState");
                int iOrdinal = amvxVar.ordinal();
                bvdq bvdqVar = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? bvdq.DEFAULT_NO_VERDICT : bvdq.PENDING_VERDICT : bvdq.POSITIVE_VERDICT_REQUIRE_SPEEDBUMP : bvdq.POSITIVE_VERDICT_HIDE_IMAGE : bvdq.POSITIVE_VERDICT_DISPLAY_IMAGE : bvdq.DEFAULT_NO_VERDICT : bvdq.NEGATIVE_VERDICT_DISPLAY_IMAGE;
                final MessageId messageId2 = messageId;
                bsjhVar.q(bvdqVar);
                bsjhVar.D(new Function() { // from class: amdh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        MessageId messageId3 = messageId2;
                        bsjl bsjlVar = (bsjl) obj;
                        if (amdx.ak(messageId3).equals("-1")) {
                            bsjlVar.n(amdx.af(messageId3));
                            return bsjlVar;
                        }
                        bsjlVar.n(amdx.af(messageId3));
                        bsjlVar.j(amdx.ak(messageId3));
                        return bsjlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsjhVar.b().e();
            }
        }, this.n);
    }

    @Override // defpackage.ajmh
    public final void J(MessageId messageId) {
        anfr anfrVar = (anfr) this.e.b();
        MessageIdType messageIdTypeAf = af(messageId);
        messageIdTypeAf.getClass();
        bbhe bbheVar = ((bbhh) anfrVar.b.b()).a;
        cawb cawbVar = (cawb) cawc.a.createBuilder();
        String strB = messageIdTypeAf.b();
        cawbVar.copyOnWrite();
        cawc cawcVar = (cawc) cawbVar.instance;
        strB.getClass();
        cawcVar.b |= 1;
        cawcVar.c = strB;
        cawbVar.copyOnWrite();
        cawc cawcVar2 = (cawc) cawbVar.instance;
        cawcVar2.d = 1;
        cawcVar2.b |= 2;
        cawbVar.copyOnWrite();
        cawc cawcVar3 = (cawc) cawbVar.instance;
        cawcVar3.b |= 4;
        cawcVar3.e = true;
        bbheVar.a((cawc) cawbVar.build());
    }

    @Override // defpackage.ajmh
    public final void K(MessageId messageId, final int i) {
        eieu eieuVarK = eiiy.k("MessageRepository#deleteToolstone");
        try {
            final MessageIdType messageIdTypeAf = af(messageId);
            ((Optional) this.ag.b()).ifPresent(new Consumer() { // from class: amcz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    anon anonVar = (anon) obj;
                    BugleConversationId bugleConversationId = this.a.k;
                    bugleConversationId.getClass();
                    MessageIdType messageIdType = messageIdTypeAf;
                    messageIdType.getClass();
                    auvh.h(auvw.c(anonVar.a, fcyi.a, fdjz.a, new anom(anonVar, messageIdType, anok.a(2, i), bugleConversationId, null)));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ajmh
    public final void L(final ajlt ajltVar, int i) {
        fcsu fcsuVar;
        ajmq ajmqVar;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ((amii) this.af.b()).a(ajltVar.b());
                        return;
                    } else if (i2 == 3) {
                        ((amii) this.af.b()).a(ajltVar.b());
                        return;
                    } else {
                        if (i2 != 4) {
                            return;
                        }
                        ((amii) this.af.b()).a(ajltVar.b());
                        return;
                    }
                }
                amii amiiVar = (amii) this.af.b();
                LruCache lruCache = amiiVar.d;
                MessageId messageIdB = ajltVar.b();
                synchronized (lruCache) {
                    if (lruCache.get(messageIdB) == null) {
                        LruCache lruCache2 = amiiVar.c;
                        synchronized (lruCache2) {
                            if (lruCache2.get(messageIdB) != null) {
                                lruCache.put(messageIdB, true);
                                lruCache2.remove(messageIdB);
                                auvw.k(amiiVar.b, null, null, new amih(amiiVar, ajltVar, null), 3);
                            }
                        }
                    }
                }
                return;
            }
            if (((aqzm) this.ah.b()).a()) {
                if (i2 == 5) {
                    amii amiiVar2 = (amii) this.af.b();
                    LruCache lruCache3 = amiiVar2.e;
                    synchronized (lruCache3) {
                        if (lruCache3.put(new amig(ajltVar.b(), 6), true) == null) {
                            coor coorVar = amiiVar2.a;
                            ((aimb) coorVar.b.b()).a().j(coorVar.c(ajltVar, 35, new Consumer() { // from class: coop
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    elof elofVar = (elof) obj;
                                    elofVar.copyOnWrite();
                                    elpg elpgVar = (elpg) elofVar.instance;
                                    evsy evsyVar = elpg.a;
                                    elpgVar.aC = 1;
                                    elpgVar.e |= 1048576;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }), aioj.LOG_SPEC_MESSAGE_RECEIVING_NORTHSTAR_EVENTS);
                        }
                    }
                    return;
                }
                if (i2 == 6) {
                    amii amiiVar3 = (amii) this.af.b();
                    LruCache lruCache4 = amiiVar3.e;
                    synchronized (lruCache4) {
                        if (lruCache4.put(new amig(ajltVar.b(), 7), true) == null) {
                            coor coorVar2 = amiiVar3.a;
                            ((aimb) coorVar2.b.b()).a().j(coorVar2.c(ajltVar, 35, new Consumer() { // from class: cooo
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    elof elofVar = (elof) obj;
                                    elofVar.copyOnWrite();
                                    elpg elpgVar = (elpg) elofVar.instance;
                                    evsy evsyVar = elpg.a;
                                    elpgVar.aC = 2;
                                    elpgVar.e |= 1048576;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }), aioj.LOG_SPEC_MESSAGE_RECEIVING_NORTHSTAR_EVENTS);
                        }
                    }
                    return;
                }
                if (i2 != 7) {
                    throw new IllegalArgumentException("Unsupported analytics event type: ".concat(ajme.a(i)));
                }
                amii amiiVar4 = (amii) this.af.b();
                LruCache lruCache5 = amiiVar4.e;
                synchronized (lruCache5) {
                    if (lruCache5.put(new amig(ajltVar.b(), 8), true) == null) {
                        coor coorVar3 = amiiVar4.a;
                        ((aimb) coorVar3.b.b()).a().j(coorVar3.c(ajltVar, 35, new Consumer() { // from class: coom
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                elof elofVar = (elof) obj;
                                elofVar.copyOnWrite();
                                elpg elpgVar = (elpg) elofVar.instance;
                                evsy evsyVar = elpg.a;
                                elpgVar.aC = 3;
                                elpgVar.e |= 1048576;
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }), aioj.LOG_SPEC_MESSAGE_RECEIVING_NORTHSTAR_EVENTS);
                    }
                }
                return;
            }
            return;
        }
        eieu eieuVarK = eiiy.k("MessageRepository#reportAnalyticsWithMetricExtension");
        try {
            if (ajltVar instanceof amia) {
                ajmc ajmcVarD = ajltVar.d();
                amia amiaVar = (amia) ajltVar;
                final int iE = amiaVar.E();
                fhaz fhazVarG = amiaVar.G();
                final boolean z = ajltVar.g() instanceof amwf;
                if (ajmcVarD.d() == 1 && (ajltVar instanceof alwv)) {
                    if (((arrc) this.am.b()).a()) {
                        basd basdVarF = ((alwv) ajltVar).F();
                        String strF = basdVarF.k() ? basdVarF.f() : fhazVarG != null ? fhazVarG.b : "";
                        if (!strF.isEmpty()) {
                            ((cmxn) this.m.b()).l(strF, ajltVar, iE, this.A, this.B);
                        }
                    } else {
                        ((alwv) ajltVar).F().g(new Consumer() { // from class: amdf
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                amdx amdxVar = this.a;
                                ((cmxn) amdxVar.m.b()).l(((basd) obj).f(), ajltVar, iE, amdxVar.A, amdxVar.B);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                } else if (ajmcVarD.d() == 2 && fhazVarG != null) {
                    String str = fhazVarG.b;
                    fcsu fcsuVar2 = this.m;
                    cmxn cmxnVar = (cmxn) fcsuVar2.b();
                    feeg feegVarB = ((ajfr) cmxnVar.t.b()).b(ajltVar, this.A, this.B);
                    cczv cczvVar = cmxn.p;
                    if (((Boolean) cczvVar.e()).booleanValue()) {
                        ((ajfx) cmxnVar.s.b()).f(cmxn.c, cmxnVar.w.get());
                    }
                    dzfh dzfhVar = new dzfh("ToVisible");
                    ekgb ekgbVar = cmxn.i;
                    cmxnVar.f(str, dzfhVar, feegVarB, ekgbVar);
                    cmxnVar.j(str, dzfhVar, ekgbVar);
                    dzfh dzfhVarA = dzfh.a(dzfhVar, cmxn.a(iE));
                    ekgb ekgbVar2 = cmxn.h;
                    cmxnVar.j(str, dzfhVarA, ekgbVar2);
                    ((ConcurrentHashMap) cmxnVar.x.get(cmxm.SEND_BUTTON_ACCURATE.ordinal())).get(str);
                    ajmq ajmqVar2 = (ajmq) ajmcVarD;
                    ajlq ajlqVarA = ajmqVar2.a();
                    ajlq ajlqVar = ajlq.SENT;
                    if (ajlqVarA == ajlqVar) {
                        cmxn cmxnVar2 = (cmxn) fcsuVar2.b();
                        fcsuVar = fcsuVar2;
                        feeg feegVarB2 = ((ajfr) cmxnVar2.t.b()).b(ajltVar, this.A, this.B);
                        if (((Boolean) cczvVar.e()).booleanValue()) {
                            ajmqVar = ajmqVar2;
                            ((ajfx) cmxnVar2.s.b()).f(cmxn.g, cmxnVar2.w.get());
                        } else {
                            ajmqVar = ajmqVar2;
                        }
                        dzfh dzfhVar2 = new dzfh("ToSentVisible");
                        if (feegVarB2 != null) {
                            cmxnVar2.f(str, dzfhVar2, feegVarB2, cmxn.j);
                        }
                        cmxnVar2.j(str, dzfhVar2, ekgbVar);
                        cmxnVar2.j(str, dzfh.a(dzfhVar2, cmxn.a(iE)), cmxn.j);
                        ((aiur) this.ac.b()).b(fhazVarG, iE);
                    } else {
                        fcsuVar = fcsuVar2;
                        ajmqVar = ajmqVar2;
                        if (ajmqVar.a() == ajlq.DELIVERED) {
                            cmxn cmxnVar3 = (cmxn) fcsuVar.b();
                            feeg feegVarB3 = ((ajfr) cmxnVar3.t.b()).b(ajltVar, this.A, this.B);
                            dzfh dzfhVar3 = new dzfh("ToDeliveredVisible");
                            if (feegVarB3 != null) {
                                cmxnVar3.f(str, dzfhVar3, feegVarB3, ekgbVar);
                                cmxnVar3.f(str, dzfhVar3, feegVarB3, cmxn.k);
                            }
                            cmxnVar3.j(str, dzfhVar3, ekgbVar);
                            cmxnVar3.j(str, dzfhVar3, cmxn.k);
                            cmxnVar3.j(str, dzfh.a(dzfhVar3, cmxn.a(iE)), ekgbVar);
                            ((aiur) this.ac.b()).a(fhazVarG, iE);
                        }
                    }
                    if (!ajltVar.b().a().isEmpty()) {
                        cmxn cmxnVar4 = (cmxn) fcsuVar.b();
                        feeg feegVarB4 = ((ajfr) cmxnVar4.t.b()).b(ajltVar, this.A, this.B);
                        if (((Boolean) cczvVar.e()).booleanValue()) {
                            ((ajfx) cmxnVar4.s.b()).f(cmxn.d, cmxnVar4.w.get());
                        }
                        dzfh dzfhVar4 = new dzfh("ToVisibleFromDisk");
                        cmxnVar4.f(str, dzfhVar4, feegVarB4, ekgbVar2);
                        cmxnVar4.j(str, dzfh.a(dzfhVar4, cmxn.a(iE)), ekgbVar2);
                    }
                    ConcurrentHashMap concurrentHashMap = this.an;
                    ajlq ajlqVar2 = (ajlq) concurrentHashMap.get(fhazVarG);
                    ajlq ajlqVarA2 = ajmqVar.a();
                    if (ajlqVar2 != null && ajlqVar2 != ajlqVarA2 && (ajltVar.b() instanceof amgc)) {
                        if (ajlqVarA2 == ajlqVar) {
                            auvh.h(((ajfm) this.S.b()).a(ajltVar, 30));
                        } else if (ajlqVarA2 == ajlq.DELIVERED) {
                            auvh.h(((ajfm) this.S.b()).a(ajltVar, 31));
                        }
                    }
                    if (concurrentHashMap.mappingCount() > 300) {
                        ekrw ekrwVarJ = a.j();
                        ekrwVarJ.X(eksq.a, "BugleMapi");
                        ekrd ekrdVar = (ekrd) ekrwVarJ;
                        ekrdVar.X(cqnc.t, this.k);
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "reportAnalyticsWithMetricExtension", 1747, "CoreBugleMessageRepository.java")).q("Exceeded limit of tracked messages");
                        concurrentHashMap.clear();
                    }
                    concurrentHashMap.put(fhazVarG, ajlqVarA2);
                }
            }
            eieuVarK.close();
        } finally {
        }
    }

    @Override // defpackage.ajmh
    public final eiju M(MessageId messageId, anhj anhjVar, ckmn ckmnVar, fhaz fhazVar, angn angnVar) {
        return ao(new anhm(messageId, anhjVar, ckmnVar, fhazVar, angnVar));
    }

    @Override // defpackage.ajmh
    public final eiju N(final int i) {
        eieu eieuVarK = eiiy.k("MessageRepository#getEarliestMessages");
        try {
            brdr brdrVarD = this.g.d(this.k, 0, i);
            brdrVarD.d((brdo[]) amgh.a.c.toArray(new brdo[0]));
            eiju eijuVarI = an(brdrVarD.b(), true).i(new eooz() { // from class: amcy
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.h.c((ekgb) obj, i, true);
                }
            }, eoqg.a);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju O(final int i) {
        eieu eieuVarK = eiiy.k("MessageRepository#getLatestMessages");
        try {
            eiju eijuVarI = ah(this.g.b(this.k, 0, i)).i(new eooz() { // from class: amcg
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.h.c((ekgb) obj, i, false);
                }
            }, eoqg.a);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju P() {
        eieu eieuVarK = eiiy.k("MessageRepository#getLatestMessagesWithReactions");
        try {
            alyy alyyVar = this.g;
            final BugleConversationId bugleConversationId = this.k;
            amfr amfrVar = alyyVar.b;
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("getIdsWithReactionsOffsetLimitDescendingQuery");
            brdrVarD.f(new Function() { // from class: alyf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bran) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bqkg bqkgVarA = bqkl.a();
            bqkgVarA.v();
            brdrVarD.H(dqts.i(bqkgVarA.b(), bqkl.c.b, MessagesTable.c.a).g());
            brdrVarD.h(new Function() { // from class: alyg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    final BugleConversationId bugleConversationId2 = bugleConversationId;
                    brecVar.b(new Function() { // from class: alym
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar2 = (brec) obj2;
                            amfr.b(brecVar2, bugleConversationId2);
                            return brecVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: alyn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            brec brecVar2 = (brec) obj2;
                            brecVar2.m(bugleConversationId2.a);
                            brecVar2.ar(new dqxl("$V{J:message_reactions} NOTNULL", new Object[]{bqkl.c.d}));
                            return brecVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.y(10);
            brdr brdrVarA = amfrVar.a(brdrVarD);
            brdrVarA.d((brdo[]) amgh.a.b.toArray(new brdo[0]));
            eiju eijuVarI = ah(brdrVarA.b()).i(new eooz() { // from class: amca
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.h.c((ekgb) obj, 10, false);
                }
            }, eoqg.a);
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final void Q(final MessageId messageId, final int i) {
        eieu eieuVarK = eiiy.k("MessageRepository#starMessage");
        try {
            final MessageIdType messageIdTypeAf = af(messageId);
            ((Optional) this.I.b()).ifPresent(new Consumer() { // from class: amde
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    final ankg ankgVar = (ankg) obj;
                    final MessageIdType messageIdType = messageIdTypeAf;
                    final amdx amdxVar = this.a;
                    final int i2 = i;
                    auvh.h(amdxVar.ag(messageId).i(new eooz() { // from class: ambk
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return ankgVar.c(amdxVar.k, messageIdType, (String) obj2, i2);
                        }
                    }, amdxVar.c));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final void R(final MessageId messageId, final int i) {
        eieu eieuVarK = eiiy.k("MessageRepository#unstarMessage");
        try {
            final MessageIdType messageIdTypeAf = af(messageId);
            ((Optional) this.I.b()).ifPresent(new Consumer() { // from class: amai
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    final ankg ankgVar = (ankg) obj;
                    final MessageIdType messageIdType = messageIdTypeAf;
                    final amdx amdxVar = this.a;
                    final int i2 = i;
                    auvh.h(amdxVar.ag(messageId).i(new eooz() { // from class: amcv
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return ankgVar.d(amdxVar.k, messageIdType, (String) obj2, i2);
                        }
                    }, amdxVar.c));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final void S() {
        eieu eieuVarK = eiiy.k("MessageRepository#performToolstoneAction");
        try {
            ((Optional) this.ag.b()).ifPresent(new Consumer() { // from class: amcs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    anon anonVar = (anon) obj;
                    BugleConversationId bugleConversationId = this.a.k;
                    bugleConversationId.getClass();
                    auvh.h(auvw.c(anonVar.a, fcyi.a, fdjz.a, new anol(anonVar, anok.a(5, 3), bugleConversationId, null)));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju T(final MessageId messageId) {
        eieu eieuVarK = eiiy.k("MessageRepository#loadLinkPreview");
        try {
            final MessageIdType messageIdTypeAf = af(messageId);
            eieu eieuVarK2 = eiiy.k("MessageRepository#getSenderOfMessage");
            try {
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("CoreBugleMessageRepository#getSenderOfMessage");
                brdrVarD.e(new Function() { // from class: ambe
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bran branVar = (bran) obj;
                        return new brao[]{branVar.a, branVar.c};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brdrVarD.h(new Function() { // from class: ambf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar = (brec) obj;
                        brecVar.p(messageIdTypeAf);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                eiju eijuVarH = brdrVarD.b().x().h(new ejvr() { // from class: ambg
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ekgb ekgbVar = (ekgb) obj;
                        if (ekgbVar.isEmpty()) {
                            throw new amfd(messageId);
                        }
                        String strAa = ((MessagesTable.BindData) ekgbVar.get(0)).aa();
                        strAa.getClass();
                        return strAa;
                    }
                }, this.n);
                eieuVarK2.b(eijuVarH);
                eieuVarK2.close();
                eiju eijuVarI = eijuVarH.i(new eooz() { // from class: ambw
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        String str = (String) obj;
                        anfr anfrVar = (anfr) this.a.e.b();
                        MessageIdType messageIdType = messageIdTypeAf;
                        messageIdType.getClass();
                        str.getClass();
                        bbhe bbheVar = ((bbhh) anfrVar.b.b()).a;
                        cawb cawbVar = (cawb) cawc.a.createBuilder();
                        String strB = messageIdType.b();
                        cawbVar.copyOnWrite();
                        cawc cawcVar = (cawc) cawbVar.instance;
                        strB.getClass();
                        cawcVar.b |= 1;
                        cawcVar.c = strB;
                        cawbVar.copyOnWrite();
                        cawc cawcVar2 = (cawc) cawbVar.instance;
                        cawcVar2.d = 2;
                        cawcVar2.b = 2 | cawcVar2.b;
                        bbheVar.a((cawc) cawbVar.build());
                        return auvw.c(anfrVar.c, fcyi.a, fdjz.a, new anfq(anfrVar, str, null));
                    }
                }, this.b);
                eieuVarK.close();
                return eijuVarI;
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

    @Override // defpackage.alza
    public final BugleConversationId U() {
        return this.k;
    }

    @Override // defpackage.alza
    public final eiju V(String str) {
        eieu eieuVarK = eiiy.k("MessageRepository#getMessageIdFromRcsMessageId");
        try {
            final basd basdVarA = basd.a(str);
            String[] strArr = MessagesTable.a;
            final brec brecVar = new brec();
            brecVar.N(basdVarA);
            brecVar.A(false);
            eiju eijuVarG = eijx.g(new Callable() { // from class: amda
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("MessageRepository#getMessageIdFromRcsMessageId");
                    bran branVar = MessagesTable.c;
                    brao braoVar = branVar.a;
                    brdrVarD.c(braoVar, branVar.R);
                    brdrVarD.g(brecVar);
                    brdrVarD.y(1);
                    bsje bsjeVarC = PartsTable.c();
                    bsjeVarC.f(new Function() { // from class: amau
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bsgr) obj).a;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brdrVarD.G(dqts.i(bsjeVarC.b(), PartsTable.d.b, braoVar));
                    MessagesTable.BindData bindData = (MessagesTable.BindData) brdrVarD.b().l();
                    if (bindData == null) {
                        return null;
                    }
                    basd basdVar = basdVarA;
                    MessageIdType messageIdTypeE = bindData.E();
                    PartsTable.BindData[] bindDataArr = (PartsTable.BindData[]) bindData.aH("parts", new PartsTable.BindData[0]);
                    return bindDataArr.length == 0 ? new CoreBugleMessageId(messageIdTypeE, -1L, basdVar, bindData.H()) : new CoreBugleMessageId(messageIdTypeE, Long.parseLong(bindDataArr[0].K()), basdVar, bindData.H());
                }
            }, this.n);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alza
    public final eiju W(MessageId messageId) {
        eieu eieuVarK = eiiy.k("MessageRepository#importMessageRead");
        try {
            eiju eijuVarD = ((aypj) this.Q.b()).d(this.k.a, ((CoreBugleMessageId) messageId).a);
            eieuVarK.close();
            return eijuVarD;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alza
    public final eiju X(ckwl ckwlVar) {
        return ((anad) this.v.b()).a(ckwlVar).h(new ejvr() { // from class: amcw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, this.n);
    }

    @Override // defpackage.alza
    public final eiju Y(Instant instant) {
        return ((annz) this.W.get()).a(instant);
    }

    @Override // defpackage.alza
    public final eiju Z(int i) {
        return O(i).h(new ejvr() { // from class: ambc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                if (ekgbVar == null || ekgbVar.isEmpty()) {
                    return false;
                }
                return Boolean.valueOf(Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: amax
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
                    public final boolean test(Object obj2) {
                        return ((ajlt) obj2).g() instanceof amwf;
                    }
                }).anyMatch(new Predicate() { // from class: amay
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
                    public final boolean test(Object obj2) {
                        return Collection.EL.stream(((amwf) ((ajlt) obj2).g()).a()).anyMatch(new Predicate() { // from class: amdc
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
                            public final boolean test(Object obj3) {
                                return ((amwe) obj3).c().equals(amwd.OTP);
                            }
                        });
                    }
                }));
            }
        }, this.n);
    }

    @Override // defpackage.ajmh
    public final ajlu a() {
        return (ajlu) this.d.get();
    }

    @Override // defpackage.alza
    public final eiju aa(aoff aoffVar) {
        return !((aqtu) this.ai.b()).a() ? eijx.e(null) : ((annp) this.aj.b()).a(aoffVar, this.k, this.M);
    }

    @Override // defpackage.alza
    public final void ab() {
        this.D.c(new Supplier() { // from class: ambl
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "forceNotifyAllMessagesChanged");
    }

    @Override // defpackage.alza
    public final eiju ac(aoer aoerVar, amvr amvrVar, basd basdVar, Instant instant, final MessageId messageId) {
        if (((Boolean) cbpz.e.e()).booleanValue()) {
            return ((anad) this.v.b()).c(this.V, this.k, aoerVar, amvrVar, basdVar, instant, messageId).i(new eooz() { // from class: ambu
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return eijx.e(null);
                }
            }, this.n);
        }
        if (!(amvrVar instanceof amwf)) {
            throw new IllegalArgumentException("Only text message is supported for import.");
        }
        return ((anad) this.v.b()).d(this.V, this.k, aoerVar, (amwf) amvrVar, basdVar, instant).i(new eooz() { // from class: ambv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                MessageIdType messageIdType = (MessageIdType) obj;
                MessageId messageId2 = messageId;
                if (!(messageId2 instanceof BugleMessageId)) {
                    return eijx.e(null);
                }
                amdx amdxVar = this.a;
                return ((anad) amdxVar.v.b()).b(messageIdType, ((BugleMessageId) messageId2).c()).h(new ejvr() { // from class: ambh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return null;
                    }
                }, amdxVar.n);
            }
        }, this.n);
    }

    @Override // defpackage.ancc
    public final ajly ad(MessageId messageId, Instant instant) {
        if (!(messageId instanceof CoreBuglePartialMessageId)) {
            return new alwn(instant.toEpochMilli(), Long.parseLong(messageId.a()), 0L);
        }
        CoreBuglePartialMessageId coreBuglePartialMessageId = (CoreBuglePartialMessageId) messageId;
        long epochMilli = instant.toEpochMilli();
        MessageIdType messageIdType = coreBuglePartialMessageId.a;
        return new alwn(epochMilli, messageIdType.a, coreBuglePartialMessageId.b);
    }

    @Override // defpackage.ancc
    public final andp ae() {
        return (andp) this.ae.get();
    }

    final eiju ag(MessageId messageId) {
        return v(messageId).h(new ejvr() { // from class: ambj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ajlt ajltVar = (ajlt) obj;
                if (ajltVar == null) {
                    ekrw ekrwVarJ = amdx.a.j();
                    ekrwVarJ.X(eksq.a, "BugleMapi");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getAnalyticsStableId", 1513, "CoreBugleMessageRepository.java")).q("Message not found while getting analytics stable id");
                    return null;
                }
                Long lQ = ajltVar.q();
                if (lQ != null) {
                    return Long.toString(lQ.longValue());
                }
                ekrw ekrwVarJ2 = amdx.a.j();
                ekrwVarJ2.X(eksq.a, "BugleMapi");
                ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getAnalyticsStableId", 1518, "CoreBugleMessageRepository.java")).q("Analytics stable ID is null.");
                return null;
            }
        }, this.c);
    }

    public final eiju ah(dqxe dqxeVar) {
        return an(dqxeVar, false);
    }

    @Override // defpackage.ancc
    public final eiju ai(int i, int i2) {
        return ah(this.g.b(this.k, i, i2));
    }

    @Override // defpackage.ancc
    public final Instant aj(MessageId messageId) {
        Long lValueOf;
        ejwl.l(messageId instanceof amgc);
        final MessageIdType messageIdTypeC = ((amgc) messageId).c();
        eieu eieuVarK = eiiy.k("MessageTableOperations#getMessageTimeStamp");
        try {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("getMessageTimeStamp");
            brdrVarD.f(new Function() { // from class: ancs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bran) obj).i;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.h(new Function() { // from class: anct
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.p(messageIdTypeC);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brap brapVar = (brap) brdrVarD.b().p();
            try {
                if (brapVar.moveToNext()) {
                    lValueOf = Long.valueOf(brapVar.l());
                    brapVar.close();
                } else {
                    brapVar.close();
                    lValueOf = 0L;
                }
                eieuVarK.close();
                return Instant.ofEpochMilli(lValueOf.longValue());
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

    @Override // defpackage.ankf
    public final void al(ajlx ajlxVar) {
        ekfw ekfwVar;
        ekgb ekgbVarA;
        ajmq ajmqVarG;
        eieu eieuVarK = eiiy.k("MessageRepository#notifySending");
        try {
            ajma ajmaVarE = e();
            if ((ajmaVarE instanceof andf) && (ajlxVar instanceof amzg)) {
                alwu alwuVar = (alwu) this.ab.b();
                amhc amhcVar = this.Z;
                ajlxVar.getClass();
                MessageCoreData messageCoreDataG = ((amzg) ajlxVar).g();
                if (messageCoreDataG.cF()) {
                    ekgbVarA = alwuVar.c;
                    ekgbVarA.getClass();
                } else {
                    ekfw ekfwVar2 = new ekfw();
                    boolean zCB = messageCoreDataG.cB();
                    int iD = messageCoreDataG.d();
                    Instant instantOfEpochMilli = (iD == 1 || iD == 2) ? Instant.ofEpochMilli(axja.a(messageCoreDataG.o())) : Instant.ofEpochMilli(messageCoreDataG.o());
                    ajlt ajltVarC = ((amzg) ajlxVar).c();
                    alwt alwtVar = ajltVarC != null ? new alwt(ajltVarC) : null;
                    amvr amvrVarE = ((amzg) ajlxVar).e();
                    if (amvrVarE != null) {
                        CoreBugleMessageId coreBugleMessageIdA = ((anbh) alwuVar.a.b()).a();
                        if (amhcVar == null || ((MessageData) ((amzg) ajlxVar).g()).d() != 3 || ((amzg) ajlxVar).g().cl()) {
                            ekfwVar = ekfwVar2;
                            ajmqVarG = ameh.g(((amzg) ajlxVar).d().g(), ajlq.SENDING, ajmw.a, instantOfEpochMilli.toEpochMilli());
                        } else {
                            ((amzg) ajlxVar).g().cd(((auau) alwuVar.b.b()).a());
                            MessageIdType messageIdTypeB = bary.b(coreBugleMessageIdA.a());
                            basd basdVarF = messageCoreDataG.F();
                            basdVarF.getClass();
                            aoer aoerVarG = ((amzg) ajlxVar).d().g();
                            aoerVarG.getClass();
                            ekfwVar = ekfwVar2;
                            ajmqVarG = amhcVar.e(messageIdTypeB, basdVarF, aoerVarG, ajlq.SENDING, ajmw.a, instantOfEpochMilli.toEpochMilli());
                        }
                        ajmq ajmqVar = ajmqVarG;
                        if (((MessageData) ((amzg) ajlxVar).g()).r == null) {
                            ConversationId conversationIdF = ((amzg) ajlxVar).d().f();
                            instantOfEpochMilli.getClass();
                            String str = null;
                            ekfwVar.h(new amht(coreBugleMessageIdA, conversationIdF, amvrVarE, str, ajmqVar, instantOfEpochMilli, Long.valueOf(messageCoreDataG.t()), zCB, alwtVar, messageCoreDataG.aJ(), messageCoreDataG.d(), alwuVar.d, 523912));
                        }
                    } else {
                        ekfwVar = ekfwVar2;
                    }
                    ekqh it = ((amzg) ajlxVar).i().iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        amsv amsvVar = (amsv) it.next();
                        CoreBugleMessageId coreBugleMessageIdA2 = ((anbh) alwuVar.a.b()).a();
                        ConversationId conversationIdF2 = ((amzg) ajlxVar).d().f();
                        amsvVar.getClass();
                        baxt baxtVar = ((MessageData) ((amzg) ajlxVar).g()).r;
                        String str2 = baxtVar != null ? baxtVar.a : null;
                        ameh amehVarG = ameh.g(((amzg) ajlxVar).d().g(), ajlq.SENDING, ajmw.a, instantOfEpochMilli.toEpochMilli());
                        instantOfEpochMilli.getClass();
                        ekfwVar.h(new amht(coreBugleMessageIdA2, conversationIdF2, amsvVar, str2, amehVarG, instantOfEpochMilli, null, zCB, alwtVar, messageCoreDataG.aJ(), messageCoreDataG.d(), alwuVar.d, 523968));
                    }
                    ekgb ekgbVarG = ekfwVar.g();
                    ekgbVarG.getClass();
                    ekgbVarA = ekfv.a(fcva.al(ekgbVarG, new alws()));
                }
                andf andfVar = (andf) ajmaVarE;
                andz andzVar = andfVar.e;
                synchronized (andzVar.b) {
                    andzVar.e.addAll(0, ekgbVarA);
                }
                auvw.k(andfVar.d, null, null, new andd(andfVar, null), 3);
            }
            eieuVarK.close();
        } finally {
        }
    }

    @Override // defpackage.ancc
    public final void am() {
        eieu eieuVarK = eiiy.k("MessageRepository#startPreload");
        try {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleMapi");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.t, this.k);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "startPreload", 1565, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository startPreload");
            ((andq) this.N.get()).k();
            eieuVarK.close();
            amhc amhcVar = this.Y;
            if (((Boolean) ames.e.e()).booleanValue()) {
                cquc cqucVar = amhcVar.d;
                if (cqucVar != null) {
                    cqub.a(cqucVar);
                }
                amhcVar.d = l(new amhb(amhcVar));
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

    @Override // defpackage.ancc, java.lang.AutoCloseable
    public final void close() {
        fdlr fdlrVar;
        ((andq) this.N.get()).close();
        this.Y.close();
        this.Z.close();
        if (!((aqtu) this.ai.b()).a() || (fdlrVar = ((anny) this.ak.b()).b) == null) {
            return;
        }
        fdlrVar.t(null);
    }

    @Override // defpackage.ajmh
    public final ajlw d() {
        return (ajlw) this.H.get();
    }

    @Override // defpackage.ajmh
    public final ajma e() {
        return (ajma) this.N.get();
    }

    @Override // defpackage.ajmh
    public final ajmp f() {
        return (ajmp) this.o.get();
    }

    @Override // defpackage.cqto
    public final void fJ() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar = cqnc.t;
        BugleConversationId bugleConversationId = this.k;
        ekrdVar.X(ekrzVar, bugleConversationId);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "onFirstRegister", 778, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository: onFirstRegister, Starting tombstone updater.");
        ((annz) this.W.get()).c();
        ejwl.l(this.ap == null);
        ekfw ekfwVar = new ekfw();
        ekgb ekgbVar = (ekgb) this.J.get();
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            anbf anbfVar = (anbf) ekgbVar.get(i);
            ekfwVar.h(anbfVar.b(new amdw(bugleConversationId, new amdu(this, anbfVar.a(), this.ao))));
        }
        amet ametVar = this.E;
        amds amdsVar = this.ao;
        ekfwVar.h(ametVar.c(new amdw(bugleConversationId, new amdt(this.Y, new amdu(this, "messages table", amdsVar)))));
        ekfwVar.h(this.F.a.b(new amdw(bugleConversationId, new amdu(this, "message parts table", amdsVar))));
        ekfwVar.h(this.K.a(new amdv(this, "recipients", amdsVar)));
        ekfwVar.h(this.L.a(new amdv(this, "self identity", amdsVar)));
        ekfwVar.h(f().b(new amdu(this, "reactions cache", amdsVar)));
        ekfwVar.h(this.G.c.b(new amdw(bugleConversationId, new amdu(this, "message user reference table", amdsVar))));
        this.ap = cqty.a(ekfwVar.g());
    }

    @Override // defpackage.cqto
    public final void fK() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.t, this.k);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "onLastUnregister", 821, "CoreBugleMessageRepository.java")).q("CoreBugleMessageRepository: onLastUnregister, Stopping tombstone updater.");
        cquc cqucVar = this.ap;
        if (cqucVar != null) {
            cqucVar.a();
            this.ap = null;
        }
        ((annz) this.W.get()).d();
    }

    @Override // defpackage.ajmh
    public final ConversationId g() {
        return this.k;
    }

    @Override // defpackage.ajmh
    public final anpj h() {
        eieu eieuVarK = eiiy.k("MessageRepository#getDeferredLinkPreviews");
        try {
            anei aneiVar = (anei) this.al.b();
            BugleConversationId bugleConversationId = this.k;
            bbmo bbmoVar = (bbmo) aneiVar.a.b();
            bbmoVar.getClass();
            fdjx fdjxVar = (fdjx) aneiVar.b.b();
            fdjxVar.getClass();
            bugleConversationId.getClass();
            aneh anehVar = new aneh(bbmoVar, fdjxVar, bugleConversationId);
            eieuVarK.close();
            return anehVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final anpj i(MessageId messageId) {
        eieu eieuVarK = eiiy.k("MessageRepository#getMessageObservable");
        try {
            amff amffVar = new amff(this, messageId);
            eieuVarK.close();
            return amffVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final anpj j() {
        eieu eieuVarK = eiiy.k("MessageRepository#getNumberOfUnreadMessages");
        try {
            if (this.T == null) {
                this.T = new amid(this, this.n, this.k);
            }
            amid amidVar = this.T;
            eieuVarK.close();
            return amidVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final anpj k() {
        amhr amhrVar = this.U;
        bbmo bbmoVar = (bbmo) amhrVar.a.b();
        bbmoVar.getClass();
        amaf amafVar = (amaf) amhrVar.b.b();
        amafVar.getClass();
        fdjx fdjxVar = (fdjx) amhrVar.c.b();
        fdjxVar.getClass();
        BugleConversationId bugleConversationId = this.k;
        bugleConversationId.getClass();
        return new amhq(bbmoVar, amafVar, fdjxVar, bugleConversationId);
    }

    @Override // defpackage.ajmh
    public final cquc l(final ajmg ajmgVar) {
        eieu eieuVarK = eiiy.k("MessageRepository#subscribeToChangesToAllMessages");
        try {
            ekfw ekfwVar = new ekfw();
            ekfwVar.h(this.D.a(new cqtk() { // from class: amcl
                @Override // defpackage.cqtk
                public final eiju a(Object obj) {
                    return ajmgVar.b();
                }
            }, "CoreBugleMessageRepository::register", "CoreBugleMessageRepository::callback", "CoreBugleMessageRepository::unregister"));
            final amds amdsVar = this.ao;
            synchronized (amdsVar.a) {
                amdsVar.b.add(ajmgVar);
            }
            ekfwVar.h(new cquc() { // from class: amdr
                @Override // defpackage.cquc
                public final void a() {
                    amds amdsVar2 = amdsVar;
                    Object obj = amdsVar2.a;
                    ajmg ajmgVar2 = ajmgVar;
                    synchronized (obj) {
                        amdsVar2.b.remove(ajmgVar2);
                    }
                }

                @Override // defpackage.cquc, java.io.Closeable, java.lang.AutoCloseable
                public final /* synthetic */ void close() {
                    cqub.a(this);
                }
            });
            amdm amdmVar = new amdm(this, cqty.a(ekfwVar.g()));
            eieuVarK.close();
            return amdmVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju m(MessageId messageId, ekgb ekgbVar) {
        fcsu fcsuVar = this.aq;
        return ((Optional) fcsuVar.b()).isEmpty() ? eijx.d(new IllegalStateException("no messageClassificationPersister.")) : ((cdvn) ((Optional) fcsuVar.b()).get()).a(((CoreBugleMessageId) messageId).a, ekgbVar);
    }

    @Override // defpackage.ajmh
    public final eiju n(MessageId messageId, anhj anhjVar, ckmn ckmnVar, fhaz fhazVar) {
        return ao(new anhl(messageId, anhjVar, ckmnVar, fhazVar));
    }

    @Override // defpackage.ajmh
    public final eiju o(final MessageId messageId) {
        return eijx.f(new Runnable() { // from class: amci
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = bqkl.a;
                bqki bqkiVar = new bqki();
                bqkiVar.ap("CoreBugleMessageRepository#clearReactionEffects");
                bqkiVar.d();
                bqkiVar.c(amdx.af(messageId));
            }
        }, this.c);
    }

    @Override // defpackage.ajmh
    public final eiju p(final ekgb ekgbVar) {
        return eijx.f(new Runnable() { // from class: amct
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = bqkl.a;
                bqki bqkiVar = new bqki();
                bqkiVar.ap("CoreBugleMessageRepository#clearReactionEffects");
                final ekgb ekgbVar2 = ekgbVar;
                bqkiVar.f(new Function() { // from class: amdb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqkk bqkkVar = (bqkk) obj;
                        bqkkVar.c((Iterable) Collection.EL.stream(ekgbVar2).map(new amag()).collect(ekcv.a));
                        return bqkkVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bqkiVar.d();
                bqkiVar.b().e();
            }
        }, this.c);
    }

    @Override // defpackage.ajmh
    public final eiju q() {
        fcsu fcsuVar = this.I;
        if (!((Optional) fcsuVar.b()).isEmpty()) {
            return ((ankg) ((Optional) fcsuVar.b()).get()).b(this.k);
        }
        ekrw ekrwVarI = a.i();
        ekrwVarI.X(eksq.a, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarI;
        ekrdVar.X(cqnc.t, this.k);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "countStarredMessages", 1863, "CoreBugleMessageRepository.java")).q("Message star manager is not available");
        return eijx.d(new UnsupportedOperationException("Message star manager is not available."));
    }

    @Override // defpackage.ajmh
    public final eiju r(final ekgb ekgbVar) {
        eieu eieuVarK = eiiy.k("MessageRepository#deleteMessages");
        try {
            ajpu ajpuVar = (ajpu) this.j.b();
            Stream map = Collection.EL.stream(ekgbVar).map(new amag());
            int i = ekgb.d;
            eiju eijuVarH = ajpuVar.a((List) map.collect(ekcv.a)).h(new ejvr() { // from class: amar
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    final amdx amdxVar = this.a;
                    if (amdxVar.z.a() && bool.booleanValue()) {
                        Iterable$EL.forEach(ekgbVar, new Consumer() { // from class: amba
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj2) {
                                MessageId messageId = (MessageId) obj2;
                                basd basdVarE = messageId instanceof amhg ? ((amhg) messageId).e() : basd.a;
                                if (basdVarE.equals(basd.a)) {
                                    return;
                                }
                                amdz amdzVar = (amdz) amdxVar.C.b();
                                basdVarE.getClass();
                                ellg ellgVar = (ellg) ellh.a.createBuilder();
                                ellgVar.getClass();
                                elgr.g(ellf.BUGLE_MESSAGE, ellgVar);
                                elof elofVar = (elof) elpg.b.createBuilder();
                                elofVar.getClass();
                                elhf.f(basdVarE.f(), elofVar);
                                elhf.h(5, elofVar);
                                elgr.d(elhf.a(elofVar), ellgVar);
                                ((aimb) amdzVar.a.b()).a().j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                    return bool;
                }
            }, this.b);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju s(ekgb ekgbVar, cdyt cdytVar) {
        eieu eieuVarK = eiiy.k("MessageRepository#deleteMessagesWithReason");
        try {
            ajpu ajpuVar = (ajpu) this.j.b();
            Stream map = Collection.EL.stream(ekgbVar).map(new amag());
            int i = ekgb.d;
            eiju eijuVarB = ajpuVar.b((List) map.collect(ekcv.a), cdytVar);
            eieuVarK.close();
            return eijuVarB;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju t(ekgb ekgbVar) {
        fcsu fcsuVar = this.aa;
        if (!((Optional) fcsuVar.b()).isEmpty()) {
            Stream streamConcat = Stream.CC.concat(Collection.EL.stream(ekgbVar).map(new Function() { // from class: amcm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int iOrdinal = ((amvv) obj).ordinal();
                    int i = 2;
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            i = 4;
                        } else if (iOrdinal != 2) {
                            i = 3;
                            if (iOrdinal != 3) {
                                i = 1;
                            }
                        } else {
                            i = 5;
                        }
                    }
                    return Integer.valueOf(i);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: amcn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new SearchQuery.ContentSearchFilter(((Integer) obj).intValue());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }), Stream.CC.of(new SearchQuery.ConversationSearchFilter(this.k.a)));
            int i = ekgb.d;
            return ((bxuz) ((Optional) fcsuVar.b()).get()).a(SearchQuery.d((ekgb) streamConcat.collect(ekcv.a))).h(new ejvr() { // from class: amco
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    bxwt bxwtVar = (bxwt) obj;
                    Stream map = Stream.CC.concat(Collection.EL.stream(bxwtVar.d()), Collection.EL.stream(bxwtVar.h())).map(new Function() { // from class: amcb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            MediaSearchResult mediaSearchResult = (MediaSearchResult) obj2;
                            mediaSearchResult.getClass();
                            String strK = mediaSearchResult.k();
                            strK.getClass();
                            Uri uriH = mediaSearchResult.h();
                            uriH.getClass();
                            Uri uriH2 = mediaSearchResult.h();
                            uriH2.getClass();
                            mediaSearchResult.aA(4, "width");
                            int i2 = mediaSearchResult.a;
                            mediaSearchResult.aA(5, "height");
                            Size size = new Size(i2, mediaSearchResult.b);
                            mediaSearchResult.aA(6, "timestamp");
                            long j = mediaSearchResult.c;
                            amvx amvxVar = ((Boolean) ((cczi) crtr.V.get()).e()).booleanValue() ? amvx.DISPLAY_BUT_UNPROCESSESED : amvx.DISPLAY;
                            if (amvxVar != null) {
                                return new amuj(strK, uriH, uriH2, size, j, amvxVar);
                            }
                            throw new NullPointerException("Null displayState");
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new Function() { // from class: amcc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return new ajmj((amuj) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    Collector collector = ekcv.a;
                    ekgb ekgbVar2 = (ekgb) map.collect(collector);
                    Stream stream = Collection.EL.stream(bxwtVar.e());
                    final amdx amdxVar = this.a;
                    ekgb ekgbVar3 = (ekgb) Stream.CC.concat(Collection.EL.stream(ekgbVar2), Stream.CC.concat(Collection.EL.stream((ekgb) stream.map(new Function() { // from class: amcd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            UrlSearchResult urlSearchResult = (UrlSearchResult) obj2;
                            long epochMilli = ((cogw) amdxVar.q.b()).f().toEpochMilli();
                            long jG = urlSearchResult.g();
                            Uri uri = Uri.EMPTY;
                            if (urlSearchResult.s() != null) {
                                uri = Uri.parse(urlSearchResult.s());
                            }
                            Uri uri2 = Uri.EMPTY;
                            if (urlSearchResult.p() != null) {
                                uri2 = Uri.parse(urlSearchResult.p());
                            }
                            boolean z = epochMilli > jG;
                            anev anevVar = new anev();
                            anevVar.f(urlSearchResult.q());
                            anevVar.e(uri);
                            anevVar.c(urlSearchResult.o());
                            anevVar.d(uri2);
                            anevVar.b(z);
                            return anevVar.a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new Function() { // from class: amce
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return new ajmt((anex) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(collector)), Collection.EL.stream((ekgb) Collection.EL.stream(bxwtVar.f()).map(new Function() { // from class: amcf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bxuy bxuyVar = (bxuy) obj2;
                            boolean z = false;
                            if (bxuyVar.h() != null) {
                                long epochMilli = ((cogw) amdxVar.q.b()).f().toEpochMilli();
                                Long lH = bxuyVar.h();
                                lH.getClass();
                                if (epochMilli > lH.longValue()) {
                                    z = true;
                                }
                            }
                            Uri uri = Uri.EMPTY;
                            if (bxuyVar.n() != null) {
                                String strN = bxuyVar.n();
                                strN.getClass();
                                uri = Uri.parse(strN);
                            }
                            Uri uri2 = Uri.EMPTY;
                            if (bxuyVar.l() != null) {
                                String strL = bxuyVar.l();
                                strL.getClass();
                                uri2 = Uri.parse(strL);
                            }
                            anev anevVar = new anev();
                            anevVar.f(bxuyVar.m());
                            anevVar.e(uri);
                            anevVar.c(bxuyVar.k());
                            anevVar.d(uri2);
                            anevVar.b(z);
                            return anevVar.a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).map(new Function() { // from class: amce
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return new ajmt((anex) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(collector)))).collect(collector);
                    return new alzc(ekgbVar3.size(), ekgbVar3);
                }
            }, eoqg.a);
        }
        ekrw ekrwVarI = a.i();
        ekrwVarI.X(eksq.a, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarI;
        ekrdVar.X(cqnc.t, this.k);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getContentSummary", 1761, "CoreBugleMessageRepository.java")).q("Message search API is not available");
        return eijx.d(new UnsupportedOperationException("Message search API is not available."));
    }

    @Override // defpackage.ajmh
    public final eiju u() {
        eieu eieuVarK = eiiy.k("MessageRepository#getLatestReadMessage");
        try {
            alyy alyyVar = this.g;
            final BugleConversationId bugleConversationId = this.k;
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("getLatestReadMessage");
            brdrVarD.f(new Function() { // from class: alyx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((bran) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.d((brdo[]) amgh.a.b.toArray(new brdo[0]));
            brdrVarD.h(new Function() { // from class: alxu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.m(bugleConversationId.a);
                    brecVar.O(true);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.y(1);
            eiju eijuVarH = ah(alyyVar.b.a(brdrVarD).b()).h(new ejvr() { // from class: ambo
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return (ajlt) Collection.EL.stream((ekgb) obj).filter(new Predicate() { // from class: amdi
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
                        public final boolean test(Object obj2) {
                            return ((ajlt) obj2).y();
                        }
                    }).findFirst().orElse(null);
                }
            }, eoqg.a);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju v(final MessageId messageId) {
        eieu eieuVarK = eiiy.k("MessageRepository#getMessage");
        try {
            eiju eijuVarH = ((messageId instanceof CoreBugleMessageId) || (messageId instanceof CoreBuglePartialMessageId)) ? ah(new dqxl("($V)", new Object[]{af(messageId).b()})).h(new ejvr() { // from class: amav
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Stream stream = Collection.EL.stream((ekgb) obj);
                    final MessageId messageId2 = messageId;
                    return (ajlt) stream.filter(new Predicate() { // from class: amdg
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
                        public final boolean test(Object obj2) {
                            return ((ajlt) obj2).b().equals(messageId2);
                        }
                    }).findFirst().orElse(null);
                }
            }, eoqg.a) : eijx.d(new IllegalArgumentException("CoreBugleMessageId or CoreBuglePartialMessageId should be provided"));
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju w() {
        eieu eieuVarK = eiiy.k("MessageRepository#getMessageSendingL7");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: ambp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final amdx amdxVar = this.a;
                    final long epochMilli = ((cogw) amdxVar.q.b()).g().minusDays(7L).y(ZoneId.systemDefault()).toInstant().toEpochMilli();
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("getMessageSendingL7");
                    brdrVarD.c(MessagesTable.c.g);
                    brdrVarD.h(new Function() { // from class: ambi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            brecVar.m(amdxVar.k.a);
                            brecVar.aj(1, 25);
                            brecVar.Z(epochMilli);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brap brapVar = (brap) brdrVarD.b().p();
                    try {
                        HashSet hashSet = new HashSet();
                        while (brapVar.moveToNext()) {
                            hashSet.add(Instant.ofEpochMilli(brapVar.m()).atZone(ZoneId.systemDefault()).toLocalDate());
                        }
                        Integer numValueOf = Integer.valueOf(hashSet.size());
                        brapVar.close();
                        return numValueOf;
                    } catch (Throwable th) {
                        try {
                            brapVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.n);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajmh
    public final eiju x() {
        return eijx.g(new Callable() { // from class: amaw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object coreBugleMessageId;
                ekrg ekrgVar = amdx.a;
                ekrw ekrwVarH = ekrgVar.h();
                ekrz ekrzVar = eksq.a;
                ekrwVarH.X(ekrzVar, "BugleMapi");
                ekrd ekrdVar = (ekrd) ekrwVarH;
                amdx amdxVar = this.a;
                ekrz ekrzVar2 = cqnc.t;
                BugleConversationId bugleConversationId = amdxVar.k;
                ekrdVar.X(ekrzVar2, bugleConversationId);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getOldestUnreadMessageId", 716, "CoreBugleMessageRepository.java")).q("getOldestUnreadMessageId started");
                brdr brdrVarB = bxjj.b(bugleConversationId.a);
                brdrVarB.f(new Function() { // from class: ambm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bran) obj).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brdrVarB.d((brdo[]) amgh.a.c.toArray(new brdo[0]));
                brdrVarB.w(MessagesTable.c.a);
                brdrVarB.y(1);
                MessagesTable.BindData bindData = (MessagesTable.BindData) ((amfr) amdxVar.t.get()).a(brdrVarB).b().l();
                if (bindData == null) {
                    coreBugleMessageId = null;
                } else {
                    boolean z = amdxVar.u;
                    final MessageIdType messageIdTypeE = bindData.E();
                    if (z) {
                        String[] strArr = PartsTable.a;
                        coreBugleMessageId = (MessageId) DesugarArrays.stream((PartsTable.BindData[]) bindData.aH("parts", new PartsTable.BindData[0])).min(Comparator.CC.comparingInt(new ToIntFunction() { // from class: amby
                            @Override // java.util.function.ToIntFunction
                            public final int applyAsInt(Object obj) {
                                return Integer.parseInt(((PartsTable.BindData) obj).K());
                            }
                        })).map(new Function() { // from class: amcj
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) throws NumberFormatException {
                                return new CoreBugleMessageId(messageIdTypeE, Long.parseLong(((PartsTable.BindData) obj).K()));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElse(new CoreBugleMessageId(messageIdTypeE, -1L));
                    } else {
                        coreBugleMessageId = new CoreBugleMessageId(messageIdTypeE, -1L);
                    }
                }
                ekrw ekrwVarH2 = ekrgVar.h();
                ekrwVarH2.X(ekrzVar, "BugleMapi");
                ekrd ekrdVar2 = (ekrd) ekrwVarH2;
                ekrdVar2.X(ekrzVar2, bugleConversationId);
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/CoreBugleMessageRepository", "getOldestUnreadMessageId", 722, "CoreBugleMessageRepository.java")).t("getOldestUnreadMessageId completed. Returning: %s", coreBugleMessageId);
                return coreBugleMessageId;
            }
        }, this.n);
    }

    @Override // defpackage.ajmh
    public final eiju y() {
        return eijx.g(new Callable() { // from class: amcq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("MessageRepository.isEmptyConversation");
                final amdx amdxVar = this.a;
                brdrVarD.h(new Function() { // from class: amcp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar = (brec) obj;
                        brecVar.m(amdxVar.k.a);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return Boolean.valueOf(brdrVarD.b().W());
            }
        }, this.n);
    }

    @Override // defpackage.ajmh
    public final eiju z() {
        eieu eieuVarK = eiiy.k("MessageRepository#markAllMessagesAsRead");
        try {
            cgkj cgkjVar = (cgkj) this.O.b();
            cglf cglfVar = cglf.NT_INCOMING_MESSAGE;
            cgql cgqlVar = (cgql) this.P.b();
            ConversationIdType conversationIdType = this.k.a;
            cgkjVar.b(cglfVar, cgqlVar.a(conversationIdType));
            eiju eijuVarA = ((aypj) this.Q.b()).a(conversationIdType);
            eieuVarK.close();
            return eijuVarA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
