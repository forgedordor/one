package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bscf implements Supplier {
    final /* synthetic */ PartsTable.BindData a;

    public bscf(PartsTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        PartsTable.BindData bindData = this.a;
        MessageIdType messageIdType = bindData.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bindData.b));
    }
}
