package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acvt extends acwv {
    private final List a;
    private final int b;
    private final int c;
    private final boolean d;

    public acvt(List list, int i, int i2, boolean z) {
        if (list == null) {
            throw new NullPointerException("Null getList");
        }
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // defpackage.acwv
    public final int a() {
        return this.b;
    }

    @Override // defpackage.acwv
    public final int b() {
        return this.c;
    }

    @Override // defpackage.acwv
    public final List c() {
        return this.a;
    }

    @Override // defpackage.acwv
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acwv) {
            acwv acwvVar = (acwv) obj;
            if (this.a.equals(acwvVar.c()) && this.b == acwvVar.a() && this.c == acwvVar.b() && this.d == acwvVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "InitialQueryResult{getList=" + this.a.toString() + ", getPosition=" + this.b + ", getTotalCount=" + this.c + ", wasQueryCancelled=" + this.d + "}";
    }
}
