package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqux extends cqup {
    private final Optional a;
    private final int b;

    public cqux(int i, Optional optional) {
        this.b = i;
        this.a = optional;
    }

    @Override // defpackage.cqup
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.cqup
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqup) {
            cqup cqupVar = (cqup) obj;
            if (this.b == cqupVar.b() && this.a.equals(cqupVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        int i = this.b;
        return "AudioPlaybackResult{status=" + (i != 1 ? i != 2 ? "INTERRUPTED" : "FAILED" : "SUCCEEDED") + ", error=" + this.a.toString() + "}";
    }
}
