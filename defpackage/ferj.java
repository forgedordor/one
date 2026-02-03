package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ferj implements ferh {
    private static final Pattern a = Pattern.compile("(?<=/)[^/]*/[^/]*$");
    private static final Map b = new ConcurrentHashMap();
    private static final Properties c;
    private final String e = "zoneinfo/";
    private final Map d = new ConcurrentHashMap();

    static {
        Properties properties = new Properties();
        c = properties;
        try {
            properties.load(fexa.a("net/fortuna/ical4j/model/tz.alias"));
        } catch (IOException e) {
            LogFactory.getLog(ferj.class).warn("Error loading timezone aliases: ".concat(String.valueOf(e.getMessage())));
        }
        try {
            c.load(fexa.a("tz.alias"));
        } catch (Exception e2) {
            LogFactory.getLog(ferj.class).debug("Error loading custom timezone aliases: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    @Override // defpackage.ferh
    public final ferg a(String str) {
        Exception e;
        ferg fergVar;
        fesp fespVar;
        URL resource;
        fewk fewkVar;
        ferg fergVar2 = (ferg) this.d.get(str);
        if (fergVar2 != null) {
            return fergVar2;
        }
        Map map = b;
        ferg fergVar3 = (ferg) map.get(str);
        if (fergVar3 != null) {
            return fergVar3;
        }
        String property = c.getProperty(str);
        if (property != null) {
            return a(property);
        }
        synchronized (map) {
            ferg fergVar4 = (ferg) map.get(str);
            if (fergVar4 == null) {
                try {
                    String str2 = this.e + str + ".ics";
                    Log log = fexa.a;
                    fespVar = null;
                    try {
                        resource = Thread.currentThread().getContextClassLoader().getResource(str2);
                    } catch (SecurityException e2) {
                        fexa.a.info("Unable to access context classloader, using default. ".concat(String.valueOf(e2.getMessage())));
                        resource = null;
                    }
                    if (resource == null) {
                        resource = fexa.class.getResource("/".concat(str2));
                    }
                    if (resource != null) {
                        fespVar = (fesp) new femc().a(resource.openStream()).a();
                        if (!"false".equals(fews.a("net.fortuna.ical4j.timezone.update.enabled")) && (fewkVar = (fewk) fespVar.a("TZURL")) != null) {
                            try {
                                fesp fespVar2 = (fesp) new femc().a(fewkVar.c.toURL().openStream()).a();
                                if (fespVar2 != null) {
                                    fespVar = fespVar2;
                                }
                            } catch (Exception e3) {
                                LogFactory.getLog(ferj.class).warn("Unable to retrieve updates for timezone: ".concat(String.valueOf(((fewg) fespVar.a("TZID")).c)), e3);
                            }
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    fergVar = fergVar4;
                }
                if (fespVar != null) {
                    fergVar = new ferg(fespVar);
                    try {
                        b.put(fergVar.getID(), fergVar);
                    } catch (Exception e5) {
                        e = e5;
                        LogFactory.getLog(ferj.class).warn("Error occurred loading VTimeZone", e);
                        fergVar4 = fergVar;
                        return fergVar4;
                    }
                    fergVar4 = fergVar;
                } else if (fewr.b("ical4j.parsing.relaxed")) {
                    Matcher matcher = a.matcher(str);
                    if (matcher.find()) {
                        return a(matcher.group());
                    }
                }
            }
            return fergVar4;
        }
    }

    @Override // defpackage.ferh
    public final void b(ferg fergVar) {
        this.d.put(fergVar.getID(), fergVar);
    }
}
