package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajfi {
    static elny a(MessageCoreData messageCoreData, int i) {
        int i2 = i - 1;
        return (i2 == 2 || i2 == 3) ? elny.INCOMING : messageCoreData.z().j();
    }
}
