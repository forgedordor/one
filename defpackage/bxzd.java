package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.DesugarArrays;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxzd extends dqpi {
    public static final /* synthetic */ int c = 0;
    public final Consumer a;
    public final List b = new ArrayList();
    private final dqsn d;

    public bxzd(dqsn dqsnVar, Consumer consumer) {
        this.d = dqsnVar;
        this.a = consumer;
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        final bqrm bqrmVar = (bqrm) dqsdVar.b();
        if (bqrmVar != null) {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("MessageStarChangeQueryListener#onChangeInTransaction1");
            brdrVarD.e(new Function() { // from class: bxyw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = bxzd.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.h(new Function() { // from class: bxyx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    int i = bxzd.c;
                    brecVar.p(bqrmVar.k());
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brap brapVar = (brap) brdrVarD.b().p();
            while (brapVar.moveToNext()) {
                try {
                    MessagesTable.BindData bindData = (MessagesTable.BindData) brapVar.cQ();
                    List list = this.b;
                    ajle ajleVar = ajle.UPDATE;
                    CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bqrmVar.k(), -1L);
                    ConversationIdType conversationIdTypeD = bindData.D();
                    conversationIdTypeD.getClass();
                    list.add(new anap(ajleVar, coreBugleMessageId, new BugleConversationId(conversationIdTypeD), Instant.ofEpochMilli(bindData.w()), 0));
                } finally {
                }
            }
            brapVar.close();
        }
        final bqrm[] bqrmVarArr = (bqrm[]) dqsdVar.a();
        if (bqrmVarArr != null) {
            brdr brdrVarD2 = MessagesTable.d();
            brdrVarD2.A("MessageStarChangeQueryListener#onChangeInTransaction2");
            brdrVarD2.e(new Function() { // from class: bxyy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = bxzd.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD2.h(new Function() { // from class: bxyz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    int i = bxzd.c;
                    brecVar.t((Iterable) DesugarArrays.stream(bqrmVarArr).map(new Function() { // from class: bxyv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            int i2 = bxzd.c;
                            return ((bqrm) obj2).k();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(ekcv.b));
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD2.b().E().forEach(new Consumer() { // from class: bxza
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    MessagesTable.BindData bindData2 = (MessagesTable.BindData) obj;
                    ajle ajleVar2 = ajle.UPDATE;
                    CoreBugleMessageId coreBugleMessageId2 = new CoreBugleMessageId(bindData2.E(), -1L);
                    ConversationIdType conversationIdTypeD2 = bindData2.D();
                    conversationIdTypeD2.getClass();
                    this.a.b.add(new anap(ajleVar2, coreBugleMessageId2, new BugleConversationId(conversationIdTypeD2), Instant.ofEpochMilli(bindData2.w()), 0));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        List list2 = this.b;
        if (list2.isEmpty()) {
            return;
        }
        final ekgb ekgbVarN = ekgb.n(list2);
        this.d.g(new dqsm() { // from class: bxzb
            @Override // defpackage.dqsm
            public final eieu a() {
                int i = bxzd.c;
                return eiiy.k("MSCQL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(ekgbVarN.hashCode()), new Runnable() { // from class: bxzc
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.z(ekgbVarN);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void c(dqwl dqwlVar, dqsd dqsdVar) {
        List list = this.b;
        list.clear();
        dqyj dqyjVarD = dqsdVar.d();
        if (dqyjVarD != null) {
            String[] strArr = bqsm.a;
            bqsh bqshVar = new bqsh(bqsm.a);
            bqshVar.A("MessageStarChangeQueryListener#preChangeInTransaction");
            bqshVar.d(new Function() { // from class: bxyt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bqrv bqrvVar = (bqrv) obj;
                    int i = bxzd.c;
                    return new bqrw[]{bqrvVar.a, bqrvVar.b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.e(new Function() { // from class: bxyu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = bxzd.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bqshVar.H(dqts.i(brdrVarD.b(), MessagesTable.c.a, bqsm.c.b).g());
            bqshVar.k((bqsk) dqyjVarD);
            bqrx bqrxVar = (bqrx) bqshVar.b().p();
            while (bqrxVar.moveToNext()) {
                try {
                    ekgb ekgbVarP = ekgb.p((MessagesTable.BindData[]) ((bqrm) bqrxVar.cQ()).aH("messages", new MessagesTable.BindData[0]));
                    if (!ekgbVarP.isEmpty()) {
                        ajle ajleVar = ajle.UPDATE;
                        CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(((MessagesTable.BindData) ekgbVarP.get(0)).E(), -1L);
                        ConversationIdType conversationIdTypeD = ((MessagesTable.BindData) ekgbVarP.get(0)).D();
                        conversationIdTypeD.getClass();
                        list.add(new anap(ajleVar, coreBugleMessageId, new BugleConversationId(conversationIdTypeD), Instant.ofEpochMilli(((MessagesTable.BindData) ekgbVarP.get(0)).w()), 0));
                    }
                } finally {
                }
            }
            bqrxVar.close();
        }
    }
}
