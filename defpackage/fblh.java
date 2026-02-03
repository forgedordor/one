package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fblh implements ejxr {
    private static final fblh a = new fblh();
    private final ejxr b = new ejxw(new fblj());

    public static boolean b(Context context) {
        return a.get().a(context);
    }

    public static boolean c(Context context) {
        return a.get().b(context);
    }

    @Override // defpackage.ejxr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbli get() {
        return (fbli) ((ejxw) this.b).a;
    }
}
