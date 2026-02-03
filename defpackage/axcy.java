package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public abstract class axcy {
    public abstract ParticipantsTable.BindData a();

    public abstract Optional b();

    public final int c() {
        return a().q() + 1;
    }

    public final int d() {
        return a().q();
    }

    public final int e() {
        return a().r();
    }

    public final SelfIdentityId f() {
        return aofa.b(a().R());
    }

    public final String g() {
        return a().W();
    }

    public final boolean h() {
        return a().q() != -1;
    }

    public final boolean i() {
        return a().r() == -1;
    }
}
