package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amhq implements anpj {
    public final ConversationIdType a;
    private final bbmo b;
    private final amaf c;
    private final fdjx d;
    private final BugleConversationId e;
    private final bbmn f;

    public amhq(bbmo bbmoVar, amaf amafVar, fdjx fdjxVar, BugleConversationId bugleConversationId) {
        this.b = bbmoVar;
        this.c = amafVar;
        this.d = fdjxVar;
        this.e = bugleConversationId;
        this.a = bugleConversationId.a;
        cmcm cmcmVarB = ScheduledSendTable.b();
        cmbx cmbxVar = ScheduledSendTable.c;
        cmcmVarB.c(cmbxVar.a);
        cmcmVarB.e(new Function() { // from class: amhn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cmcs cmcsVar = (cmcs) obj;
                cmcsVar.d(cmct.SCHEDULED);
                cmcsVar.ap(new dqpj("scheduled_send.conversation_id", 1, Long.valueOf(barn.a(this.a.a))));
                return cmcsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdr brdrVarD = MessagesTable.d();
        bran branVar = MessagesTable.c;
        brdrVarD.c(branVar.a);
        cmcmVarB.H(dqts.i(brdrVarD.b(), branVar.a, cmbxVar.b).g());
        this.f = bbmoVar.a(cmcmVarB.b(), "BugleMessageRespository.ScheduledMessagesQuery");
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.f.f(new cqtk() { // from class: amho
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "ScheduledMessageObservableSupplier::register", "ScheduledMessageObservableSupplier::callback", "ScheduledMessageObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new amhp(this, null));
    }

    @Override // defpackage.anpj
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ekgb c() {
        dqxe dqxeVar = cmax.a;
        cmap cmapVarA = cmas.a();
        cmapVarA.A("getScheduledMessagesForConversation1");
        final ConversationIdType conversationIdType = this.a;
        cmapVarA.c(new Function() { // from class: cmau
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cmar cmarVar = (cmar) obj;
                dqxe dqxeVar2 = cmax.a;
                cmarVar.ap(new dqpj("scheduled_send.conversation_id", 1, Long.valueOf(barn.a(conversationIdType))));
                return cmarVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cmapVarA.c(new Function() { // from class: cmav
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cmar cmarVar = (cmar) obj;
                dqxe dqxeVar2 = cmax.a;
                cmct cmctVar = cmct.SENDING;
                cmarVar.ap(new dqty("scheduled_send.status", 2, Integer.valueOf(cmctVar == null ? 0 : cmctVar.ordinal())));
                return cmarVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cmai cmaiVar = cmas.b;
        cmapVarA.D((String) DesugarArrays.stream(new cmam[]{new cmam(cmaiVar.a), new cmam(cmaiVar.b)}).map(new Function() { // from class: cmao
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cmam) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        ekgb<clpq> ekgbVarZ = cmapVarA.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        for (clpq clpqVar : ekgbVarZ) {
            amaf amafVar = this.c;
            BugleConversationId bugleConversationId = this.e;
            amtw amtwVar = (amtw) amafVar.a.b();
            amtwVar.getClass();
            clpqVar.getClass();
            arrayList.add(new amae(amtwVar, bugleConversationId, clpqVar));
        }
        return ekfv.a(arrayList);
    }
}
