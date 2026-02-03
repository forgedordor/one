package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class cotx {
    public static String a(MessagePartCoreData messagePartCoreData) {
        if (messagePartCoreData.U() != null) {
            return messagePartCoreData.U();
        }
        Uri uriT = messagePartCoreData.t();
        Uri uriV = messagePartCoreData.v();
        String strR = messagePartCoreData.R();
        if (uriV != null && !cqmz.u(uriV)) {
            uriT = uriV;
        }
        if (uriT == null) {
            return null;
        }
        return dfhq.g(uriT, ejwk.b(strR));
    }
}
