package defpackage;

import j$.time.Instant;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crwq extends fcyz implements fdat {
    final /* synthetic */ crwr a;
    final /* synthetic */ long b;
    final /* synthetic */ crws c;
    final /* synthetic */ crwi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crwq(crwr crwrVar, long j, crws crwsVar, crwi crwiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = crwrVar;
        this.b = j;
        this.c = crwsVar;
        this.d = crwiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crwq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final crwr crwrVar = this.a;
        final long j = this.b;
        final crws crwsVar = this.c;
        final crwi crwiVar = this.d;
        Object objC = crwrVar.a.c("A2pConversationSubscriptionsDatabaseOperations#setSubscriptionState", new ejxr() { // from class: crwp
            @Override // defpackage.ejxr
            public final Object get() {
                long j2 = j;
                crws crwsVar2 = crwsVar;
                crwi crwiVar2 = crwiVar;
                crwr crwrVar2 = crwrVar;
                final crwh crwhVarA = crwrVar2.a(j2);
                if (crwhVarA == null) {
                    Instant instantF = ((cogw) crwrVar2.b.b()).f();
                    instantF.getClass();
                    crwh crwhVar = new crwh(j2, crwsVar2, crwiVar2, instantF);
                    String[] strArr = bmhw.a;
                    bmgq bmgqVar = new bmgq();
                    bmgqVar.e(crwhVar.a);
                    bmgqVar.d(crwhVar.d);
                    bmgqVar.c(crwhVar.b);
                    bmgqVar.b(crwhVar.c);
                    bmgn bmgnVarA = bmgqVar.a();
                    final dqsy dqsyVarB = bmhw.b();
                    return Boolean.valueOf(Long.valueOf(dqru.b(bmhw.b(), "a2p_conversation_subscriptions", bmgnVarA, new Function() { // from class: bmgl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return Long.valueOf(dqsyVarB.P("a2p_conversation_subscriptions", (dqst) obj2));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bmgm
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj2) {
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    })).longValue() > 0);
                }
                String[] strArr2 = bmhw.a;
                bmht bmhtVar = new bmht();
                bmhtVar.ap("A2pConversationSubscriptionsDatabaseOperations-updateSubscription");
                bmhtVar.af(new bmhu((bmhv) new Function() { // from class: crwo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bmhv bmhvVar = (bmhv) obj2;
                        bmhvVar.b(crwhVarA.a);
                        return bmhvVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new bmhv())));
                Instant instantF2 = ((cogw) crwrVar2.b.b()).f();
                if (instantF2 == null) {
                    bmhtVar.a.putNull("last_action_timestamp");
                } else {
                    bmhtVar.a.put("last_action_timestamp", Long.valueOf(bart.a(instantF2)));
                }
                if (crwsVar2 != crws.CONVERSATION_TOOLSTONE_STATE_UNSPECIFIED) {
                    if (crwsVar2 == null) {
                        bmhtVar.a.putNull("conversation_toolstone_state");
                    } else {
                        bmhtVar.a.put("conversation_toolstone_state", Integer.valueOf(crwsVar2.a()));
                    }
                }
                if (crwiVar2 != crwi.CONVERSATION_SUBSCRIPTION_STATE_UNSPECIFIED) {
                    if (crwiVar2 == null) {
                        bmhtVar.a.putNull("conversation_subscription_state");
                    } else {
                        bmhtVar.a.put("conversation_subscription_state", Integer.valueOf(crwiVar2.a()));
                    }
                }
                bmhtVar.am();
                return Boolean.valueOf(bmhtVar.a().e() > 0);
            }
        });
        objC.getClass();
        return objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crwq(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
