package defpackage;

import android.content.pm.PackageManager;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rph implements rez {
    private final rqk a;
    private final rii b;

    public rph(rqk rqkVar, rii riiVar) {
        this.a = rqkVar;
        this.b = riiVar;
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ rhy a(Object obj, int i, int i2, rex rexVar) throws PackageManager.NameNotFoundException, NumberFormatException {
        rhy rhyVarC = this.a.c((Uri) obj, rexVar);
        if (rhyVarC == null) {
            return null;
        }
        return rop.a(this.b, ((rqh) rhyVarC).c(), i, i2);
    }

    @Override // defpackage.rez
    public final /* bridge */ /* synthetic */ boolean b(Object obj, rex rexVar) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }
}
