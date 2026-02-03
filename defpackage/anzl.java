package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anzl extends fcyz implements fdat {
    int a;
    final /* synthetic */ anzn b;
    final /* synthetic */ ParticipantsTable.BindData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anzl(anzn anznVar, ParticipantsTable.BindData bindData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = anznVar;
        this.c = bindData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anzl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        anzv anzvVar = (anzv) this.b.c.b();
        ParticipantsTable.BindData bindData = this.c;
        this.a = 1;
        Object objC = anzvVar.c(bindData, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anzl(this.b, this.c, fcxyVar);
    }
}
