package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvp implements bakm {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/conversationencryptionstatus/E2eeConversationCreationListener");
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;

    public bvvp(fcsu fcsuVar, fdjx fdjxVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        fcsuVar2.getClass();
        this.b = fcsuVar;
        this.d = fdjxVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.bakm
    public final void a(ConversationIdType conversationIdType, ajsm ajsmVar) {
        if (ajsmVar != ajsm.b) {
            return;
        }
        auvw.k(this.d, null, null, new bvvo(this, conversationIdType, null), 3);
    }
}
