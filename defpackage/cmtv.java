package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.SparseIntArray;
import com.google.android.apps.messaging.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmtv {
    public static SparseIntArray b;
    public final fcsu c;
    private final fcsu f;
    private static final char[] d = {' ', '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~'};
    private static final ekhx e = ekhx.s((char) 8205, (char) 8419, (char) 65039);
    public static final SparseIntArray a = new SparseIntArray();

    static {
        for (int i = 0; i < 95; i++) {
            a.put(d[i], i + 32);
        }
        SparseIntArray sparseIntArray = a;
        sparseIntArray.put(10, 10);
        sparseIntArray.put(13, 13);
        b = null;
    }

    public cmtv(fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = fcsuVar;
        this.f = fcsuVar2;
    }

    public static SparseIntArray a(Context context, boolean z) {
        XmlResourceParser xml;
        SparseIntArray sparseIntArray = new SparseIntArray();
        try {
            xml = z ? context.getResources().getXml(R.xml.gsm_sms_7bit_translation_table) : context.getResources().getXml(R.xml.cdma_sms_7bit_translation_table);
        } catch (Resources.NotFoundException e2) {
            cqca.p("Bugle", e2, "Failed to load 7bit translation table XML: ".concat(e2.toString()));
        } catch (IOException e3) {
            cqca.p("Bugle", e3, "Could not read 7bit translation table XML: ".concat(e3.toString()));
        } catch (XmlPullParserException e4) {
            cqca.p("Bugle", e4, "Could not parse 7bit translation table XML: ".concat(e4.toString()));
        }
        if (xml == null) {
            cqca.n("Bugle", "Failed to load 7bit translation table XML: empty");
            return sparseIntArray;
        }
        while (true) {
            int next = xml.next();
            if (next == 1) {
                break;
            }
            if (next == 2) {
                String name = xml.getName();
                if (name.equals("translation")) {
                    int attributeUnsignedIntValue = xml.getAttributeUnsignedIntValue(null, "from", -1);
                    int attributeUnsignedIntValue2 = xml.getAttributeUnsignedIntValue(null, "to", -1);
                    if (attributeUnsignedIntValue == -1 || attributeUnsignedIntValue2 == -1) {
                        cqca.n("Bugle", "Invalid table file format: missing from or to");
                    } else {
                        sparseIntArray.put(attributeUnsignedIntValue, attributeUnsignedIntValue2);
                    }
                } else if (!name.equals("unicode_to_gsm_7bit_supported_character")) {
                    cqca.n("Bugle", "Invalid table file format: wrong tag");
                }
            }
        }
        return sparseIntArray;
    }

    public final boolean b(char c) {
        if (c >= 1024 && c <= 7360) {
            return false;
        }
        if (c >= 11264 && c <= 11359) {
            return false;
        }
        if (c >= 11520 && c <= 11775) {
            return false;
        }
        if (c >= 11904 && c <= 13168) {
            return false;
        }
        if (c >= 13280 && c <= 40908) {
            return false;
        }
        if (c >= 40960 && c <= 55295) {
            return false;
        }
        if ((c < 55296 || c > 57343) && !((cqmb) this.f.b()).g(String.valueOf(c))) {
            ekhx ekhxVar = e;
            Character chValueOf = Character.valueOf(c);
            return (ekhxVar.contains(chValueOf) || cknv.a.contains(chValueOf)) ? false : true;
        }
        return false;
    }

    public final boolean c(String str) {
        for (char c : str.toCharArray()) {
            if (!b(c)) {
                return false;
            }
        }
        return true;
    }
}
