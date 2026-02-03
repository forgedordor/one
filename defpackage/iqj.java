package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqj {
    public static final int a(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final long b(KeyEvent keyEvent) {
        return iqn.a(keyEvent.getKeyCode());
    }
}
