package defpackage;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnoc extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ Context c;
    final /* synthetic */ Locale d;
    final /* synthetic */ dnoe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnoc(Context context, Locale locale, dnoe dnoeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = context;
        this.d = locale;
        this.e = dnoeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnoc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            Locale locale = dnoe.a;
            Context context = this.c;
            Locale locale2 = this.d;
            context.getClass();
            locale2.getClass();
            File file = new File(new File(String.valueOf(context.getCacheDir().getPath()).concat("/emoji/search"), dngl.a(locale2)), "model");
            File file2 = true != file.isDirectory() ? null : file;
            if (file2 != null) {
                file2.delete();
            }
            if (!file.exists()) {
                if (fdbq.f(locale2, dnoe.a)) {
                    InputStream inputStreamOpen = context.getAssets().open("emoji_search_" + dngl.a(locale2) + ".zip");
                    try {
                        inputStreamOpen.getClass();
                        dnoe.c(inputStreamOpen, file, locale2);
                        fczl.a(inputStreamOpen, null);
                    } finally {
                    }
                } else {
                    dnoe dnoeVar = this.e;
                    dnnv dnnvVar = dnoeVar.b;
                    if (dnnvVar != null) {
                        this.a = file;
                        this.b = 1;
                        if (dnoeVar.a(dnnvVar, locale2, file, this) == fcylVar) {
                            return fcylVar;
                        }
                    }
                }
            }
            obj2 = file;
        }
        if (((File) obj2).exists()) {
            return obj2;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnoc(this.c, this.d, this.e, fcxyVar);
    }
}
