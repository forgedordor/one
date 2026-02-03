package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bquq implements Supplier {
    final /* synthetic */ MessagesTable.BindData a;

    public bquq(MessagesTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        MessagesTable.BindData bindData = this.a;
        Optional optional = bindData.ar;
        if (optional == null || optional.equals(basg.a)) {
            return null;
        }
        return basg.b(bindData.ar);
    }
}
