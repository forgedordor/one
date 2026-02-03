package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fewp extends feou {
    public static final fewp c = new fewo();
    private static final long serialVersionUID = 8872508067309087704L;
    private String d;
    private String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fewp() {
        super(VCardConstants.PROPERTY_VERSION);
        fera feraVar = fera.a;
    }

    @Override // defpackage.fenc
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.d;
        if (str != null) {
            stringBuffer.append(str);
            if (this.e != null) {
                stringBuffer.append(';');
            }
        }
        String str2 = this.e;
        if (str2 != null) {
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.feou
    public void c(String str) {
        if (str.indexOf(59) < 0) {
            this.e = str;
        } else {
            this.d = str.substring(0, str.indexOf(59) - 1);
            this.e = str.substring(str.indexOf(59));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fewp(feor feorVar) {
        super(VCardConstants.PROPERTY_VERSION, feorVar);
        fera feraVar = fera.a;
        this.e = "2.0";
    }
}
