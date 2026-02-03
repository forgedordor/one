package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wng implements wms {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/converter/LocalVideoConverter");

    @Override // defpackage.wms
    public final Object a(vvr vvrVar, wmv wmvVar, String str, fcxy fcxyVar) {
        dltd dltdVar = vvrVar.a;
        if (!(dltdVar instanceof doju)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        doju dojuVar = (doju) dltdVar;
        String str2 = dojuVar.b;
        vvq vvqVar = vvrVar.b;
        Uri uri = vvqVar.c;
        Uri uri2 = Uri.parse(str2);
        Uri uri3 = uri == null ? uri2 : uri;
        dojm dojmVar = dojuVar.a;
        String strA = ((dojmVar instanceof doja) || fdbq.f(dojmVar, dojb.a)) ? "video/mp4" : dogh.a(dojmVar).a();
        uri3.getClass();
        boolean z = dojuVar.f instanceof dmbx;
        woa woaVar = new woa(strA, uri3, true != z ? null : uri2, new Size(dojuVar.c, dojuVar.d), dojuVar.g, dojuVar.e, vvt.e(vvrVar), z, vvqVar.b);
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/converter/LocalVideoConverter", "convert", 48, "LocalVideoConverter.kt")).H("MapiVideoContent isResizable %s, saveToExternalStorage %b", woaVar.a, woaVar.b);
        return new wno(woaVar, uri2);
    }
}
