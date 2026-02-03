package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.EnumSet;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atvv implements asrc {
    public final fcsu b;
    public final atuz c;
    public final atva d;
    public final atvb e;
    public final atog f;
    public final atny g;
    public final atoe h;
    public final atoc i;
    public final cjbf j;
    public final caxe k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    private final fcsu p;
    private final aika q;
    private final fcsu r;
    private final eosc s;
    private final eosc t;
    private final atau u;
    private final fcsu v;
    private final fcsu w;
    private final fcsu x;
    private final arph y;
    private final apto z;
    private static final cqce o = cqce.g("BugleDataModel", "IncomingChatApiImpl");
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl");

    public atvv(fcsu fcsuVar, fcsu fcsuVar2, atuz atuzVar, atva atvaVar, atvb atvbVar, atog atogVar, atny atnyVar, atoe atoeVar, atoc atocVar, aika aikaVar, fcsu fcsuVar3, eosc eoscVar, eosc eoscVar2, cjbf cjbfVar, atau atauVar, caxe caxeVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, arph arphVar, apto aptoVar) {
        this.p = fcsuVar;
        this.b = fcsuVar2;
        this.c = atuzVar;
        this.d = atvaVar;
        this.e = atvbVar;
        this.f = atogVar;
        this.g = atnyVar;
        this.h = atoeVar;
        this.i = atocVar;
        this.q = aikaVar;
        this.r = fcsuVar3;
        this.s = eoscVar;
        this.t = eoscVar2;
        this.j = cjbfVar;
        this.u = atauVar;
        this.k = caxeVar;
        this.l = fcsuVar4;
        this.v = fcsuVar5;
        this.w = fcsuVar6;
        this.x = fcsuVar7;
        this.m = fcsuVar8;
        this.n = fcsuVar9;
        this.y = arphVar;
        this.z = aptoVar;
    }

    public static eiju m(cazi caziVar) {
        return caziVar.a().h(new ejvr() { // from class: atvc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cbcw cbcwVar = (cbcw) obj;
                if (cbcwVar.e() || cbcwVar.f()) {
                    aubg aubgVar = (aubg) aubl.a.createBuilder();
                    aubk aubkVar = aubk.OK;
                    aubgVar.copyOnWrite();
                    aubl aublVar = (aubl) aubgVar.instance;
                    aublVar.c = aubkVar.f;
                    aublVar.b |= 1;
                    return (aubl) aubgVar.build();
                }
                aubg aubgVar2 = (aubg) aubl.a.createBuilder();
                aubk aubkVar2 = aubk.FAILED_PERMANENTLY;
                aubgVar2.copyOnWrite();
                aubl aublVar2 = (aubl) aubgVar2.instance;
                aublVar2.c = aubkVar2.f;
                aublVar2.b |= 1;
                aubi aubiVar = aubi.UNKNOWN_CAUSE;
                aubgVar2.copyOnWrite();
                aubl aublVar3 = (aubl) aubgVar2.instance;
                aublVar3.d = aubiVar.v;
                aublVar3.b |= 2;
                return (aubl) aubgVar2.build();
            }
        }, eoqg.a);
    }

    private final eiju n(aufh aufhVar) {
        asrx asrxVar = (asrx) this.r.b();
        elpg elpgVar = elpg.b;
        elof elofVar = (elof) elpgVar.createBuilder();
        String str = aufhVar.j;
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        str.getClass();
        elpgVar2.c |= Integer.MIN_VALUE;
        elpgVar2.H = str;
        elpg elpgVar3 = aufhVar.o;
        if (elpgVar3 != null) {
            elpgVar = elpgVar3;
        }
        enyw enywVarB = enyw.b(elpgVar.Y);
        if (enywVarB == null) {
            enywVarB = enyw.UNKNOWN_RCS_TYPE;
        }
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elpgVar4.Y = enywVarB.h;
        elpgVar4.d |= 2097152;
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elpgVar5.h = 8;
        elpgVar5.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar6 = (elpg) elofVar.instance;
        elpgVar6.i = 2;
        elpgVar6.c |= 2;
        asrxVar.d((elpg) elofVar.build());
        aubp aubpVar = aubp.BOT;
        aubq aubqVar = aufhVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        if (aubpVar == aubpVarB) {
            atxd atxdVar = (atxd) this.x.b();
            aufhVar.getClass();
            return auvw.c(atxdVar.a, fcyi.a, fdjz.a, new atxc(atxdVar, aufhVar, null)).h(new ejvr() { // from class: atvq
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    int iOrdinal = ((atav) obj).ordinal();
                    if (iOrdinal == 0) {
                        ekrw ekrwVarH = atvv.a.h();
                        ekrwVarH.X(eksq.a, "BugleDataModel");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 647, "IncomingChatApiImpl.java")).q("Successfully processed incoming message");
                        aubg aubgVar = (aubg) aubl.a.createBuilder();
                        aubk aubkVar = aubk.OK;
                        aubgVar.copyOnWrite();
                        aubl aublVar = (aubl) aubgVar.instance;
                        aublVar.c = aubkVar.f;
                        aublVar.b |= 1;
                        return (aubl) aubgVar.build();
                    }
                    if (iOrdinal == 1) {
                        ekrw ekrwVarJ = atvv.a.j();
                        ekrwVarJ.X(eksq.a, "BugleDataModel");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 657, "IncomingChatApiImpl.java")).q("Failed to process incoming message transiently");
                        aubg aubgVar2 = (aubg) aubl.a.createBuilder();
                        aubk aubkVar2 = aubk.FAILED_TRANSIENTLY;
                        aubgVar2.copyOnWrite();
                        aubl aublVar2 = (aubl) aubgVar2.instance;
                        aublVar2.c = aubkVar2.f;
                        aublVar2.b |= 1;
                        aubi aubiVar = aubi.UNKNOWN_CAUSE;
                        aubgVar2.copyOnWrite();
                        aubl aublVar3 = (aubl) aubgVar2.instance;
                        aublVar3.d = aubiVar.v;
                        aublVar3.b |= 2;
                        return (aubl) aubgVar2.build();
                    }
                    if (iOrdinal != 2) {
                        throw new IllegalArgumentException("Unsupported WorkQueueResultType");
                    }
                    ekrw ekrwVarJ2 = atvv.a.j();
                    ekrwVarJ2.X(eksq.a, "BugleDataModel");
                    ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 650, "IncomingChatApiImpl.java")).q("Failed to process incoming message permanently");
                    aubg aubgVar3 = (aubg) aubl.a.createBuilder();
                    aubk aubkVar3 = aubk.FAILED_PERMANENTLY;
                    aubgVar3.copyOnWrite();
                    aubl aublVar4 = (aubl) aubgVar3.instance;
                    aublVar4.c = aubkVar3.f;
                    aublVar4.b |= 1;
                    aubi aubiVar2 = aubi.UNKNOWN_CAUSE;
                    aubgVar3.copyOnWrite();
                    aubl aublVar5 = (aubl) aubgVar3.instance;
                    aublVar5.d = aubiVar2.v;
                    aublVar5.b |= 2;
                    return (aubl) aubgVar3.build();
                }
            }, eoqg.a);
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleDataModel");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.e, aufhVar.j);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "processMessageAfterValidation", 316, "IncomingChatApiImpl.java")).q("Received incoming message.");
        atya atyaVar = (atya) this.v.b();
        aufk aufkVar = (aufk) aufl.a.createBuilder();
        aufkVar.copyOnWrite();
        aufl auflVar = (aufl) aufkVar.instance;
        aufhVar.getClass();
        auflVar.c = aufhVar;
        auflVar.b |= 1;
        aufkVar.copyOnWrite();
        aufl auflVar2 = (aufl) aufkVar.instance;
        auflVar2.b |= 2;
        auflVar2.d = true;
        eiju eijuVarH = atyaVar.a((aufl) aufkVar.build()).h(new ejvr() { // from class: atvq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int iOrdinal = ((atav) obj).ordinal();
                if (iOrdinal == 0) {
                    ekrw ekrwVarH2 = atvv.a.h();
                    ekrwVarH2.X(eksq.a, "BugleDataModel");
                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 647, "IncomingChatApiImpl.java")).q("Successfully processed incoming message");
                    aubg aubgVar = (aubg) aubl.a.createBuilder();
                    aubk aubkVar = aubk.OK;
                    aubgVar.copyOnWrite();
                    aubl aublVar = (aubl) aubgVar.instance;
                    aublVar.c = aubkVar.f;
                    aublVar.b |= 1;
                    return (aubl) aubgVar.build();
                }
                if (iOrdinal == 1) {
                    ekrw ekrwVarJ = atvv.a.j();
                    ekrwVarJ.X(eksq.a, "BugleDataModel");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 657, "IncomingChatApiImpl.java")).q("Failed to process incoming message transiently");
                    aubg aubgVar2 = (aubg) aubl.a.createBuilder();
                    aubk aubkVar2 = aubk.FAILED_TRANSIENTLY;
                    aubgVar2.copyOnWrite();
                    aubl aublVar2 = (aubl) aubgVar2.instance;
                    aublVar2.c = aubkVar2.f;
                    aublVar2.b |= 1;
                    aubi aubiVar = aubi.UNKNOWN_CAUSE;
                    aubgVar2.copyOnWrite();
                    aubl aublVar3 = (aubl) aubgVar2.instance;
                    aublVar3.d = aubiVar.v;
                    aublVar3.b |= 2;
                    return (aubl) aubgVar2.build();
                }
                if (iOrdinal != 2) {
                    throw new IllegalArgumentException("Unsupported WorkQueueResultType");
                }
                ekrw ekrwVarJ2 = atvv.a.j();
                ekrwVarJ2.X(eksq.a, "BugleDataModel");
                ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "workQueueResultToChatResultWithRetries", 650, "IncomingChatApiImpl.java")).q("Failed to process incoming message permanently");
                aubg aubgVar3 = (aubg) aubl.a.createBuilder();
                aubk aubkVar3 = aubk.FAILED_PERMANENTLY;
                aubgVar3.copyOnWrite();
                aubl aublVar4 = (aubl) aubgVar3.instance;
                aublVar4.c = aubkVar3.f;
                aublVar4.b |= 1;
                aubi aubiVar2 = aubi.UNKNOWN_CAUSE;
                aubgVar3.copyOnWrite();
                aubl aublVar5 = (aubl) aubgVar3.instance;
                aublVar5.d = aubiVar2.v;
                aublVar5.b |= 2;
                return (aubl) aubgVar3.build();
            }
        }, eoqg.a);
        this.k.d(EnumSet.of(caxd.WAKELOCK, caxd.BACKGROUND_SERVICE), eijuVarH, new Supplier() { // from class: atvr
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        });
        return eijuVarH;
    }

    private static Optional o(evuh evuhVar, evqs evqsVar) {
        try {
            return Optional.of(evuhVar.getParserForType().i(evqsVar, evrr.a()));
        } catch (evtj unused) {
            return Optional.empty();
        }
    }

    private static boolean p(aubq aubqVar) {
        aubp aubpVar = aubp.GROUP;
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        return !aubpVar.equals(aubpVarB) || aubqVar.d.startsWith("sip:");
    }

    @Override // defpackage.asrc
    public final eiju a(final aubf aubfVar) {
        final Optional optionalO = o(aubb.a, aubfVar.d);
        if (!optionalO.isEmpty()) {
            return eijx.h(new eooy() { // from class: atvl
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    String str = ((aubb) optionalO.get()).c;
                    atvv atvvVar = this.a;
                    return atvv.m(((cazj) atvvVar.g.a.b()).a(cbcu.g("on_add_user_to_group_chat_complete", aubfVar, atvvVar.l(str))));
                }
            }, this.s);
        }
        o.r("Invalid opaque data in AddUserToGroupChatResponse");
        ((cifw) this.w.b()).d();
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.FAILED_PERMANENTLY;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubi aubiVar = aubi.INVALID_OPAQUE_DATA;
        aubgVar.copyOnWrite();
        aubl aublVar2 = (aubl) aubgVar.instance;
        aublVar2.d = aubiVar.v;
        aublVar2.b |= 2;
        return eijx.e((aubl) aubgVar.build());
    }

    @Override // defpackage.asrc
    public final eiju b(final auch auchVar) {
        final Optional optionalO = o(aucb.a, auchVar.e);
        if (!optionalO.isEmpty()) {
            return eijx.h(new eooy() { // from class: atvf
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    String str = ((aucb) optionalO.get()).c;
                    atvv atvvVar = this.a;
                    return atvv.m(((cazj) atvvVar.i.a.b()).a(cbcu.g("on_create_group_chat_complete", auchVar, atvvVar.l(str))));
                }
            }, this.s);
        }
        o.r("Invalid opaque data in CreateGroupChatResponse");
        ((cifw) this.w.b()).i();
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.FAILED_PERMANENTLY;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubi aubiVar = aubi.INVALID_OPAQUE_DATA;
        aubgVar.copyOnWrite();
        aubl aublVar2 = (aubl) aubgVar.instance;
        aublVar2.d = aubiVar.v;
        aublVar2.b |= 2;
        return eijx.e((aubl) aubgVar.build());
    }

    @Override // defpackage.asrc
    public final eiju c(final audc audcVar) {
        eiju eijuVarH;
        eieu eieuVarK = eiiy.k("IncomingChatApiImpl#onGroupEventNotification");
        try {
            aubq aubqVar = audcVar.q;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            if (p(aubqVar)) {
                eijuVarH = eijx.h(new eooy() { // from class: atvj
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        aufm aufmVar = (aufm) aufo.a.createBuilder();
                        aufmVar.copyOnWrite();
                        aufo aufoVar = (aufo) aufmVar.instance;
                        audc audcVar2 = audcVar;
                        audcVar2.getClass();
                        aufoVar.c = audcVar2;
                        aufoVar.b = 1;
                        aufo aufoVar2 = (aufo) aufmVar.build();
                        atvv atvvVar = this.a;
                        return atvv.m(atvvVar.c.a(aufoVar2, atvvVar.l(audcVar2.e)));
                    }
                }, this.s);
            } else {
                cqbd cqbdVarE = o.e();
                cqbdVarE.I("Invalid group destination");
                cqbdVarE.g(audcVar.e);
                cqbdVarE.r();
                aubg aubgVar = (aubg) aubl.a.createBuilder();
                aubk aubkVar = aubk.FAILED_PERMANENTLY;
                aubgVar.copyOnWrite();
                aubl aublVar = (aubl) aubgVar.instance;
                aublVar.c = aubkVar.f;
                aublVar.b |= 1;
                aubi aubiVar = aubi.INVALID_REPLY_TO_CHAT_ENDPOINT;
                aubgVar.copyOnWrite();
                aubl aublVar2 = (aubl) aubgVar.instance;
                aublVar2.d = aubiVar.v;
                aublVar2.b |= 2;
                eijuVarH = eijx.e((aubl) aubgVar.build());
            }
            eieuVarK.b(eijuVarH);
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

    @Override // defpackage.asrc
    public final eiju d(final audk audkVar) {
        eiju eijuVarH;
        eieu eieuVarK = eiiy.k("IncomingChatApiImpl#onGroupFullStateNotification");
        try {
            aubq aubqVar = audkVar.f;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            if (p(aubqVar)) {
                eijuVarH = eijx.h(new eooy() { // from class: atvi
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        aufm aufmVar = (aufm) aufo.a.createBuilder();
                        aufmVar.copyOnWrite();
                        aufo aufoVar = (aufo) aufmVar.instance;
                        audk audkVar2 = audkVar;
                        audkVar2.getClass();
                        aufoVar.c = audkVar2;
                        aufoVar.b = 2;
                        aufo aufoVar2 = (aufo) aufmVar.build();
                        atvv atvvVar = this.a;
                        return atvv.m(atvvVar.c.a(aufoVar2, atvvVar.l(audkVar2.d)));
                    }
                }, this.s);
            } else {
                cqbd cqbdVarE = o.e();
                cqbdVarE.I("Invalid group destination");
                cqbdVarE.g(audkVar.d);
                cqbdVarE.r();
                aubg aubgVar = (aubg) aubl.a.createBuilder();
                aubk aubkVar = aubk.FAILED_PERMANENTLY;
                aubgVar.copyOnWrite();
                aubl aublVar = (aubl) aubgVar.instance;
                aublVar.c = aubkVar.f;
                aublVar.b |= 1;
                aubi aubiVar = aubi.INVALID_REPLY_TO_CHAT_ENDPOINT;
                aubgVar.copyOnWrite();
                aubl aublVar2 = (aubl) aubgVar.instance;
                aublVar2.d = aubiVar.v;
                aublVar2.b |= 2;
                eijuVarH = eijx.e((aubl) aubgVar.build());
            }
            eieuVarK.b(eijuVarH);
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

    @Override // defpackage.asrc
    public final eiju e(final auee aueeVar) {
        eieu eieuVarK = eiiy.k("IncomingChatApiImpl#onGroupNotifications");
        try {
            eiju eijuVarH = eijx.h(new eooy() { // from class: atvk
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    aufq aufqVar = (aufq) aufr.a.createBuilder();
                    aufqVar.copyOnWrite();
                    aufr aufrVar = (aufr) aufqVar.instance;
                    auee aueeVar2 = aueeVar;
                    aueeVar2.getClass();
                    aufrVar.c = aueeVar2;
                    aufrVar.b |= 1;
                    return atvv.m(((cazj) this.a.d.a.b()).a(cbcu.f("chatapi_incoming_group_notification_list_message", (aufr) aufqVar.build())));
                }
            }, this.s);
            eieuVarK.b(eijuVarH);
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

    @Override // defpackage.asrc
    public final eiju f(final aufh aufhVar) {
        Optional optionalOf;
        eieu eieuVarK = eiiy.k("IncomingChatApiImpl#onIncomingMessage");
        try {
            aubq aubqVar = aufhVar.f;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            if (!p(aubqVar)) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleDataModel");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.X(cqnc.e, aufhVar.j);
                ekrdVar.X(cqnc.s, barn.b(aufhVar.k));
                ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "validateIncomingChatMessageRequest", 227, "IncomingChatApiImpl.java");
                aubq aubqVar2 = aufhVar.f;
                if (aubqVar2 == null) {
                    aubqVar2 = aubq.a;
                }
                aubp aubpVarB = aubp.b(aubqVar2.c);
                if (aubpVarB == null) {
                    aubpVarB = aubp.UNKNOWN_TYPE;
                }
                ekrdVar2.t("Invalid destination for endpoint type: %s", aubpVarB.name());
                ((asrx) this.r.b()).e(aufhVar, enxk.CHAT_API_FAILED_PERMANENTLY, 3);
                aubg aubgVar = (aubg) aubl.a.createBuilder();
                aubk aubkVar = aubk.FAILED_PERMANENTLY;
                aubgVar.copyOnWrite();
                aubl aublVar = (aubl) aubgVar.instance;
                aublVar.c = aubkVar.f;
                aublVar.b |= 1;
                aubi aubiVar = aubi.INVALID_REPLY_TO_CHAT_ENDPOINT;
                aubgVar.copyOnWrite();
                aubl aublVar2 = (aubl) aubgVar.instance;
                aublVar2.d = aubiVar.v;
                aublVar2.b |= 2;
                optionalOf = Optional.of((aubl) aubgVar.build());
            } else if ((aufhVar.c & 4) != 0) {
                aubq aubqVar3 = aufhVar.f;
                if (aubqVar3 == null) {
                    aubqVar3 = aubq.a;
                }
                aubp aubpVarB2 = aubp.b(aubqVar3.c);
                if (aubpVarB2 == null) {
                    aubpVarB2 = aubp.UNKNOWN_TYPE;
                }
                if (aubpVarB2.equals(aubp.GROUP) && (aufhVar.c & 32) == 0) {
                    ekrw ekrwVarJ2 = a.j();
                    ekrwVarJ2.X(eksq.a, "BugleDataModel");
                    ekrd ekrdVar3 = (ekrd) ekrwVarJ2;
                    ekrdVar3.X(cqnc.s, barn.b(aufhVar.k));
                    ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "validateIncomingChatMessageRequest", 257, "IncomingChatApiImpl.java")).t("Missing group token for a group message: %s", aufhVar.j);
                    ((asrx) this.r.b()).e(aufhVar, enxk.CHAT_API_FAILED_PERMANENTLY, 12);
                    aubg aubgVar2 = (aubg) aubl.a.createBuilder();
                    aubk aubkVar2 = aubk.FAILED_PERMANENTLY;
                    aubgVar2.copyOnWrite();
                    aubl aublVar3 = (aubl) aubgVar2.instance;
                    aublVar3.c = aubkVar2.f;
                    aublVar3.b |= 1;
                    aubi aubiVar2 = aubi.INVALID_GROUP_TOKEN;
                    aubgVar2.copyOnWrite();
                    aubl aublVar4 = (aubl) aubgVar2.instance;
                    aublVar4.d = aubiVar2.v;
                    aublVar4.b |= 2;
                    optionalOf = Optional.of((aubl) aubgVar2.build());
                } else {
                    aubq aubqVar4 = aufhVar.h;
                    if (aubqVar4 == null) {
                        aubqVar4 = aubq.a;
                    }
                    if (!((crmx) this.p.b()).I(aubqVar4.d)) {
                        ekrw ekrwVarJ3 = a.j();
                        ekrwVarJ3.X(eksq.a, "BugleDataModel");
                        ekrd ekrdVar4 = (ekrd) ekrwVarJ3;
                        ekrdVar4.X(cqnc.e, aufhVar.j);
                        ekrdVar4.X(cqnc.s, barn.b(aufhVar.k));
                        ekrd ekrdVar5 = (ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "validateIncomingChatMessageRequest", 273, "IncomingChatApiImpl.java");
                        aubq aubqVar5 = aufhVar.h;
                        if (aubqVar5 == null) {
                            aubqVar5 = aubq.a;
                        }
                        aubp aubpVarB3 = aubp.b(aubqVar5.c);
                        if (aubpVarB3 == null) {
                            aubpVarB3 = aubp.UNKNOWN_TYPE;
                        }
                        String strName = aubpVarB3.name();
                        aubq aubqVar6 = aufhVar.h;
                        if (aubqVar6 == null) {
                            aubqVar6 = aubq.a;
                        }
                        ekrdVar5.D("Invalid selfChatEndpoint for receiverType: %s, receiverId: %s", strName, aubqVar6.d);
                        ((asrx) this.r.b()).e(aufhVar, enxk.CHAT_API_FAILED_PERMANENTLY, 9);
                        aubg aubgVar3 = (aubg) aubl.a.createBuilder();
                        aubk aubkVar3 = aubk.FAILED_PERMANENTLY;
                        aubgVar3.copyOnWrite();
                        aubl aublVar5 = (aubl) aubgVar3.instance;
                        aublVar5.c = aubkVar3.f;
                        aublVar5.b |= 1;
                        aubi aubiVar3 = aubi.INVALID_SELF_CHAT_ENDPOINT;
                        aubgVar3.copyOnWrite();
                        aubl aublVar6 = (aubl) aubgVar3.instance;
                        aublVar6.d = aubiVar3.v;
                        aublVar6.b |= 2;
                        optionalOf = Optional.of((aubl) aubgVar3.build());
                    } else if (this.y.a() && (aufhVar.c & 128) == 0) {
                        ekrw ekrwVarJ4 = a.j();
                        ekrwVarJ4.X(eksq.a, "BugleDataModel");
                        ekrd ekrdVar6 = (ekrd) ekrwVarJ4;
                        ekrdVar6.X(cqnc.s, barn.b(aufhVar.k));
                        ((ekrd) ekrdVar6.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "validateIncomingChatMessageRequest", 290, "IncomingChatApiImpl.java")).t("Missing receiver my identity token for message: %s", aufhVar.j);
                        ((asrx) this.r.b()).e(aufhVar, enxk.CHAT_API_FAILED_PERMANENTLY, 13);
                        aubg aubgVar4 = (aubg) aubl.a.createBuilder();
                        aubk aubkVar4 = aubk.FAILED_PERMANENTLY;
                        aubgVar4.copyOnWrite();
                        aubl aublVar7 = (aubl) aubgVar4.instance;
                        aublVar7.c = aubkVar4.f;
                        aublVar7.b |= 1;
                        aubi aubiVar4 = aubi.INVALID_MY_IDENTITY_TOKEN;
                        aubgVar4.copyOnWrite();
                        aubl aublVar8 = (aubl) aubgVar4.instance;
                        aublVar8.d = aubiVar4.v;
                        aublVar8.b |= 2;
                        optionalOf = Optional.of((aubl) aubgVar4.build());
                    } else {
                        optionalOf = Optional.empty();
                    }
                }
            } else {
                ekrw ekrwVarJ5 = a.j();
                ekrwVarJ5.X(eksq.a, "BugleDataModel");
                ekrd ekrdVar7 = (ekrd) ekrwVarJ5;
                ekrdVar7.X(cqnc.s, barn.b(aufhVar.k));
                ((ekrd) ekrdVar7.h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingChatApiImpl", "validateIncomingChatMessageRequest", 242, "IncomingChatApiImpl.java")).t("Missing sender destination token for message: %s", aufhVar.j);
                ((asrx) this.r.b()).e(aufhVar, enxk.CHAT_API_FAILED_PERMANENTLY, 11);
                aubg aubgVar5 = (aubg) aubl.a.createBuilder();
                aubk aubkVar5 = aubk.FAILED_PERMANENTLY;
                aubgVar5.copyOnWrite();
                aubl aublVar9 = (aubl) aubgVar5.instance;
                aublVar9.c = aubkVar5.f;
                aublVar9.b |= 1;
                aubi aubiVar5 = aubi.INVALID_SENDER_TOKEN;
                aubgVar5.copyOnWrite();
                aubl aublVar10 = (aubl) aubgVar5.instance;
                aublVar10.d = aubiVar5.v;
                aublVar10.b |= 2;
                optionalOf = Optional.of((aubl) aubgVar5.build());
            }
            eiju eijuVarE = optionalOf.isPresent() ? eijx.e(optionalOf.get()) : (this.y.a() && this.z.a()) ? n(aufhVar).h(new ejvr() { // from class: atvd
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    aubl aublVar11 = (aubl) obj;
                    aubk aubkVarB = aubk.b(aublVar11.c);
                    if (aubkVarB == null) {
                        aubkVarB = aubk.UNKNOWN_STATUS;
                    }
                    if (!aubkVarB.equals(aubk.OK)) {
                        return aublVar11;
                    }
                    aufh aufhVar2 = aufhVar;
                    axfx axfxVar = aufhVar2.i;
                    if (axfxVar == null) {
                        axfxVar = axfx.a;
                    }
                    final axcm axcmVarA = awzn.a(axfxVar);
                    awky awkyVar = aufhVar2.e;
                    if (awkyVar == null) {
                        awkyVar = awky.a;
                    }
                    atvv atvvVar = this.a;
                    final awjl awjlVarA = awjj.a(awkyVar);
                    final ConversationIdType conversationIdTypeB = barn.b(aufhVar2.k);
                    ((awlc) atvvVar.n.b()).d(new Consumer() { // from class: atvu
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj2) {
                            ((baxx) obj2).a(axcmVarA, conversationIdTypeB, awjlVarA);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return aublVar11;
                }
            }, this.t) : n(aufhVar);
            eieuVarK.b(eijuVarE);
            eieuVarK.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.asrc
    public final eiju g(final augk augkVar) {
        final Optional optionalO = o(augg.a, augkVar.d);
        if (!optionalO.isEmpty()) {
            return eijx.h(new eooy() { // from class: atvh
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    String str = ((augg) optionalO.get()).c;
                    atvv atvvVar = this.a;
                    return atvv.m(((cazj) atvvVar.h.a.b()).a(cbcu.g("on_remove_user_from_group_chat_complete", augkVar, atvvVar.l(str))));
                }
            }, this.s);
        }
        o.r("Invalid opaque data in RemoveUserFromGroupChatResponse");
        cifw cifwVar = (cifw) this.w.b();
        cbqz cbqzVar = cbqz.a;
        cbqzVar.getClass();
        cifw.v(cifwVar, 19, 3, null, null, null, cifwVar.m(3, null), 0, cbqzVar, null, 348);
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.FAILED_PERMANENTLY;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubi aubiVar = aubi.INVALID_OPAQUE_DATA;
        aubgVar.copyOnWrite();
        aubl aublVar2 = (aubl) aubgVar.instance;
        aublVar2.d = aubiVar.v;
        aublVar2.b |= 2;
        return eijx.e((aubl) aubgVar.build());
    }

    @Override // defpackage.asrc
    public final eiju h(final augq augqVar) {
        final Optional optionalO = o(augs.a, augqVar.d);
        if (!optionalO.isEmpty()) {
            return eijx.h(new eooy() { // from class: atvp
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    String str = ((augs) optionalO.get()).c;
                    atvv atvvVar = this.a;
                    return atvv.m(((cazj) atvvVar.e.a.b()).a(cbcu.g("chatapi_revoke_chat_message_response", augqVar, atvvVar.l(str))));
                }
            }, this.s);
        }
        o.r("Invalid opaque data in RevokeChatMessageResponse");
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.FAILED_PERMANENTLY;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubi aubiVar = aubi.INVALID_OPAQUE_DATA;
        aubgVar.copyOnWrite();
        aubl aublVar2 = (aubl) aubgVar.instance;
        aublVar2.d = aubiVar.v;
        aublVar2.b |= 2;
        return eijx.e((aubl) aubgVar.build());
    }

    @Override // defpackage.asrc
    public final eiju i(final augz augzVar) {
        Optional optionalO = o(auhf.a, augzVar.d);
        final auib auibVar = (auib) optionalO.map(new Function() { // from class: atvm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                auib auibVar2 = ((auhf) obj).g;
                return auibVar2 == null ? auib.a : auibVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(Predicate$CC.isEqual(auib.a).mo538negate()).orElse((auib) this.u.fM(cqdr.a()));
        if (((Boolean) ((cczi) cjbf.c.get()).e()).booleanValue()) {
            cjbf cjbfVar = this.j;
            elpg elpgVar = augzVar.h;
            if (elpgVar == null) {
                elpgVar = elpg.b;
            }
            cjbfVar.c(auibVar, basd.a(elpgVar.H), 4, 17);
        }
        if (!optionalO.isEmpty()) {
            eooy eooyVar = new eooy() { // from class: atvn
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    final atvv atvvVar = this.a;
                    final eiju eijuVarK = ((atyp) atvvVar.b.b()).k(augzVar);
                    eooz eoozVar = new eooz() { // from class: atvs
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            atav atavVar = (atav) obj;
                            if (atavVar != atav.SUCCESS) {
                                ((ains) atvvVar.l.b()).e("Bugle.Rcs.ChatApi.Failure.ProcessSendChatMessageResponse.Count", atavVar == atav.FAIL_RETRY ? 1 : 2);
                            }
                            return eijuVarK;
                        }
                    };
                    eoqg eoqgVar = eoqg.a;
                    eiju eijuVarI = eijuVarK.i(eoozVar, eoqgVar);
                    atvvVar.k.b(eijuVarI);
                    return atvv.m(new cbcx(eijuVarI.h(new ejvr() { // from class: atvt
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return ataw.b((atav) obj);
                        }
                    }, eoqgVar), eijx.e(true)));
                }
            };
            eosc eoscVar = this.t;
            return eijx.h(eooyVar, eoscVar).h(new ejvr() { // from class: atvo
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    aubl aublVar = (aubl) obj;
                    if (((Boolean) ((cczi) cjbf.c.get()).e()).booleanValue()) {
                        augz augzVar2 = augzVar;
                        atvv atvvVar = this.a;
                        elpg elpgVar2 = augzVar2.h;
                        if (elpgVar2 == null) {
                            elpgVar2 = elpg.b;
                        }
                        atvvVar.j.c(auibVar, basd.a(elpgVar2.H), 9, 17);
                    }
                    return aublVar;
                }
            }, eoscVar);
        }
        o.r("Invalid opaque data in SendChatMessageResponse");
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.FAILED_PERMANENTLY;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubi aubiVar = aubi.INVALID_OPAQUE_DATA;
        aubgVar.copyOnWrite();
        aubl aublVar2 = (aubl) aubgVar.instance;
        aublVar2.d = aubiVar.v;
        aublVar2.b |= 2;
        return eijx.e((aubl) aubgVar.build());
    }

    @Override // defpackage.asrc
    public final eiju j(final auik auikVar) {
        final Optional optionalO = o(auig.a, auikVar.d);
        if (!optionalO.isEmpty()) {
            return eijx.h(new eooy() { // from class: atvg
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    String str = ((auig) optionalO.get()).c;
                    atvv atvvVar = this.a;
                    return atvv.m(((cazj) atvvVar.f.a.b()).a(cbcu.g("on_trigger_chat_group_full_state_update_complete", auikVar, atvvVar.l(str))));
                }
            }, this.s);
        }
        o.r("Invalid opaque data in TriggerChatGroupFullStateUpdateResponse");
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubk aubkVar = aubk.FAILED_PERMANENTLY;
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubi aubiVar = aubi.INVALID_OPAQUE_DATA;
        aubgVar.copyOnWrite();
        aubl aublVar2 = (aubl) aubgVar.instance;
        aublVar2.d = aubiVar.v;
        aublVar2.b |= 2;
        return eijx.e((aubl) aubgVar.build());
    }

    @Override // defpackage.asrc
    public final eiju k(final auis auisVar) {
        return eijx.g(new Callable() { // from class: atve
            @Override // java.util.concurrent.Callable
            public final Object call() {
                atol atolVar = (atol) this.a.m.b();
                auis auisVar2 = auisVar;
                auisVar2.getClass();
                auim auimVar = (auim) evsn.parseFrom(auim.a, auisVar2.d, evrr.a());
                auimVar.getClass();
                String str = auimVar.c;
                str.getClass();
                aubl aublVar = auisVar2.c;
                if (aublVar == null) {
                    aublVar = aubl.a;
                }
                aublVar.getClass();
                if (atolVar.a(str, aublVar)) {
                    aubg aubgVar = (aubg) aubl.a.createBuilder();
                    aubgVar.getClass();
                    aubm.b(aubk.OK, aubgVar);
                    return aubm.a(aubgVar);
                }
                aubg aubgVar2 = (aubg) aubl.a.createBuilder();
                aubgVar2.getClass();
                aubm.b(aubk.FAILED_PERMANENTLY, aubgVar2);
                return aubm.a(aubgVar2);
            }
        }, this.t);
    }

    public final cbog l(String str) {
        caxr caxrVar = new caxr();
        caxrVar.a = Long.toString(this.q.c(str));
        return caxrVar.a();
    }
}
