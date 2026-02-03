package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxz implements dsuj, dsxw {
    public final eohz a;
    public final List b;
    public final dsvg c;
    public final long d;
    public final boolean e;

    public dsxz(eohz eohzVar, List list, dsvg dsvgVar, long j, boolean z) {
        this.a = eohzVar;
        this.b = list;
        this.c = dsvgVar;
        this.d = j;
        this.e = z;
    }

    @Override // defpackage.dsxw
    public final /* synthetic */ dsvq a() {
        return dsxv.a(this);
    }

    @Override // defpackage.dsxw
    public final List b() {
        return this.b;
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        eohx eohxVar = dsxv.a(this).d;
        if (eohxVar == null) {
            eohxVar = eohx.a;
        }
        ejwfVarB.f("rootVeId", eohxVar.d);
        eohx eohxVar2 = dsxv.b(this).d;
        if (eohxVar2 == null) {
            eohxVar2 = eohx.a;
        }
        ejwfVarB.f("targetVeId", eohxVar2.d);
        return ejwfVarB.toString();
    }
}
