package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efuo {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r4) {
        /*
            efsj r0 = defpackage.efsj.h(r4)
            efsh r1 = defpackage.efsh.CONFIG_LAYOUT_GRAVITY
            java.lang.String r4 = r0.j(r4, r1)
            r0 = 0
            if (r4 != 0) goto Le
            return r0
        Le:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            int r1 = r4.hashCode()
            r2 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            r3 = 1
            if (r1 == r2) goto L2e
            r2 = 109757538(0x68ac462, float:5.219839E-35)
            if (r1 == r2) goto L24
            goto L38
        L24:
            java.lang.String r1 = "start"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L38
            r4 = r3
            goto L39
        L2e:
            java.lang.String r1 = "center"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L38
            r4 = r0
            goto L39
        L38:
            r4 = -1
        L39:
            if (r4 == 0) goto L42
            if (r4 == r3) goto L3e
            return r0
        L3e:
            r4 = 8388611(0x800003, float:1.1754948E-38)
            return r4
        L42:
            r4 = 17
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efuo.a(android.content.Context):int");
    }

    public static TemplateLayout b(Activity activity) {
        View viewFindViewById;
        if (activity == null || (viewFindViewById = activity.findViewById(R.id.suc_layout_status)) == null) {
            return null;
        }
        return (TemplateLayout) viewFindViewById.getParent();
    }

    public static boolean c(View view) {
        Activity activityE;
        if (view instanceof efrl) {
            return ((efrl) view).e();
        }
        Context context = view.getContext();
        if (Build.VERSION.SDK_INT < 29 || !efsj.h(context).m()) {
            return false;
        }
        try {
            efte efteVar = efrl.a;
            activityE = efsj.e(context);
            if (activityE != null) {
                try {
                    TemplateLayout templateLayoutB = b(activityE);
                    if (templateLayoutB instanceof efrl) {
                        return ((efrl) templateLayoutB).e();
                    }
                } catch (ClassCastException | IllegalArgumentException unused) {
                }
            }
        } catch (ClassCastException | IllegalArgumentException unused2) {
            activityE = null;
        }
        boolean zA = activityE != null ? eftj.a(activityE.getIntent()) : false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sucUsePartnerResource});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        return zA || z;
    }
}
