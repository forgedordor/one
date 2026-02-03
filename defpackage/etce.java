package defpackage;

import java.io.IOException;
import java.util.Currency;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etce extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        String strJ = etdbVar.j();
        try {
            return Currency.getInstance(strJ);
        } catch (IllegalArgumentException e) {
            throw new esyr(a.V(strJ, etdbVar, "Failed parsing '", "' as Currency; at path "), e);
        }
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        etddVar.m(((Currency) obj).getCurrencyCode());
    }
}
