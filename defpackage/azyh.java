package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azyh implements azvp {
    @Override // defpackage.azvp
    public final long a() {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("queryTableMaxId");
        return brdrVarD.b().j(MessagesTable.c.a);
    }

    @Override // defpackage.azvp
    public final azwc b() {
        return azvt.b;
    }

    @Override // defpackage.azvp
    public final dqtq c() {
        String[] strArr = MessagesTable.a;
        return new dqtq("messages", "$primary");
    }

    @Override // defpackage.azvp
    public final /* synthetic */ String d() {
        return azvo.a(this);
    }

    @Override // defpackage.azvp
    public final /* synthetic */ int e() {
        return azvo.b(this);
    }
}
