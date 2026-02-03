package defpackage;

import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atdg implements atdd {
    private final atdk a;
    private boolean b;

    public atdg(atdk atdkVar) {
        this.a = atdkVar;
    }

    @Override // defpackage.atdd
    public final eiju a() {
        if (this.b) {
            throw new atdf();
        }
        this.b = true;
        return eijx.e(new atcq(ekgd.f("User-Agent", this.a.a())));
    }

    @Override // defpackage.atdd
    public final boolean b(UrlResponseInfo urlResponseInfo) {
        return false;
    }
}
