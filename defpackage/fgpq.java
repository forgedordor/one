package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgpq implements fgqf, fgqd {
    private static final Map a = new ConcurrentHashMap();
    private final fgmu b;
    private final boolean c;

    public fgpq(fgmu fgmuVar, boolean z) {
        this.b = fgmuVar;
        this.c = z;
    }

    @Override // defpackage.fgqd
    public final int a() {
        return b();
    }

    @Override // defpackage.fgqf
    public final int b() {
        return this.c ? 6 : 20;
    }

    @Override // defpackage.fgqd
    public final int c(fgpz fgpzVar, CharSequence charSequence, int i) {
        int i2;
        int iIntValue;
        Map concurrentHashMap;
        Map map = a;
        Locale locale = fgpzVar.b;
        Map concurrentHashMap2 = (Map) map.get(locale);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap();
            map.put(locale, concurrentHashMap2);
        }
        fgmu fgmuVar = this.b;
        Object[] objArr = (Object[]) concurrentHashMap2.get(fgmuVar);
        if (objArr == null) {
            concurrentHashMap = new ConcurrentHashMap(32);
            fgng fgngVar = new fgng(fgmz.a);
            fgms fgmsVarA = fgmuVar.a(fgngVar.b);
            if (!fgmsVarA.u()) {
                throw new IllegalArgumentException("Field '" + fgmuVar.y + "' is not supported");
            }
            fgnf fgnfVar = new fgnf(fgngVar, fgmsVarA);
            int iD = fgnfVar.b.d();
            int iC = fgnfVar.b.c();
            if (iC - iD <= 32) {
                iIntValue = fgnfVar.b.b(locale);
                while (iD <= iC) {
                    fgng fgngVar2 = fgnfVar.a;
                    long jH = fgnfVar.b.h(fgngVar2.a, iD);
                    fgmq fgmqVar = fgngVar2.b;
                    fgngVar2.a = jH;
                    concurrentHashMap.put(fgnfVar.e(locale), Boolean.TRUE);
                    concurrentHashMap.put(fgnfVar.e(locale).toLowerCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(fgnfVar.e(locale).toUpperCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(fgnfVar.f(locale), Boolean.TRUE);
                    concurrentHashMap.put(fgnfVar.f(locale).toLowerCase(locale), Boolean.TRUE);
                    concurrentHashMap.put(fgnfVar.f(locale).toUpperCase(locale), Boolean.TRUE);
                    iD++;
                }
                i2 = 0;
                if ("en".equals(locale.getLanguage()) && fgmuVar == fgmu.b) {
                    concurrentHashMap.put("BCE", Boolean.TRUE);
                    concurrentHashMap.put("bce", Boolean.TRUE);
                    concurrentHashMap.put("CE", Boolean.TRUE);
                    concurrentHashMap.put("ce", Boolean.TRUE);
                    iIntValue = 3;
                }
                concurrentHashMap2.put(fgmuVar, new Object[]{concurrentHashMap, Integer.valueOf(iIntValue)});
            }
            return ~i;
        }
        i2 = 0;
        Map map2 = (Map) objArr[0];
        iIntValue = ((Integer) objArr[1]).intValue();
        concurrentHashMap = map2;
        for (int iMin = Math.min(charSequence.length(), i + iIntValue); iMin > i; iMin--) {
            String string = charSequence.subSequence(i, iMin).toString();
            if (concurrentHashMap.containsKey(string)) {
                fgpx fgpxVarC = fgpzVar.c();
                fgpxVarC.a = fgmuVar.a(fgpzVar.a);
                fgpxVarC.b = i2;
                fgpxVarC.c = string;
                fgpxVarC.d = locale;
                return iMin;
            }
        }
        return ~i;
    }

    @Override // defpackage.fgqf
    public final void d(Appendable appendable, long j, fgmq fgmqVar, int i, fgmz fgmzVar, Locale locale) throws IOException {
        try {
            fgms fgmsVarA = this.b.a(fgmqVar);
            appendable.append(this.c ? fgmsVarA.l(j, locale) : fgmsVarA.n(j, locale));
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }
}
