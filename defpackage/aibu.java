package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aibu extends fcyz implements fdat {
    final /* synthetic */ aice a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibu(fcxy fcxyVar, aice aiceVar) {
        super(2, fcxyVar);
        this.a = aiceVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aibu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        MessagesTable.d().A("getMessageCount");
        return new Long(r3.b().h());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aibu aibuVar = new aibu(fcxyVar, this.a);
        aibuVar.b = obj;
        return aibuVar;
    }
}
