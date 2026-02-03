package defpackage;

import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ptv {
    public final prj a;
    public final pxc b;
    private final Configuration c;
    private final float d;

    public ptv(prj prjVar, pxc pxcVar, Configuration configuration, float f) {
        this.a = prjVar;
        this.b = pxcVar;
        this.c = configuration;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptv)) {
            return false;
        }
        ptv ptvVar = (ptv) obj;
        return fdbq.f(this.a, ptvVar.a) && fdbq.f(this.b, ptvVar.b) && fdbq.f(this.c, ptvVar.c) && Float.compare(this.d, ptvVar.d) == 0;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "ParentContainerInfo(windowBounds=" + this.a + ", windowLayoutInfo=" + this.b + ", configuration=" + this.c + ", density=" + this.d + ')';
    }
}
