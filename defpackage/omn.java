package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class omn {
    public final Context a;

    public omn(Context context) {
        this.a = context;
    }

    public final String a(int i) throws Resources.NotFoundException {
        try {
            String resourceName = this.a.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }
}
