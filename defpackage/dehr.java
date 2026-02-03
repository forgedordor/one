package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dehr extends dcfm implements dehy {
    static final dcfe a;
    public static final /* synthetic */ int o = 0;
    private static final dcfd p;
    private static final dceu q;
    public final Object b;
    public defn m;
    public boolean n;

    static {
        dcfd dcfdVar = new dcfd();
        p = dcfdVar;
        dehn dehnVar = new dehn();
        q = dehnVar;
        a = new dcfe("TrustedTime.API", dehnVar, dcfdVar);
    }

    public dehr(Context context) {
        super(context, a, dcfa.q, dcfl.a);
        this.b = new Object();
    }

    @Override // defpackage.dehy
    public final defn a() {
        synchronized (this.b) {
            if (this.n) {
                return degc.c(null);
            }
            this.n = true;
            this.m = null;
            return degc.c(null);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.b) {
            str = "BasicInternalTimeSignalSupplierInitializer{task=" + String.valueOf(this.m) + ", disposed=" + this.n + "}";
        }
        return str;
    }
}
