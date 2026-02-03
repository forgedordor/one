package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbhj {
    public static String a(Context context, List list) {
        StringBuilder sb = new StringBuilder();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                bazc bazcVar = (bazc) it.next();
                if (bazcVar.aX()) {
                    if (bazcVar.bj() && !bazcVar.bs()) {
                        i++;
                    }
                    if (bazcVar.bx()) {
                        i2++;
                    }
                }
            }
            Resources resources = context.getResources();
            if (i > 0) {
                sb.append(resources.getQuantityString(R.plurals.notification_picture_count, i, Integer.valueOf(i)));
            }
            if (i2 > 0) {
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(resources.getString(R.string.enumeration_comma));
                }
                sb.append(resources.getQuantityString(R.plurals.notification_video_count, i2, Integer.valueOf(i2)));
            }
        }
        return sb.toString();
    }
}
