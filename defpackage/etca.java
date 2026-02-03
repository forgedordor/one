package defpackage;

import java.io.IOException;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etca extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        String strJ = etdbVar.j();
        if (strJ.equals("null")) {
            return null;
        }
        return new URL(strJ);
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        URL url = (URL) obj;
        etddVar.m(url == null ? null : url.toExternalForm());
    }
}
