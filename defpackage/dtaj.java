package defpackage;

import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class dtaj extends dsuz {
    final /* synthetic */ dtak d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtaj(dtak dtakVar, dsvc dsvcVar) {
        super(dsvcVar);
        this.d = dtakVar;
    }

    @Deprecated
    public final dsvd a(Object obj) {
        dtak dtakVar = this.d;
        Map map = dtakVar.a;
        ejwl.l(map.get(obj) == null);
        dsvd dsvdVar = dtakVar.b;
        dsvd dsvdVarE = e(dsvdVar.e);
        dtal dtalVar = new dtal(dsvdVarE);
        dsvdVarE.f = dtalVar;
        dtalVar.l();
        map.put(obj, dsvdVarE);
        dsvdVar.f.e(dsvdVarE);
        return dsvdVarE;
    }
}
