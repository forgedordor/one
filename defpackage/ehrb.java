package defpackage;

import android.content.ComponentCallbacks2;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehrb {
    public volatile rbv a;
    private final fcsu c;
    private final ehrc d;
    private final boolean e;
    private final Object f = new Object();
    public final ComponentCallbacks2 b = new ehqw(this);

    public ehrb(fcsu fcsuVar, ehrc ehrcVar, boolean z) {
        this.c = fcsuVar;
        this.d = ehrcVar;
        this.e = z;
    }

    public final rbr a() {
        return g().b();
    }

    public final rbr b() {
        return g().d();
    }

    public final rbr c(Drawable drawable) {
        return g().e(drawable);
    }

    public final rbr d(Uri uri) {
        return g().f(uri);
    }

    public final rbr e(res resVar) {
        return g().h(resVar);
    }

    public final rbr f(String str) {
        return g().i(str);
    }

    public final rbv g() {
        if (this.e) {
            ecem.c();
        }
        if (this.a == null) {
            synchronized (this.f) {
                if (this.a == null) {
                    this.a = (rbv) this.c.b();
                    this.d.a(this);
                }
            }
        }
        return this.a;
    }
}
