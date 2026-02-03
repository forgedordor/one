package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Objects;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eomm {
    public static final eomm b;
    private static final Map d;
    private static final ejwb e;
    private final String f;
    private final String g;
    private final ekgd h;
    private String i;
    private int j;
    private static final ekgd c = ekgd.f("charset", ejuf.c(StandardCharsets.UTF_8.name()));
    public static final ejvf a = new ejun(new ejun(new ejun(ejuq.a, new ejvb(ejuy.a)), new ejux(' ')), ejvf.n("()<>@,;:\\\"/[]?="));

    static {
        ejvf.n("\"\\\r");
        ejvf.m(" \t\r\n");
        d = new HashMap();
        a("*", "*");
        a(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "*");
        a("image", "*");
        a("audio", "*");
        a("video", "*");
        a("application", "*");
        a("font", "*");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "cache-manifest");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "css");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "csv");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "html");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "calendar");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "markdown");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "plain");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "javascript");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "tab-separated-values");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "vcard");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "vnd.wap.wml");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "xml");
        d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        d("image", "svg+xml");
        a("image", "tiff");
        a("image", "avif");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a("audio", "mp4");
        a("audio", "mpeg");
        a("audio", "ogg");
        a("audio", "webm");
        a("audio", "l16");
        a("audio", "l24");
        a("audio", "basic");
        a("audio", "aac");
        a("audio", "vorbis");
        a("audio", "x-ms-wma");
        a("audio", "x-ms-wax");
        a("audio", "vnd.rn-realaudio");
        a("audio", "vnd.wave");
        a("video", "mp4");
        a("video", "mpeg");
        a("video", "ogg");
        a("video", "quicktime");
        a("video", "webm");
        a("video", "x-ms-wmv");
        a("video", "x-flv");
        a("video", "3gpp");
        a("video", "3gpp2");
        d("application", "xml");
        d("application", "atom+xml");
        a("application", "x-bzip2");
        d("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        b = a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", ffho.e);
        a("application", "cbor");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        d("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        d("application", "json");
        a("application", "jwt");
        d("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        d("application", "opensearchdescription+xml");
        a("application", "pdf");
        a("application", "postscript");
        a("application", "protobuf");
        d("application", "rdf+xml");
        d("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        d("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        d("application", "xhtml+xml");
        d("application", "xrd+xml");
        a("application", "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        e = new ejwb(new ejwc("; "), "=");
    }

    private eomm(String str, String str2, ekgd ekgdVar) {
        this.f = str;
        this.g = str2;
        this.h = ekgdVar;
    }

    private static eomm a(String str, String str2) {
        eomm eommVar = new eomm(str, str2, ekdy.a);
        c(eommVar);
        return eommVar;
    }

    private final Map b() {
        return ekmi.l(this.h.map, new ejvr() { // from class: eoml
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Collection collection = (Collection) obj;
                if (collection instanceof ekhj) {
                    ekhj ekhjVar = (ekhj) collection;
                    ekhjVar.l();
                    return ekhjVar;
                }
                ekhg ekhgVar = new ekhg(collection instanceof ekni ? ((ekni) collection).i().size() : 11);
                ekhgVar.b(collection);
                return ekhgVar.a();
            }
        });
    }

    private static void c(eomm eommVar) {
        d.put(eommVar, eommVar);
    }

    private static void d(String str, String str2) {
        c(new eomm(str, str2, c));
        ejwi.j(StandardCharsets.UTF_8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eomm) {
            eomm eommVar = (eomm) obj;
            if (this.f.equals(eommVar.f) && this.g.equals(eommVar.g) && b().equals(eommVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int iHash = Objects.hash(this.f, this.g, b());
        this.j = iHash;
        return iHash;
    }

    public final String toString() throws IOException {
        String str = this.i;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append('/');
        sb.append(this.g);
        ekgd ekgdVar = this.h;
        if (!ekgdVar.A()) {
            sb.append("; ");
            final ejvr ejvrVar = new ejvr() { // from class: eomk
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    if (eomm.a.i(str2) && !str2.isEmpty()) {
                        return str2;
                    }
                    StringBuilder sb2 = new StringBuilder(str2.length() + 16);
                    sb2.append('\"');
                    for (int i = 0; i < str2.length(); i++) {
                        char cCharAt = str2.charAt(i);
                        if (cCharAt == '\r' || cCharAt == '\\') {
                            sb2.append('\\');
                        } else if (cCharAt == '\"') {
                            cCharAt = '\"';
                            sb2.append('\\');
                        }
                        sb2.append(cCharAt);
                    }
                    sb2.append('\"');
                    return sb2.toString();
                }
            };
            e.b(sb, new ekmy(ekgdVar, new ekma() { // from class: ekmr
                @Override // defpackage.ekma
                public final Object a(Object obj, Object obj2) {
                    return ejvrVar.apply(obj2);
                }
            }).u());
        }
        String string = sb.toString();
        this.i = string;
        return string;
    }
}
