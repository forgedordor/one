package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class aypg implements ayms {
    public abstract Action a(MessageCoreData messageCoreData, boolean z, elny elnyVar, bvdk bvdkVar, int i, Optional optional, long j, boolean z2);

    public abstract Action b(int i, ekgb ekgbVar, String str, String str2, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, boolean z, boolean z2, elny elnyVar, DeviceData deviceData, boolean z3, ArrayList arrayList, boolean z4, fhaz fhazVar);

    public final Action d(MessageCoreData messageCoreData, boolean z, bvdk bvdkVar) {
        return a(messageCoreData, z, null, bvdkVar, -1, Optional.empty(), 0L, false);
    }

    public final Action e(MessageCoreData messageCoreData, int i, boolean z) {
        return a(messageCoreData, true, null, null, i, Optional.empty(), 0L, z);
    }
}
