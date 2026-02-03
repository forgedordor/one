package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajqo extends ajqz {
    private final int a;
    private final Optional b;
    private final int c;
    private final Optional d;
    private final int e;

    public ajqo(int i, Optional optional, int i2, int i3, Optional optional2) {
        this.a = i;
        this.b = optional;
        this.e = i2;
        this.c = i3;
        this.d = optional2;
    }

    @Override // defpackage.ajqz
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ajqz
    public final int b() {
        return this.c;
    }

    @Override // defpackage.ajqz
    public final Optional c() {
        return this.d;
    }

    @Override // defpackage.ajqz
    public final Optional d() {
        return this.b;
    }

    @Override // defpackage.ajqz
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajqz) {
            ajqz ajqzVar = (ajqz) obj;
            if (this.a == ajqzVar.a() && this.b.equals(ajqzVar.d()) && this.e == ajqzVar.e() && this.c == ajqzVar.b() && this.d.equals(ajqzVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.e;
        elow.c(i);
        return (((((iHashCode * 1000003) ^ i) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        int i = this.e;
        return "LogContent{httpStatusCode=" + this.a + ", rcsDiagnostics=" + this.b.toString() + ", mmsApi=" + elow.b(i) + ", lastConnectionFailureCauseCode=" + this.c + ", formatType=" + optional.toString() + "}";
    }
}
