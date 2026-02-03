package defpackage;

import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iit extends ijf {
    public final int a;
    private final long c;

    public iit(long j, int i) {
        super(Build.VERSION.SDK_INT >= 29 ? new BlendModeColorFilter(ijg.b(j), iib.a(i)) : new PorterDuffColorFilter(ijg.b(j), iib.b(i)));
        this.c = j;
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iit)) {
            return false;
        }
        long j = this.c;
        iit iitVar = (iit) obj;
        long j2 = iitVar.c;
        long j3 = ije.a;
        return fcts.a(j, j2) && iis.b(this.a, iitVar.a);
    }

    public final int hashCode() {
        long j = ije.a;
        return (fctr.a(this.c) * 31) + this.a;
    }

    public final String toString() {
        return "BlendModeColorFilter(color=" + ((Object) ije.g(this.c)) + ", blendMode=" + ((Object) iis.a(this.a)) + ')';
    }
}
