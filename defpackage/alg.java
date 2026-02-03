package defpackage;

import android.util.Size;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alg extends anl {
    private final String a;
    private final Class b;
    private final bml c;
    private final bni d;
    private final Size e;
    private final bms f;
    private final List g;

    public alg(String str, Class cls, bml bmlVar, bni bniVar, Size size, bms bmsVar, List list) {
        this.a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.b = cls;
        if (bmlVar == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.c = bmlVar;
        if (bniVar == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.d = bniVar;
        this.e = size;
        this.f = bmsVar;
        this.g = list;
    }

    @Override // defpackage.anl
    public final Size a() {
        return this.e;
    }

    @Override // defpackage.anl
    public final bml b() {
        return this.c;
    }

    @Override // defpackage.anl
    public final bms c() {
        return this.f;
    }

    @Override // defpackage.anl
    public final bni d() {
        return this.d;
    }

    @Override // defpackage.anl
    public final Class e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Size size;
        bms bmsVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof anl) {
            anl anlVar = (anl) obj;
            if (this.a.equals(anlVar.f()) && this.b.equals(anlVar.e()) && this.c.equals(anlVar.b()) && this.d.equals(anlVar.d()) && ((size = this.e) != null ? size.equals(anlVar.a()) : anlVar.a() == null) && ((bmsVar = this.f) != null ? bmsVar.equals(anlVar.c()) : anlVar.c() == null) && ((list = this.g) != null ? list.equals(anlVar.g()) : anlVar.g() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.anl
    public final String f() {
        return this.a;
    }

    @Override // defpackage.anl
    public final List g() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        Size size = this.e;
        int iHashCode2 = ((iHashCode * 1000003) ^ (size == null ? 0 : size.hashCode())) * 1000003;
        bms bmsVar = this.f;
        int iHashCode3 = (iHashCode2 ^ (bmsVar == null ? 0 : bmsVar.hashCode())) * 1000003;
        List list = this.g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.a + ", useCaseType=" + this.b + ", sessionConfig=" + this.c + ", useCaseConfig=" + this.d + ", surfaceResolution=" + this.e + ", streamSpec=" + this.f + ", captureTypes=" + this.g + "}";
    }
}
