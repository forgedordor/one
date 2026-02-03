package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chhe extends fcyz implements fdat {
    final /* synthetic */ chhh a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chhe(chhh chhhVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = chhhVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chhe) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        chhh chhhVar = this.a;
        ParticipantsTable.BindData bindDataB = ((bbca) chhhVar.a.b()).b(this.b);
        if (bindDataB != null) {
            return ((asqx) chhhVar.b.b()).a(bindDataB.T(), false);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chhe(this.a, this.b, fcxyVar);
    }
}
