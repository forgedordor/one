package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aibv extends fcyz implements fdat {
    final /* synthetic */ aice a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibv(fcxy fcxyVar, aice aiceVar) {
        super(2, fcxyVar);
        this.a = aiceVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aibv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("getOldestMessageTimestamp");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(brdrVarD.b().k(MessagesTable.c.i));
        instantOfEpochMilli.getClass();
        return evxd.b(instantOfEpochMilli);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aibv aibvVar = new aibv(fcxyVar, this.a);
        aibvVar.b = obj;
        return aibvVar;
    }
}
