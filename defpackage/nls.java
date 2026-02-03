package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nls {
    public final Handler a;
    public final mrk b;

    public nls(Handler handler, mrk mrkVar) {
        if (mrkVar != null) {
            mee.f(handler);
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = mrkVar;
    }

    public final void a(final mpd mpdVar) {
        mpdVar.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: nlq
                @Override // java.lang.Runnable
                public final void run() {
                    final mpd mpdVar2 = mpdVar;
                    mpdVar2.a();
                    String str = mgb.a;
                    mwk mwkVar = (mwk) this.a.b.a.j;
                    mwkVar.J(mwkVar.H(), 1020, new mez() { // from class: mvl
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                            ((mtx) obj).g(mpdVar2);
                        }
                    });
                }
            });
        }
    }

    public final void b(final Object obj) {
        Handler handler = this.a;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: nll
                @Override // java.lang.Runnable
                public final void run() {
                    String str = mgb.a;
                    mrn mrnVar = this.a.b.a;
                    mwk mwkVar = (mwk) mrnVar.j;
                    mtv mtvVarI = mwkVar.I();
                    final Object obj2 = obj;
                    mwkVar.J(mtvVarI, 26, new mez() { // from class: mvy
                        @Override // defpackage.mez
                        public final void a(Object obj3) {
                        }
                    });
                    if (mrnVar.t == obj2) {
                        mrnVar.h.f(26, new mez() { // from class: mrj
                            @Override // defpackage.mez
                            public final void a(Object obj3) {
                                ((mce) obj3).u();
                            }
                        });
                    }
                }
            });
        }
    }

    public final void c(final mde mdeVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: nlj
                @Override // java.lang.Runnable
                public final void run() {
                    String str = mgb.a;
                    mrn mrnVar = this.a.b.a;
                    final mde mdeVar2 = mdeVar;
                    mrnVar.A = mdeVar2;
                    mrnVar.h.f(25, new mez() { // from class: mri
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                            int i = mrk.b;
                            ((mce) obj).C(mdeVar2);
                        }
                    });
                }
            });
        }
    }
}
