package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etbs extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        String strJ = etdbVar.j();
        if (strJ.length() == 1) {
            return Character.valueOf(strJ.charAt(0));
        }
        throw new esyr(a.V(strJ, etdbVar, "Expecting character, got: ", "; at "));
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        Character ch = (Character) obj;
        etddVar.m(ch == null ? null : ch.toString());
    }
}
