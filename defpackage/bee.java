package defpackage;

import android.util.Size;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bee extends bfd {
    public final Size a;
    public final int b;
    public final List c;
    public final boolean d;
    public final bbn e;
    public final bfp f;
    public final btb g;
    public final btb h;

    public bee(Size size, int i, List list, boolean z, bbn bbnVar, bfp bfpVar, btb btbVar, btb btbVar2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.a = size;
        this.b = i;
        this.c = list;
        this.d = z;
        this.e = bbnVar;
        this.f = bfpVar;
        this.g = btbVar;
        this.h = btbVar2;
    }

    @Override // defpackage.bfd
    public final int a() {
        return this.b;
    }

    @Override // defpackage.bfd
    public final Size b() {
        return this.a;
    }

    @Override // defpackage.bfd
    public final bbn c() {
        return this.e;
    }

    @Override // defpackage.bfd
    public final bfp d() {
        return this.f;
    }

    @Override // defpackage.bfd
    public final btb e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        bbn bbnVar;
        bfp bfpVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bfd) {
            bfd bfdVar = (bfd) obj;
            if (this.a.equals(bfdVar.b()) && this.b == bfdVar.a() && this.c.equals(bfdVar.g()) && this.d == bfdVar.h() && ((bbnVar = this.e) != null ? bbnVar.equals(bfdVar.c()) : bfdVar.c() == null) && ((bfpVar = this.f) != null ? bfpVar.equals(bfdVar.d()) : bfdVar.d() == null) && this.g.equals(bfdVar.f()) && this.h.equals(bfdVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bfd
    public final btb f() {
        return this.g;
    }

    @Override // defpackage.bfd
    public final List g() {
        return this.c;
    }

    @Override // defpackage.bfd
    public final boolean h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        bbn bbnVar = this.e;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (bbnVar == null ? 0 : bbnVar.hashCode())) * 1000003;
        bfp bfpVar = this.f;
        return ((((iHashCode2 ^ (bfpVar != null ? bfpVar.hashCode() : 0)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.a + ", inputFormat=" + this.b + ", outputFormats=" + this.c + ", virtualCamera=" + this.d + ", imageReaderProxyProvider=" + this.e + ", postviewSettings=" + this.f + ", requestEdge=" + this.g + ", errorEdge=" + this.h + "}";
    }
}
