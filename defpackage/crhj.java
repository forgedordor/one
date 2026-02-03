package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crhj {
    private final fcsu a;

    public crhj(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public static RbmSuggestionData a(bods bodsVar) {
        return new RbmSuggestionData(ConversationSuggestion.createRbmConversationSuggestion(bodsVar.k(), bodsVar.r(), bodsVar.p(), bodsVar.q(), bodsVar.n().b, bodsVar.o().b), bodsVar.m());
    }

    public final void b(final List list, final MessageIdType messageIdType, final boolean z, final long j) {
        eieu eieuVarK = eiiy.k("ConversationSuggestionDatabaseOperations#addConversationSuggestions");
        try {
            cqaz.h();
            if (list != null && !dhic.a(list)) {
                ((dqsn) this.a.b()).d("ConversationSuggestionDatabaseOperations#addConversationSuggestions", new Runnable() { // from class: crgz
                    @Override // java.lang.Runnable
                    public final void run() {
                        List<ConversationSuggestion> list2 = list;
                        final basd basdVarA = basd.a(((ConversationSuggestion) list2.get(0)).getTargetRcsMessageId());
                        if (basd.l(basdVarA)) {
                            String[] strArr = bofr.a;
                            bofg bofgVar = new bofg();
                            bofgVar.f("deleteConversationSuggestionsByRcsMessage");
                            bofgVar.b = new bofp((bofq) new Function() { // from class: crhf
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bofq bofqVar = (bofq) obj;
                                    int iIntValue = bofr.c().intValue();
                                    if (iIntValue < 12000) {
                                        dqru.x("target_rcs_message_id", iIntValue);
                                    }
                                    bofqVar.ap(new dqpj("conversation_suggestions.target_rcs_message_id", 1, basd.d(basdVarA)));
                                    return bofqVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }.apply(new bofq()));
                            bofgVar.d();
                        }
                        for (ConversationSuggestion conversationSuggestion : list2) {
                            boolean z2 = z;
                            long j2 = j;
                            MessageIdType messageIdType2 = messageIdType;
                            String[] strArr2 = bofr.a;
                            bodv bodvVar = new bodv();
                            bodvVar.i(messageIdType2);
                            bodvVar.b(conversationSuggestion.getSuggestionType());
                            bodvVar.e(conversationSuggestion.serializeProperties());
                            bodvVar.c(conversationSuggestion.getPostBackData());
                            bodvVar.d(conversationSuggestion.getPostBackEncoding());
                            bodvVar.f(basd.a(conversationSuggestion.getRcsMessageId()));
                            bodvVar.j(basd.a(conversationSuggestion.getTargetRcsMessageId()));
                            bodvVar.h(j2);
                            bodvVar.g(z2);
                            final bods bodsVarA = bodvVar.a();
                            final dqsy dqsyVarB = bofr.b();
                            dqru.b(bofr.b(), "conversation_suggestions", bodsVarA, new Function() { // from class: bodp
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(dqsyVarB.O("conversation_suggestions", (dqst) obj));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Consumer() { // from class: bodq
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    Long l = (Long) obj;
                                    if (l.longValue() >= 0) {
                                        bods bodsVar = bodsVarA;
                                        bodsVar.a = l.longValue();
                                        bodsVar.fN(0);
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                    }
                });
            }
            eieuVarK.close();
        } finally {
        }
    }
}
