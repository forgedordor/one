package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqj {
    public static int a(etly etlyVar, Context context) {
        int iA = etlt.a(etlyVar.l);
        if (iA == 0) {
            iA = 1;
        }
        if (iA - 1 != 1) {
            return -1;
        }
        return (int) context.getResources().getDimension(R.dimen.growthkit_gm3_icon_size);
    }

    public static int b(etly etlyVar, Context context) {
        int iA = etlt.a(etlyVar.l);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 1;
        if (i == 1) {
            return (int) context.getResources().getDimension(R.dimen.growthkit_gm3_icon_size);
        }
        if (i != 2) {
            return -1;
        }
        return context.getResources().getDimensionPixelOffset(R.dimen.growthkit_gm3_dialog_max_width);
    }
}
