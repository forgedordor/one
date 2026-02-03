package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rqz {
    public final rcg a;
    public final List b;
    final rbv c;
    public boolean d;
    public rqw e;
    public boolean f;
    public rqw g;
    public Bitmap h;
    public rqw i;
    public int j;
    public int k;
    public int l;
    private final Handler m;
    private final rii n;
    private boolean o;
    private rbr p;

    public rqz(raw rawVar, rcg rcgVar, int i, int i2, rfb rfbVar, Bitmap bitmap) {
        rii riiVar = rawVar.a;
        rbv rbvVarC = raw.c(rawVar.a());
        rbr rbrVarQ = raw.c(rawVar.a()).b().q(((rtj) ((rtj) rtj.d(rha.c).ag()).ai()).Q(i, i2));
        this.b = new ArrayList();
        this.c = rbvVarC;
        Handler handler = new Handler(Looper.getMainLooper(), new rqy(this));
        this.n = riiVar;
        this.m = handler;
        this.p = rbrVarQ;
        this.a = rcgVar;
        e(rfbVar, bitmap);
    }

    final int a() {
        return ((rck) this.a).f.c;
    }

    public final void b() {
        int i;
        if (!this.d || this.o) {
            return;
        }
        rqw rqwVar = this.i;
        if (rqwVar != null) {
            this.i = null;
            c(rqwVar);
            return;
        }
        this.o = true;
        rcg rcgVar = this.a;
        rck rckVar = (rck) rcgVar;
        rci rciVar = rckVar.f;
        int i2 = rciVar.c;
        int i3 = 0;
        if (i2 > 0 && (i = rckVar.e) >= 0) {
            i3 = i < i2 ? ((rch) rciVar.e.get(i)).i : -1;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + i3;
        rcgVar.b();
        this.g = new rqw(this.m, rckVar.e, jUptimeMillis);
        this.p.q((rtj) new rtj().W(new ruq(Double.valueOf(Math.random())))).k(rcgVar).w(this.g);
    }

    final void c(rqw rqwVar) {
        this.o = false;
        if (this.f) {
            this.m.obtainMessage(2, rqwVar).sendToTarget();
            return;
        }
        if (!this.d) {
            this.i = rqwVar;
            return;
        }
        if (rqwVar.b != null) {
            d();
            rqw rqwVar2 = this.e;
            this.e = rqwVar;
            List list = this.b;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((rqx) list.get(size)).c();
                }
            }
            if (rqwVar2 != null) {
                this.m.obtainMessage(2, rqwVar2).sendToTarget();
            }
        }
        b();
    }

    public final void d() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.n.d(bitmap);
            this.h = null;
        }
    }

    final void e(rfb rfbVar, Bitmap bitmap) {
        rvi.f(rfbVar);
        rvi.f(bitmap);
        this.h = bitmap;
        this.p = this.p.q(new rtj().Y(rfbVar));
        this.j = rvk.a(bitmap);
        this.k = bitmap.getWidth();
        this.l = bitmap.getHeight();
    }

    public final void f() {
        this.d = false;
    }
}
