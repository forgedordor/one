package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebkg extends ebka {
    private final String b;
    private final BigInteger c;
    private final long d;

    public ebkg(String str, ebkf ebkfVar, ebjy ebjyVar, String str2) {
        super(ebkfVar, ebjyVar, str2);
        this.b = str;
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + 2208988800L;
        this.c = BigInteger.valueOf(jCurrentTimeMillis);
        this.d = jCurrentTimeMillis;
    }

    public static ebkg e(String str) throws ebki, NumberFormatException {
        String strC = ebkk.c(str, "o=");
        String[] strArrSplit = strC.split(" ");
        if (strArrSplit.length != 6) {
            throw new ebki("Illegal format for origin: ".concat(String.valueOf(strC)));
        }
        String str2 = strArrSplit[0];
        String strReplace = strArrSplit[1].replace(".", "");
        try {
            BigInteger bigInteger = new BigInteger(strReplace);
            String strReplace2 = strArrSplit[2].replace(".", "");
            try {
                long j = Long.parseLong(strReplace2);
                String str3 = strArrSplit[3];
                return new ebkg(str2, bigInteger, j, ebkf.a, ebjy.b(strArrSplit[4]), strArrSplit[5]);
            } catch (NumberFormatException e) {
                throw new ebki("Invalid SDP format, numerical expected: ".concat(String.valueOf(strReplace2)), e);
            }
        } catch (NumberFormatException e2) {
            throw new ebki("Invalid SDP format, numerical expected: ".concat(String.valueOf(strReplace)), e2);
        }
    }

    @Override // defpackage.ebka, defpackage.ebkh
    public final void b(StringBuilder sb) {
        sb.append("o=");
        sb.append(this.b);
        sb.append(" ");
        sb.append(this.c.toString());
        sb.append(" ");
        sb.append(this.d);
        sb.append(" ");
        d(sb);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    @Override // defpackage.ebka
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebkg)) {
            return false;
        }
        ebkg ebkgVar = (ebkg) obj;
        return this.c.equals(ebkgVar.c) && TextUtils.equals(this.b, ebkgVar.b) && super.c(ebkgVar) && this.d == ebkgVar.d;
    }

    @Override // defpackage.ebka
    public final int hashCode() {
        int iHashCode = (((super.hashCode() * 37) + this.c.intValue()) * 37) + ((int) this.d);
        String str = this.b;
        return !TextUtils.isEmpty(str) ? (iHashCode * 37) + str.hashCode() : iHashCode;
    }

    protected ebkg(String str, BigInteger bigInteger, long j, ebkf ebkfVar, ebjy ebjyVar, String str2) {
        super(ebkfVar, ebjyVar, str2);
        this.b = str;
        this.c = bigInteger;
        this.d = j;
    }
}
