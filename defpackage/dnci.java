package defpackage;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnci extends fcyz implements fdat {
    final /* synthetic */ dncj a;
    final /* synthetic */ doig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnci(dncj dncjVar, doig doigVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dncjVar;
        this.b = doigVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnci) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dncj dncjVar = this.a;
        Context context = dncjVar.a;
        File file = new File(context.getFilesDir(), "hugo");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, dncjVar.c);
        if (!file2.exists()) {
            file2.mkdir();
        }
        long epochMilli = dncjVar.b.a().toEpochMilli();
        doig doigVar = this.b;
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(doigVar.a());
        if (extensionFromMimeType == null) {
            ((ekrd) doig.a.j().h("com/google/android/libraries/compose/media/MediaType", "toFileExtension", 31, "MediaType.kt")).t("'%s' extension not found, returning null", doigVar);
        }
        extensionFromMimeType.getClass();
        File file3 = new File(file2, epochMilli + "." + extensionFromMimeType);
        if (!file3.exists()) {
            file3.createNewFile();
        }
        Uri uriA = FileProvider.a(context, "com.google.android.libraries.compose.core.data.content", file3);
        context.grantUriPermission(context.getApplicationContext().getPackageName(), uriA, 2);
        return uriA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnci(this.a, this.b, fcxyVar);
    }
}
