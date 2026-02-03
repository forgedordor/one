package defpackage;

import android.content.Context;
import android.view.PointerIcon;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ldr {
    public final PointerIcon a;

    private ldr(PointerIcon pointerIcon) {
        this.a = pointerIcon;
    }

    public static ldr a(Context context) {
        return new ldr(PointerIcon.getSystemIcon(context, 1002));
    }
}
