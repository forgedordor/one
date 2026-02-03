package defpackage;

import java.io.IOException;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etch extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException, NumberFormatException {
        BitSet bitSet = new BitSet();
        etdbVar.l();
        int iT = etdbVar.t();
        int i = 0;
        while (iT != 2) {
            int i2 = iT - 1;
            if (i2 == 5 || i2 == 6) {
                int iC = etdbVar.c();
                if (iC != 0) {
                    if (iC != 1) {
                        throw new esyr("Invalid bitset value " + iC + ", expected 0 or 1; at path " + etdbVar.f());
                    }
                    bitSet.set(i);
                } else {
                    continue;
                }
            } else {
                if (i2 != 7) {
                    throw new esyr("Invalid bitset value type: " + etdc.a(iT) + "; at path " + etdbVar.e());
                }
                if (etdbVar.s()) {
                    bitSet.set(i);
                }
            }
            i++;
            iT = etdbVar.t();
        }
        etdbVar.n();
        return bitSet;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        etddVar.e();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            etddVar.k(bitSet.get(i) ? 1L : 0L);
        }
        etddVar.g();
    }
}
