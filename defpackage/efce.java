package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efce extends efem {
    private final Optional a;
    private final Optional b;
    private final int c;

    public efce(int i, Optional optional, Optional optional2) {
        this.c = i;
        this.a = optional;
        this.b = optional2;
    }

    @Override // defpackage.efem
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.efem
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.efem
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efem) {
            efem efemVar = (efem) obj;
            if (this.c == efemVar.c() && this.a.equals(efemVar.a()) && this.b.equals(efemVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.c != 1 ? "STOP" : "START";
        Optional optional = this.a;
        Optional optional2 = this.b;
        return "IsComposingMessage{state=" + str + ", refresh=" + optional.toString() + ", timestamp=" + optional2.toString() + "}";
    }
}
