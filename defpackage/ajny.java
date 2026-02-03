package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajny {
    private final Context a;
    private final crqv b;

    public ajny(Context context, crqv crqvVar) {
        this.a = context;
        this.b = crqvVar;
    }

    final ajnz a(int i, int i2, Object obj, Object obj2) throws Resources.NotFoundException {
        Resources resources = this.a.getResources();
        return new ajnz(this.b, resources.getString(i), resources.getBoolean(i2), obj, obj2);
    }
}
