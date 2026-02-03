package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atku extends fcyz implements fdat {
    final /* synthetic */ aucl a;
    final /* synthetic */ atkz b;
    final /* synthetic */ athh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atku(aucl auclVar, atkz atkzVar, athh athhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = auclVar;
        this.b = atkzVar;
        this.c = athhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atku) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        atkz atkzVar = this.b;
        athh athhVar = this.c;
        aucl auclVar = this.a;
        eieu eieuVarH = eiiy.h("FileProcessingDatabaseOperations#updateFileTransferEntryWithHttpRequestResult-file");
        try {
            aucj aucjVar = auclVar.c;
            if (aucjVar == null) {
                aucjVar = aucj.a;
            }
            aucjVar.getClass();
            atkzVar.x(athhVar, aucjVar, atmy.a);
            fczl.a(eieuVarH, null);
            aucj aucjVar2 = this.a.d;
            if (aucjVar2 == null) {
                aucjVar2 = aucj.a;
            }
            aucjVar2.getClass();
            if (!aucjVar2.equals(aucj.a)) {
                atkz atkzVar2 = this.b;
                athh athhVar2 = this.c;
                eieuVarH = eiiy.h("FileProcessingDatabaseOperations#updateFileTransferEntryWithHttpRequestResult-thumbnail");
                try {
                    atkzVar2.x(athhVar2, aucjVar2, atmy.b);
                    fczl.a(eieuVarH, null);
                } finally {
                }
            }
            return fctx.a;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atku(this.a, this.b, this.c, fcxyVar);
    }
}
