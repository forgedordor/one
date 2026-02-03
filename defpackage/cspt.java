package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cspt {
    private final fcsu a;
    private final fcsu b;

    public cspt(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar3;
    }

    public final csps a(ParticipantsTable.BindData bindData) {
        String strB;
        if (bindData == null || (strB = csod.b(((alrj) this.b.b()).q(bindData))) == null || fdgn.H(strB)) {
            return null;
        }
        return ((cspu) this.a.b()).a(bindData);
    }
}
