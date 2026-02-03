package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afki implements afkc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/messageclassifications/ConversationClassificationPersisterImpl");
    public final fcsu b;
    public final cogw c;
    private final fdjx d;
    private final fcyh e;

    public afki(fdjx fdjxVar, fdjx fdjxVar2, fcyh fcyhVar, fcsu fcsuVar, cogw cogwVar) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcyhVar.getClass();
        fcsuVar.getClass();
        cogwVar.getClass();
        this.d = fdjxVar;
        this.e = fcyhVar;
        this.b = fcsuVar;
        this.c = cogwVar;
    }

    @Override // defpackage.afkc
    public final eiju a(ConversationIdType conversationIdType, List list) {
        list.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new afkh(this, conversationIdType, list, null));
    }

    @Override // defpackage.afkc
    public final Object b(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e), new afke(null, this), fcxyVar);
    }

    @Override // defpackage.afkc
    public final Object c(ConversationIdType conversationIdType, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e), new afkf(null, this, conversationIdType), fcxyVar);
    }

    @Override // defpackage.afkc
    public final Object d(ConversationIdType conversationIdType, List list, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e), new afkg(null, this, conversationIdType, list), fcxyVar);
    }
}
