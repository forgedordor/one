package defpackage;

import android.view.Window;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgv extends lgu {
    public lgv(Window window, leb lebVar) {
        super(window, lebVar);
    }

    @Override // defpackage.lha
    public final void g(boolean z) {
        if (!z) {
            b(8192);
            return;
        }
        c(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        d();
        a(8192);
    }

    @Override // defpackage.lha
    public final boolean h() {
        return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
