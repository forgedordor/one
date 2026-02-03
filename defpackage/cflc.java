package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cflc implements cfmz {
    public static final cqce a = cqce.g("BugleNetwork", "GetConversationDelegate");
    public final cexq b;
    public final fcsu c;
    public final fcsu d;
    public final eosc e;
    public final fcsu f;
    private final eosc g;
    private final fcsu h;

    public cflc(eosc eoscVar, eosc eoscVar2, cexq cexqVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.g = eoscVar;
        this.b = cexqVar;
        this.c = fcsuVar;
        this.d = fcsuVar3;
        this.e = eoscVar2;
        this.f = fcsuVar2;
        this.h = fcsuVar4;
    }

    @Override // defpackage.cfmz
    public final /* synthetic */ eiju a(cfmy cfmyVar) {
        return cfmx.a(this, cfmyVar);
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ eiju b(cfmy cfmyVar, evuh evuhVar) {
        eoyf eoyfVar = (eoyf) evuhVar;
        ConversationIdType conversationIdTypeB = barn.b(eoyfVar.c);
        if (!conversationIdTypeB.b() || (eoyfVar.b & 1) == 0) {
            return d(conversationIdTypeB);
        }
        ((ekrd) a.i().h("com/google/android/apps/messaging/shared/net/handler/ditto/GetConversationDelegate", "handleRequestInternal", 79, "GetConversationDelegate.java")).q("conversationId is empty, trying to get the conversation using other ids instead");
        ceeh ceehVar = (ceeh) this.h.b();
        epqd epqdVar = eoyfVar.d;
        if (epqdVar == null) {
            epqdVar = epqd.a;
        }
        return ceehVar.a(epqdVar).i(new eooz() { // from class: cfkz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.d((ConversationIdType) obj);
            }
        }, this.g);
    }

    @Override // defpackage.cfmz
    public final /* bridge */ /* synthetic */ evuh c(evqs evqsVar) {
        return (eoyf) evsn.parseFrom(eoyf.a, evqsVar, evrr.a());
    }

    public final eiju d(final ConversationIdType conversationIdType) {
        eiju eijuVarI;
        if (conversationIdType.b()) {
            a.r("conversationId is null");
            eijuVarI = eijx.e(eoyh.a);
        } else {
            eijuVarI = eijx.g(new Callable() { // from class: cfkw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ((axgh) this.a.d.b()).a(conversationIdType);
                }
            }, this.g).i(new eooz() { // from class: cfkx
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    ConversationIdType conversationIdType2 = conversationIdType;
                    final bajf bajfVar = (bajf) obj;
                    if (bajfVar == null) {
                        cqbd cqbdVarE = cflc.a.e();
                        cqbdVarE.A("conversation is null", conversationIdType2);
                        cqbdVarE.r();
                        return eijx.e(eoyh.a);
                    }
                    final cflc cflcVar = this.a;
                    eiju eijuVarB = cflcVar.b.b(conversationIdType2);
                    eooz eoozVar = new eooz() { // from class: cfla
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return ((cehg) cflcVar.c.b()).f(bajfVar, (ekgb) obj2);
                        }
                    };
                    eosc eoscVar = cflcVar.e;
                    return eijuVarB.i(eoozVar, eoscVar).h(new ejvr() { // from class: cflb
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eowm eowmVar = (eowm) obj2;
                            eoyg eoygVar = (eoyg) eoyh.a.createBuilder();
                            eoygVar.copyOnWrite();
                            eoyh eoyhVar = (eoyh) eoygVar.instance;
                            eowmVar.getClass();
                            eoyhVar.c = eowmVar;
                            eoyhVar.b |= 1;
                            return (eoyh) eoygVar.build();
                        }
                    }, eoscVar);
                }
            }, this.e);
        }
        return eijuVarI.i(new eooz() { // from class: cfky
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final eoyh eoyhVar = (eoyh) obj;
                if (!((Boolean) ((cczi) bvfd.o.get()).e()).booleanValue()) {
                    return eijx.e(eoyhVar);
                }
                cezf cezfVar = (cezf) this.a.f.b();
                eowm eowmVar = eoyhVar.c;
                if (eowmVar == null) {
                    eowmVar = eowm.a;
                }
                eowm eowmVar2 = eowm.a;
                if (!eowmVar.equals(eowmVar2) && !eowmVar.u && eowmVar.i) {
                    eows eowsVar = eows.RCS;
                    int i = eowmVar.t;
                    eows eowsVar2 = i != 0 ? i != 1 ? i != 2 ? null : eowsVar : eows.XMS : eows.UNKNOWN_CONVERSATION_TYPE;
                    if (eowsVar2 == null) {
                        eowsVar2 = eows.UNRECOGNIZED;
                    }
                    if (eowsVar.equals(eowsVar2)) {
                        eowm eowmVar3 = eoyhVar.c;
                        if (eowmVar3 != null) {
                            eowmVar2 = eowmVar3;
                        }
                        return cezfVar.d(eowmVar2, 1).h(new ejvr() { // from class: ceza
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                eowm eowmVar4 = (eowm) obj2;
                                eoyg eoygVar = (eoyg) eoyhVar.toBuilder();
                                eoygVar.copyOnWrite();
                                eoyh eoyhVar2 = (eoyh) eoygVar.instance;
                                eoyhVar2.c = null;
                                eoyhVar2.b &= -2;
                                eoygVar.copyOnWrite();
                                eoyh eoyhVar3 = (eoyh) eoygVar.instance;
                                eowmVar4.getClass();
                                eoyhVar3.c = eowmVar4;
                                eoyhVar3.b |= 1;
                                return (eoyh) eoygVar.build();
                            }
                        }, cezfVar.b);
                    }
                }
                return eijx.e(eoyhVar);
            }
        }, this.e);
    }
}
