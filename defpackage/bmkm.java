package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmkm extends dqyp {
    @Override // defpackage.dqyp
    public final /* synthetic */ dqyj a() {
        return new bmkl(this);
    }

    public final void b(Function... functionArr) {
        bmkm[] bmkmVarArr = new bmkm[2];
        for (int i = 0; i < 2; i++) {
            Function function = functionArr[i];
            String[] strArr = bmkn.a;
            bmkmVarArr[i] = (bmkm) function.apply(new bmkm());
        }
        aq(bmkmVarArr);
    }

    public final void c(long j) {
        ap(new dqty("backup_id_map.status", 1, Long.valueOf(j)));
    }

    public final void d(Iterable iterable) {
        ap(new dqpm("backup_id_map.status", 3, as(iterable), true));
    }

    public final void e(long... jArr) {
        ap(new dqpm("backup_id_map.status", 3, ekjz.g(dqru.p(jArr, Long.class), new ejvr() { // from class: dqyo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return String.valueOf((Long) obj);
            }
        }), true));
    }

    public final void f(dqxe dqxeVar) {
        ap(new dqpk("backup_id_map.table_name", 1, dqxeVar));
    }

    public final void g(String str) {
        ap(new dqpj("backup_id_map.table_name", 1, str));
    }

    public final void h() {
        ap(new dqpn("backup_id_map.table_name", 5));
    }
}
