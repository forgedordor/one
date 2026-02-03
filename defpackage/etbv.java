package defpackage;

import java.io.IOException;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etbv extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        String strJ = etdbVar.j();
        try {
            return etam.b(strJ);
        } catch (NumberFormatException e) {
            throw new esyr(a.V(strJ, etdbVar, "Failed parsing '", "' as BigInteger; at path "), e);
        }
    }

    @Override // defpackage.esyv
    public final /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        etddVar.l((BigInteger) obj);
    }
}
