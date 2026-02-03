package defpackage;

import android.app.Notification;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class caya {
    static {
        cdag.v("constaints_only_on_work_manager");
    }

    public static caxz l() {
        caxk caxkVar = new caxk();
        caxkVar.g(10000L);
        caxkVar.f(pza.b);
        caxkVar.b(caze.WAKELOCK);
        caxkVar.e = Optional.empty();
        caxkVar.d(1);
        caxkVar.c(1);
        caxkVar.e(false);
        return caxkVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract Notification d();

    public abstract pza e();

    public abstract pzj f();

    public abstract caze g();

    public abstract elgm h();

    public abstract Duration i();

    public abstract Optional j();

    public abstract boolean k();

    final void m() {
        int iOrdinal = g().ordinal();
        if ((iOrdinal == 2 || iOrdinal == 3) && d() == null) {
            throw new IllegalStateException("must supply foreground notification");
        }
    }
}
