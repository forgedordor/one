package defpackage;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ikw extends ikm {
    private final List b;
    private final long a = 9205357640488583168L;
    private final List c = null;

    public ikw(List list) {
        this.b = list;
    }

    @Override // defpackage.ikm
    public final Shader b(long j) {
        List list = this.b;
        long jB = iia.b(j);
        iip.a(list, null);
        return new SweepGradient(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (4294967295L & jB)), iip.b(list), (float[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikw)) {
            return false;
        }
        ikw ikwVar = (ikw) obj;
        long j = ikwVar.a;
        if (!ihs.h(9205357640488583168L, 9205357640488583168L) || !fdbq.f(this.b, ikwVar.b)) {
            return false;
        }
        List list = ikwVar.c;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return ((ihr.a(9205357640488583168L) * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "SweepGradient(colors=" + this.b + ", stops=null)";
    }
}
