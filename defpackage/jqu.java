package defpackage;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqu {
    public static final String a(int i, int i2, Object[] objArr, hml hmlVar) {
        return ((Resources) hmlVar.e(AndroidCompositionLocals_androidKt.c)).getQuantityString(i, i2, Arrays.copyOf(objArr, 1));
    }

    public static final String b(int i, hml hmlVar) {
        return ((Resources) hmlVar.e(AndroidCompositionLocals_androidKt.c)).getString(i);
    }

    public static final String c(int i, Object[] objArr, hml hmlVar) {
        return ((Resources) hmlVar.e(AndroidCompositionLocals_androidKt.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }
}
