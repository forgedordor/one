package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciin extends cayv {
    public static final eksp a;
    public static final ekgp b;
    public final cicm c;
    public final dqsn d;
    private final eosd e;
    private final eosc f;

    static {
        cdag.f(cdag.b, "rcs_service_connection_wait_timeout_for_pwq", 3000L);
        a = eksp.c("BugleGroupManagement");
        b = ekgp.l(new Predicate() { // from class: ciik
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
                return ((cihz) obj).b;
            }
        }, ciga.NAME_CHANGE);
    }

    public ciin(eosd eosdVar, eosc eoscVar, cicm cicmVar, dqsn dqsnVar) {
        this.e = eosdVar;
        this.f = eoscVar;
        this.c = cicmVar;
        this.d = dqsnVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("GroupSessionStartedHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return ciip.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final ciip ciipVar = (ciip) evuhVar;
        final long j = ciipVar.c;
        eooy eooyVar = new eooy() { // from class: ciif
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eksp ekspVar = ciin.a;
                return eijx.e(ciipVar);
            }
        };
        eosc eoscVar = this.f;
        return eijx.h(eooyVar, eoscVar).h(new ejvr() { // from class: ciig
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ciip ciipVar2 = (ciip) obj;
                if (ciipVar2.d.isEmpty()) {
                    ((eksl) ((eksl) ciin.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartedHandler", "areValidGroupSessionStartedParameters", 186, "GroupSessionStartedHandler.java")).q("Invalid parameters. RCS group ID not set");
                } else {
                    if (!ciipVar2.e.isEmpty()) {
                        long j2 = j;
                        ciin ciinVar = this.a;
                        cicq cicqVarW = cicr.w();
                        cicqVarW.j(false);
                        cicqVarW.q(true);
                        cicqVarW.w(emaf.GROUP_SESSION_STARTED_EVENT);
                        cicqVarW.p(false);
                        cicqVarW.z(j2);
                        cicqVarW.u(ciipVar2.d);
                        cicqVarW.n(ciipVar2.f);
                        final ConversationIdType conversationIdTypeA = ciinVar.c.a(cicqVarW.D());
                        if (conversationIdTypeA.b()) {
                            eksl ekslVar = (eksl) ciin.a.i();
                            ekslVar.X(cqnc.N, ciipVar2.d);
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartedHandler", "processPendingWorkItemAsync", 147, "GroupSessionStartedHandler.java")).q("Could not retrieve conversation. Skipping conference URI update.");
                            return cbcw.k();
                        }
                        ciip ciipVar3 = ciipVar;
                        String str = ciipVar2.e;
                        ejwl.b(!TextUtils.isEmpty(str), "Calling updateConferenceUri with empty URI");
                        String[] strArr = botm.a;
                        bote boteVar = new bote();
                        boteVar.ap("updateConferenceUri");
                        boteVar.ad(new Function() { // from class: ciil
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                botl botlVar = (botl) obj2;
                                eksp ekspVar = ciin.a;
                                botlVar.r(conversationIdTypeA);
                                return botlVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        boteVar.N(str);
                        boteVar.b().e();
                        if ((ciipVar3.b & 1) != 0) {
                            final cihz cihzVar = ciipVar3.g;
                            if (cihzVar == null) {
                                cihzVar = cihz.a;
                            }
                            ciinVar.d.d("GroupSessionStartedHandler#updateRcsGroupCapabilities", new Runnable() { // from class: ciim
                                @Override // java.lang.Runnable
                                public final void run() {
                                    eksp ekspVar = ciin.a;
                                    final ConversationIdType conversationIdType = conversationIdTypeA;
                                    bojh bojhVarB = botm.b(conversationIdType);
                                    if (bojhVarB == null) {
                                        return;
                                    }
                                    cifz cifzVarA = bojhVarB.L().a();
                                    ekqg ekqgVarListIterator = ciin.b.entrySet().listIterator();
                                    while (ekqgVarListIterator.hasNext()) {
                                        cihz cihzVar2 = cihzVar;
                                        Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                                        if (aky$$ExternalSyntheticApiModelOutline0.m179m(entry.getKey()).test(cihzVar2)) {
                                            cifzVarA.c((ciga) entry.getValue());
                                        } else {
                                            cifzVarA.b((ciga) entry.getValue());
                                        }
                                    }
                                    bote boteVar2 = new bote();
                                    boteVar2.ap("updateRcsGroupCapabilities");
                                    boteVar2.ad(new Function() { // from class: ciij
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            botl botlVar = (botl) obj2;
                                            eksp ekspVar2 = ciin.a;
                                            botlVar.r(conversationIdType);
                                            return botlVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    boteVar2.O(cifzVarA.a());
                                    boteVar2.b().e();
                                }
                            });
                        }
                        return cbcw.i();
                    }
                    ((eksl) ((eksl) ciin.a.j()).h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartedHandler", "areValidGroupSessionStartedParameters", 191, "GroupSessionStartedHandler.java")).q("Invalid parameters. RCS conference URI not set");
                }
                ekrw ekrwVarN = ciin.a.n();
                ekrwVarN.X(cqnc.L, Long.valueOf(ciipVar2.c));
                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/rcs/groups/invite/GroupSessionStartedHandler", "processPendingWorkItemAsync", 122, "GroupSessionStartedHandler.java")).q("Invalid GroupSessionStartedParameters. Ignoring incoming RCS group invitation. This is probably because this conversation is actually a one to one conversation and this handler is scheduled to support legacy CS.apk clients.");
                return cbcw.i();
            }
        }, this.e).f(TimeoutException.class, new eooz() { // from class: ciih
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = ciin.a;
                return eijx.e(cbcw.m());
            }
        }, eoscVar).f(efao.class, new eooz() { // from class: ciii
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = ciin.a;
                return eijx.e(cbcw.m());
            }
        }, eoscVar);
    }
}
