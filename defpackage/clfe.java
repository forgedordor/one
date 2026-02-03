package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clfe {
    private static final cqce a = cqce.g("Bugle", "ReminderDatabaseOperations");

    public static String a(ConversationIdType conversationIdType, MessageIdType messageIdType, long j) {
        if (messageIdType.c()) {
            return null;
        }
        String[] strArr = btin.a;
        bthe btheVar = new bthe();
        btheVar.c(messageIdType);
        btheVar.b(conversationIdType);
        btheVar.d(j);
        final bthb bthbVarA = btheVar.a();
        final dqsy dqsyVarD = btin.d();
        long jB = dqru.b(btin.d(), "reminders", bthbVarA, new Function() { // from class: btgx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarD.O("reminders", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: btgy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bthb bthbVar = bthbVarA;
                    bthbVar.a = String.valueOf(l);
                    bthbVar.fN(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Long.valueOf(jB).getClass();
        if (jB != -1) {
            return String.valueOf(jB);
        }
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("failed to insert reminder for message");
        cqbdVarE.d(messageIdType);
        cqbdVarE.r();
        return null;
    }
}
