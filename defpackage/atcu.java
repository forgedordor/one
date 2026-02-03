package defpackage;

import android.util.Base64;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atcu implements atdd {
    private final dggz a;
    private final atdk b;
    private int c = 0;

    public atcu(dggz dggzVar, atdk atdkVar) {
        this.a = dggzVar;
        this.b = atdkVar;
    }

    @Override // defpackage.atdd
    public final eiju a() {
        if (this.c >= 2) {
            throw new atdf();
        }
        ekha ekhaVar = new ekha();
        ekhaVar.l("User-Agent", this.b.a());
        if (this.c > 0) {
            InstantMessageConfiguration instantMessageConfigurationO = ((dgiq) this.a.l().orElseThrow()).o();
            ekhaVar.l("Authorization", "Basic ".concat(String.valueOf(Base64.encodeToString((instantMessageConfigurationO.mFtHttpContentServerUser + ":" + instantMessageConfigurationO.mFtHttpContentServerPassword).getBytes(), 2))));
        }
        this.c++;
        return eijx.e(new atcq(ekhaVar.f()));
    }

    @Override // defpackage.atdd
    public final boolean b(UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        return this.c < 2 ? httpStatusCode == 401 : httpStatusCode != 200;
    }
}
