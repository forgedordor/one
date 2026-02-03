package defpackage;

import com.android.vcard.VCardConstants;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fevb extends feou {
    private static final long serialVersionUID = -902100715801867636L;
    private BigDecimal c;
    private BigDecimal d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevb() {
        super(VCardConstants.PROPERTY_GEO);
        fera feraVar = fera.a;
        this.c = BigDecimal.valueOf(0L);
        this.d = BigDecimal.valueOf(0L);
    }

    @Override // defpackage.fenc
    public final String a() {
        return String.valueOf(this.c) + ";" + String.valueOf(this.d);
    }

    @Override // defpackage.feou
    public final void c(String str) {
        String strSubstring = str.substring(0, str.indexOf(59));
        if (ffhe.a(strSubstring)) {
            this.c = new BigDecimal(strSubstring);
        } else {
            this.c = BigDecimal.valueOf(0L);
        }
        String strSubstring2 = str.substring(str.indexOf(59) + 1);
        if (ffhe.a(strSubstring2)) {
            this.d = new BigDecimal(strSubstring2);
        } else {
            this.d = BigDecimal.valueOf(0L);
        }
    }
}
