package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evae extends evar {
    private final Optional a;
    private final Optional b;
    private final List c;
    private final long d;

    public evae(Optional optional, Optional optional2, List list, long j) {
        if (optional == null) {
            throw new NullPointerException("Null confidenceMasks");
        }
        this.a = optional;
        this.b = optional2;
        if (list == null) {
            throw new NullPointerException("Null qualityScores");
        }
        this.c = list;
        this.d = j;
    }

    @Override // defpackage.evar
    public final long a() {
        return this.d;
    }

    @Override // defpackage.evar
    public final Optional b() {
        return this.b;
    }

    @Override // defpackage.evar
    public final Optional c() {
        return this.a;
    }

    @Override // defpackage.evar
    public final List d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evar) {
            evar evarVar = (evar) obj;
            if (this.a.equals(evarVar.c()) && this.b.equals(evarVar.b()) && this.c.equals(evarVar.d()) && this.d == evarVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        List list = this.c;
        Optional optional = this.b;
        return "ImageSegmenterResult{confidenceMasks=" + this.a.toString() + ", categoryMask=" + optional.toString() + ", qualityScores=" + list.toString() + ", timestampMs=" + this.d + "}";
    }
}
