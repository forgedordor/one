package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rho implements res {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final res g;
    private final Map h;
    private final rex i;
    private int j;

    public rho(Object obj, res resVar, int i, int i2, Map map, Class cls, Class cls2, rex rexVar) {
        rvi.f(obj);
        this.b = obj;
        rvi.e(resVar, "Signature must not be null");
        this.g = resVar;
        this.c = i;
        this.d = i2;
        rvi.f(map);
        this.h = map;
        rvi.e(cls, "Resource class must not be null");
        this.e = cls;
        this.f = cls2;
        rvi.f(rexVar);
        this.i = rexVar;
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj instanceof rho) {
            rho rhoVar = (rho) obj;
            if (this.b.equals(rhoVar.b) && this.g.equals(rhoVar.g) && this.d == rhoVar.d && this.c == rhoVar.c && this.h.equals(rhoVar.h) && this.e.equals(rhoVar.e) && this.f.equals(rhoVar.f) && this.i.equals(rhoVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.j = iHashCode;
        int iHashCode2 = (((((iHashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
        this.j = iHashCode2;
        int iHashCode3 = (iHashCode2 * 31) + this.h.hashCode();
        this.j = iHashCode3;
        int iHashCode4 = (iHashCode3 * 31) + this.e.hashCode();
        this.j = iHashCode4;
        int iHashCode5 = (iHashCode4 * 31) + this.f.hashCode();
        this.j = iHashCode5;
        int iHashCode6 = (iHashCode5 * 31) + this.i.hashCode();
        this.j = iHashCode6;
        return iHashCode6;
    }

    public final String toString() {
        rex rexVar = this.i;
        Map map = this.h;
        res resVar = this.g;
        Class cls = this.f;
        Class cls2 = this.e;
        return "EngineKey{model=" + this.b.toString() + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + cls2.toString() + ", transcodeClass=" + cls.toString() + ", signature=" + resVar.toString() + ", hashCode=" + this.j + ", transformations=" + map.toString() + ", options=" + rexVar.toString() + "}";
    }
}
