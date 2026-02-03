package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkku implements dkly {
    public final List a;
    public final dklx b;
    public final fdap c;
    public final fdap d;
    public final Long e;
    private final int f;

    public dkku() {
        this(null, 0, null, null, null, 63);
    }

    @Override // defpackage.dkly
    public final dklx a() {
        return this.b;
    }

    @Override // defpackage.dkly
    public final List b() {
        return this.a;
    }

    @Override // defpackage.dkly
    public final int c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkku)) {
            return false;
        }
        dkku dkkuVar = (dkku) obj;
        return fdbq.f(this.a, dkkuVar.a) && this.f == dkkuVar.f && fdbq.f(this.b, dkkuVar.b) && fdbq.f(this.c, dkkuVar.c) && fdbq.f(this.d, dkkuVar.d) && fdbq.f(this.e, dkkuVar.e);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.f) * 31) + this.b.hashCode();
        fdap fdapVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (fdapVar == null ? 0 : fdapVar.hashCode())) * 31;
        fdap fdapVar2 = this.d;
        return ((iHashCode2 + (fdapVar2 != null ? fdapVar2.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EagerMetatextUiData(metatextList=");
        sb.append(this.a);
        sb.append(", visibility=");
        int i = this.f;
        sb.append((Object) (i != 1 ? i != 2 ? "HIDDEN_BY_DEFAULT" : "SHOWN_BY_DEFAULT" : "ALWAYS_SHOWN"));
        sb.append(", flags=");
        sb.append(this.b);
        sb.append(", onClick=");
        sb.append(this.c);
        sb.append(", onPositionChangedAfterClick=");
        sb.append(this.d);
        sb.append(", durationOfPositionSubscriptionInMillis=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dkku(List list, int i, dklx dklxVar, fdap fdapVar, fdap fdapVar2, int i2) {
        list = (i2 & 1) != 0 ? fcvo.a : list;
        i = (i2 & 2) != 0 ? 3 : i;
        dklxVar = (i2 & 4) != 0 ? new dklx(false, false, false, 7) : dklxVar;
        fdapVar = (i2 & 8) != 0 ? null : fdapVar;
        fdapVar2 = (i2 & 16) != 0 ? null : fdapVar2;
        list.getClass();
        if (i == 0) {
            throw null;
        }
        dklxVar.getClass();
        this.a = list;
        this.f = i;
        this.b = dklxVar;
        this.c = fdapVar;
        this.d = fdapVar2;
        this.e = 1000L;
    }
}
