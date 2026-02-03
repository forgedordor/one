package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esxy extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) {
        if (etdbVar.t() != 9) {
            return Double.valueOf(etdbVar.a());
        }
        etdbVar.p();
        return null;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            etddVar.j();
            return;
        }
        double dDoubleValue = number.doubleValue();
        esyd.l(dDoubleValue);
        etddVar.c();
        if (etddVar.d == 1 || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            etddVar.a();
            etddVar.a.append((CharSequence) Double.toString(dDoubleValue));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + dDoubleValue);
        }
    }
}
