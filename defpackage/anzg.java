package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anzg {
    public final ParticipantsTable.BindData a;

    public anzg(ParticipantsTable.BindData bindData) {
        this.a = bindData;
    }

    public final boolean a() {
        return b() && csdm.a(this.a.o()).f();
    }

    public final boolean b() {
        return this.a.aa();
    }

    public final boolean c() {
        return !b() && csdm.a(this.a.o()).e();
    }

    public final boolean d() {
        return b() && csdm.a(this.a.o()).e();
    }
}
