package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cpby {
    public final Context a;
    protected final cpbz b;
    private final alqm c;

    public cpby(Context context, cpbz cpbzVar, alqm alqmVar) {
        this.a = context;
        this.b = cpbzVar;
        this.c = alqmVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract Intent e();

    public final Drawable f(int i) {
        Context context = this.a;
        Drawable drawable = context.getDrawable(b());
        drawable.getClass();
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        int dimension = (int) context.getResources().getDimension(R.dimen.business_action_default_icon_size);
        drawableMutate.setBounds(0, 0, dimension, dimension);
        return drawableMutate;
    }

    public abstract String g(String str);

    public final String h() {
        return this.c.h();
    }

    public final boolean i() {
        return this.b.e(e());
    }

    public abstract int j();
}
