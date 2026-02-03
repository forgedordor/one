package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzkj {
    private static final ejxk b = ejxk.b('/');
    private static final Pattern c = Pattern.compile("^(\\*[a-z]+\\*).*");
    final ConcurrentHashMap a = new ConcurrentHashMap();

    static String a(String str) {
        List listI = b.i(str);
        if (listI.size() == 3) {
            return (String) listI.get(0);
        }
        ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/battery/HashingNameSanitizer", "sanitizeSyncName", 56, "HashingNameSanitizer.java")).t("malformed sync name: %s", str);
        return "MALFORMED";
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.fedi b(defpackage.dzki r17, defpackage.fedi r18) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzkj.b(dzki, fedi):fedi");
    }

    final fedi c(fedi fediVar) {
        fecy fecyVar = fediVar.e;
        if (fecyVar == null) {
            fecyVar = fecy.a;
        }
        if ((fecyVar.b & 1) == 0) {
            return fediVar;
        }
        fecy fecyVar2 = fediVar.e;
        if (fecyVar2 == null) {
            fecyVar2 = fecy.a;
        }
        fecx fecxVar = (fecx) fecyVar2.toBuilder();
        Long l = (Long) this.a.get(Long.valueOf(((fecy) fecxVar.instance).c));
        l.getClass();
        fedh fedhVar = (fedh) fediVar.toBuilder();
        long jLongValue = l.longValue();
        fecxVar.copyOnWrite();
        fecy fecyVar3 = (fecy) fecxVar.instance;
        fecyVar3.b |= 1;
        fecyVar3.c = jLongValue;
        fedhVar.copyOnWrite();
        fedi fediVar2 = (fedi) fedhVar.instance;
        fecy fecyVar4 = (fecy) fecxVar.build();
        fecyVar4.getClass();
        fediVar2.e = fecyVar4;
        fediVar2.b |= 4;
        return (fedi) fedhVar.build();
    }
}
