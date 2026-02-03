package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bary {
    public static final MessageIdType a = new MessageIdType(-1);

    public static long a(MessageIdType messageIdType) {
        if (messageIdType == null) {
            return -1L;
        }
        return messageIdType.a;
    }

    public static MessageIdType b(String str) {
        if (str != null) {
            try {
                return new MessageIdType(Long.parseLong(str));
            } catch (Exception unused) {
            }
        }
        return a;
    }
}
