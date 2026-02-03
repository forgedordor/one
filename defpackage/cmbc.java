package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmbc implements Supplier {
    final /* synthetic */ ScheduledSendTable.BindData a;

    public cmbc(ScheduledSendTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        ScheduledSendTable.BindData bindData = this.a;
        MessageIdType messageIdType = bindData.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bindData.b));
    }
}
