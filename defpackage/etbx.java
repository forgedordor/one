package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etbx extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) {
        if (etdbVar.t() != 9) {
            return new StringBuilder(etdbVar.j());
        }
        etdbVar.p();
        return null;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        StringBuilder sb = (StringBuilder) obj;
        etddVar.m(sb == null ? null : sb.toString());
    }
}
