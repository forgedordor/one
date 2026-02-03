package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzch implements Serializable {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;

    public bzch(String str, int i, int i2, int i3) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = true;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzch)) {
            return false;
        }
        bzch bzchVar = (bzch) obj;
        if (!fdbq.f(this.a, bzchVar.a) || this.b != bzchVar.b || this.c != bzchVar.c) {
            return false;
        }
        boolean z = bzchVar.d;
        return this.e == bzchVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + 1231) * 31) + this.e;
    }

    public final String toString() {
        return "WorkHandlerExecutionContext(workHandlerId=" + this.a + ", workHandlerFlags=" + this.b + ", attemptCount=" + this.c + ", canRetry=true, tableType=" + this.e + ")";
    }
}
