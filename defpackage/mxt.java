package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxt {
    public final Handler a;
    public final mrk b;

    public mxt(Handler handler, mrk mrkVar) {
        this.a = mrkVar == null ? null : handler;
        this.b = mrkVar;
    }

    public final void a(final mpd mpdVar) {
        mpdVar.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: mxi
                @Override // java.lang.Runnable
                public final void run() {
                    mpdVar.a();
                    String str = mgb.a;
                    mwk mwkVar = (mwk) this.a.b.a.j;
                    mwkVar.J(mwkVar.H(), 1013, new mez() { // from class: mvg
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }
}
