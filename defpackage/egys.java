package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egys implements egyi {
    final /* synthetic */ eopk a;
    final /* synthetic */ Object b;
    final /* synthetic */ egyt c;

    public egys(egyt egytVar, eopk eopkVar, Object obj) {
        this.a = eopkVar;
        this.b = obj;
        this.c = egytVar;
    }

    @Override // defpackage.egyi
    public final eopy a() {
        eopk eopkVar = this.a;
        eoqg eoqgVar = eoqg.a;
        return eopy.d(eopkVar, eoqgVar).e(eiid.g(new eopo() { // from class: egyr
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) {
                return egyh.a(obj, this.a.c.b.f());
            }
        }), eoqgVar);
    }

    @Override // defpackage.egyi
    public final ListenableFuture b() {
        return eorv.a;
    }

    @Override // defpackage.egyi
    public final Object c() {
        return this.b;
    }

    public final String toString() {
        return "LocalDataSource[" + this.a.toString() + "]";
    }
}
