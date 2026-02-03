package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clhp implements fcsu {
    final /* synthetic */ ParticipantsTable.BindData a;

    public clhp(ParticipantsTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // defpackage.fcsu
    public final /* synthetic */ Object b() {
        baqz baqzVarZ = bara.z();
        baqzVarZ.l(false);
        baqzVarZ.k(false);
        baqzVarZ.x(new cnqj());
        baqzVarZ.p(fcva.b(this.a));
        ((bake) baqzVarZ).b = Optional.empty();
        baqzVarZ.m(0);
        return baqzVarZ.y();
    }
}
