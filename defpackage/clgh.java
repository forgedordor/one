package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clgh implements bayb {
    public static final eksp a = eksp.c("BugleReplies");
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;
    private final bxlc e;
    private final fcsu f;
    private final fcsu g;
    private final aryv h;

    public clgh(fdjx fdjxVar, bxlc bxlcVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, aryv aryvVar, fcsu fcsuVar5) {
        fdjxVar.getClass();
        bxlcVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.d = fdjxVar;
        this.e = bxlcVar;
        this.f = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.g = fcsuVar4;
        this.h = aryvVar;
    }

    private static final MessageIdType a(basd basdVar, brec brecVar) throws IOException {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("RepliesOnRcsMessageReceiverListener#queryMessageId");
        brdrVarD.c(MessagesTable.c.a);
        brecVar.A(false);
        brdrVarD.g(brecVar);
        brdrVarD.y(1);
        dqqj dqqjVarP = brdrVarD.b().p();
        try {
            brap brapVar = (brap) dqqjVarP;
            if (brapVar.moveToFirst()) {
                MessageIdType messageIdTypeQ = brapVar.q();
                fczl.a(dqqjVarP, null);
                return messageIdTypeQ;
            }
            MessageIdType messageIdTypeA = ckee.a(basdVar);
            fczl.a(dqqjVarP, null);
            return messageIdTypeA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(dqqjVarP, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bayb
    public final void d(final MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        auvw.k(this.d, null, null, new clgg(this, messageCoreData, null), 3);
        String[] strArr = bqmc.a;
        bqlz bqlzVar = new bqlz();
        bqlzVar.ap("linkMissingRepliesToMessage");
        bqlzVar.af(new bqma((bqmb) new Function() { // from class: clgf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqmb bqmbVar = (bqmb) obj;
                eksp ekspVar = clgh.a;
                ahqp ahqpVar = ahqp.REPLIED_TO_MESSAGE_NOT_FOUND;
                int iA = ahqpVar == null ? 0 : ahqpVar.a();
                MessageCoreData messageCoreData2 = messageCoreData;
                bqmbVar.ap(new dqty("message_replies.replied_to_message_id_null_reason", 1, Integer.valueOf(iA)));
                bqmbVar.ap(new dqpj("message_replies.replied_to_rcs_message_id", 1, basd.d(messageCoreData2.F())));
                return bqmbVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bqmb())));
        bqlzVar.c(messageCoreData.C());
        ContentValues contentValues = bqlzVar.a;
        contentValues.putNull("replied_to_rcs_message_id");
        contentValues.putNull("replied_to_message_id_null_reason");
        final bqly bqlyVarA = bqlzVar.b();
        final int i = 0;
        ekgb ekgbVar = (ekgb) bqmc.a().p("message_replies.updateAndReturnUpdatedRows-txn", new ejxr() { // from class: bqlx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejxr
            public final Object get() {
                String[] strArr2 = bqmc.a;
                bqlw bqlwVar = new bqlw(bqmc.a);
                bqlwVar.A("message_replies.updateAndReturnUpdatedRows-query");
                bqly bqlyVar = bqlyVarA;
                ekgb ekgbVar2 = bqlyVar.e;
                int i2 = ((ekoe) ekgbVar2).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    bqlwVar.k((bqma) ((dqyj) ekgbVar2.get(i3)));
                }
                dqpb dqpbVar = (dqpb) bqlyVar.d;
                if (dqpbVar.b) {
                    bqmb bqmbVar = new bqmb();
                    bqmbVar.ar(bqlyVar.h());
                    bqlwVar.k(new bqma(bqmbVar));
                }
                if (dqpbVar.c) {
                    bqlwVar.s();
                }
                Integer num = i;
                ekgb ekgbVarZ = bqlwVar.b().z();
                num.intValue();
                bqlyVar.t(0);
                return ekgbVarZ;
            }
        });
        if (ekgbVar.isEmpty()) {
            return;
        }
        eksl ekslVar = (eksl) a.h();
        ekrz ekrzVar = ahrb.a;
        ekslVar.X(ahrb.c, messageCoreData.C().b());
        ekslVar.X(ahrb.d, messageCoreData.F().f());
        ekslVar.r("Linked %d previous replies to the received message.", ekgbVar.size());
        bxlc bxlcVar = this.e;
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        ekgbVar.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        Iterator<E> it = ekgbVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((bqks) it.next()).m());
        }
        bxlcVar.m(conversationIdTypeA, arrayList, new String[0]);
        if (((eoth) ((aryt) this.h).a.b()).a("bugle.log_out_of_order_event_for_replies")) {
            basd basdVarF = messageCoreData.F();
            basdVarF.getClass();
            ekqh it2 = ekgbVar.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                MessagesTable.BindData bindDataB = MessagesTable.b(((bqks) it2.next()).m());
                basd basdVarI = bindDataB != null ? bindDataB.I() : null;
                if (basdVarI != null) {
                    ailn ailnVarA = ((aimb) this.g.b()).a();
                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                    ellf ellfVar = ellf.OUT_OF_ORDER_RCS_MESSAGE_DELIVERY;
                    ellgVar.copyOnWrite();
                    ellh ellhVar = (ellh) ellgVar.instance;
                    ellhVar.j = ellfVar.f11do;
                    ellhVar.b |= 1;
                    enwa enwaVar = (enwa) enwc.a.createBuilder();
                    enwaVar.getClass();
                    enwaVar.copyOnWrite();
                    enwc enwcVar = (enwc) enwaVar.instance;
                    enwcVar.c = 1;
                    enwcVar.b = 1 | enwcVar.b;
                    String strF = basdVarI.f();
                    enwaVar.copyOnWrite();
                    enwc enwcVar2 = (enwc) enwaVar.instance;
                    enwcVar2.b |= 2;
                    enwcVar2.d = strF;
                    String strF2 = basdVarF.f();
                    enwaVar.copyOnWrite();
                    enwc enwcVar3 = (enwc) enwaVar.instance;
                    enwcVar3.b |= 4;
                    enwcVar3.e = strF2;
                    evsn evsnVarBuild = enwaVar.build();
                    evsnVarBuild.getClass();
                    ellgVar.copyOnWrite();
                    ellh ellhVar2 = (ellh) ellgVar.instance;
                    ellhVar2.cz = (enwc) evsnVarBuild;
                    ellhVar2.i |= 64;
                    ailnVarA.j(ellgVar, aioj.LOG_SPEC_MISSING_RCS_MESSAGE_DEBUG_EVENT);
                }
            }
        }
        ((ains) this.f.b()).d("Bugle.MessageReplies.Rcs.Received.MissingRepliedToLinked.Count", ekgbVar.size());
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final void k(MessageCoreData messageCoreData) throws IOException {
        messageCoreData.getClass();
        eyga eygaVarAc = messageCoreData.ac();
        basd basdVarA = eygaVarAc != null ? clgb.a(eygaVarAc) : basd.a;
        if (basdVarA.i()) {
            ekrw ekrwVarN = a.n();
            ekrwVarN.X(cqnc.b, messageCoreData.C());
            ekrwVarN.q("Message is not a reply, replied-to RCS message id is empty.");
            return;
        }
        String[] strArr = MessagesTable.a;
        brec brecVar = new brec();
        brecVar.F(basdVarA);
        MessageIdType messageIdTypeA = a(basdVarA, brecVar);
        if (messageIdTypeA.c()) {
            brec brecVar2 = new brec();
            brecVar2.N(basdVarA);
            messageIdTypeA = a(basdVarA, brecVar2);
        }
        if (messageIdTypeA.c()) {
            eksl ekslVar = (eksl) a.h();
            ekrz ekrzVar = ahrb.a;
            ekslVar.X(ahrb.a, messageCoreData.C().b());
            ekslVar.X(ahrb.d, basdVarA.f());
            ekslVar.q("Processing reply to a missing message.");
            String[] strArr2 = bqmc.a;
            bqkx bqkxVar = new bqkx();
            bqkxVar.d(messageCoreData.C());
            bqkxVar.g(basdVarA);
            bqkxVar.f(ahqp.REPLIED_TO_MESSAGE_NOT_FOUND);
            bqkxVar.c();
            ((ains) this.f.b()).c("Bugle.MessageReplies.Rcs.Received.MissingRepliedTo.Count");
            return;
        }
        ekrw ekrwVarN2 = a.n();
        ekrz ekrzVar2 = ahrb.a;
        ekrwVarN2.X(ahrb.a, messageCoreData.C().b());
        ekrwVarN2.X(ahrb.c, messageIdTypeA.b());
        ekrwVarN2.q("Processing reply.");
        String[] strArr3 = bqmc.a;
        bqkx bqkxVar2 = new bqkx();
        bqkxVar2.d(messageCoreData.C());
        bqkxVar2.e(messageIdTypeA);
        bqkxVar2.c();
        messageCoreData.bN(clfx.a(messageIdTypeA));
        ((ains) this.f.b()).c("Bugle.MessageReplies.Rcs.Received.Success.Count");
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
