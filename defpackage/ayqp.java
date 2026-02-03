package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ayqp implements ayms {
    public static boolean f(MessagePartCoreData messagePartCoreData, boolean z) {
        if (!z) {
            return messagePartCoreData.t() != null;
        }
        if (messagePartCoreData.t() != null) {
            if ((TextUtils.isEmpty(messagePartCoreData.N()) || messagePartCoreData.ba()) && !messagePartCoreData.aT()) {
                return true;
            }
            if (messagePartCoreData.bj()) {
                return (TextUtils.isEmpty(messagePartCoreData.Q()) || messagePartCoreData.bb()) && !messagePartCoreData.aU();
            }
        }
        return false;
    }

    public static ArrayList g(List list) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (MessagePartCoreData messagePartCoreData : ((bazb) it.next()).M()) {
                    if (f(messagePartCoreData, false)) {
                        arrayList.add(messagePartCoreData);
                    }
                }
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((bazb) it2.next()).M().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) it3.next();
                        if (TextUtils.equals(messagePartCoreData2.W(), null) && f(messagePartCoreData2, false)) {
                            arrayList.add(messagePartCoreData2);
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public abstract Action a(ArrayList arrayList, String str, boolean z);

    public final Action b(bazb bazbVar) {
        return a(g(ekgb.r(bazbVar)), null, false);
    }

    public final Action d(bazb bazbVar, String str) {
        return a(g(ekgb.r(bazbVar)), str, false);
    }

    public final Action e(List list, boolean z) {
        return a(g(list), null, z);
    }
}
