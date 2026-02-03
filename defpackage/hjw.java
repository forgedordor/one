package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjw {
    public static final String a(String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str2.getClass();
        return str2;
    }

    public static final String b(int i, hml hmlVar) {
        hmlVar.e(AndroidCompositionLocals_androidKt.a);
        return ((Context) hmlVar.e(AndroidCompositionLocals_androidKt.b)).getResources().getString(i);
    }
}
