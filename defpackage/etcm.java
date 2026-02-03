package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etcm extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        try {
            int iC = etdbVar.c();
            if (iC <= 65535 && iC >= -32768) {
                return Short.valueOf((short) iC);
            }
            throw new esyr("Lossy conversion from " + iC + " to short; at path " + etdbVar.f());
        } catch (NumberFormatException e) {
            throw new esyr(e);
        }
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        if (((Number) obj) == null) {
            etddVar.j();
        } else {
            etddVar.k(r4.shortValue());
        }
    }
}
