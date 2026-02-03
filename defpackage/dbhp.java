package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dbhp extends dbho implements dbhs {
    public dbhp(dbhq dbhqVar) {
        super(dbhqVar, "active_sim_ids");
    }

    @Override // defpackage.dbho
    public final /* bridge */ /* synthetic */ Object d() {
        Set set = (Set) super.d();
        if (set != null) {
            return ekhx.o(set);
        }
        return null;
    }
}
