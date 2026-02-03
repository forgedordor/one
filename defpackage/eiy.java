package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eiy extends ejj {
    final /* synthetic */ boolean a;
    final /* synthetic */ eos b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ ibx e;
    final /* synthetic */ boolean f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ long i;
    final /* synthetic */ ejy j;
    final /* synthetic */ icc k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eiy(long j, boolean z, eir eirVar, eos eosVar, int i, int i2, ibx ibxVar, icc iccVar, boolean z2, int i3, int i4, long j2, ejy ejyVar) {
        super(j, z, eirVar, eosVar);
        this.a = z;
        this.b = eosVar;
        this.c = i;
        this.d = i2;
        this.e = ibxVar;
        this.k = iccVar;
        this.f = z2;
        this.g = i3;
        this.h = i4;
        this.i = j2;
        this.j = ejyVar;
    }

    @Override // defpackage.ejj
    public final eji a(int i, Object obj, Object obj2, List list, long j) {
        int i2 = i == this.c + (-1) ? 0 : this.d;
        return new eji(i, list, this.a, this.e, this.k, this.b.q(), this.f, this.g, this.h, i2, this.i, obj, obj2, this.j.k, j);
    }
}
