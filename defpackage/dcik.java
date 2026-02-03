package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcik {
    public final dcib a;
    public final Feature[] b;
    public final boolean c;
    public final int d;

    protected dcik(dcib dcibVar, Feature[] featureArr, boolean z, int i) {
        this.a = dcibVar;
        this.b = featureArr;
        this.c = z;
        this.d = i;
    }

    public final dchz a() {
        return this.a.b;
    }

    protected abstract void b(dcev dcevVar, defr defrVar);
}
