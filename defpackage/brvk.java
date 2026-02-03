package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brvk implements Supplier {
    final /* synthetic */ ParticipantsTable.BindData a;

    public brvk(ParticipantsTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        ParticipantsTable.BindData bindData = this.a;
        axcm axcmVar = bindData.c;
        if (axcmVar == null || axcmVar.equals(null)) {
            return null;
        }
        return axcn.b(bindData.c);
    }
}
