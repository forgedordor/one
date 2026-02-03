package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpjy {
    public static final boolean a(WindowInsetsAnimation windowInsetsAnimation) {
        return (windowInsetsAnimation.getTypeMask() & WindowInsets.Type.ime()) != 0;
    }
}
