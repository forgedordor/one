package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfeg extends dfek {
    public final int a;
    public final Duration b;

    public dfeg(int i, Duration duration) {
        this.a = i;
        this.b = duration;
    }

    @Override // defpackage.dfek
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dfek
    public final Duration b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfek) {
            dfek dfekVar = (dfek) obj;
            if (this.a == dfekVar.a() && this.b.equals(dfekVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "FileTransferError{type=" + this.a + ", retryAfter=" + String.valueOf(this.b) + "}";
    }
}
