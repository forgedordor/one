package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqow extends dqwf {
    private final dqwl a;
    private final dqpi b;
    private final int c;
    private final List d;

    public dqow(dqwl dqwlVar, dqpi dqpiVar, int i, List list) {
        this.a = dqwlVar;
        if (dqpiVar == null) {
            throw new NullPointerException("Null changeListener");
        }
        this.b = dqpiVar;
        this.c = i;
        if (list == null) {
            throw new NullPointerException("Null preChangeDataObjects");
        }
        this.d = list;
    }

    @Override // defpackage.dqwf
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dqwf
    public final dqpi b() {
        return this.b;
    }

    @Override // defpackage.dqwf
    public final dqwl c() {
        return this.a;
    }

    @Override // defpackage.dqwf
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqwf) {
            dqwf dqwfVar = (dqwf) obj;
            if (this.a.equals(dqwfVar.c()) && this.b.equals(dqwfVar.b()) && this.c == dqwfVar.a() && this.d.equals(dqwfVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.h) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        List list = this.d;
        dqpi dqpiVar = this.b;
        return "PreChangeCallState{query=" + this.a.toString() + ", changeListener=" + dqpiVar.toString() + ", listPosition=" + this.c + ", preChangeDataObjects=" + list.toString() + "}";
    }
}
