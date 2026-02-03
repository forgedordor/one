package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvx extends fcyz implements fdat {
    final /* synthetic */ long a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvx(fcxy fcxyVar, long j) {
        super(2, fcxyVar);
        this.a = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahvx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = btsn.a;
        btsk btskVar = new btsk();
        btskVar.ap("markRestoreWorkflowFileAsRestored");
        btso btsoVar = btso.b;
        if (btsoVar == null) {
            btskVar.a.putNull("status");
        } else {
            btskVar.a.put("status", Integer.valueOf(btsoVar.ordinal()));
        }
        long j = this.a;
        btsm btsmVar = new btsm();
        btsmVar.ap(new dqty("restore_workflow_files._id", 1, Long.valueOf(j)));
        return Boolean.valueOf(btskVar.aj(new btsl(btsmVar), "restore_workflow_files-buildAndUpdateForId"));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahvx ahvxVar = new ahvx(fcxyVar, this.a);
        ahvxVar.b = obj;
        return ahvxVar;
    }
}
