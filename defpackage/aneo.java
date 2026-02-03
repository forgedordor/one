package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aneo extends dqpi {
    public static final /* synthetic */ int b = 0;
    public final fdap a;
    private final dqsn c;

    public aneo(dqsn dqsnVar, fdap fdapVar) {
        this.c = dqsnVar;
        this.a = fdapVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqpi
    public final /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) throws IOException {
        final ArrayList arrayList;
        bsjg bsjgVar = (bsjg) dqsdVar.c();
        if (bsjgVar == null) {
            arrayList = new ArrayList();
        } else {
            bsje bsjeVarC = PartsTable.c();
            bsjeVarC.A("MPSCQL::onChangeInTransaction::update");
            bsjeVarC.e(new Function() { // from class: anem
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = aneo.b;
                    return new bsgs[]{((bsgr) obj).b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekqh it = bsjgVar.e.iterator();
            while (it.hasNext()) {
                dqyj dqyjVar = (dqyj) it.next();
                dqyjVar.getClass();
                bsjeVarC.k((bsji) dqyjVar);
            }
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("MPSCQL::onChangeInTransaction::update2");
            brdrVarD.e(new Function() { // from class: anen
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = aneo.b;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.G(dqts.i(bsjeVarC.b(), PartsTable.d.b, MessagesTable.c.a));
            dqqj dqqjVarP = brdrVarD.b().p();
            try {
                brap brapVar = (brap) dqqjVarP;
                ajle ajleVar = ajle.UPDATE;
                ArrayList arrayList2 = new ArrayList();
                while (brapVar.moveToNext()) {
                    MessagesTable.BindData bindData = (MessagesTable.BindData) brapVar.cQ();
                    CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.E(), -1L);
                    ConversationIdType conversationIdTypeD = bindData.D();
                    if (conversationIdTypeD == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    arrayList2.add(new anap(ajleVar, coreBugleMessageId, new BugleConversationId(conversationIdTypeD), Instant.ofEpochMilli(bindData.w()), 0));
                }
                fczl.a(dqqjVarP, null);
                arrayList = arrayList2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(dqqjVarP, th);
                    throw th2;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.c.g(new dqsm() { // from class: anek
            @Override // defpackage.dqsm
            public final eieu a() {
                int i = aneo.b;
                return eiiy.a("MPSCQL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(arrayList.hashCode()), new Runnable() { // from class: anel
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.invoke(ekfv.a(arrayList));
            }
        });
    }
}
