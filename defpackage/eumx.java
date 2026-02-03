package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eumx {
    public final View a;
    public final int b;
    private final int c;
    private final Context d;

    public eumx(Context context, int i) {
        context.getClass();
        this.d = context;
        this.b = i;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.floating_toolbar_overflow_side_padding);
        this.a = a(null);
    }

    public static final boolean b(eunc euncVar) {
        return euncVar != null && euncVar.a() == R.id.smartAction;
    }

    public final View a(eunc euncVar) {
        View viewB = eumz.b(this.d, euncVar, this.b, b(euncVar));
        int i = this.c;
        viewB.setPadding(i, 0, i, 0);
        return viewB;
    }
}
