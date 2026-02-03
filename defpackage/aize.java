package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aize {
    final /* synthetic */ kog a;
    final /* synthetic */ qxl b;

    public aize(kog kogVar, qxl qxlVar) {
        this.a = kogVar;
        this.b = qxlVar;
    }

    public final void a(int i) {
        if (i != 0) {
            aizf.a.r(a.g(i, "Bad response code: "));
            this.a.b(Optional.empty());
            return;
        }
        try {
            String string = this.b.a().a.getString("install_referrer");
            if (!TextUtils.isEmpty(string)) {
                this.a.b(Optional.of(string.substring(0, Math.min(string.length(), 100))));
            } else {
                aizf.a.p("Empty referrer");
                this.a.b(Optional.empty());
            }
        } catch (RemoteException e) {
            aizf.a.s("Error talking to Referrer API", e);
            this.a.b(Optional.empty());
        }
    }
}
