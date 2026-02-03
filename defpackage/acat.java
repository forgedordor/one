package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acat extends acca {
    private final dyuo a;
    private final Optional b;
    private final Optional c;
    private final Optional d;

    public acat(dyuo dyuoVar, Optional optional, Optional optional2, Optional optional3) {
        this.a = dyuoVar;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
    }

    @Override // defpackage.acca
    public final dyuo a() {
        return this.a;
    }

    @Override // defpackage.acca
    public final Optional b() {
        return this.d;
    }

    @Override // defpackage.acca
    public final Optional c() {
        return this.c;
    }

    @Override // defpackage.acca
    public final Optional d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acca) {
            acca accaVar = (acca) obj;
            if (this.a.equals(accaVar.a()) && this.b.equals(accaVar.d()) && this.c.equals(accaVar.c()) && this.d.equals(accaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "Options{features=" + this.a.toString() + ", topViewCreator=" + String.valueOf(optional3) + ", continueButtonCallbacks=" + String.valueOf(optional2) + ", cancelButtonCallbacks=" + String.valueOf(optional) + "}";
    }
}
