package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class doao {
    public static int b(doav doavVar) {
        String host = Uri.parse(doavVar.f()).getHost();
        return (host == null || !fdgn.n(host, "tenor.com")) ? 2 : 1;
    }
}
