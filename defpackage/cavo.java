package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionsJsonParser;
import com.google.android.ims.rcsservice.chatsession.message.RichCardParser;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cavo extends cayv {
    public static final cczv a = cdag.h(cdag.b, "enable_rbm_welcome_message_rich_cards", false);
    public static final cqce b = cqce.g("Bugle", "RbmChatbotDirectoryWelcomeMessageHandler");
    public final bveg c;
    public final ayfx d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final cogw k;
    private final fcsu l;
    private final dqsn m;

    public cavo(bveg bvegVar, ayfx ayfxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, dqsn dqsnVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, cogw cogwVar) {
        this.c = bvegVar;
        this.d = ayfxVar;
        this.l = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.m = dqsnVar;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
        this.k = cogwVar;
    }

    private static eiju k() {
        return eijx.e(cbcw.i());
    }

    private static eiju l() {
        return eijx.e(cbcw.k());
    }

    private final void m(final String str, final String str2, final ConversationIdType conversationIdType, final String str3, final boolean z, final List list) {
        this.m.d("RbmChatbotDirectoryWelcomeMessageHandler#createMessage", new Runnable() { // from class: cavm
            @Override // java.lang.Runnable
            public final void run() {
                cavo cavoVar = this.a;
                axcy axcyVarG = ((chwq) cavoVar.i.b()).g();
                fcsu fcsuVar = cavoVar.j;
                final basd basdVarA = ((auau) fcsuVar.b()).a();
                long epochMilli = cavoVar.k.f().toEpochMilli();
                SelfIdentityId selfIdentityIdF = axcyVarG.f();
                String str4 = str3;
                boolean z2 = z;
                String str5 = true != z2 ? str4 : null;
                bveg bvegVar = cavoVar.c;
                ConversationIdType conversationIdType2 = conversationIdType;
                String str6 = str2;
                MessageCoreData messageCoreDataS = bvegVar.s(basdVarA, str6, selfIdentityIdF, conversationIdType2, 100, 3, str5, true, true, epochMilli, epochMilli);
                cqce cqceVar = cavo.b;
                cqbd cqbdVarC = cqceVar.c();
                cqbdVarC.I("Creating RCS message for Welcome Message");
                cqbdVarC.A("botId", str);
                cqbdVarC.f(str6);
                cqbdVarC.c(conversationIdType2);
                cqbdVarC.h(basdVarA);
                cqbdVarC.r();
                if (z2) {
                    cqceVar.p("Adding rich card parts for Welcome Message...");
                    cavoVar.d.a(str4, messageCoreDataS, true);
                }
                MessageIdType messageIdTypeA = ((bauh) cavoVar.e.b()).a(messageCoreDataS);
                if (messageIdTypeA.c()) {
                    cqceVar.r("Unable to persist Welcome Message");
                    return;
                }
                List list2 = list;
                cqbd cqbdVarC2 = cqceVar.c();
                cqbdVarC2.I("Created rich card parts for Welcome Message");
                cqbdVarC2.A("messageRowId", messageIdTypeA);
                cqbdVarC2.r();
                if (!list2.isEmpty()) {
                    cqbd cqbdVarC3 = cqceVar.c();
                    cqbdVarC3.I("Adding suggestions");
                    cqbdVarC3.y("count", list2.size());
                    cqbdVarC3.r();
                    final basd basdVarA2 = ((auau) fcsuVar.b()).a();
                    Collection.EL.stream(list2).forEach(new Consumer() { // from class: cavn
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ConversationSuggestion conversationSuggestion = (ConversationSuggestion) obj;
                            cczv cczvVar = cavo.a;
                            conversationSuggestion.setRcsMessageId(basdVarA2.f());
                            conversationSuggestion.setTargetRcsMessageId(basdVarA.f());
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    ((crhj) cavoVar.f.b()).b(list2, messageIdTypeA, true, epochMilli);
                }
                ((bxlc) cavoVar.h.b()).k(conversationIdType2);
                ((egzh) cavoVar.g.b()).b(eijx.e(conversationIdType2), "latest_message");
            }
        });
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RbmChatbotDirectoryWelcomeMessageHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cavq.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        eiju eijuVarL;
        cavq cavqVar = (cavq) evuhVar;
        Uri uri = Uri.parse(cavqVar.b);
        String strB = ejwk.b(uri.getQueryParameter("welcome_message_content"));
        String strB2 = ejwk.b(uri.getQueryParameter("welcome_message_type"));
        String queryParameter = uri.getQueryParameter("suggestions");
        ConversationIdType conversationIdTypeB = barn.b(cavqVar.c);
        String str = cavqVar.d;
        eieu eieuVarK = eiiy.k("RbmChatbotDirectoryWelcomeMessageHandler#processPendingWorkItemAsync");
        try {
            if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(strB2)) {
                b.p("There is no Welcome Message data in intent URI.");
            } else if (!RbmSpecificMessage.CONTENT_TYPE.equals(strB2) && !"text/plain".equals(strB2)) {
                cqbd cqbdVarE = b.e();
                cqbdVarE.I("Unrecognized content type");
                cqbdVarE.A("welcomeMessageContentType", strB2);
                cqbdVarE.r();
            } else {
                if (baxe.a(conversationIdTypeB) <= 0) {
                    ParticipantsTable.BindData bindDataC = ((bbca) this.l.b()).c(str);
                    if (bindDataC == null) {
                        cqbd cqbdVarE2 = b.e();
                        cqbdVarE2.I("Participant wasn't found in database, skipping Welcome Message");
                        cqbdVarE2.A("botId", str);
                        cqbdVarE2.A("conversationId", conversationIdTypeB);
                        cqbdVarE2.r();
                        eijuVarL = l();
                    } else {
                        int i = ekgb.d;
                        List list = ekoe.a;
                        if (queryParameter != null && !queryParameter.isEmpty()) {
                            list = new ConversationSuggestionsJsonParser().parse(new String(Base64.decode(queryParameter, 0), StandardCharsets.UTF_8));
                            cqbd cqbdVarC = b.c();
                            cqbdVarC.I("Adding suggestions");
                            cqbdVarC.y("number", list.size());
                            cqbdVarC.r();
                        }
                        List list2 = list;
                        if ("text/plain".equals(strB2)) {
                            m(str, bindDataC.R(), conversationIdTypeB, strB, false, list2);
                            eijuVarL = k();
                        } else if (((Boolean) a.e()).booleanValue()) {
                            String str2 = new String(Base64.decode(strB, 0), StandardCharsets.UTF_8);
                            if (new RichCardParser(str2, false).parse() == null) {
                                cqbd cqbdVarE3 = b.e();
                                cqbdVarE3.I("Unable to parse JSON for Welcome Message:");
                                cqbdVarE3.M("richCard", str2);
                                cqbdVarE3.M("content", strB);
                                cqbdVarE3.r();
                                eijuVarL = l();
                            } else {
                                m(str, bindDataC.R(), conversationIdTypeB, str2, true, list2);
                                eijuVarL = k();
                            }
                        } else {
                            b.p("Rich cards are not enabled for Welcome Message");
                            eijuVarL = l();
                        }
                    }
                    eieuVarK.close();
                    return eijuVarL;
                }
                cqbd cqbdVarC2 = b.c();
                cqbdVarC2.I("There are messages in conversation, not inserting Welcome Message");
                cqbdVarC2.A("conversationId", conversationIdTypeB);
                cqbdVarC2.r();
            }
            eijuVarL = l();
            eieuVarK.close();
            return eijuVarL;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
