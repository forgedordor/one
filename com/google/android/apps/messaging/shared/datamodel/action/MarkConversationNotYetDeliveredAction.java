package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.MarkConversationNotYetDeliveredAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import defpackage.ains;
import defpackage.axse;
import defpackage.axsf;
import defpackage.axtl;
import defpackage.basd;
import defpackage.baxf;
import defpackage.chwp;
import defpackage.chwq;
import defpackage.cqaz;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.dqsl;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class MarkConversationNotYetDeliveredAction extends Action<Void> {
    public final fcsu b;
    public final fcsu c;
    public final ains d;
    public final baxf e;
    private final chwq f;
    private final dqsn g;
    public static final cqce a = cqce.g("BugleDataModel", "MarkConversationNotYetDeliveredAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axse();

    /* compiled from: PG */
    public interface a {
        axsf hP();
    }

    public MarkConversationNotYetDeliveredAction(fcsu fcsuVar, fcsu fcsuVar2, chwq chwqVar, ains ainsVar, dqsn dqsnVar, baxf baxfVar, Parcel parcel) {
        super(parcel, elgm.MARK_CONVERSATION_NOT_YET_DELIVERED_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.f = chwqVar;
        this.d = ainsVar;
        this.g = dqsnVar;
        this.e = baxfVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("MarkConversationNotYetDeliveredAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        eieu eieuVarK = eiiy.k("MarkConversationNotYetDeliveredAction.executeAction");
        try {
            final basd basdVarB = basd.b(this.v.f(), "rcs_message_id");
            final chwp chwpVarI = this.f.i(basdVarB);
            if (chwpVarI == chwp.NONE) {
                a.q("client side fallback is disabled.");
            } else {
                int iIntValue = ((Integer) this.g.a("MarkConversationNotYetDeliveredAction#executeAction", new dqsl() { // from class: axsd
                    @Override // defpackage.dqsl
                    public final Object a(byeu byeuVar) {
                        MarkConversationNotYetDeliveredAction markConversationNotYetDeliveredAction = this.a;
                        fcsu fcsuVar = markConversationNotYetDeliveredAction.c;
                        baxe baxeVar = (baxe) fcsuVar.b();
                        basd basdVar = basdVarB;
                        MessageCoreData messageCoreDataX = baxeVar.x(basdVar);
                        int i = 0;
                        if (messageCoreDataX == null) {
                            cqbd cqbdVarE = MarkConversationNotYetDeliveredAction.a.e();
                            cqbdVarE.I("rcs");
                            cqbdVarE.h(basdVar);
                            cqbdVarE.I("missing cant mark NotDelivered.");
                            cqbdVarE.r();
                            byeuVar.a(0);
                            throw new IllegalStateException();
                        }
                        fcsu fcsuVar2 = markConversationNotYetDeliveredAction.b;
                        final ConversationIdType conversationIdTypeA = messageCoreDataX.A();
                        if (((bakt) fcsuVar2.b()).ad(conversationIdTypeA)) {
                            cqbd cqbdVarA = MarkConversationNotYetDeliveredAction.a.a();
                            cqbdVarA.I("Skipping client side fallback for RBM.");
                            cqbdVarA.c(conversationIdTypeA);
                            cqbdVarA.r();
                            byeuVar.a(0);
                        }
                        chwp chwpVar = chwpVarI;
                        ains ainsVar = markConversationNotYetDeliveredAction.d;
                        long j = chwpVar.e;
                        ainsVar.g("Bugle.Rcs.Chat.Message.NotYetDelivered.Counts", j);
                        if (markConversationNotYetDeliveredAction.v.y("rcs_offline")) {
                            ainsVar.g("Bugle.Rcs.Chat.Message.NotYetDelivered.Offline.Counts", j);
                        }
                        final baxe baxeVar2 = (baxe) fcsuVar.b();
                        final long jR = messageCoreDataX.r();
                        eieu eieuVarK2 = eiiy.k("MessageDatabaseOperations#getUndeliveredRcsMessages");
                        try {
                            brdr brdrVarD = MessagesTable.d();
                            brdrVarD.A("getUndeliveredRcsMessages");
                            brdrVarD.h(new Function() { // from class: bavp
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    brec brecVar = (brec) obj;
                                    cqce cqceVar = baxe.a;
                                    brecVar.m(conversationIdTypeA);
                                    brecVar.J(3);
                                    brecVar.ae(1);
                                    brecVar.Z(jR);
                                    return brecVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            brdrVarD.d(new brdo(MessagesTable.c.i, true));
                            Stream streamE = brdrVarD.b().E();
                            try {
                                List<MessageCoreData> list = (List) streamE.map(new Function() { // from class: bavq
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        baxe baxeVar3 = baxeVar2;
                                        MessageCoreData messageCoreDataA = ((bveg) baxeVar3.e.b()).a();
                                        messageCoreDataA.aN((MessagesTable.BindData) obj);
                                        ((bbae) baxeVar3.f.b()).c(messageCoreDataA, false);
                                        return messageCoreDataA;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(Collectors.toCollection(new baum()));
                                if (streamE != null) {
                                    streamE.close();
                                }
                                eieuVarK2.close();
                                for (MessageCoreData messageCoreData : list) {
                                    markConversationNotYetDeliveredAction.e.a(messageCoreData, -1);
                                    if (messageCoreData.cB()) {
                                        ((baxe) markConversationNotYetDeliveredAction.c.b()).Z(messageCoreData.A(), messageCoreData.C());
                                    } else if (chwpVar.ordinal() == 1) {
                                        ((baxe) markConversationNotYetDeliveredAction.c.b()).Z(messageCoreData.A(), messageCoreData.C());
                                    }
                                    i++;
                                }
                                return Integer.valueOf(i);
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                eieuVarK2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                })).intValue();
                cqbd cqbdVarA = a.a();
                cqbdVarA.I("MarkConversationNotYetDeliveredAction client side fallback enabled for");
                cqbdVarA.G(iIntValue);
                cqbdVarA.I("messages.");
                cqbdVarA.h(basdVarB);
                cqbdVarA.A("fallbackMode", chwpVarI);
                cqbdVarA.r();
                if (iIntValue > 0) {
                    axtl.d(7, this);
                }
            }
            eieuVarK.close();
            return null;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.MarkConversationNotYetDelivered.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public MarkConversationNotYetDeliveredAction(fcsu fcsuVar, fcsu fcsuVar2, chwq chwqVar, ains ainsVar, dqsn dqsnVar, baxf baxfVar, basd basdVar, boolean z) {
        super(elgm.MARK_CONVERSATION_NOT_YET_DELIVERED_ACTION);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.f = chwqVar;
        this.d = ainsVar;
        this.g = dqsnVar;
        this.e = baxfVar;
        cqaz.l(basdVar);
        basd.h(this.v.f(), "rcs_message_id", basdVar);
        this.v.p("rcs_offline", z);
    }
}
