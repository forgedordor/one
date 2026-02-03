package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class taj extends fcyz implements fdat {
    final /* synthetic */ dbxp a;
    final /* synthetic */ tbe b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taj(fcxy fcxyVar, dbxp dbxpVar, tbe tbeVar) {
        super(2, fcxyVar);
        this.a = dbxpVar;
        this.b = tbeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((taj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("checkHeuristics");
        long j = brdrVarD.b().j(MessagesTable.c.i);
        dbxp dbxpVar = this.a;
        evvp evvpVar = dbxpVar.c;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        if (evxc.a(evvpVar) > j) {
            this.b.l.g("Message timestamp check passed");
            return true;
        }
        long j2 = dbxpVar.d;
        tbe tbeVar = this.b;
        if (j2 <= ((Number) tbeVar.b.b()).longValue()) {
            tbeVar.l.g("Message count check passed");
            return true;
        }
        brdr brdrVarD2 = MessagesTable.d();
        brdrVarD2.A("checkHeuristics");
        if (brdrVarD2.b().h() == 0) {
            tbeVar.l.g("No messages found on source device");
            return false;
        }
        if (dbxpVar.d / r0 < ((Number) tbeVar.c.b()).doubleValue()) {
            tbeVar.l.g("Message count ratio check passed");
            return true;
        }
        tbeVar.l.g("No heuristics passed");
        return false;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        taj tajVar = new taj(fcxyVar, this.a, this.b);
        tajVar.c = obj;
        return tajVar;
    }
}
