package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anjx extends dqpi {
    public static final /* synthetic */ int b = 0;
    public final fdap a;
    private final dqsn c;

    public anjx(dqsn dqsnVar, fdap fdapVar) {
        this.c = dqsnVar;
        this.a = fdapVar;
    }

    private static final void f(brdr brdrVar, final dqxe dqxeVar, anjw anjwVar) throws IOException {
        brdrVar.e(new Function() { // from class: anjq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bran branVar = (bran) obj;
                int i = anjx.b;
                return new brao[]{branVar.a, branVar.b, branVar.i};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVar.h(new Function() { // from class: anjr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                int i = anjx.b;
                brecVar.A(false);
                brecVar.s(dqxeVar);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dqqj dqqjVarP = brdrVar.b().p();
        try {
            brap brapVar = (brap) dqqjVarP;
            while (brapVar.moveToNext()) {
                Set set = anjwVar.a;
                CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(brapVar.q(), -1L);
                BugleConversationId bugleConversationId = new BugleConversationId(brapVar.p());
                Instant instantOfEpochMilli = Instant.ofEpochMilli(brapVar.l());
                instantOfEpochMilli.getClass();
                set.add(new anip(coreBugleMessageId, bugleConversationId, instantOfEpochMilli));
            }
            fczl.a(dqqjVarP, null);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqpi
    public final /* synthetic */ Object d(dqwl dqwlVar, dqsd dqsdVar) throws IOException {
        anjw anjwVar = new anjw(null);
        dqyd dqydVarC = dqsdVar.c();
        if (dqydVarC != null) {
            String[] strArr = bqmc.a;
            bqlw bqlwVar = new bqlw(bqmc.a);
            bqlwVar.d(new Function() { // from class: anjs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = anjx.b;
                    return ((bqli) obj).b;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekqh it = dqydVarC.e.iterator();
            while (it.hasNext()) {
                dqyj dqyjVar = (dqyj) it.next();
                dqyjVar.getClass();
                bqlwVar.k((bqma) dqyjVar);
            }
            bqlv bqlvVarB = bqlwVar.b();
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("RepliesChangeQueryListener#preChangeInTransaction-messages1");
            f(brdrVarD, bqlvVarB, anjwVar);
        }
        dqyj dqyjVarD = dqsdVar.d();
        if (dqyjVarD != null) {
            String[] strArr2 = bqmc.a;
            bqlw bqlwVar2 = new bqlw(bqmc.a);
            bqlwVar2.d(new Function() { // from class: anjt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = anjx.b;
                    return ((bqli) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bqlwVar2.k((bqma) dqyjVarD);
            bqlv bqlvVarB2 = bqlwVar2.b();
            brdr brdrVarD2 = MessagesTable.d();
            brdrVarD2.A("RepliesChangeQueryListener#preChangeInTransaction-messages2");
            f(brdrVarD2, bqlvVarB2, anjwVar);
        }
        return anjwVar;
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void e(dqwl dqwlVar, dqsd dqsdVar, Object obj) throws IOException {
        obj.getClass();
        anjw anjwVar = (anjw) obj;
        dqpd dqpdVarB = dqsdVar.b();
        if (dqpdVarB != null) {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("RepliesChangeQueryListener#onChangeInTransaction-messages1");
            f(brdrVarD, new dqxl("($V)", new Object[]{((bqks) dqpdVarB).m().b()}), anjwVar);
        }
        Set set = anjwVar.a;
        if (set.isEmpty()) {
            return;
        }
        final ekgb ekgbVarA = ekfv.a(set);
        this.c.g(new dqsm() { // from class: anju
            @Override // defpackage.dqsm
            public final eieu a() {
                int i = anjx.b;
                return eiiy.a("RCQL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(ekgbVarA.hashCode()), new Runnable() { // from class: anjv
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.invoke(ekgbVarA);
            }
        });
    }
}
