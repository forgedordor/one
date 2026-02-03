package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcip {
    public dcir a;
    public dcir b;
    public dcib c;
    public Feature[] d;
    public int e;
    private final Runnable f = new Runnable() { // from class: dcim
        @Override // java.lang.Runnable
        public final void run() {
        }
    };
    private boolean g = true;

    public final dciq a() {
        dclh.b(this.a != null, "Must set register function");
        dclh.b(this.b != null, "Must set unregister function");
        dclh.b(this.c != null, "Must set holder");
        dchz dchzVar = this.c.b;
        dclh.n(dchzVar, "Key must not be null");
        return new dciq(new dcin(this, this.c, this.d, this.g, this.e), new dcio(this, dchzVar), this.f);
    }

    public final void b() {
        this.g = false;
    }
}
