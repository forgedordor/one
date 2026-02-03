package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsun extends dqws<bstl, bsum, bsun, ProfilesTable.BindData, bstk> {
    public bsun(String[] strArr) {
        super("profiles_table", strArr, null, null, null, "$primary");
    }

    private final void f(bstk... bstkVarArr) {
        int iIntValue = ProfilesTable.c().intValue();
        for (bstk bstkVar : bstkVarArr) {
            if (((Integer) ProfilesTable.b.getOrDefault(bstkVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(bstkVarArr);
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsum b() {
        l();
        return new bsum(this.a.a());
    }

    public final void c(Function function) {
        f((bstk[]) function.apply(ProfilesTable.c));
    }

    public final void d(Function function) {
        f((bstk) function.apply(ProfilesTable.c));
    }

    public final void e(Function function) {
        String[] strArr = ProfilesTable.a;
        k(new bsuq((bsur) function.apply(new bsur())));
    }
}
