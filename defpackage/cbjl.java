package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbjl extends dqws {
    public cbjl(String[] strArr) {
        super("work_queue_work_manager_ids", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cbjk b() {
        l();
        return new cbjk(this.a.a());
    }

    public final void c(cbis... cbisVarArr) {
        int iA = cbjq.d().a();
        Integer.valueOf(iA).getClass();
        for (cbis cbisVar : cbisVarArr) {
            if (((Integer) cbjq.b.getOrDefault(cbisVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        m(cbisVarArr);
    }

    public final void d(Function function) {
        String[] strArr = cbjq.a;
        k(new cbjo((cbjp) function.apply(new cbjp())));
    }
}
