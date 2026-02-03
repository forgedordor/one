package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class attm {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter");
    public final eosc b;
    public final eosc c;
    public final eosc d;
    public final cicm e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final bbdl k;
    public final alrj l;
    public final Set m;
    public final fcsu n;
    public final ardl o;
    public final awnf p;
    private final cejp q;
    private final cigc r;
    private final chtk s;
    private final dghj t;
    private final dggl u;
    private final fcsu v;
    private final auab w;

    public attm(eosc eoscVar, eosc eoscVar2, eosc eoscVar3, cicm cicmVar, fcsu fcsuVar, cejp cejpVar, fcsu fcsuVar2, cigc cigcVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bbdl bbdlVar, chtk chtkVar, dghj dghjVar, dggl dgglVar, alrj alrjVar, fcsu fcsuVar6, Set set, fcsu fcsuVar7, auab auabVar, ardl ardlVar, awnf awnfVar) {
        this.b = eoscVar;
        this.c = eoscVar2;
        this.d = eoscVar3;
        this.e = cicmVar;
        this.f = fcsuVar;
        this.q = cejpVar;
        this.g = fcsuVar2;
        this.r = cigcVar;
        this.h = fcsuVar3;
        this.i = fcsuVar5;
        this.j = fcsuVar4;
        this.k = bbdlVar;
        this.s = chtkVar;
        this.t = dghjVar;
        this.u = dgglVar;
        this.l = alrjVar;
        this.v = fcsuVar6;
        this.m = set;
        this.n = fcsuVar7;
        this.w = auabVar;
        this.o = ardlVar;
        this.p = awnfVar;
    }

    public static boolean j(audk audkVar) {
        aueb auebVar = audkVar.n;
        if (auebVar == null) {
            auebVar = aueb.a;
        }
        return auebVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.atrj a(final defpackage.aubq r23, defpackage.bojh r24) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.attm.a(aubq, bojh):atrj");
    }

    public final axcy b(aubq aubqVar, final bojh bojhVar) {
        Optional map = this.t.i(this.u.a(aubqVar.d)).map(new Function() { // from class: atsz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((dggr) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bbdl bbdlVar = this.k;
        bbdlVar.getClass();
        return (axcy) map.map(new Function() { // from class: atta
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bbdlVar.f(((Integer) obj).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: attb
            @Override // java.util.function.Supplier
            public final Object get() {
                ekrw ekrwVarJ = attm.a.j();
                ekrwVarJ.X(eksq.a, "BugleGroupManagement");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrz ekrzVar = cqnc.s;
                bojh bojhVar2 = bojhVar;
                ekrdVar.X(ekrzVar, bojhVar2.C());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getConversationSubscription", 745, "IncomingRcsGroupNotificationConversationGetter.java")).q("Cannot find subscription for group notification self identity, falling back to existing subscription");
                String strT = bojhVar2.T();
                strT.getClass();
                axcy axcyVarE = this.a.k.e(aofa.b(strT));
                axcyVarE.getClass();
                return axcyVarE;
            }
        });
    }

    public final cicq c(audk audkVar, ekgb ekgbVar) {
        cicq cicqVarW = cicr.w();
        cicqVarW.j(true);
        cicqVarW.p(false);
        cicqVarW.q(true);
        cicqVarW.w(emaf.GROUP_NOTIFICATION);
        cicqVarW.u(audkVar.d);
        aubq aubqVar = audkVar.f;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        cicqVarW.s(aubqVar.d);
        auet auetVar = audkVar.i;
        if (auetVar == null) {
            auetVar = auet.a;
        }
        cicqVarW.n(auetVar.c);
        cicqVarW.r(ekgbVar);
        aubq aubqVar2 = audkVar.m;
        if (aubqVar2 == null) {
            aubqVar2 = aubq.a;
        }
        cicqVarW.l(Optional.of(aubqVar2));
        cicqVarW.t(d(audkVar));
        return cicqVarW;
    }

    public final cigb d(audk audkVar) {
        cifz cifzVar = new cifz(0L);
        for (aucp aucpVar : new evsz(audkVar.g, audk.a)) {
            ciga cigaVar = (ciga) this.r.fM(aucpVar);
            if (cigaVar == null) {
                ekrw ekrwVarE = a.e();
                ekrwVarE.X(eksq.a, "BugleGroupManagement");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getRcsGroupCapability", 691, "IncomingRcsGroupNotificationConversationGetter.java")).t("Received a server capability not supported by the client: %s", aucpVar.name());
            } else {
                cifzVar.c(cigaVar);
            }
        }
        return cifzVar.a();
    }

    public final eiju e(final audk audkVar, final ekgb ekgbVar) {
        return eijx.g(new Callable() { // from class: atsu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cicr cicrVarD;
                attm attmVar = this.a;
                boolean zA = ((area) attmVar.n.b()).a();
                audk audkVar2 = audkVar;
                ekgb ekgbVar2 = ekgbVar;
                if (zA) {
                    audo audoVar = audkVar2.j;
                    if (audoVar == null) {
                        audoVar = audo.a;
                    }
                    Uri uri = Uri.parse(audoVar.c);
                    cicq cicqVarC = attmVar.c(audkVar2, ekgbVar2);
                    ((ciai) cicqVarC).b = Optional.of(uri);
                    cicrVarD = cicqVarC.D();
                } else {
                    cicrVarD = attmVar.c(audkVar2, ekgbVar2).D();
                }
                ConversationIdType conversationIdTypeA = attmVar.e.a(cicrVarD);
                if (!conversationIdTypeA.b()) {
                    return conversationIdTypeA;
                }
                ekrw ekrwVarJ = attm.a.j();
                ekrwVarJ.X(eksq.a, "BugleGroupManagement");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "findOrCreateRcsConversation", 383, "IncomingRcsGroupNotificationConversationGetter.java")).q("Failed to retrieve conversation for an incoming GroupFullState notification.");
                return null;
            }
        }, this.d);
    }

    public final eiju f(aubq aubqVar, String str) {
        cicq cicqVarW = cicr.w();
        cicqVarW.j(false);
        cicqVarW.p(false);
        cicqVarW.q(true);
        cicqVarW.w(emaf.GROUP_NOTIFICATION);
        cicqVarW.u(str);
        final eiju eijuVarD = this.e.d(cicqVarW.D());
        final eiju eijuVarE = eijx.e(aubqVar);
        return eijx.m(eijuVarD, eijuVarE).a(new Callable() { // from class: attl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ConversationIdType conversationIdType = (ConversationIdType) eork.q(eijuVarD);
                final aubq aubqVar2 = (aubq) eork.q(eijuVarE);
                if (!conversationIdType.b()) {
                    final attm attmVar = this.a;
                    return (atrj) botm.k(conversationIdType, new Function() { // from class: atsv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return attmVar.a(aubqVar2, (bojh) obj);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
                ekrw ekrwVarJ = attm.a.j();
                ekrwVarJ.X(eksq.a, "BugleGroupManagement");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getExistingConversation", 302, "IncomingRcsGroupNotificationConversationGetter.java")).q("Failed to retrieve conversation for an incoming GroupEvent notification.");
                return null;
            }
        }, this.c);
    }

    public final eiju g(awjl awjlVar, final aubq aubqVar) {
        return this.w.c(awjlVar).h(new ejvr() { // from class: atsx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ConversationIdType conversationIdType = (ConversationIdType) obj;
                if (!conversationIdType.b()) {
                    final aubq aubqVar2 = aubqVar;
                    final attm attmVar = this.a;
                    return (atrj) botm.k(conversationIdType, new Function() { // from class: atst
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return attmVar.a(aubqVar2, (bojh) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
                ekrw ekrwVarJ = attm.a.j();
                ekrwVarJ.X(eksq.a, "BugleGroupManagement");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getExistingConversation", 266, "IncomingRcsGroupNotificationConversationGetter.java")).q("Failed to retrieve conversation for an incoming GroupEvent notification.");
                return null;
            }
        }, this.d);
    }

    public final eiju h(final ConversationIdType conversationIdType) {
        return this.q.a().i(new eooz() { // from class: atsw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                try {
                    return eijx.e(((asqx) this.a.g.b()).a((String) obj, false));
                } catch (IllegalArgumentException e) {
                    return eijx.d(new atuf(e));
                }
            }
        }, this.c).i(new eooz() { // from class: attc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.i((aubq) obj, conversationIdType);
            }
        }, this.b);
    }

    public final eiju i(final aubq aubqVar, final ConversationIdType conversationIdType) {
        return eijx.g(new Callable() { // from class: atsn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final attm attmVar = this.a;
                final aubq aubqVar2 = aubqVar;
                Function function = new Function() { // from class: atsp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bojh bojhVar = (bojh) obj;
                        if (bojhVar == null) {
                            return null;
                        }
                        return attmVar.a(aubqVar2, bojhVar);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                ConversationIdType conversationIdType2 = conversationIdType;
                atrj atrjVar = (atrj) botm.j(conversationIdType2, function);
                if (atrjVar != null) {
                    return atrjVar;
                }
                ekrw ekrwVarJ = attm.a.j();
                ekrwVarJ.X(eksq.a, "BugleGroupManagement");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getGroupConversationMetadata", 250, "IncomingRcsGroupNotificationConversationGetter.java")).q("Failed to retrieve conversation to create GroupConversationMetadata.");
                throw new attn(String.format("Cannot find conversation bind data to create GroupConversationMetadata. Bugle conversation ID: %s", conversationIdType2));
            }
        }, this.c);
    }

    public final boolean k() {
        return !((Boolean) this.v.b()).booleanValue();
    }
}
