package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmki extends dqws {
    public bmki(String[] strArr) {
        super("backup_id_map", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bmkh b() {
        l();
        return new bmkh(this.a.a());
    }

    public final void c(bmju... bmjuVarArr) {
        int iA = bmkn.c().a();
        Integer.valueOf(iA).getClass();
        for (bmju bmjuVar : bmjuVarArr) {
            if (((Integer) bmkn.b.getOrDefault(bmjuVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        m(bmjuVarArr);
    }

    public final void d(Function function) {
        String[] strArr = bmkn.a;
        k(new bmkl((bmkm) function.apply(new bmkm())));
    }
}
