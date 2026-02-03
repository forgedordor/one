package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jql {
    public static final long a(int i, hml hmlVar) {
        Context context = (Context) hmlVar.e(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) hmlVar.e(AndroidCompositionLocals_androidKt.c);
        Resources.Theme theme = context.getTheme();
        WeakHashMap weakHashMap = kyy.a;
        return ijg.c(resources.getColor(i, theme));
    }
}
