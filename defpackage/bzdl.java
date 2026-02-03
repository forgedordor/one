package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdl {
    public static final boolean a(MessageCoreData messageCoreData) {
        if (messageCoreData.M().size() != 1 || !((MessagePartCoreData) messageCoreData.M().get(0)).bv()) {
            return false;
        }
        String strAb = ((MessagePartCoreData) messageCoreData.M().get(0)).ab();
        return strAb == null || strAb.length() == 0;
    }
}
