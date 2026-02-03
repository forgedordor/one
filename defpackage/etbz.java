package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etbz extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) {
        if (etdbVar.t() != 9) {
            return new StringBuffer(etdbVar.j());
        }
        etdbVar.p();
        return null;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        StringBuffer stringBuffer = (StringBuffer) obj;
        etddVar.m(stringBuffer == null ? null : stringBuffer.toString());
    }
}
