package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euyr extends euza {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;

    public euyr(Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
    }

    @Override // defpackage.euza
    public final Optional a() {
        return this.d;
    }

    @Override // defpackage.euza
    public final Optional b() {
        return this.c;
    }

    @Override // defpackage.euza
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.euza
    public final Optional d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof euza) {
            euza euzaVar = (euza) obj;
            if (this.a.equals(euzaVar.d()) && this.b.equals(euzaVar.c()) && this.c.equals(euzaVar.b())) {
                euzaVar.e();
                if (this.d.equals(euzaVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "BaseOptions{modelAssetPath=" + this.a.toString() + ", modelAssetFileDescriptor=" + String.valueOf(optional2) + ", modelAssetBuffer=" + String.valueOf(optional) + ", delegate=CPU, delegateOptions=" + String.valueOf(this.d) + "}";
    }

    @Override // defpackage.euza
    public final void e() {
    }
}
