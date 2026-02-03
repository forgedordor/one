package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class azyi implements azvp {
    public static final azyi a = new azyi();

    private azyi() {
    }

    @Override // defpackage.azvp
    public final long a() {
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.A("queryTableMaxId");
        return bsjeVarC.b().j(PartsTable.d.a);
    }

    @Override // defpackage.azvp
    public final azwc b() {
        return azvt.d;
    }

    @Override // defpackage.azvp
    public final dqtq c() {
        String[] strArr = PartsTable.a;
        return new dqtq("parts", "$primary");
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
