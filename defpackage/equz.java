package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equz extends eqtf {
    public final equy a;

    public equz(equy equyVar) {
        this.a = equyVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.a != equy.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof equz) && ((equz) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(equz.class, this.a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.a.d + ")";
    }
}
