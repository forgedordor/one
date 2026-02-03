package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cspm {
    private final fcsu a;

    public cspm(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    public final cspl a(MessageCoreData messageCoreData) {
        MessagesTable.BindData bindDataJ = messageCoreData.J();
        bindDataJ.getClass();
        return b(bindDataJ);
    }

    public final cspl b(MessagesTable.BindData bindData) {
        if (bindData.E().c()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (bindData.D().b()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return ((cspn) this.a.b()).a(bindData);
    }
}
