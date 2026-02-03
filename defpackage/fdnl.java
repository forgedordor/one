package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdnl extends fdnm implements fdkh {
    public final Handler a;
    public final fdnl b;
    private final String c;
    private final boolean d;

    public fdnl(Handler handler, String str) {
        this(handler, str, false);
    }

    private final void k(fcyh fcyhVar, Runnable runnable) {
        fdlw.d(fcyhVar, new CancellationException(a.h(this, "The task was rejected, the handler underlying the dispatcher '", "' was closed")));
        fdjq fdjqVar = fdkq.a;
        fdzy.a.a(fcyhVar, runnable);
    }

    @Override // defpackage.fdjq
    public final void a(fcyh fcyhVar, Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        k(fcyhVar, runnable);
    }

    @Override // defpackage.fdnm, defpackage.fdkh
    public final fdks c(long j, final Runnable runnable, fcyh fcyhVar) {
        if (this.a.postDelayed(runnable, fddu.k(j, 4611686018427387903L))) {
            return new fdks() { // from class: fdni
                @Override // defpackage.fdks
                public final void hz() {
                    this.a.a.removeCallbacks(runnable);
                }
            };
        }
        k(fcyhVar, runnable);
        return fdml.a;
    }

    @Override // defpackage.fdkh
    public final void d(long j, final fdis fdisVar) {
        final Runnable runnable = new Runnable() { // from class: fdnj
            @Override // java.lang.Runnable
            public final void run() {
                fdisVar.g(this, fctx.a);
            }
        };
        if (this.a.postDelayed(runnable, fddu.k(j, 4611686018427387903L))) {
            fdisVar.d(new fdap() { // from class: fdnk
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    this.a.a.removeCallbacks(runnable);
                    return fctx.a;
                }
            });
        } else {
            k(((fdiu) fdisVar).b, runnable);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fdnl)) {
            return false;
        }
        fdnl fdnlVar = (fdnl) obj;
        return fdnlVar.a == this.a && fdnlVar.d == this.d;
    }

    @Override // defpackage.fdjq
    public final boolean ey(fcyh fcyhVar) {
        if (this.d) {
            return !fdbq.f(Looper.myLooper(), this.a.getLooper());
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.d;
        return (true != z ? 1237 : 1231) ^ System.identityHashCode(this.a);
    }

    @Override // defpackage.fdmi
    public final /* synthetic */ fdmi j() {
        return this.b;
    }

    @Override // defpackage.fdmi, defpackage.fdjq
    public final String toString() {
        String strG = g();
        if (strG != null) {
            return strG;
        }
        String string = this.c;
        if (string == null) {
            string = this.a.toString();
        }
        return this.d ? String.valueOf(string).concat(".immediate") : string;
    }

    private fdnl(Handler handler, String str, boolean z) {
        this.a = handler;
        this.c = str;
        this.d = z;
        this.b = z ? this : new fdnl(handler, str, true);
    }
}
