package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bapp {
    public final fcsu a;
    public final fcsu b;
    private final dqsn c;

    public bapp(dqsn dqsnVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = dqsnVar;
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public final void a(final ConversationIdType conversationIdType, final ConversationIdType conversationIdType2, final bvdk bvdkVar) {
        cqaz.h();
        this.c.d("ConversationMergeDatabaseOperations#mergeMessagesInConversations", new Runnable() { // from class: bapm
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = MessagesTable.a;
                brdu brduVar = new brdu();
                brduVar.ap("mergeMessagesInConversations-messages");
                ConversationIdType conversationIdType3 = conversationIdType2;
                brduVar.n(conversationIdType3);
                final ConversationIdType conversationIdType4 = conversationIdType;
                brduVar.X(new Function() { // from class: bapn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar = (brec) obj;
                        brecVar.m(conversationIdType4);
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brduVar.b().e();
                String[] strArr2 = PartsTable.a;
                bsjh bsjhVar = new bsjh();
                bsjhVar.ap("mergeMessagesInConversations-parts");
                bsjhVar.k(conversationIdType3);
                bsjhVar.D(new Function() { // from class: bapo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsjl bsjlVar = (bsjl) obj;
                        bsjlVar.i(conversationIdType4);
                        return bsjlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsjhVar.b().e();
                bapp bappVar = this.a;
                ((cdww) bappVar.b.b()).d(conversationIdType4, 0L);
                ((baqi) bappVar.a.b()).a(conversationIdType3, true, bvdkVar);
            }
        });
    }
}
