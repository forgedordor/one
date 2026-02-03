package defpackage;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cznm implements eind {
    final /* synthetic */ czmx a;

    public cznm(czmx czmxVar) {
        this.a = czmxVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) throws IOException {
        czmx czmxVar = this.a;
        if (czmxVar.x()) {
            czmxVar.g(czmxVar.aj);
        } else if (czmxVar.N != null) {
            if (czmxVar.t != null) {
                czmxVar.B(4);
                czmxVar.A(4);
            }
            if (((Boolean) ((cczi) crbf.aC.get()).e()).booleanValue() && cqmz.v(czmxVar.N.b())) {
                egps egpsVar = czmxVar.aj;
                egpr egprVar = czmxVar.e;
                final czoi czoiVar = czmxVar.al;
                Uri uriB = czmxVar.N.b();
                final String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uriB.toString());
                egprVar.h(new egpq(eiju.g(rdo.a(czoiVar.c.b().i(uriB))).h(new ejvr() { // from class: czoh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) throws IOException {
                        String str = fileExtensionFromUrl;
                        File file = (File) obj;
                        if (true == ejwk.c(str)) {
                            str = "png";
                        }
                        Context context = czoiVar.b;
                        Uri uriD = bxlf.d(str, context);
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                Uri uriD2 = cqmz.d(context, fileInputStream, uriD);
                                fileInputStream.close();
                                return uriD2 != null ? uriD2 : Uri.EMPTY;
                            } finally {
                            }
                        } catch (IOException unused) {
                            return Uri.EMPTY;
                        }
                    }
                }, czoiVar.a)), new egpo(czmxVar.N.b()), egpsVar);
            } else {
                czmxVar.u(czmxVar.N.b(), czmxVar.N.h());
            }
        }
        return eine.a;
    }
}
