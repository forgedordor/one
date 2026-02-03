package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amfa extends dqpi {
    public static final /* synthetic */ int b = 0;
    public final Consumer a;
    private final dqsn c;
    private final List d = new ArrayList();

    public amfa(dqsn dqsnVar, Consumer consumer) {
        this.c = dqsnVar;
        this.a = consumer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void f(dqyd dqydVar, List list) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("MessageChangeQueryListener#preChangeInTransaction-messages1");
        brdrVarD.e(new Function() { // from class: ameu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bran branVar = (bran) obj;
                int i = amfa.b;
                return new brao[]{branVar.a, branVar.b, branVar.G, branVar.i};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekqh it = dqydVar.e.iterator();
        while (it.hasNext()) {
            brdrVarD.k((brdv) ((dqyj) it.next()));
        }
        brdt brdtVar = (brdt) dqydVar;
        int iA = 0;
        if (((Boolean) ames.e.e()).booleanValue() && brdtVar.n("message_status")) {
            iA = brdtVar.a();
        }
        int i = iA;
        brap brapVar = (brap) brdrVarD.b().p();
        while (brapVar.moveToNext()) {
            try {
                brdt brdtVar2 = (brdt) dqydVar;
                if (!(brdtVar2.n("is_hidden") ? brdtVar2.a.getAsBoolean("is_hidden").booleanValue() : brapVar.L())) {
                    list.add(new anap(ajle.UPDATE, new CoreBugleMessageId(brapVar.q(), -1L), new BugleConversationId(brapVar.p()), Instant.ofEpochMilli(brapVar.l()), i));
                }
            } finally {
            }
        }
        brapVar.close();
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        MessagesTable.BindData bindData = (MessagesTable.BindData) dqsdVar.b();
        if (bindData != null && !bindData.ag() && (!((Boolean) ames.c.e()).booleanValue() || bindData.s() != 4)) {
            List list = this.d;
            ajle ajleVar = ajle.INSERT;
            CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.E(), -1L);
            ConversationIdType conversationIdTypeD = bindData.D();
            conversationIdTypeD.getClass();
            list.add(new anap(ajleVar, coreBugleMessageId, new BugleConversationId(conversationIdTypeD), Instant.ofEpochMilli(bindData.w()), 0));
        }
        MessagesTable.BindData[] bindDataArr = (MessagesTable.BindData[]) dqsdVar.a();
        if (bindDataArr != null) {
            for (MessagesTable.BindData bindData2 : bindDataArr) {
                if (!bindData2.ag() && !bindData2.E().c()) {
                    List list2 = this.d;
                    ajle ajleVar2 = ajle.INSERT;
                    CoreBugleMessageId coreBugleMessageId2 = new CoreBugleMessageId(bindData2.E(), -1L);
                    ConversationIdType conversationIdTypeD2 = bindData2.D();
                    conversationIdTypeD2.getClass();
                    list2.add(new anap(ajleVar2, coreBugleMessageId2, new BugleConversationId(conversationIdTypeD2), Instant.ofEpochMilli(bindData2.w()), 0));
                }
            }
        }
        dqyd dqydVarC = dqsdVar.c();
        if (dqydVarC != null) {
            ArrayList arrayList = new ArrayList();
            f(dqydVarC, arrayList);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                final ajmf ajmfVar = (ajmf) arrayList.get(i);
                List list3 = this.d;
                if (Collection.EL.stream(list3).anyMatch(new Predicate() { // from class: amev
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        ajmf ajmfVar2 = (ajmf) obj;
                        int i2 = amfa.b;
                        MessageId messageIdB = ajmfVar2.b();
                        ajmf ajmfVar3 = ajmfVar;
                        return messageIdB.equals(ajmfVar3.b()) && !ajmfVar2.c().equals(ajmfVar3.c());
                    }
                })) {
                    list3.add(ajmfVar);
                }
            }
        }
        List list4 = this.d;
        if (list4.isEmpty()) {
            return;
        }
        final ekgb ekgbVarN = ekgb.n(list4);
        this.c.g(new dqsm() { // from class: amew
            @Override // defpackage.dqsm
            public final eieu a() {
                int i2 = amfa.b;
                return eiiy.k("MCQL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(ekgbVarN.hashCode()), new Runnable() { // from class: amex
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.z(ekgbVarN);
            }
        });
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void c(dqwl dqwlVar, dqsd dqsdVar) {
        List list = this.d;
        list.clear();
        dqyd dqydVarC = dqsdVar.c();
        if (dqydVarC != null) {
            f(dqydVarC, list);
        }
        dqyj dqyjVarD = dqsdVar.d();
        if (dqyjVarD != null) {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("+MessageChangeQueryListener#preChangeInTransaction-messages2");
            brdrVarD.e(new Function() { // from class: amey
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = amfa.b;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.k((brdv) dqyjVarD);
            brdrVarD.h(new Function() { // from class: amez
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    int i = amfa.b;
                    brecVar.A(false);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.s();
            brap brapVar = (brap) brdrVarD.b().p();
            while (brapVar.moveToNext()) {
                try {
                    list.add(new anap(ajle.DELETE, new CoreBugleMessageId(brapVar.q(), -1L), new BugleConversationId(brapVar.p()), Instant.ofEpochMilli(brapVar.l()), 0));
                } finally {
                }
            }
            brapVar.close();
        }
    }
}
