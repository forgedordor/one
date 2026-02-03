package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pi extends View {
    public pi(Context context) {
        super(context);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final int getWindowSystemUiVisibility() {
        return 0;
    }
}
