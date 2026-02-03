package defpackage;

import android.webkit.WebResourceError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abtc extends RuntimeException {
    public final WebResourceError a;

    public abtc(WebResourceError webResourceError) {
        super((String) webResourceError.getDescription());
        this.a = webResourceError;
    }
}
