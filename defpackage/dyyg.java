package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyyg {
    public static void a(dsvh dsvhVar, dsve dsveVar, View view) {
        dsvf dsvfVar = (dsvf) view.getTag(R.id.interaction_info_tag);
        if (dsvfVar != null) {
            dsveVar.b(dsvfVar);
            b(view, null);
        }
        dsvhVar.a(dsveVar.a(), view);
    }

    public static void b(View view, dsvf dsvfVar) {
        view.setTag(R.id.interaction_info_tag, dsvfVar);
    }
}
