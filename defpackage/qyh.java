package defpackage;

import android.util.Log;
import com.android.vcard.VCardConstants;
import com.android.vcard.VCardEntryCommitter;
import com.android.vcard.VCardParserImpl_V21;
import com.android.vcard.VCardParser_V30;
import com.android.vcard.VCardProperty;
import com.android.vcard.VCardUtils;
import java.io.IOException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qyh extends VCardParserImpl_V21 {
    private String f;
    private boolean g;

    public qyh() {
        this.g = false;
    }

    protected static final String w(String str) {
        return VCardUtils.convertStringCharset(str, "ISO-8859-1", "UTF-8");
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected int a() {
        return 1;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected final String c() {
        String str = this.f;
        if (str == null) {
            return this.c.readLine();
        }
        this.f = null;
        return str;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected final String d() throws qyq, IOException {
        String line;
        String string = null;
        StringBuilder sb = null;
        while (true) {
            line = this.c.readLine();
            if (line == null) {
                break;
            }
            if (line.length() != 0) {
                if (line.charAt(0) == ' ' || line.charAt(0) == '\t') {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    String str = this.f;
                    if (str != null) {
                        sb.append(str);
                        this.f = null;
                    }
                    sb.append((CharSequence) line, 1, line.length());
                } else {
                    if (sb != null) {
                        break;
                    }
                    if (this.f != null) {
                        sb = null;
                        break;
                    }
                    this.f = line;
                }
            }
        }
        if (sb != null) {
            string = sb.toString();
        } else {
            String str2 = this.f;
            if (str2 != null) {
                string = str2;
            }
        }
        this.f = line;
        if (string != null) {
            return string;
        }
        throw new qyq("Reached end of buffer.");
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected String e() {
        return VCardConstants.VERSION_V30;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected String f(String str) {
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

    @Override // com.android.vcard.VCardParserImpl_V21
    protected Set h() {
        return VCardParser_V30.sKnownPropertyNameSet;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected final void l(VCardProperty vCardProperty) {
        if (this.g) {
            return;
        }
        Log.w(VCardEntryCommitter.LOG_TAG, "AGENT in vCard 3.0 is not supported yet. Ignore it");
        this.g = true;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected final void m(VCardProperty vCardProperty, String str, String str2) {
        v(vCardProperty, str, str2);
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected final void n(VCardProperty vCardProperty, String str) {
        q(vCardProperty, str);
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    public final void o(VCardProperty vCardProperty, String str) throws qyq {
        try {
            super.o(vCardProperty, str);
        } catch (qyq e) {
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                throw new qyq("Unknown params value: ".concat(String.valueOf(str)), e);
            }
            v(vCardProperty, strArrSplit[0], strArrSplit[1]);
        }
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    public final void q(VCardProperty vCardProperty, String str) {
        v(vCardProperty, VCardConstants.PARAM_TYPE, str);
    }

    protected void v(VCardProperty vCardProperty, String str, String str2) {
        int length = str2.length();
        boolean z = false;
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '\"') {
                if (z) {
                    vCardProperty.addParameter(str, w(sb.toString()));
                    z = false;
                } else {
                    z = true;
                    if (sb != null) {
                        if (sb.length() > 0) {
                            Log.w(VCardEntryCommitter.LOG_TAG, "Unexpected Dquote inside property.");
                        } else {
                            vCardProperty.addParameter(str, w(sb.toString()));
                        }
                    }
                }
                sb = null;
            } else {
                if (cCharAt == ',') {
                    if (z) {
                        cCharAt = ',';
                    } else {
                        if (sb == null) {
                            Log.w(VCardEntryCommitter.LOG_TAG, a.a(str2, "Comma is used before actual string comes. (", ")"));
                        } else {
                            vCardProperty.addParameter(str, w(sb.toString()));
                        }
                        sb = null;
                    }
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(cCharAt);
            }
        }
        if (z) {
            Log.d(VCardEntryCommitter.LOG_TAG, "Dangling Dquote.");
        }
        if (sb != null) {
            if (sb.length() == 0) {
                Log.w(VCardEntryCommitter.LOG_TAG, "Unintended behavior. We must not see empty StringBuilder at the end of parameter value parsing.");
            } else {
                vCardProperty.addParameter(str, w(sb.toString()));
            }
        }
    }

    public qyh(byte[] bArr) {
        super(null);
        this.g = false;
    }

    @Override // com.android.vcard.VCardParserImpl_V21
    protected final String b(String str) {
        return str;
    }
}
