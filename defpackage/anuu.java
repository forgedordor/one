package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anuu extends dqpi {
    public static final /* synthetic */ int a = 0;
    private final fdat b;

    public anuu(fdat fdatVar) {
        this.b = fdatVar;
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ Object d(dqwl dqwlVar, dqsd dqsdVar) throws IOException {
        anut anutVar = new anut(null);
        dqyj dqyjVarD = dqsdVar.d();
        if (dqyjVarD == null) {
            return anutVar;
        }
        String[] strArr = boiv.a;
        boiq boiqVar = new boiq(boiv.a);
        boiqVar.A("ConversationToParticipantsQueryListener#preChangeInTransaction");
        boiqVar.e(new Function() { // from class: anus
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = anuu.a;
                return ((boic) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boiqVar.k((boit) dqyjVarD);
        boiqVar.y(10);
        dqqj dqqjVarP = boiqVar.b().p();
        try {
            boie boieVar = (boie) dqqjVarP;
            if (boieVar.moveToNext()) {
                anutVar.a.add(new BugleConversationId(boieVar.e()));
            }
            fczl.a(dqqjVarP, null);
            return anutVar;
        } finally {
        }
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void e(dqwl dqwlVar, dqsd dqsdVar, Object obj) {
        ConversationIdType conversationIdTypeN;
        obj.getClass();
        anut anutVar = (anut) obj;
        dqpd dqpdVarB = dqsdVar.b();
        if (dqpdVarB != null && (conversationIdTypeN = ((bohm) dqpdVarB).n()) != null) {
            anutVar.a.add(new BugleConversationId(conversationIdTypeN));
        }
        dqpd[] dqpdVarArrA = dqsdVar.a();
        if (dqpdVarArrA != null) {
            ArrayList arrayList = new ArrayList();
            for (dqpd dqpdVar : dqpdVarArrA) {
                dqpdVar.getClass();
                ConversationIdType conversationIdTypeN2 = ((bohm) dqpdVar).n();
                if (conversationIdTypeN2 != null) {
                    arrayList.add(conversationIdTypeN2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                anutVar.a.add(new BugleConversationId((ConversationIdType) it.next()));
            }
        }
        Set set = anutVar.a;
        if (set.isEmpty()) {
            return;
        }
        this.b.a(ekfv.f(set), false);
    }
}
