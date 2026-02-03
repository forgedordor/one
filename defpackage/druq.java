package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class druq extends ContentObserver {
    final /* synthetic */ drur a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public druq(drur drurVar, Handler handler) {
        super(handler);
        this.a = drurVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        onChange(z, null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        drur drurVar = this.a;
        drurVar.e = Boolean.valueOf(drur.b(drurVar.c));
        ((ekrd) ((ekrd) drur.a.h()).h("com/google/android/libraries/inputmethod/keypresseffect/SystemHapticSettings$1", "onChange", 124, "SystemHapticSettings.java")).t("vibration enabled: %s", drurVar.e);
    }
}
