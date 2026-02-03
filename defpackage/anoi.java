package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anoi extends dqpi {
    public static final /* synthetic */ int c = 0;
    public final fdap a;
    final /* synthetic */ anoj b;

    public anoi(anoj anojVar, fdap fdapVar) {
        this.b = anojVar;
        this.a = fdapVar;
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        final List list;
        dqpd dqpdVarB = dqsdVar.b();
        final buxp buxpVar = dqpdVarB instanceof buxp ? (buxp) dqpdVarB : null;
        if (buxpVar == null) {
            list = fcvo.a;
        } else {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("UserReferenceChangeQueryListener::getChangedMessages");
            brdrVarD.e(new Function() { // from class: anod
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bran branVar = (bran) obj;
                    int i = anoi.c;
                    return new brao[]{branVar.a, branVar.b, branVar.i};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.h(new Function() { // from class: anoe
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    int i = anoi.c;
                    brecVar.p(buxpVar.n());
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.h(new Function() { // from class: anof
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    int i = anoi.c;
                    brecVar.ah(anoj.a);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb<MessagesTable.BindData> ekgbVarZ = brdrVarD.b().z();
            ekgbVarZ.getClass();
            ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
            for (MessagesTable.BindData bindData : ekgbVarZ) {
                ajle ajleVar = ajle.UPDATE;
                CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(bindData.E(), -1L);
                ConversationIdType conversationIdTypeD = bindData.D();
                if (conversationIdTypeD == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList.add(new anap(ajleVar, coreBugleMessageId, new BugleConversationId(conversationIdTypeD), Instant.ofEpochMilli(bindData.w()), 0));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return;
        }
        ((dqsn) this.b.b.b()).g(new dqsm() { // from class: anog
            @Override // defpackage.dqsm
            public final eieu a() {
                int i = anoi.c;
                return eiiy.a("UserReferenceChangeQueryListener::onChangeInTransaction");
            }
        }, String.valueOf(list.hashCode()), new Runnable() { // from class: anoh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.invoke(ekfv.a(list));
            }
        });
    }
}
