package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyrh {
    protected abstract int a();

    protected abstract int c();

    public abstract int d();

    protected abstract boolean e();

    public final Context f(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{a()});
        try {
            Context contextThemeWrapper = new ContextThemeWrapper(new ContextThemeWrapper(context, typedArrayObtainStyledAttributes.getResourceId(0, c())), d());
            if (e()) {
                contextThemeWrapper = eehf.a(contextThemeWrapper);
            }
            return contextThemeWrapper;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
