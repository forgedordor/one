package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etcn extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) {
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        try {
            return Integer.valueOf(etdbVar.c());
        } catch (NumberFormatException e) {
            throw new esyr(e);
        }
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        if (((Number) obj) == null) {
            etddVar.j();
        } else {
            etddVar.k(r4.intValue());
        }
    }
}
