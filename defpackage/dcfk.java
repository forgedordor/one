package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcfk {
    public dciv a;
    private Looper b;

    public final dcfl a() {
        if (this.a == null) {
            this.a = new dcgk();
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new dcfl(this.a, this.b);
    }

    public final void b(Looper looper) {
        dclh.n(looper, "Looper must not be null.");
        this.b = looper;
    }
}
