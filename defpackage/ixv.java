package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixv implements ixm {
    private final ixu a;

    public ixv(ixu ixuVar) {
        this.a = ixuVar;
    }

    @Override // defpackage.ixm
    public final int a(ivu ivuVar, List list, int i) {
        return this.a.a(ivuVar, jdx.a(ivuVar), i);
    }

    @Override // defpackage.ixm
    public final int b(ivu ivuVar, List list, int i) {
        return this.a.b(ivuVar, jdx.a(ivuVar), i);
    }

    @Override // defpackage.ixm
    public final int c(ivu ivuVar, List list, int i) {
        return this.a.c(ivuVar, jdx.a(ivuVar), i);
    }

    @Override // defpackage.ixm
    public final int d(ivu ivuVar, List list, int i) {
        return this.a.d(ivuVar, jdx.a(ivuVar), i);
    }

    @Override // defpackage.ixm
    public final ixn e(ixp ixpVar, List list, long j) {
        return this.a.e(ixpVar, jdx.a(ixpVar), j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixv) && fdbq.f(this.a, ((ixv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
