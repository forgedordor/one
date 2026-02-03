package defpackage;

import android.util.Size;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhq extends bmw {
    public final Size a;
    public final Map b;
    public final Size c;
    public final Map d;
    public final Size e;
    public final Map f;
    public final Map g;

    public bhq(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.a = size;
        this.b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.c = size2;
        this.d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.e = size3;
        this.f = map3;
        this.g = map4;
    }

    @Override // defpackage.bmw
    public final Size a() {
        return this.a;
    }

    @Override // defpackage.bmw
    public final Size b() {
        return this.c;
    }

    @Override // defpackage.bmw
    public final Size c() {
        return this.e;
    }

    @Override // defpackage.bmw
    public final Map d() {
        return this.f;
    }

    @Override // defpackage.bmw
    public final Map e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmw) {
            bmw bmwVar = (bmw) obj;
            if (this.a.equals(bmwVar.a()) && this.b.equals(bmwVar.f()) && this.c.equals(bmwVar.b()) && this.d.equals(bmwVar.e()) && this.e.equals(bmwVar.c()) && this.f.equals(bmwVar.d()) && this.g.equals(bmwVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bmw
    public final Map f() {
        return this.b;
    }

    @Override // defpackage.bmw
    public final Map g() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", ultraMaximumSizeMap=" + this.g + "}";
    }
}
