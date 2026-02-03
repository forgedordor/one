package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etcj extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        int iT = etdbVar.t();
        if (iT != 9) {
            return iT == 6 ? Boolean.valueOf(Boolean.parseBoolean(etdbVar.j())) : Boolean.valueOf(etdbVar.s());
        }
        etdbVar.p();
        return null;
    }

    @Override // defpackage.esyv
    public final /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            etddVar.j();
            return;
        }
        etddVar.c();
        etddVar.a();
        etddVar.a.write(true != bool.booleanValue() ? "false" : "true");
    }
}
