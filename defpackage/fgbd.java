package defpackage;

import org.chromium.net.CallbackException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgbd extends CallbackException {
    protected fgbd(android.net.http.CallbackException callbackException) {
        super(callbackException.getMessage(), callbackException.getCause());
    }
}
