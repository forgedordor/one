package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class druo implements drly {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/keypresseffect/PressEffectPlayer");
    private static volatile druo c;
    public boolean b;
    private final ejxr d;
    private final drwx e;
    private final int f;
    private final boolean g;
    private final drur h;
    private int i;
    private final int j;
    private final drww k;
    private final drww l;
    private final drww m;
    private final drww n;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private druo(final android.content.Context r20) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.druo.<init>(android.content.Context):void");
    }

    public static druo a(Context context) {
        if (c == null) {
            synchronized (druo.class) {
                if (c == null) {
                    drlx drlxVar = drlx.a;
                    c = new druo(context.getApplicationContext());
                    drlxVar.a(c);
                }
            }
        }
        return c;
    }

    private static final void e(View view) {
        try {
            view.performHapticFeedback(3);
        } catch (RuntimeException unused) {
        }
        SystemClock.uptimeMillis();
    }

    public final void b() throws NumberFormatException {
        int i;
        if (this.g) {
            i = this.j;
        } else {
            drwx drwxVar = this.e;
            int i2 = this.j;
            try {
                i = Integer.parseInt((String) drwxVar.d(drwxVar.g.a(R.string.pref_key_vibration_duration_on_keypress), String.class, "", null));
            } catch (NumberFormatException unused) {
                i = i2;
            }
        }
        this.i = Math.min(i, 100);
    }

    final boolean c() {
        return this.j != this.i;
    }

    public final void d(View view) {
        if (view == null) {
            return;
        }
        drur drurVar = this.h;
        Boolean bool = drurVar != null ? drurVar.e : null;
        if (bool != null) {
            if (Boolean.TRUE.equals(bool)) {
                e(view);
                return;
            }
            return;
        }
        if (this.b) {
            if (drxx.b || c()) {
                Vibrator vibrator = (Vibrator) this.d.get();
                if (vibrator == null || (this.j == -1 && !c())) {
                    e(view);
                    return;
                }
                int i = this.i;
                if (i > 0) {
                    if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT < ((Long) druh.a.b()).longValue() || !vibrator.areAllPrimitivesSupported(1)) {
                        try {
                            vibrator.vibrate(i);
                        } catch (RuntimeException unused) {
                        }
                    } else {
                        vibrator.vibrate(VibrationEffect.startComposition().addPrimitive(1, i * 0.01f).compose());
                    }
                    SystemClock.uptimeMillis();
                }
            }
        }
    }
}
