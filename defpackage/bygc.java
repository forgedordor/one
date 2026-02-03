package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bygc extends byvt {
    private final MessagesTable.BindData a;
    private final PartsTable.BindData b;

    public bygc(MessagesTable.BindData bindData, PartsTable.BindData bindData2) {
        this.a = bindData;
        if (bindData2 == null) {
            throw new NullPointerException("Null part");
        }
        this.b = bindData2;
    }

    @Override // defpackage.byvt
    public final MessagesTable.BindData a() {
        return this.a;
    }

    @Override // defpackage.byvt
    public final PartsTable.BindData b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byvt) {
            byvt byvtVar = (byvt) obj;
            if (this.a.equals(byvtVar.a()) && this.b.equals(byvtVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        PartsTable.BindData bindData = this.b;
        return "PartAndAssociatedMessage{message=" + this.a.toString() + ", part=" + bindData.toString() + "}";
    }
}
