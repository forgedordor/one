package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class liu {
    public final lit a;
    public final lis b;
    public final boolean c;

    public liu(lit litVar, lis lisVar) {
        this.a = litVar;
        this.b = lisVar;
        this.c = litVar != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof liu) {
            liu liuVar = (liu) obj;
            if (this.c == liuVar.c && fdbq.f(this.a, liuVar.a) && fdbq.f(this.b, liuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.c), this.a, this.b);
    }

    public liu() {
        this(null, null);
    }
}
