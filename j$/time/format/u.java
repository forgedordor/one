package j$.time.format;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class u extends t {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public final TextStyle e;
    public final boolean f;
    public final HashMap g;
    public final HashMap h;

    public u(TextStyle textStyle, boolean z) {
        super(j$.time.temporal.k.e, "ZoneText(" + String.valueOf(textStyle) + ")");
        this.g = new HashMap();
        this.h = new HashMap();
        Objects.a(textStyle, "textStyle");
        this.e = textStyle;
        this.f = z;
    }

    @Override // j$.time.format.t
    public final n a(v vVar) {
        n nVar;
        if (this.e == TextStyle.NARROW) {
            return super.a(vVar);
        }
        Locale locale = vVar.a.b;
        boolean z = vVar.b;
        Set set = j$.time.zone.g.d;
        int size = set.size();
        HashMap map = z ? this.g : this.h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (nVar = (n) ((SoftReference) entry.getValue()).get()) != null) {
            return nVar;
        }
        n nVar2 = vVar.b ? new n("", null, null) : new m("", null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                nVar2.a(str, str);
                HashMap map2 = E.g;
                HashMap map3 = E.d;
                String str2 = (String) map3.get(str);
                if (str2 == null && map2.containsKey(str)) {
                    str = (String) map2.get(str);
                    str2 = (String) map3.get(str);
                }
                if (str2 != null) {
                    Map map4 = (Map) E.f.get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (String) E.e.get(str2) : (String) map4.get(locale.getCountry());
                }
                if (map2.containsKey(str)) {
                    str = (String) map2.get(str);
                }
                for (int i2 = this.e == TextStyle.FULL ? 1 : 2; i2 < strArr.length; i2 += 2) {
                    nVar2.a(strArr[i2], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(nVar2)));
        return nVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // j$.time.format.t, j$.time.format.InterfaceC0031e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(j$.time.format.x r14, java.lang.StringBuilder r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.u.f(j$.time.format.x, java.lang.StringBuilder):boolean");
    }
}
