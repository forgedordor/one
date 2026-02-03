package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pqv extends ppw {
    public pqv() {
        super("MULTI_PROFILE", "MULTI_PROFILE");
    }

    @Override // defpackage.pqc
    public final boolean d() {
        if (!super.d() || !pqx.a("MULTI_PROCESS")) {
            return false;
        }
        Uri uri = pps.a;
        if (pqx.e.d()) {
            return pqz.a.a().isMultiProcessEnabled();
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
}
