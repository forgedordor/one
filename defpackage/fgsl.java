package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgsl implements Cloneable {
    public static final Map a = new HashMap();
    private static final String[] j;
    private static final String[] k;
    private static final String[] l;
    private static final String[] m;
    private static final String[] n;
    private static final String[] o;
    private static final String[] p;
    public String b;
    public final String c;
    public boolean d = true;
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    private boolean q = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, "frame", "noframes", "section", "nav", "aside", "hgroup", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.HEADER, "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        j = strArr;
        k = new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", GroupManagementRequest.DATA_TAG, "bdi", "s", "strike", "nobr"};
        l = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        m = new String[]{ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
        n = new String[]{"pre", "plaintext", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, "textarea"};
        o = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        p = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (int i = 0; i < 69; i++) {
            d(new fgsl(strArr[i]));
        }
        String[] strArr2 = k;
        int length = strArr2.length;
        for (int i2 = 0; i2 < 68; i2++) {
            fgsl fgslVar = new fgsl(strArr2[i2]);
            fgslVar.d = false;
            fgslVar.e = false;
            d(fgslVar);
        }
        String[] strArr3 = l;
        int length2 = strArr3.length;
        for (int i3 = 0; i3 < 21; i3++) {
            fgsl fgslVar2 = (fgsl) a.get(strArr3[i3]);
            fgqz.g(fgslVar2);
            fgslVar2.f = true;
        }
        String[] strArr4 = m;
        int length3 = strArr4.length;
        for (int i4 = 0; i4 < 19; i4++) {
            fgsl fgslVar3 = (fgsl) a.get(strArr4[i4]);
            fgqz.g(fgslVar3);
            fgslVar3.e = false;
        }
        String[] strArr5 = n;
        int length4 = strArr5.length;
        for (int i5 = 0; i5 < 4; i5++) {
            fgsl fgslVar4 = (fgsl) a.get(strArr5[i5]);
            fgqz.g(fgslVar4);
            fgslVar4.h = true;
        }
        String[] strArr6 = o;
        int length5 = strArr6.length;
        for (int i6 = 0; i6 < 8; i6++) {
            fgsl fgslVar5 = (fgsl) a.get(strArr6[i6]);
            fgqz.g(fgslVar5);
            fgslVar5.i = true;
        }
        String[] strArr7 = p;
        int length6 = strArr7.length;
        for (int i7 = 0; i7 < 5; i7++) {
            fgsl fgslVar6 = (fgsl) a.get(strArr7[i7]);
            fgqz.g(fgslVar6);
            fgslVar6.q = true;
        }
    }

    private fgsl(String str) {
        this.b = str;
        this.c = fgrb.a(str);
    }

    public static fgsl b(String str, fgsj fgsjVar) {
        fgqz.g(str);
        Map map = a;
        fgsl fgslVar = (fgsl) map.get(str);
        if (fgslVar != null) {
            return fgslVar;
        }
        String strB = fgsjVar.b(str);
        fgqz.e(strB);
        String strA = fgrb.a(strB);
        fgsl fgslVar2 = (fgsl) map.get(strA);
        if (fgslVar2 == null) {
            fgsl fgslVar3 = new fgsl(strB);
            fgslVar3.d = false;
            return fgslVar3;
        }
        if (!fgsjVar.c || strB.equals(strA)) {
            return fgslVar2;
        }
        fgsl fgslVarClone = fgslVar2.clone();
        fgslVarClone.b = strB;
        return fgslVarClone;
    }

    private static void d(fgsl fgslVar) {
        a.put(fgslVar.b, fgslVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fgsl clone() {
        try {
            return (fgsl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean c() {
        return this.f || this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgsl)) {
            return false;
        }
        fgsl fgslVar = (fgsl) obj;
        return this.b.equals(fgslVar.b) && this.f == fgslVar.f && this.e == fgslVar.e && this.d == fgslVar.d && this.h == fgslVar.h && this.g == fgslVar.g && this.i == fgslVar.i && this.q == fgslVar.q;
    }

    public final int hashCode() {
        return (((((((((((((this.b.hashCode() * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.q ? 1 : 0);
    }

    public final String toString() {
        return this.b;
    }
}
