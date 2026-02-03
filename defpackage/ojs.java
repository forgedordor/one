package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ojs {
    public final String c;
    public final String d;
    public final String e;
    public String f;
    public boolean g;
    public final fctc h;
    public final fctc i;
    public String j;
    public boolean k;
    private final List p;
    private final fctc q;
    private final fctc r;
    private final fctc s;
    private final fctc t;
    private final fctc u;
    private final fctc v;
    private static final fdgl l = new fdgl("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final fdgl a = new fdgl("\\{(.+?)\\}");
    private static final fdgl m = new fdgl("http[s]?://");
    private static final fdgl n = new fdgl(".*");
    private static final fdgl o = new fdgl("([^/]*?|)");
    public static final fdgl b = new fdgl("^[^?#]+\\?([^#]*).*");

    public ojs(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        ArrayList arrayList = new ArrayList();
        this.p = arrayList;
        this.q = fctd.a(new fdae() { // from class: ojh
            @Override // defpackage.fdae
            public final Object invoke() {
                String str4 = this.a.f;
                if (str4 != null) {
                    return new fdgl(str4, null);
                }
                return null;
            }
        });
        this.r = fctd.a(new fdae() { // from class: oji
            @Override // defpackage.fdae
            public final Object invoke() {
                String str4 = this.a.c;
                boolean z = false;
                if (str4 != null && ojs.b.e(str4)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        this.s = fctd.b(3, new fdae() { // from class: ojj
            @Override // defpackage.fdae
            public final Object invoke() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ojs ojsVar = this.a;
                if (ojsVar.h()) {
                    String str4 = ojsVar.c;
                    str4.getClass();
                    Uri uriB = okr.b(str4);
                    for (String str5 : uriB.getQueryParameterNames()) {
                        StringBuilder sb = new StringBuilder();
                        List<String> queryParameters = uriB.getQueryParameters(str5);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(a.d(str4, str5, "Query parameter ", " must only be present once in ", ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                        }
                        String str6 = (String) fcva.P(queryParameters);
                        if (str6 == null) {
                            ojsVar.g = true;
                            str6 = str5;
                        }
                        ojr ojrVar = new ojr();
                        int i = 0;
                        for (fdgd fdgdVarF = ojs.a.f(str6); fdgdVarF != null; fdgdVarF = fdgdVarF.c()) {
                            fdgc fdgcVarB = ((fdgg) fdgdVarF).b.b(1);
                            fdgcVarB.getClass();
                            ojrVar.b.add(fdgcVarB.a);
                            if (fdgdVarF.b().a > i) {
                                String strSubstring = str6.substring(i, fdgdVarF.b().a);
                                strSubstring.getClass();
                                sb.append(fdgi.a(strSubstring));
                            }
                            sb.append("([\\s\\S]+?)?");
                            i = fdgdVarF.b().b + 1;
                        }
                        if (i < str6.length()) {
                            String strSubstring2 = str6.substring(i);
                            strSubstring2.getClass();
                            sb.append(fdgi.a(strSubstring2));
                        }
                        sb.append("$");
                        ojrVar.a = ojs.k(sb.toString());
                        linkedHashMap.put(str5, ojrVar);
                    }
                }
                return linkedHashMap;
            }
        });
        this.t = fctd.b(3, new fdae() { // from class: ojk
            @Override // defpackage.fdae
            public final Object invoke() {
                String str4 = this.a.c;
                if (str4 == null || okr.b(str4).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                String fragment = okr.b(str4).getFragment();
                StringBuilder sb = new StringBuilder();
                fragment.getClass();
                ojs.j(fragment, arrayList2, sb);
                return new fcti(arrayList2, sb.toString());
            }
        });
        this.u = fctd.b(3, new fdae() { // from class: ojl
            @Override // defpackage.fdae
            public final Object invoke() {
                List list;
                fcti fctiVarC = this.a.c();
                return (fctiVarC == null || (list = (List) fctiVarC.a) == null) ? new ArrayList() : list;
            }
        });
        this.h = fctd.b(3, new fdae() { // from class: ojm
            @Override // defpackage.fdae
            public final Object invoke() {
                fcti fctiVarC = this.a.c();
                if (fctiVarC != null) {
                    return (String) fctiVarC.b;
                }
                return null;
            }
        });
        this.i = fctd.a(new fdae() { // from class: ojn
            @Override // defpackage.fdae
            public final Object invoke() {
                String str4 = (String) this.a.h.a();
                if (str4 != null) {
                    return new fdgl(str4, null);
                }
                return null;
            }
        });
        this.v = fctd.a(new fdae() { // from class: ojo
            @Override // defpackage.fdae
            public final Object invoke() {
                String str4 = this.a.j;
                if (str4 != null) {
                    return new fdgl(str4);
                }
                return null;
            }
        });
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!l.d(str)) {
                sb.append(m.a());
            }
            fdgd fdgdVarF = new fdgl("(\\?|#|$)").f(str);
            if (fdgdVarF != null) {
                boolean z = false;
                String strSubstring = str.substring(0, fdgdVarF.b().a);
                strSubstring.getClass();
                j(strSubstring, arrayList, sb);
                if (!n.d(sb) && !o.d(sb)) {
                    z = true;
                }
                this.k = z;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            this.f = k(sb.toString());
        }
        if (str3 == null) {
            return;
        }
        if (!new fdgl("^[\\s\\S]+/[\\s\\S]+$").e(str3)) {
            throw new IllegalArgumentException("The given mimeType " + str3 + " does not match to required \"type/subtype\" format");
        }
        ojq ojqVar = new ojq(str3);
        this.j = fdgn.q("^(" + ojqVar.a + "|[*]+)/(" + ojqVar.b + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    public static final void i(Bundle bundle, String str, String str2, oil oilVar) {
        if (oilVar == null) {
            pjc.d(bundle, str, str2);
            return;
        }
        str.getClass();
        okq okqVar = oilVar.a;
        okqVar.f(bundle, str, okqVar.c(str2));
    }

    public static final void j(String str, List list, StringBuilder sb) {
        int i = 0;
        for (fdgd fdgdVarF = a.f(str); fdgdVarF != null; fdgdVarF = fdgdVarF.c()) {
            fdgc fdgcVarB = ((fdgg) fdgdVarF).b.b(1);
            fdgcVarB.getClass();
            list.add(fdgcVarB.a);
            if (fdgdVarF.b().a > i) {
                String strSubstring = str.substring(i, fdgdVarF.b().a);
                strSubstring.getClass();
                sb.append(fdgi.a(strSubstring));
            }
            sb.append(o.a());
            i = fdgdVarF.b().b + 1;
        }
        if (i < str.length()) {
            String strSubstring2 = str.substring(i);
            strSubstring2.getClass();
            sb.append(fdgi.a(strSubstring2));
        }
    }

    public static final String k(String str) {
        return (fdgn.G(str, "\\Q", false) && fdgn.G(str, "\\E", false)) ? fdgn.q(str, ".*", "\\E.*\\Q") : fdgn.G(str, "\\.\\*", false) ? fdgn.q(str, "\\.\\*", ".*") : str;
    }

    private final Map l() {
        return (Map) this.s.a();
    }

    public final List a() {
        Collection collectionValues = l().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            fcva.y(arrayList, ((ojr) it.next()).b);
        }
        return fcva.ah(fcva.ah(this.p, arrayList), b());
    }

    public final List b() {
        return (List) this.u.a();
    }

    public final fcti c() {
        return (fcti) this.t.a();
    }

    public final fdgl d() {
        return (fdgl) this.v.a();
    }

    public final fdgl e() {
        return (fdgl) this.q.a();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ojs)) {
            ojs ojsVar = (ojs) obj;
            if (fdbq.f(this.c, ojsVar.c) && fdbq.f(this.d, ojsVar.d) && fdbq.f(this.e, ojsVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(fdgd fdgdVar, Bundle bundle, Map map) {
        List list = this.p;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                fcva.m();
            }
            String str = (String) obj;
            fdgc fdgcVarB = ((fdgg) fdgdVar).b.b(i2);
            String strA = fdgcVarB != null ? okr.a(fdgcVarB.a) : null;
            oil oilVar = (oil) map.get(str);
            if (strA == null) {
                strA = "";
            }
            try {
                i(bundle, str, strA, oilVar);
                arrayList.add(fctx.a);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    public final boolean g(Uri uri, Bundle bundle, Map map) {
        Object objValueOf;
        boolean z;
        String query;
        for (Map.Entry entry : l().entrySet()) {
            String str = (String) entry.getKey();
            ojr ojrVar = (ojr) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.g && (query = uri.getQuery()) != null && !fdbq.f(query, uri.toString())) {
                queryParameters = fcva.b(query);
            }
            boolean z2 = false;
            Bundle bundleA = lab.a((fcti[]) Arrays.copyOf(new fcti[0], 0));
            List<String> list = ojrVar.b;
            for (String str2 : list) {
                oil oilVar = (oil) map.get(str2);
                okq okqVar = oilVar != null ? oilVar.a : null;
                if ((okqVar instanceof oia) && !oilVar.c) {
                    oia oiaVar = (oia) okqVar;
                    oiaVar.f(bundleA, str2, oiaVar.a());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = ojrVar.a;
                fdgd fdgdVarC = str4 != null ? new fdgl(str4).c(str3) : null;
                if (fdgdVarC == null) {
                    return z2;
                }
                ArrayList arrayList = new ArrayList(fcva.p(list, 10));
                ?? r14 = z2;
                for (Object obj : list) {
                    int i = r14 + 1;
                    if (r14 < 0) {
                        fcva.m();
                    }
                    String str5 = (String) obj;
                    fdgc fdgcVarB = ((fdgg) fdgdVarC).b.b(i);
                    String str6 = fdgcVarB != null ? fdgcVarB.a : null;
                    oil oilVar2 = (oil) map.get(str5);
                    try {
                        boolean zG = pis.g(bundleA, str5);
                        if (str6 == null) {
                            str6 = "";
                        }
                        if (zG) {
                            if (pis.g(bundleA, str5)) {
                                if (oilVar2 != null) {
                                    okq okqVar2 = oilVar2.a;
                                    Object objB = okqVar2.b(bundleA, str5);
                                    str5.getClass();
                                    if (!pis.g(bundleA, str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    okqVar2.f(bundleA, str5, okqVar2.d(str6, objB));
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            objValueOf = Boolean.valueOf(z);
                        } else {
                            i(bundleA, str5, str6, oilVar2);
                            objValueOf = fctx.a;
                        }
                    } catch (IllegalArgumentException unused) {
                        objValueOf = fctx.a;
                    }
                    arrayList.add(objValueOf);
                    r14 = i;
                    z2 = false;
                }
            }
            bundle.putAll(bundleA);
        }
        return true;
    }

    public final boolean h() {
        return ((Boolean) this.r.a()).booleanValue();
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.d;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = iHashCode * 31;
        String str3 = this.e;
        return ((i + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }
}
