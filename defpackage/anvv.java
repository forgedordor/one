package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anvv {
    private final fcsu a;
    private final fcsu b;

    public anvv(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
    }

    public final anvu a(ParticipantsTable.BindData bindData, bncf bncfVar, ProfilesTable.BindData bindData2) {
        bindData.getClass();
        return new anvu(this.a, this.b, bindData, bncfVar, bindData2);
    }
}
