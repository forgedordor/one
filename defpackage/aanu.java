package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanu extends dqpi {
    public static final eksp a = eksp.c("NewConvCreatedListener");
    public static final ejxr b = cdag.w(235366139, "enable_conversation_creation_check");
    public static final ejxr c = cdag.v("enable_forked_conversation_check");
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final bosz g;
    private final dqsn j;
    private final apty k;

    public aanu(dqsn dqsnVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, apty aptyVar) {
        botb botbVarE = botm.e();
        botbVarE.A("conversationCreatedQuery");
        botbVarE.g(new Function() { // from class: aanp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = aanu.a;
                return ((bopp) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.g = botbVarE.b();
        this.j = dqsnVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.k = aptyVar;
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        final bojh bojhVar = (bojh) dqsdVar.b();
        if (bojhVar != null) {
            if (((Boolean) ((cczi) b.get()).e()).booleanValue()) {
                ((eksl) a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/NewConversationCreatedChangeListener", "onChangeInTransaction", 93, "NewConversationCreatedChangeListener.java")).t("onChangeInTransaction for New Conversation created: %s", bojhVar.C());
                this.j.g(new dqsm() { // from class: aanq
                    @Override // defpackage.dqsm
                    public final eieu a() {
                        eksp ekspVar = aanu.a;
                        return eiiy.k("NCCCL::convoCreated::runAfterCommit");
                    }
                }, this.k.a() ? String.format("NewConversationCreatedChangeListener::%s", bojhVar.C()) : bojhVar.C().toString(), new Runnable() { // from class: aanr
                    @Override // java.lang.Runnable
                    public final void run() {
                        bojh bojhVar2 = bojhVar;
                        Optional optionalOf = Optional.of(Integer.valueOf(bojhVar2.k()));
                        aamb aambVar = (aamb) this.a.d.b();
                        fcsu fcsuVar = aambVar.a;
                        ConversationIdType conversationIdTypeC = bojhVar2.C();
                        eosc eoscVar = (eosc) fcsuVar.b();
                        eoscVar.getClass();
                        eosc eoscVar2 = (eosc) aambVar.b.b();
                        eoscVar2.getClass();
                        aapx aapxVar = (aapx) aambVar.c.b();
                        aapxVar.getClass();
                        conversationIdTypeC.getClass();
                        final aama aamaVar = new aama(eoscVar, eoscVar2, aapxVar, conversationIdTypeC, optionalOf);
                        eijx.f(new Runnable() { // from class: aaly
                            @Override // java.lang.Runnable
                            public final void run() {
                                eksl ekslVar = (eksl) aama.a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/ConversationCreatedActivityReporter", "evaluate", 54, "ConversationCreatedActivityReporter.java");
                                aama aamaVar2 = aamaVar;
                                ConversationIdType conversationIdType = aamaVar2.e;
                                ekslVar.t("Starting conversation(ID: %s) insert notification for Normalization metric", conversationIdType);
                                final aaps aapsVar = new aaps();
                                aapsVar.d(emvl.NEW_CONVERSATION_CREATED);
                                aapsVar.c(conversationIdType);
                                aamaVar2.f.ifPresent(new Consumer() { // from class: aalz
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj) {
                                        Integer num = (Integer) obj;
                                        num.intValue();
                                        ((aaps) aapsVar).a = Optional.of(num);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                aamaVar2.d.b(aapsVar.e());
                            }
                        }, aamaVar.b).k(auvh.b(), aamaVar.c);
                    }
                });
            }
            if (((Boolean) ((cczi) c.get()).e()).booleanValue()) {
                ((eksl) a.n().h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/NewConversationCreatedChangeListener", "onChangeInTransaction", 107, "NewConversationCreatedChangeListener.java")).t("onChangeInTransaction for Forked Conversation Inspector: %s", bojhVar.C());
                this.j.g(new dqsm() { // from class: aans
                    @Override // defpackage.dqsm
                    public final eieu a() {
                        eksp ekspVar = aanu.a;
                        return eiiy.k("NCCCL::forkedConvo::runAfterCommit");
                    }
                }, null, new Runnable() { // from class: aant
                    @Override // java.lang.Runnable
                    public final void run() {
                        aanu aanuVar = this.a;
                        bakt baktVar = (bakt) aanuVar.f.b();
                        bojh bojhVar2 = bojhVar;
                        bojh bojhVarR = baktVar.r(bojhVar2.C());
                        if (bojhVarR == null) {
                            ((eksl) ((eksl) aanu.a.j()).h("com/google/android/apps/messaging/custodian/inspectors/forking/conversationstable/NewConversationCreatedChangeListener", "onChangeInTransaction", 118, "NewConversationCreatedChangeListener.java")).t("Failed to get conversation data from bugle DB for conversation id: %s", bojhVar2.C());
                            return;
                        }
                        aanj aanjVar = (aanj) aanuVar.e.b();
                        awfi awfiVar = (awfi) aanjVar.a.b();
                        awfiVar.getClass();
                        aamg aamgVar = (aamg) aanjVar.b.b();
                        aamgVar.getClass();
                        awci awciVar = (awci) aanjVar.c.b();
                        awciVar.getClass();
                        fcsu fcsuVar = aanjVar.d;
                        alrj alrjVar = (alrj) aanjVar.e.b();
                        alrjVar.getClass();
                        aapx aapxVar = (aapx) aanjVar.f.b();
                        aapxVar.getClass();
                        fcsu fcsuVar2 = aanjVar.g;
                        fcsu fcsuVar3 = aanjVar.h;
                        aweh awehVar = (aweh) aanjVar.i.b();
                        awehVar.getClass();
                        fdjx fdjxVar = (fdjx) aanjVar.j.b();
                        fdjxVar.getClass();
                        eizx eizxVar = (eizx) aanjVar.k.b();
                        eizxVar.getClass();
                        ains ainsVar = (ains) aanjVar.l.b();
                        ainsVar.getClass();
                        aipo aipoVar = (aipo) aanjVar.m.b();
                        aipoVar.getClass();
                        aani aaniVar = new aani(awfiVar, aamgVar, awciVar, fcsuVar, alrjVar, aapxVar, fcsuVar2, fcsuVar3, awehVar, fdjxVar, eizxVar, ainsVar, aipoVar, aanjVar.n, aanjVar.o, bojhVarR);
                        auvw.a(ejaa.a(aaniVar.c, aaniVar.d, new aamp(aaniVar, null))).k(auvh.b(), eoqg.a);
                    }
                });
            }
        }
    }
}
