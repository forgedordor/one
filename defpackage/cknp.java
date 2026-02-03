package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cknp {
    public static ckno a(List list) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) list.get(i2);
            if (messagePartCoreData.bv() && messagePartCoreData.ab() != null) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < list.size()) {
            MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) list.get(i);
            if (messagePartCoreData2.bv()) {
                String strAb = messagePartCoreData2.ab();
                if (strAb != null) {
                    return new ckns(strAb);
                }
            } else {
                if (le.j(messagePartCoreData2.R())) {
                    return new cknn();
                }
                if (messagePartCoreData2.bj()) {
                    return new cknr();
                }
                if (messagePartCoreData2.bx()) {
                    return new cknu();
                }
                if (messagePartCoreData2.aY()) {
                    return new cknk();
                }
                if (messagePartCoreData2.bw()) {
                    return new cknl();
                }
                if (messagePartCoreData2.bu()) {
                    return new cknm();
                }
            }
        }
        return new cknt();
    }
}
