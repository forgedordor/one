package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkkv implements dkly {
    private final dklx a;
    private final Long b;
    private final fctc c;
    private final int d;

    public dkkv(fdae fdaeVar, int i, dklx dklxVar, Long l) {
        this.d = i;
        this.a = dklxVar;
        this.b = l;
        this.c = fctd.b(2, fdaeVar);
    }

    private final List d() {
        return (List) this.c.a();
    }

    @Override // defpackage.dkly
    public final dklx a() {
        return this.a;
    }

    @Override // defpackage.dkly
    public final List b() {
        return d();
    }

    @Override // defpackage.dkly
    public final int c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dkkv) {
            dkkv dkkvVar = (dkkv) obj;
            return this.d == dkkvVar.d && fdbq.f(this.a, dkkvVar.a) && fdbq.f(null, null) && fdbq.f(null, null) && fdbq.f(d(), dkkvVar.d()) && fdbq.f(this.b, dkkvVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.d * 31) + this.a.hashCode()) * 29791) + d().hashCode()) * 31) + this.b.hashCode();
    }
}
