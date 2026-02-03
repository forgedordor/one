package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atky extends fcyz implements fdat {
    final /* synthetic */ atkz a;
    final /* synthetic */ athh b;
    final /* synthetic */ cbtf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atky(atkz atkzVar, athh athhVar, cbtf cbtfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = atkzVar;
        this.b = athhVar;
        this.c = cbtfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atky) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        atkz atkzVar = this.a;
        athh athhVar = this.b;
        cbtf cbtfVar = this.c;
        eieu eieuVarH = eiiy.h("FileProcessingDatabaseOperations#updateFileTransferEntryWithThumbnailEncryptionMetadata");
        try {
            atkzVar.v(athhVar, cbtfVar, atmy.b);
            fczl.a(eieuVarH, null);
            return fctx.a;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atky(this.a, this.b, this.c, fcxyVar);
    }
}
