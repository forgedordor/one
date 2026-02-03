package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edxa extends fcyz implements fdap {
    int a;
    final /* synthetic */ edxi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edxa(edxi edxiVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = edxiVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        edxi edxiVar = this.b;
        this.a = 1;
        Context context = edxiVar.i.a;
        String strValueOf = String.valueOf(context.getPackageName());
        if (!context.getCacheDir().exists()) {
            context.getCacheDir().mkdirs();
        }
        File file = new File(context.getCacheDir(), "photopicker_images");
        if (!file.exists()) {
            file.mkdirs();
        }
        Uri uriA = FileProvider.a(context, strValueOf.concat(".photopicker_images"), new File(file, "camera_image.jpg"));
        uriA.getClass();
        return uriA == fcylVar ? fcylVar : uriA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new edxa(this.b, (fcxy) obj).b(fctx.a);
    }
}
