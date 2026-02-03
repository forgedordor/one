package defpackage;

import android.view.Window;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lgw extends lgv {
    public lgw(Window window, leb lebVar) {
        super(window, lebVar);
    }

    @Override // defpackage.lha
    public final void i(boolean z) {
        if (!z) {
            b(16);
            return;
        }
        c(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        d();
        a(16);
    }

    @Override // defpackage.lha
    public final boolean j() {
        return (this.a.getDecorView().getSystemUiVisibility() & 16) != 0;
    }
}
