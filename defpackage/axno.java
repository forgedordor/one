package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ExpireWapPushSiMessageAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axno {
    private final fcsu a;
    private final fcsu b;
    private final cogw c;
    private final fcsu d;
    private final ayou e;
    private final avpc f;

    public axno(fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar, fcsu fcsuVar3, ayou ayouVar, avpc avpcVar) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = cogwVar;
        this.d = fcsuVar3;
        this.e = ayouVar;
        this.f = avpcVar;
    }

    public final long a() {
        final ConversationIdType conversationIdTypeM;
        long j = -1;
        if (((Boolean) avos.a.e()).booleanValue()) {
            Optional optionalQ = this.f.q("ʼWAP_PUSH_SI!ʼ");
            if (optionalQ.isEmpty()) {
                ExpireWapPushSiMessageAction.a.p("no WAP Push SI messages.");
                return -1L;
            }
            conversationIdTypeM = ((bojh) optionalQ.get()).C();
        } else {
            long jE = ((cmot) this.d.b()).e("ʼWAP_PUSH_SI!ʼ");
            if (jE < 0) {
                ExpireWapPushSiMessageAction.a.r("deleteExpiredMessages: can not get thread.");
                return -1L;
            }
            conversationIdTypeM = ((bakt) this.b.b()).m(jE);
            if (conversationIdTypeM == null) {
                ExpireWapPushSiMessageAction.a.p("no WAP Push SI messages. (null)");
                return -1L;
            }
            if (conversationIdTypeM.b()) {
                ExpireWapPushSiMessageAction.a.p("no WAP Push SI messages. (empty)");
                return -1L;
            }
        }
        long epochMilli = this.c.f().toEpochMilli();
        long jA = cmwd.a();
        cqce cqceVar = ExpireWapPushSiMessageAction.a;
        cqbd cqbdVarA = cqceVar.a();
        cqbdVarA.I("time zone offset");
        cqbdVarA.H(TimeUnit.MILLISECONDS.toHours(jA));
        cqbdVarA.I("hour(s).");
        cqbdVarA.r();
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("deleteExpiredMessages");
        brdrVarD.h(new Function() { // from class: axnn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.m(conversationIdTypeM);
                brecVar.J(2);
                brecVar.ap(new dqty("messages.mms_expiry", 7, 0L));
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brap brapVar = (brap) brdrVarD.b().p();
        ArrayList arrayList = null;
        while (true) {
            try {
                if (!brapVar.moveToNext()) {
                    break;
                }
                long j2 = brapVar.j();
                if (j2 > 0) {
                    long j3 = j2 + jA;
                    if (j3 > epochMilli) {
                        j = j3;
                        break;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(brapVar.q());
                }
            } catch (Throwable th) {
                try {
                    brapVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        brapVar.close();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                MessageIdType messageIdType = (MessageIdType) arrayList.get(i);
                cqbd cqbdVarC = cqceVar.c();
                cqbdVarC.I("delete expired");
                cqbdVarC.d(messageIdType);
                cqbdVarC.r();
                this.e.a(((baxe) this.a.b()).A(messageIdType));
            }
        }
        return j;
    }
}
