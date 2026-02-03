package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckfo implements bayg {
    public static final eksp a = eksp.c("Bugle");
    public final fcsu b;
    public final cogw c;
    public final fcsu d;
    public final fcsu e;
    public final aquo f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public ckfo(fcsu fcsuVar, cogw cogwVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, aquo aquoVar) {
        this.b = fcsuVar;
        this.c = cogwVar;
        this.g = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.f = aquoVar;
    }

    @Override // defpackage.bayg
    public final eieu a() {
        return eiiy.k("RcsFallbackTrackerManager");
    }

    @Override // defpackage.bayg
    public final void b(MessageCoreData messageCoreData) {
        ejwl.l(!ecem.g());
        eieu eieuVarA = a();
        try {
            bojh bojhVarR = ((bakt) this.g.b()).r(messageCoreData.A());
            if (bojhVarR != null && bojhVarR.k() != 2) {
                ((ckfw) this.e.b()).e(messageCoreData.C());
                final MessageIdType messageIdTypeD = messageCoreData.D();
                ConversationIdType conversationIdTypeA = messageCoreData.A();
                if (messageIdTypeD != null && !messageIdTypeD.c() && conversationIdTypeA != null && !conversationIdTypeA.b()) {
                    final ConversationIdType conversationIdTypeA2 = messageCoreData.A();
                    eieu eieuVarK = eiiy.k("MessageDatabaseOperations#getAllPendingMessagesForOriginalMessageId");
                    try {
                        brdr brdrVarD = MessagesTable.d();
                        brdrVarD.A("getAllPendingMessagesForOriginalMessageId");
                        brdrVarD.h(new Function() { // from class: baul
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                brec brecVar = (brec) obj;
                                cqce cqceVar = baxe.a;
                                brecVar.m(conversationIdTypeA2);
                                brecVar.J(3);
                                int iIntValue = MessagesTable.g().intValue();
                                if (iIntValue < 48030) {
                                    dqru.x("original_message_id", iIntValue);
                                }
                                brecVar.ap(new dqpj("messages.original_message_id", 1, Long.valueOf(bary.a(messageIdTypeD))));
                                return brecVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        Stream streamE = brdrVarD.b().E();
                        try {
                            List list = (List) streamE.map(new bauj()).collect(Collectors.toCollection(new baum()));
                            if (streamE != null) {
                                streamE.close();
                            }
                            eieuVarK.close();
                            Iterable$EL.forEach(list, new Consumer() { // from class: ckfn
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    ((ckfw) this.a.e.b()).e((MessageIdType) obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            ((ckfw) this.e.b()).e(messageIdTypeD);
                        } finally {
                        }
                    } finally {
                    }
                }
            }
            eieuVarA.close();
        } catch (Throwable th) {
            try {
                eieuVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Duration c(ConversationIdType conversationIdType) {
        return ((bakt) this.g.b()).ac(conversationIdType) ? Duration.ofSeconds(((Long) this.i.b()).longValue()) : Duration.ZERO;
    }

    public final void d(MessageCoreData messageCoreData) {
        if (e(messageCoreData)) {
            if (((anpp) this.d.b()).d() && messageCoreData.cY()) {
                return;
            }
            if (this.f.a()) {
                ((ckgi) this.b.b()).c(messageCoreData.C(), this.c.f(), c(messageCoreData.A()));
            } else {
                ((ckgi) this.b.b()).a(messageCoreData.C(), this.c.f());
            }
        }
    }

    public final boolean e(MessageCoreData messageCoreData) {
        bojh bojhVarR = ((bakt) this.g.b()).r(messageCoreData.A());
        return bojhVarR != null && messageCoreData.cX() && bojhVarR.k() == 0 && !bojhVarR.an();
    }
}
