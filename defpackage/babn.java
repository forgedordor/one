package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class babn implements azvp {
    public static final babn a = new babn();

    private babn() {
    }

    @Override // defpackage.azvp
    public final long a() {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("queryTableMaxId");
        return bsboVarE.b().j(ParticipantsTable.c.a);
    }

    @Override // defpackage.azvp
    public final azwc b() {
        return azvt.c;
    }

    @Override // defpackage.azvp
    public final dqtq c() {
        String[] strArr = ParticipantsTable.a;
        return new dqtq("participants", "$primary");
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
