package defpackage;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drur implements AutoCloseable {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/keypresseffect/SystemHapticSettings");
    public static final drtr b = drtt.d("enable_system_haptic_settings");
    public final Application c;
    public final drtq d = new drtq() { // from class: drup
        @Override // defpackage.drtq
        public final void a() {
            this.a.a();
        }
    };
    public volatile Boolean e;
    private ContentObserver f;

    public drur(Application application) {
        this.c = application;
    }

    public static boolean b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return Settings.System.getInt(contentResolver, "vibrate_on", 1) == 1 && Settings.System.getInt(contentResolver, "keyboard_vibration_enabled", 1) == 1;
    }

    private final void c() {
        ContentObserver contentObserver = this.f;
        if (contentObserver == null) {
            return;
        }
        this.f = null;
        this.c.getContentResolver().unregisterContentObserver(contentObserver);
    }

    public final void a() {
        if (((Boolean) b.b()).booleanValue()) {
            if (this.f == null) {
                druq druqVar = new druq(this, new Handler(Looper.getMainLooper()));
                ContentResolver contentResolver = this.c.getContentResolver();
                contentResolver.registerContentObserver(Settings.System.getUriFor("vibrate_on"), true, druqVar);
                contentResolver.registerContentObserver(Settings.System.getUriFor("keyboard_vibration_enabled"), true, druqVar);
                this.f = druqVar;
            }
            this.e = Boolean.valueOf(b(this.c));
        } else {
            c();
            this.e = null;
        }
        ((ekrd) ((ekrd) a.h()).h("com/google/android/libraries/inputmethod/keypresseffect/SystemHapticSettings", "flagUpdated", 83, "SystemHapticSettings.java")).t("vibration enabled: %s", this.e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b.d(this.d);
        c();
    }
}
