package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldq {
    public static final ekhx a = ekhx.v("applet", "base", "embed", "math", "meta", "object", "svg", "template");
    private static final ekhx b = new ekph("script");
    private static final ekhx c = new ekph("style");
    private static final ekhx d = ekhx.v("area", "br", "col", "hr", "img", "input", "link", "param", "source", "track", "wbr");
    private static final ekhx e;
    private static final ekhx f;

    static {
        new ekph("input");
        new ekph("form");
        new ekph("script");
        ekhx.r("button", "input");
        ekhx.r("button", "input");
        e = ekhx.r("a", "area");
        f = ekhx.v("alternate", "author", "bookmark", "canonical", "cite", "help", "icon", "license", "next", "prefetch", "dns-prefetch", "prerender", "preconnect", "preload", "prev", "search", "subresource");
        new ekph("form");
        new ekph("input");
        ekhx.r("input", "textarea");
        ekhx.u("audio", "img", "input", "source", "video");
        new ekph("iframe");
    }

    public static final eldp a(String str, Map map, List list) {
        StringBuilder sb = new StringBuilder("<a");
        for (Map.Entry entry : map.entrySet()) {
            sb.append(" ");
            sb.append((String) entry.getKey());
            sb.append("=\"");
            sb.append(eldn.a((String) entry.getValue()));
            sb.append("\"");
        }
        boolean zContains = d.contains("a");
        sb.append(">");
        if (!zContains) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            sb.append("</a>");
        }
        return new eldp(sb.toString());
    }

    public static final void b(String str, String str2, List list) {
        Iterator it = Arrays.asList(eldr.a(str)).iterator();
        ejwl.p(!d.contains("a"), "Element \"%s\" is a void element and so cannot have content.", "a");
        ejwl.p(!b.contains("a"), "Element \"%s\" requires SafeScript contents, not SafeHTML or text.", "a");
        ejwl.p(true ^ c.contains("a"), "Element \"%s\" requires SafeStyleSheet contents, not SafeHTML or text.", "a");
        while (it.hasNext()) {
            list.add(((eldp) it.next()).a);
        }
    }

    public static final void c(elds eldsVar, String str, Map map) {
        ekhx ekhxVar = e;
        if (!ekhxVar.contains("a")) {
            throw new IllegalArgumentException("Attribute \"href\" with a SafeUrl value can only be used by one of the following elements: ".concat(String.valueOf(String.valueOf(ekhxVar))));
        }
        String str2 = eldsVar.b;
        int i = eldn.a;
        map.put("href", etfq.a(str2));
    }
}
