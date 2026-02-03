package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ebka extends ebkh {
    public final String a;
    private final ebkf b;
    private final ebjy c;

    public ebka(ebkf ebkfVar, ebjy ebjyVar, String str) {
        if (ebkfVar == null) {
            throw new IllegalArgumentException("Network type must not be null");
        }
        if (ebjyVar == null) {
            throw new IllegalArgumentException("Address type must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("Address must not be null");
        }
        this.b = ebkfVar;
        this.c = ebjyVar;
        this.a = str;
    }

    public static ebka a(String str) {
        String strC = ebkk.c(str, "c=");
        String[] strArrSplit = strC.split(" ");
        if (strArrSplit.length != 3) {
            throw new ebki("Illegal format for connection info: ".concat(String.valueOf(strC)));
        }
        String str2 = strArrSplit[0];
        return new ebka(ebkf.a, ebjy.b(strArrSplit[1]), strArrSplit[2]);
    }

    @Override // defpackage.ebkh
    public void b(StringBuilder sb) {
        sb.append("c=");
        d(sb);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
    }

    protected final boolean c(ebka ebkaVar) {
        return this.c == ebkaVar.c && this.b == ebkaVar.b && TextUtils.equals(this.a, ebkaVar.a);
    }

    protected final void d(StringBuilder sb) {
        sb.append(this.b);
        sb.append(" ");
        sb.append(this.c);
        sb.append(" ");
        sb.append(this.a);
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == ebka.class) {
            return c((ebka) obj);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.b.hashCode() * 37) + this.c.hashCode();
        String str = this.a;
        return !TextUtils.isEmpty(str) ? (iHashCode * 37) + str.hashCode() : iHashCode;
    }
}
