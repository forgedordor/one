package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqul implements Supplier {
    final /* synthetic */ MessagesTable.BindData a;

    public bqul(MessagesTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        MessagesTable.BindData bindData = this.a;
        axcm axcmVar = bindData.z;
        if (axcmVar == null || axcmVar.equals(null)) {
            return null;
        }
        return axcn.b(bindData.z);
    }
}
