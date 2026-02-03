package defpackage;

import android.util.Base64;
import android.util.Log;
import com.android.vcard.VCardConstants;
import com.android.vcard.VCardEntryCommitter;
import com.android.vcard.VCardParser_V40;
import com.android.vcard.VCardProperty;
import java.util.ArrayList;
import java.util.Set;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qyi extends qyh {
    public qyi() {
    }

    public static String x(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\\') {
                sb.append(cCharAt);
            } else if (i < length - 1) {
                i++;
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 == 'n' || cCharAt2 == 'N') {
                    sb.append("\n");
                } else {
                    sb.append(cCharAt2);
                }
            } else {
                cCharAt = '\\';
                sb.append(cCharAt);
            }
            i++;
        }
        return sb.toString();
    }

    @Override // defpackage.qyh, com.android.vcard.VCardParserImpl_V21
    protected final int a() {
        return 2;
    }

    @Override // defpackage.qyh, com.android.vcard.VCardParserImpl_V21
    protected final String e() {
        return VCardConstants.VERSION_V40;
    }

    @Override // defpackage.qyh, com.android.vcard.VCardParserImpl_V21
    protected final String f(String str) {
        return x(str);
    }

    @Override // defpackage.qyh, com.android.vcard.VCardParserImpl_V21
    protected final Set h() {
        return VCardParser_V40.sKnownPropertyNameSet;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    public final void p(VCardProperty vCardProperty, String str) throws qyq {
        Matcher matcher;
        String rawValue = vCardProperty.getRawValue();
        if ((!str.equals(VCardConstants.PROPERTY_PHOTO) && !str.equals(VCardConstants.PROPERTY_LOGO)) || !rawValue.startsWith("data:")) {
            super.p(vCardProperty, str);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(x(rawValue));
        vCardProperty.setValues(arrayList);
        try {
            matcher = qyl.a.matcher(rawValue);
        } catch (OutOfMemoryError unused) {
            Log.e(VCardEntryCommitter.LOG_TAG, "OutOfMemoryError happened during parsing BASE64 data!");
        } catch (qyt e) {
            throw new qyq("Data uri has an invalid format", e);
        }
        if (!matcher.matches()) {
            throw new qyt("[" + rawValue + "] is not a valid data uri");
        }
        String strGroup = matcher.group(2);
        String strGroup2 = matcher.group(4);
        try {
            vCardProperty.setDataUri(new qyl(strGroup, Base64.decode(strGroup2, 0)));
            k(vCardProperty);
        } catch (IllegalArgumentException e2) {
            throw new qyt("Decode error on base64 photo: ".concat(String.valueOf(strGroup2)), e2);
        }
    }

    @Override // defpackage.qyh
    protected final void v(VCardProperty vCardProperty, String str, String str2) {
        int length;
        StringBuilder sb = new StringBuilder(str2);
        if (VCardParser_V40.valueListParameters.contains(ejuf.d(str)) && (length = str2.length()) > 1) {
            char cCharAt = sb.charAt(0);
            int i = length - 1;
            char cCharAt2 = sb.charAt(i);
            if (cCharAt == '\"' && cCharAt2 == '\"') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(0);
            }
        }
        super.v(vCardProperty, str, sb.toString());
    }

    public qyi(byte[] bArr) {
        super(null);
    }
}
