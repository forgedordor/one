package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atbf implements atcm {
    private final UrlRequest a;

    public atbf(UrlRequest urlRequest) {
        this.a = urlRequest;
    }

    @Override // defpackage.atcm
    public final void a() {
        this.a.cancel();
    }

    @Override // defpackage.atcm
    public final void b() {
        this.a.start();
    }
}
