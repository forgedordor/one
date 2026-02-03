package defpackage;

import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esnh implements Runnable {
    final /* synthetic */ CronetException a;
    final /* synthetic */ esni b;

    public esnh(esni esniVar, CronetException cronetException) {
        this.a = cronetException;
        this.b = esniVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CronetException cronetException = this.a;
        if (!(cronetException instanceof CallbackException) && (cronetException instanceof NetworkException)) {
            ((NetworkException) cronetException).getErrorCode();
        }
        esni esniVar = this.b;
        esniVar.a.setException(new esnl(cronetException));
    }
}
