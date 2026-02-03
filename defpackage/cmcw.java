package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cmcw {
    public abstract clpq a();

    public final MessagesTable.BindData b() {
        return a().a;
    }

    public final ScheduledSendTable.BindData c() {
        return a().c;
    }

    public final String d() {
        return a().c.n();
    }
}
