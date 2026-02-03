package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bygd extends bzaq {
    public MessagesTable.BindData a;
    public ekgb b;
    public bpvd c;
    private String d;
    private Optional e = Optional.empty();

    @Override // defpackage.bzaq
    public final bzar a() {
        MessagesTable.BindData bindData;
        ekgb ekgbVar;
        String str = this.d;
        if (str != null && (bindData = this.a) != null && (ekgbVar = this.b) != null) {
            return new byge(str, bindData, ekgbVar, this.e, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" cmsId");
        }
        if (this.a == null) {
            sb.append(" messagesTableBindData");
        }
        if (this.b == null) {
            sb.append(" partsTableBindDataList");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.bzaq
    public final void b(epjf epjfVar) {
        this.e = Optional.of(epjfVar);
    }

    @Override // defpackage.bzaq
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null cmsId");
        }
        this.d = str;
    }
}
