package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzxl {
    private static final ejxk d = ejxk.b('/').a();
    public static final dzxk a = new dzxh();
    public static final dzxk b = new dzxi();
    public static final dzxk c = new dzxj();

    public static List a(String str) {
        return ekjz.g(d.i(str), new ejvr() { // from class: dzxg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return erxf.a((String) obj);
            }
        });
    }

    public static void b(dzxk dzxkVar, evug evugVar) {
        String strA = dzxkVar.a(evugVar);
        String strB = dzxkVar.b(evugVar);
        if (!strA.isEmpty() || strB.isEmpty()) {
            dzxkVar.c(evugVar, null);
        } else {
            dzxkVar.c(evugVar, erxf.a(strB));
        }
        dzxkVar.d(evugVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d2, code lost:
    
        if (java.util.regex.Pattern.matches(".*unmatched serializable field(s) declared", r0) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00da, code lost:
    
        if (r0.equals("Attempt to do a synchronize operation on a null object") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0102, code lost:
    
        if (java.util.regex.Pattern.matches("Conflicting default method implementations .+", r0) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0134, code lost:
    
        if (java.util.regex.Pattern.matches("Method '.+' implementing interface method '.+' is not public", r0) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0158, code lost:
    
        if (r1 != false) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.eoih c(defpackage.eoih r5) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzxl.c(eoih):eoih");
    }
}
