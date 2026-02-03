package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdmg {
    public final fcsu a;

    public cdmg(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public static final boolean a(ConversationIdType conversationIdType) {
        ecem.b();
        bron bronVarA = bros.a();
        bronVarA.A("ParentDisallowedConversationDatabaseOperations#isConversationMarkedAsAllowed");
        bror brorVar = new bror();
        brorVar.b(conversationIdType);
        bronVarA.k(new broq(brorVar));
        return bronVarA.b().W();
    }

    @fcsv
    public static final void b(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        ecem.b();
        String[] strArr = bros.a;
        brnv brnvVar = new brnv();
        brnvVar.b(conversationIdType);
        brns brnsVarA = brnvVar.a();
        final dqsy dqsyVarB = bros.b();
        dqru.b(bros.b(), "parent_disallowed_conversations", brnsVarA, new Function() { // from class: brno
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.Q("parent_disallowed_conversations", (dqst) obj, 4));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: brnp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public static final void c(ConversationIdType conversationIdType) {
        ecem.b();
        String[] strArr = bros.a;
        broi broiVar = new broi();
        broiVar.f("ParentDisallowedConversationDatabaseOperations#markConversationAsAllowed");
        bror brorVar = new bror();
        brorVar.b(conversationIdType);
        broiVar.a(brorVar);
        broiVar.d();
    }

    public static final void d(Set set) {
        ecem.b();
        String[] strArr = bros.a;
        broi broiVar = new broi();
        broiVar.f("ParentDisallowedConversationDatabaseOperations#markConversationsAsAllowed");
        bror brorVar = new bror();
        ekfw ekfwVar = new ekfw();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ekfwVar.h(String.valueOf(barn.a((ConversationIdType) it.next())));
        }
        brorVar.ap(new dqpm("parent_disallowed_conversations.conversation_id", 3, bror.as(ekfwVar.g()), true));
        broiVar.a(brorVar);
        broiVar.d();
    }

    public static final void e(final ConversationIdType conversationIdType, akbj akbjVar) {
        conversationIdType.getClass();
        akbjVar.getClass();
        ecem.b();
        akbk akbkVar = akbjVar.a;
        if (akbkVar == akbk.b) {
            c(conversationIdType);
            return;
        }
        String[] strArr = bros.a;
        brnv brnvVar = new brnv();
        brnvVar.b(conversationIdType);
        brnvVar.c(akbkVar);
        final brns brnsVarA = brnvVar.a();
        final broq broqVar = new broq((bror) new Function() { // from class: cdme
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bror brorVar = (bror) obj;
                brorVar.b(conversationIdType);
                return brorVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bror()));
        final dqsy dqsyVarB = bros.b();
        ((Boolean) dqsyVarB.o(new ejxr() { // from class: brnq
            @Override // defpackage.ejxr
            public final Object get() {
                String[] strArr2 = bros.a;
                brop bropVar = new brop();
                brns brnsVar = brnsVarA;
                akbk akbkVarK = brnsVar.k();
                int iIntValue = bros.c().intValue();
                int iIntValue2 = bros.c().intValue();
                if (iIntValue2 < 60790) {
                    dqru.x("conversation_parent_supervision_state", iIntValue2);
                }
                if (iIntValue >= 60790) {
                    if (akbkVarK == null) {
                        bropVar.a.putNull("conversation_parent_supervision_state");
                    } else {
                        bropVar.a.put("conversation_parent_supervision_state", Integer.valueOf(akbkVarK.ordinal()));
                    }
                }
                broq broqVar2 = broqVar;
                bropVar.al();
                bropVar.af(broqVar2);
                bropVar.an(new dqsb("parent_disallowed_conversations", "-updateOrInsert-update"));
                if (bropVar.a().e() != 0) {
                    return true;
                }
                final dqsy dqsyVar = dqsyVarB;
                return Boolean.valueOf(dqru.b(bros.b(), "parent_disallowed_conversations", brnsVar, new Function() { // from class: brnm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dqsyVar.O("parent_disallowed_conversations", (dqst) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: brnn
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }) != -1);
            }
        })).booleanValue();
    }
}
