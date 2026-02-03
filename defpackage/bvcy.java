package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvcy extends dqws<bvco, bvcx, bvcy, VmtTable.BindData, bvcn> {
    public bvcy(String[] strArr) {
        super("vmt", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bvcx b() {
        l();
        return new bvcx(this.a.a());
    }

    public final void c(bvcn... bvcnVarArr) {
        int iA = VmtTable.d().a();
        Integer.valueOf(iA).getClass();
        for (bvcn bvcnVar : bvcnVarArr) {
            if (((Integer) VmtTable.b.getOrDefault(bvcnVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        m(bvcnVarArr);
    }

    public final void d(Function function) {
        c((bvcn[]) function.apply(VmtTable.c));
    }

    public final void e(Function function) {
        String[] strArr = VmtTable.a;
        k(new bvdb((bvdc) function.apply(new bvdc())));
    }
}
