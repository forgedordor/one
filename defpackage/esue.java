package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esue extends fbpc {
    private static final ekrg a = ekrg.c("com/google/frameworks/client/data/android/server/LazyServicesHandlerRegistry");
    private static final fbsr b = new fbsr(null, null);
    private static final fbst c = fbss.a("not_found", null, new HashMap());
    private final Map d;
    private final Object e = new Object();
    private final Map f = new HashMap();
    private final Map g = new HashMap();
    private final ConcurrentHashMap h = new ConcurrentHashMap();

    public esue(Map map) {
        this.d = map;
    }

    @Override // defpackage.fbpc
    public final fbsr a(String str) {
        int iIndexOf;
        ConcurrentHashMap concurrentHashMap = this.h;
        fbsr fbsrVar = (fbsr) concurrentHashMap.get(str);
        if (fbsrVar == null && (iIndexOf = str.indexOf(47)) > 0) {
            String strSubstring = str.substring(0, iIndexOf);
            synchronized (this.e) {
                Map map = this.g;
                fbst fbstVarN = (fbst) map.get(strSubstring);
                if (fbstVarN == null) {
                    fcsu fcsuVar = (fcsu) this.d.get(strSubstring);
                    if (fcsuVar != null) {
                        fbmx fbmxVar = (fbmx) fcsuVar.b();
                        this.f.put(strSubstring, fbmxVar);
                        fbstVarN = fbmxVar.n();
                    } else {
                        ((ekrd) ((ekrd) a.j()).h("com/google/frameworks/client/data/android/server/LazyServicesHandlerRegistry", "initService", 113, "LazyServicesHandlerRegistry.java")).t("No factory available for service %s.", strSubstring);
                        fbstVarN = c;
                    }
                    map.put(strSubstring, fbstVarN);
                }
                fbsrVar = fbstVarN != c ? (fbsr) fbstVarN.b.get(str) : null;
                if (fbsrVar == null) {
                    fbsrVar = b;
                }
                concurrentHashMap.put(str, fbsrVar);
            }
        }
        if (fbsrVar == b) {
            return null;
        }
        return fbsrVar;
    }
}
