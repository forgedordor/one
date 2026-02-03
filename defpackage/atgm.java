package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atgm extends fcyz implements fdat {
    final /* synthetic */ atgs a;
    final /* synthetic */ athh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atgm(fcxy fcxyVar, atgs atgsVar, athh athhVar) {
        super(2, fcxyVar);
        this.a = atgsVar;
        this.b = athhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atgm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        try {
            atgk atgkVar = this.a.b;
            ((cazj) atgkVar.a.b()).e("file_transfer_processor", athg.b(this.b));
        } catch (IndexOutOfBoundsException unused) {
            ekrw ekrwVarE = atgs.a.e();
            ekrwVarE.X(eksq.a, "BugleFileTransfer");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(coie.j, this.b);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/FileTransferProcessorWithRetries$cancelWorkItemIfNeeded$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 116, "FileTransferProcessorWithRetries.kt")).q("Nothing to cancel - the work item either finished or was never scheduled.");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        atgm atgmVar = new atgm(fcxyVar, this.a, this.b);
        atgmVar.c = obj;
        return atgmVar;
    }
}
