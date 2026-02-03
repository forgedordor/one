package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.widget.Button;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsv {
    public static final HashMap a = new HashMap();

    public static int a(int i, float f) {
        return Color.argb((int) (f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    static void b(Context context, Button button, efsh efshVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        if (efsj.h(context).t(efshVar)) {
            int iC = efsj.h(context).c(context, efshVar);
            if (iC != 0) {
                button.setTextColor(ColorStateList.valueOf(iC));
                return;
            }
            return;
        }
        HashMap map = a;
        if (!map.containsKey(Integer.valueOf(button.getId()))) {
            throw new IllegalStateException("There is no saved default color for button");
        }
        button.setTextColor((ColorStateList) map.get(Integer.valueOf(button.getId())));
    }

    static void c(Button button, int i) {
        if (i != 0) {
            button.setTextColor(ColorStateList.valueOf(i));
        }
    }

    static void d(Context context, Button button, efsh efshVar) {
        c(button, efsj.h(context).c(context, efshVar));
    }
}
