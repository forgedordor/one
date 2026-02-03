package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fua {
    public static final String a(int i, hml hmlVar) {
        hmlVar.e(AndroidCompositionLocals_androidKt.a);
        Resources resources = ((Context) hmlVar.e(AndroidCompositionLocals_androidKt.b)).getResources();
        return ftz.a(i, 0) ? resources.getString(R.string.navigation_menu) : ftz.a(i, 1) ? resources.getString(R.string.close_drawer) : ftz.a(i, 2) ? resources.getString(R.string.close_sheet) : ftz.a(i, 3) ? resources.getString(R.string.default_error_message) : ftz.a(i, 4) ? resources.getString(R.string.dropdown_menu) : ftz.a(i, 5) ? resources.getString(R.string.range_start) : ftz.a(i, 6) ? resources.getString(R.string.range_end) : ftz.a(i, 7) ? resources.getString(R.string.mc2_snackbar_pane_title) : "";
    }
}
