package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajhe {
    public static elke a(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return elke.CONVERSATION_TYPE_ONE_ON_ONE;
            }
            if (num.intValue() == 1) {
                return elke.CONVERSATION_TYPE_GROUP_MMS;
            }
            if (num.intValue() == 2) {
                return elke.CONVERSATION_TYPE_GROUP_RCS;
            }
        }
        return elke.UNKNOWN_BUGLE_CONVERSATION_TYPE;
    }

    public static elpt b(int i) {
        return i == -2 ? elpt.UNKNOWN_BUGLE_MMS_FAILURE_CODE : (elpt) Optional.ofNullable(elpt.b(i)).orElse(elpt.UNKNOWN_BUGLE_MMS_FAILURE_CODE);
    }

    public static int c(MessageCoreData messageCoreData) {
        if (messageCoreData.cB()) {
            return messageCoreData.Q().e() ? 4 : 2;
        }
        return 3;
    }

    public static int d(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1 || i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 7 ? 1 : 15;
        }
        return 5;
    }
}
