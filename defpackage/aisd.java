package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aisd {
    public static int a(MessageCoreData messageCoreData) {
        int iD = messageCoreData.d();
        if (iD == 0) {
            return 2;
        }
        if (iD == 1 || iD == 2) {
            return 3;
        }
        return (iD == 3 || iD == 4) ? 4 : 1;
    }
}
