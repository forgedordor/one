package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ebcn implements ebco {
    public static ebsu e(Uri uri) {
        return ebsu.a(true != uri.toString().startsWith(Telephony.Mms.CONTENT_URI.toString()) ? "com.google.android.apps.messaging" : "com.android.providers.telephony");
    }

    public abstract long a();

    public abstract Context b();

    public abstract Uri c();

    @Override // defpackage.ebco
    public final InputStream d() {
        return ebsv.b(b(), c(), e(c()));
    }

    @Override // defpackage.ebco
    public final long l() {
        return a();
    }
}
