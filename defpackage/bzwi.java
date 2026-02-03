package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzwi extends bzzn {
    private final MessagesTable.BindData a;
    private final MessagesTable.BindData b;
    private final ekgb c;
    private final epjf d;

    public bzwi(MessagesTable.BindData bindData, MessagesTable.BindData bindData2, ekgb ekgbVar, epjf epjfVar) {
        this.a = bindData;
        this.b = bindData2;
        this.c = ekgbVar;
        this.d = epjfVar;
    }

    @Override // defpackage.bzzn
    public final MessagesTable.BindData a() {
        return this.a;
    }

    @Override // defpackage.bzzn
    public final MessagesTable.BindData b() {
        return this.b;
    }

    @Override // defpackage.bzzn
    public final ekgb c() {
        return this.c;
    }

    @Override // defpackage.bzzn
    public final epjf d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzzn) {
            bzzn bzznVar = (bzzn) obj;
            if (this.a.equals(bzznVar.a()) && this.b.equals(bzznVar.b()) && ekjz.h(this.c, bzznVar.c()) && this.d.equals(bzznVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        epjf epjfVar = this.d;
        ekgb ekgbVar = this.c;
        MessagesTable.BindData bindData = this.b;
        return "MessageToOverwrite{duplicateMessageInBugleDb=" + this.a.toString() + ", duplicateMessageInCms=" + bindData.toString() + ", duplicatePartsInCms=" + ekgbVar.toString() + ", duplicateAdditionalFieldsInCms=" + epjfVar.toString() + "}";
    }
}
