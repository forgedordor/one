package defpackage;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtv {
    public static final void a(abto abtoVar, int i) {
        WebSettings settings = ((WebView) abtoVar.b().orElseThrow(new abtu())).getSettings();
        pqa pqaVar = pqx.f;
        if (pqaVar.a()) {
            settings.setForceDark(i);
        } else {
            if (!pqaVar.d()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            ppn.a(settings).a(i);
        }
    }
}
