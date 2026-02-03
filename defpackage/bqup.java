package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqup implements Supplier {
    final /* synthetic */ MessagesTable.BindData a;

    public bqup(MessagesTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        MessagesTable.BindData bindData = this.a;
        baro baroVar = bindData.ap;
        if (baroVar == null || baroVar.equals(baro.a)) {
            return null;
        }
        return baro.d(bindData.ap);
    }
}
