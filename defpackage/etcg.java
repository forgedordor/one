package defpackage;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etcg extends esyv {
    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) {
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(etdbVar.j(), "_");
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        etddVar.m(locale == null ? null : locale.toString());
    }
}
