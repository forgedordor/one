package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwmi extends cayv {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "DowngradeOnUnencryptedMessageHandler");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    private final eosc k;

    public bwmi(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, eosc eoscVar, fcsu fcsuVar8, fcsu fcsuVar9) {
        this.c = fcsuVar;
        this.e = fcsuVar2;
        this.b = fcsuVar3;
        this.d = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.i = fcsuVar7;
        this.k = eoscVar;
        this.h = fcsuVar8;
        this.j = fcsuVar9;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("DowngradeOnUnencryptedMessageHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return bwml.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(final cayy cayyVar, evuh evuhVar) {
        final bwml bwmlVar = (bwml) evuhVar;
        cczv cczvVar = alvx.a;
        ((Boolean) new alup().get()).booleanValue();
        return eijx.g(new Callable() { // from class: bwmh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                bwmi bwmiVar = this.a;
                fcsu fcsuVar = bwmiVar.b;
                dzub dzubVarA = ((ajfo) fcsuVar.b()).a();
                bwml bwmlVar2 = bwmlVar;
                ConversationIdType conversationIdTypeB = barn.b(bwmlVar2.c);
                bajf bajfVarA = ((bapl) bwmiVar.i.b()).a(conversationIdTypeB);
                if (bajfVarA == null) {
                    cqbd cqbdVarA = bwmi.a.a();
                    cqbdVarA.I("Early return for null conversation.");
                    cqbdVarA.c(conversationIdTypeB);
                    cqbdVarA.h(basd.a(bwmlVar2.e));
                    cqbdVarA.r();
                    return cbcw.i();
                }
                if (!bajfVarA.D()) {
                    cqbd cqbdVarA2 = bwmi.a.a();
                    cqbdVarA2.I("Early return for consistent encryption status.");
                    cqbdVarA2.c(conversationIdTypeB);
                    cqbdVarA2.h(basd.a(bwmlVar2.e));
                    cqbdVarA2.r();
                    return cbcw.i();
                }
                MessageCoreData messageCoreDataO = ((baxe) bwmiVar.e.b()).o(conversationIdTypeB);
                if (messageCoreDataO != null && messageCoreDataO.cB() && messageCoreDataO.r() > bwmlVar2.d && messageCoreDataO.cI()) {
                    cqbd cqbdVarC = bwmi.a.c();
                    cqbdVarC.I("Will not downgrade because a new encrypted message has been received");
                    cqbdVarC.c(conversationIdTypeB);
                    cqbdVarC.h(basd.a(bwmlVar2.e));
                    cqbdVarC.r();
                    return cbcw.i();
                }
                ekgb ekgbVarB = ((baqt) bwmiVar.d.b()).b(conversationIdTypeB);
                cqce cqceVar = bwmi.a;
                cqbd cqbdVarA3 = cqceVar.a();
                cqbdVarA3.I("Attempting to downgrade a conversation");
                cqbdVarA3.c(conversationIdTypeB);
                cqbdVarA3.h(basd.a(bwmlVar2.e));
                cqbdVarA3.y("conversation type", bajfVarA.E());
                cqbdVarA3.r();
                if (ekgbVarB.isEmpty()) {
                    cqbd cqbdVarC2 = cqceVar.c();
                    cqbdVarC2.I("Unable to downgrade conversation because recipient list is empty");
                    cqbdVarC2.c(conversationIdTypeB);
                    cqbdVarC2.h(basd.a(bwmlVar2.e));
                    cqbdVarC2.r();
                } else if (bajfVarA.Q()) {
                    cqbd cqbdVarC3 = cqceVar.c();
                    cqbdVarC3.I("Downgrading group conversation");
                    cqbdVarC3.c(conversationIdTypeB);
                    cqbdVarC3.h(basd.a(bwmlVar2.e));
                    cqbdVarC3.r();
                    ((bwey) bwmiVar.g.b()).g(conversationIdTypeB, basd.a(bwmlVar2.e));
                    fcsu fcsuVar2 = bwmiVar.h;
                    ((ains) fcsuVar2.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", bwvi.DOWNGRADE_GROUP_ON_RECEIVING_UNENCRYPTED_MESSAGE_FROM_BUGLE.u);
                    bagy bagyVar = (bagy) bwmiVar.c.b();
                    aubq aubqVar = bwmlVar2.h;
                    if (aubqVar == null) {
                        aubqVar = aubq.a;
                    }
                    bagx bagxVarA = bagyVar.a(aubqVar, conversationIdTypeB);
                    bwvi bwviVar = bwvi.DEFAULT;
                    bwviVar.getClass();
                    ((bwfq) bagxVarA).e(0, bwviVar);
                    String str = bwmlVar2.e;
                    if (!Pattern.matches((String) auau.a.e(), str)) {
                        cqbd cqbdVarC4 = cqceVar.c();
                        cqbdVarC4.I("Downgrading group, unrecognized rcs message id format");
                        cqbdVarC4.c(conversationIdTypeB);
                        cqbdVarC4.h(basd.a(bwmlVar2.e));
                        cqbdVarC4.r();
                        ((ains) fcsuVar2.b()).e("Bugle.Etouffee.Conversation.Encryption.Update", bwvi.DOWNGRADE_GROUP_ON_RECEIVING_UNENCRYPTED_MESSAGE_FROM_NON_BUGLE.u);
                        aubq aubqVar2 = bwmlVar2.g;
                        if (aubqVar2 == null) {
                            aubqVar2 = aubq.a;
                        }
                        bagxVarA.c(aubqVar2, true, elyd.RECEIVED_UNENCRYPTED_MESSAGE_IN_ENCRYPTED_CONVERSATION);
                    }
                } else if (((alqm) ekgbVarB.get(0)).e().isEmpty()) {
                    cqbd cqbdVarC5 = cqceVar.c();
                    cqbdVarC5.I("Unable to downgrade conversation because rcs identifier is empty");
                    cqbdVarC5.c(conversationIdTypeB);
                    cqbdVarC5.h(basd.a(bwmlVar2.e));
                    cqbdVarC5.r();
                } else {
                    cayy cayyVar2 = cayyVar;
                    cqbd cqbdVarC6 = cqceVar.c();
                    cqbdVarC6.I("Valid unencrypted message received to downgrade encrypted conversation");
                    cqbdVarC6.c(conversationIdTypeB);
                    cqbdVarC6.h(basd.a(bwmlVar2.e));
                    cqbdVarC6.r();
                    aubq aubqVar3 = (aubq) ((alqm) ekgbVarB.get(0)).e().get();
                    if (!cayyVar2.b()) {
                        bagy bagyVar2 = (bagy) bwmiVar.c.b();
                        aubq aubqVar4 = bwmlVar2.h;
                        if (aubqVar4 == null) {
                            aubqVar4 = aubq.a;
                        }
                        bagx bagxVarA2 = bagyVar2.a(aubqVar4, conversationIdTypeB);
                        if (Collection.EL.stream(((bwjw) ((bwfq) bagxVarA2).d.b()).f.c(aubqVar3.d)).anyMatch(new Predicate() { // from class: bwjs
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
                                return ((bkvw) obj).j();
                            }
                        })) {
                            bagxVarA2.c(aubqVar3, false, elyd.RECEIVED_UNENCRYPTED_MESSAGE_IN_ENCRYPTED_CONVERSATION);
                            ((bwey) bwmiVar.g.b()).g(conversationIdTypeB, basd.a(bwmlVar2.e));
                            bwms bwmsVar = (bwms) bwmiVar.f.b();
                            bwmq bwmqVar = (bwmq) bwmr.a.createBuilder();
                            String str2 = bwmlVar2.c;
                            bwmqVar.copyOnWrite();
                            bwmr bwmrVar = (bwmr) bwmqVar.instance;
                            str2.getClass();
                            bwmrVar.b = str2;
                            bwmr bwmrVar2 = (bwmr) bwmqVar.build();
                            caxr caxrVar = new caxr();
                            caxrVar.b = "etouffee-downgrade-conversation".concat(conversationIdTypeB.toString());
                            ((cazj) bwmsVar.a.b()).g(cbcu.g("undelivered_message_fallback", bwmrVar2, caxrVar.a()));
                        }
                    }
                }
                ((ajfo) fcsuVar.b()).g(dzubVarA, ajfo.D);
                return cbcw.i();
            }
        }, this.k);
    }
}
