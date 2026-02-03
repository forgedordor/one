package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asrh {
    public final asra a;
    private final asqx b;

    public asrh(asqx asqxVar, asra asraVar) {
        this.b = asqxVar;
        this.a = asraVar;
    }

    public static final asrg e(audu auduVar, aubq aubqVar) {
        return new asrg(auduVar, ekgb.r(aubqVar), true);
    }

    public final asrg a(ConversationIdType conversationIdType, Collection collection) {
        return c(this.a.b(conversationIdType), collection);
    }

    public final asrg b(String str) {
        return new asrg(this.b.a(str, false));
    }

    public final asrg c(audu auduVar, Collection collection) {
        ejwl.b(!collection.isEmpty(), "Group recipients is empty");
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            alqm alqmVar = (alqm) it.next();
            String strH = alqmVar.h();
            if (strH != null) {
                ekfwVar.h(this.b.f(alqmVar, strH));
            }
        }
        return new asrg(auduVar, ekfwVar.g(), false);
    }

    public final asrg d(String str, String str2, Collection collection) {
        return c(this.a.a(str, str2), collection);
    }
}
