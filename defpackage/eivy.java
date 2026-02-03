package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eivy extends eiwd {
    public final List a;
    public final Class b;
    private final boolean c;
    private final boolean d;

    public eivy(List list, boolean z, boolean z2, Class cls) {
        if (list == null) {
            throw new NullPointerException("Null getPossibleValues");
        }
        this.a = list;
        this.c = z;
        this.d = z2;
        this.b = cls;
    }

    @Override // defpackage.eiwd
    public final Class a() {
        return this.b;
    }

    @Override // defpackage.eivz
    public final List b() {
        return this.a;
    }

    @Override // defpackage.eivz
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.eivz
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiwd) {
            eiwd eiwdVar = (eiwd) obj;
            if (this.a.equals(eiwdVar.b()) && this.c == eiwdVar.c() && this.d == eiwdVar.d()) {
                eiwdVar.e();
                if (this.b.equals(eiwdVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Class cls = this.b;
        return "StringOrEnumProperty{getPossibleValues=" + this.a.toString() + ", isRequired=" + this.c + ", isValueMatchRequired=" + this.d + ", isProhibited=false, enumType=" + cls.toString() + "}";
    }

    @Override // defpackage.eivz
    public final void e() {
    }
}
