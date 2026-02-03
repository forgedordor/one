package defpackage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etcb extends esyv {
    public static final URI c(etdb etdbVar) throws IOException {
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        try {
            String strJ = etdbVar.j();
            if (strJ.equals("null")) {
                return null;
            }
            return new URI(strJ);
        } catch (URISyntaxException e) {
            throw new esyk(e);
        }
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) {
        return c(etdbVar);
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        etddVar.m(uri == null ? null : uri.toASCIIString());
    }
}
