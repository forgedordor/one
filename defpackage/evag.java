package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evag extends evan {
    public final boolean a;
    public final Optional b;
    public final Optional c;
    private final euza d;
    private final String e;

    public evag(euza euzaVar, String str, boolean z, Optional optional, Optional optional2) {
        this.d = euzaVar;
        this.e = str;
        this.a = z;
        this.b = optional;
        this.c = optional2;
    }

    @Override // defpackage.evan
    public final euza a() {
        return this.d;
    }

    @Override // defpackage.evan
    public final Optional b() {
        return this.c;
    }

    @Override // defpackage.evan
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.evan
    public final String d() {
        return this.e;
    }

    @Override // defpackage.evan
    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evan) {
            evan evanVar = (evan) obj;
            if (this.d.equals(evanVar.a())) {
                evanVar.i();
                if (this.e.equals(evanVar.d()) && this.a == evanVar.e()) {
                    evanVar.f();
                    if (this.b.equals(evanVar.c()) && this.c.equals(evanVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ 1) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ImageSegmenterOptions{baseOptions=" + this.d.toString() + ", runningMode=IMAGE, displayNamesLocale=" + this.e + ", outputConfidenceMasks=" + this.a + ", outputCategoryMask=false, resultListener=" + this.b.toString() + ", errorListener=" + this.c.toString() + "}";
    }

    @Override // defpackage.evan
    public final void f() {
    }

    @Override // defpackage.evan
    public final void i() {
    }
}
