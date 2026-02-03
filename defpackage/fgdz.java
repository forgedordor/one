package defpackage;

import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdz implements Runnable {
    final /* synthetic */ fggr a;
    final /* synthetic */ RequestFinishedInfo b;

    public fgdz(fggr fggrVar, RequestFinishedInfo requestFinishedInfo) {
        this.a = fggrVar;
        this.b = requestFinishedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onRequestFinished(this.b);
    }
}
