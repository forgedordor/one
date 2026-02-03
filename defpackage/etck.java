package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etck extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) {
        if (etdbVar.t() != 9) {
            return Boolean.valueOf(etdbVar.j());
        }
        etdbVar.p();
        return null;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        etddVar.m(bool == null ? "null" : bool.toString());
    }
}
