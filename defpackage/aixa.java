package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aixa implements baxz, bayk {
    private final aiwz a;

    public aixa(aiwz aiwzVar) {
        this.a = aiwzVar;
    }

    @Override // defpackage.bayk
    public final void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        messageCoreData.getClass();
        messageIdType.getClass();
        if (messageCoreData.cO()) {
            aiwz aiwzVar = this.a;
            ConversationIdType conversationIdTypeA = messageCoreData.A();
            conversationIdTypeA.getClass();
            SelfIdentityId selfIdentityIdV = messageCoreData.v();
            selfIdentityIdV.getClass();
            aiwzVar.c(conversationIdTypeA, selfIdentityIdV, 2);
        }
    }

    @Override // defpackage.baxz
    public final void gb(MessageCoreData messageCoreData) {
        if (messageCoreData.cO()) {
            aiwz aiwzVar = this.a;
            ConversationIdType conversationIdTypeA = messageCoreData.A();
            conversationIdTypeA.getClass();
            SelfIdentityId selfIdentityIdV = messageCoreData.v();
            selfIdentityIdV.getClass();
            aiwzVar.c(conversationIdTypeA, selfIdentityIdV, 3);
        }
    }

    @Override // defpackage.bayk
    public final boolean j() {
        return true;
    }

    @Override // defpackage.baxz
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.baxz
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, fcxy fcxyVar) {
        return messageCoreData;
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, fcxy fcxyVar) {
        return messageCoreData;
    }
}
