package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdod implements cdoc {
    private final ajln a;

    public cdod(ajln ajlnVar) {
        ajlnVar.getClass();
        this.a = ajlnVar;
    }

    @Override // defpackage.cdoc
    public final Object a() {
        return fctx.a;
    }

    @Override // defpackage.cdoc
    public final Object b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajmh ajmhVarC = this.a.a(new BugleConversationId((ConversationIdType) it.next()), ajlm.MINIMAL).c();
            ekgb ekgbVarD = ((amhq) ajmhVarC.k()).c();
            ArrayList arrayList = new ArrayList(fcva.p(ekgbVarD, 10));
            Iterator<E> it2 = ekgbVarD.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ajmy) it2.next()).b());
            }
            ajmhVarC.r(ekfv.a(arrayList));
        }
        return fctx.a;
    }
}
