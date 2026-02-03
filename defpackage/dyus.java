package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyus {
    public static dyuj a(Context context, Runnable runnable) {
        ekgb ekgbVarR = ekgb.r(context.getResources().getString(R.string.sign_in_cancel));
        if (ekgbVarR == null) {
            throw new NullPointerException("Null possibleCancelStringList");
        }
        if (runnable != null) {
            return new dyur(ekgbVarR, runnable);
        }
        throw new NullPointerException("Null onCancel");
    }
}
