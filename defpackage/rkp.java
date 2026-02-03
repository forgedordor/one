package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rkp implements rlr, rks {
    private final Context a;

    public rkp(Context context) {
        this.a = context;
    }

    @Override // defpackage.rks
    public final Class a() {
        return Drawable.class;
    }

    @Override // defpackage.rlr
    public final rlq b(rlz rlzVar) {
        return new rkt(this.a, this);
    }

    @Override // defpackage.rks
    public final /* bridge */ /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i) {
        Context context = this.a;
        return rqg.a(context, context, i, theme);
    }

    @Override // defpackage.rks
    public final /* bridge */ /* synthetic */ void d(Object obj) {
    }
}
