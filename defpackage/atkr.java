package defpackage;

import android.net.Uri;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atkr extends fcyz implements fdat {
    final /* synthetic */ Uri a;
    final /* synthetic */ aubx b;
    final /* synthetic */ athh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atkr(Uri uri, aubx aubxVar, athh athhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = uri;
        this.b = aubxVar;
        this.c = athhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atkr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Uri uri = this.a;
        aubx aubxVar = this.b;
        final athh athhVar = this.c;
        eieu eieuVarH = eiiy.h("FileProcessingDatabaseOperations#updateFileTransferEntryWithEncryptedFileInfo");
        try {
            String[] strArr = atmx.a;
            atmu atmuVar = new atmu();
            atmuVar.ap("updateFileTransferEntryWithEncryptedFileInfo");
            atmuVar.e(uri);
            atmuVar.c(aubxVar);
            atmuVar.i(new Function() { // from class: atkq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    atmw atmwVar = (atmw) obj2;
                    atmwVar.c(athhVar);
                    atmwVar.b(atmy.a);
                    return atmwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (atmuVar.b().e() > 0) {
                ekrw ekrwVarE = atkz.a.e();
                ekrwVarE.X(eksq.a, "BugleFileTransfer");
                ekrd ekrdVar = (ekrd) ekrwVarE;
                ekrdVar.X(coie.j, athhVar);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl$updateFileTransferEntryWithEncryptedFileInfo$2", "invokeSuspend", 185, "FileProcessingDatabaseOperationsImpl.kt")).q("Updated file processing table entry with encrypted file info.");
            } else {
                ekrw ekrwVarJ = atkz.a.j();
                ekrwVarJ.X(eksq.a, "BugleFileTransfer");
                ekrd ekrdVar2 = (ekrd) ekrwVarJ;
                ekrdVar2.X(coie.j, athhVar);
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl$updateFileTransferEntryWithEncryptedFileInfo$2", "invokeSuspend", 190, "FileProcessingDatabaseOperationsImpl.kt")).q("Failed to update file processing table entry with encrypted file info.");
            }
            fczl.a(eieuVarH, null);
            return fctx.a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atkr(this.a, this.b, this.c, fcxyVar);
    }
}
