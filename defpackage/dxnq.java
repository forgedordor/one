package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxnq {
    public final evfy a;
    public final evgg b;
    public final Map c;

    public dxnq(evfy evfyVar, evgg evggVar, Map map) {
        evfyVar.getClass();
        map.getClass();
        this.a = evfyVar;
        this.b = evggVar;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxnq)) {
            return false;
        }
        dxnq dxnqVar = (dxnq) obj;
        return fdbq.f(this.a, dxnqVar.a) && fdbq.f(this.b, dxnqVar.b) && fdbq.f(this.c, dxnqVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MultiLoginUpdateRequestAndResponse(request=" + this.a + ", response=" + this.b + ", authResultPerUser=" + this.c + ")";
    }
}
