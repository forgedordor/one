package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayn implements ehsn {
    public final Context a;
    private final ains b;

    public aayn(Context context, ains ainsVar) {
        this.a = context;
        this.b = ainsVar;
    }

    @Override // defpackage.ehsn
    public final ehsl b(ehsm ehsmVar) {
        Uri data = ehsmVar.a.getData();
        if (data == null) {
            return null;
        }
        if ((!"https".equals(data.getScheme()) && !"http".equals(data.getScheme())) || !"messages.google.com".equals(data.getHost()) || !"/install".equals(data.getPath())) {
            return null;
        }
        this.b.c("Bugle.Deeplink.Uace.Campaigns");
        return new aaym(this);
    }
}
