package defpackage;

import android.webkit.WebView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlsn implements fdpm {
    final /* synthetic */ WebView a;

    public dlsn(WebView webView) {
        this.a = webView;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        int iOrdinal = ((dlsl) obj).ordinal();
        if (iOrdinal == 0) {
            this.a.goBack();
        } else if (iOrdinal == 1) {
            this.a.goForward();
        } else if (iOrdinal == 2) {
            this.a.reload();
        } else {
            if (iOrdinal != 3) {
                throw new fctg();
            }
            this.a.stopLoading();
        }
        return fctx.a;
    }
}
