package defpackage;

import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class acwk {
    public static SelectedConversation a(adao adaoVar) {
        acyx acyxVarK = adaoVar.k();
        ConversationIdType conversationIdTypeW = acyxVarK.w();
        ConversationId conversationId = (ConversationId) acyxVarK.B().get();
        MessageIdType messageIdTypeX = acyxVarK.x();
        long jO = acyxVarK.o();
        long jP = acyxVarK.p();
        bvdk bvdkVarY = acyxVarK.y();
        int iA = acyxVarK.a();
        boolean zAb = acyxVarK.ab();
        int iB = adaoVar.b();
        return new SelectedConversation(conversationIdTypeW, conversationId, messageIdTypeX, jO, jP, bvdkVarY, iA, zAb, iB == 8, acyxVarK.J(), acyxVarK.Q(), acyxVarK.O(), acyxVarK.P(), adaoVar.S(), acyxVarK.af(), acyxVarK.h(), acyxVarK.j(), acyxVarK.K(), acxp.c(acyxVarK), acyxVarK.b(), acyxVarK.t(), acyxVarK.Z(), acyxVarK.z());
    }
}
