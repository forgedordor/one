package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfqm {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/reflectedmessage/ReflectedTachygramMessageHandler");
    public final fdjx b;
    public final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final Map f;
    private final Map g;
    private final Map h;

    public cfqm(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, Map map, Map map2, Map map3, fcsu fcsuVar3) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.b = fdjxVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = map;
        this.g = map2;
        this.h = map3;
        this.c = fcsuVar3;
        Iterator<E> it = ((ekgp) map).keySet().iterator();
        while (it.hasNext()) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/shared/net/handler/reflectedmessage/ReflectedTachygramMessageHandler", "<init>", 52, "ReflectedTachygramMessageHandler.kt")).t("Registered ReflectedBugleMessageContentHandler for %s ", ((elhc) it.next()).name());
        }
    }

    private static final String d(ezjj ezjjVar) {
        ezji ezjiVarB = ezji.b(ezjjVar.d);
        if (ezjiVarB == null) {
            ezjiVarB = ezji.UNRECOGNIZED;
        }
        String str = String.format("messageType: %s, messageId: %s", Arrays.copyOf(new Object[]{ezjiVarB.name(), ezjjVar.c}, 2));
        str.getClass();
        return str;
    }

    private final void e(String str, int i) {
        ((cfra) this.c.b()).p(str, emfy.BASIC_MESSAGE, emfv.UNKNOWN_CONTENT_TYPE, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ezui r11, defpackage.cfpw r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfqm.a(ezui, cfpw, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0170, code lost:
    
        r5 = r7;
        r0 = r14;
        r14 = r15;
        r9 = r17;
        r8 = 2;
        r15 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        if (r0 == r4) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020b, code lost:
    
        if (r5.a(r11, r0, r3) != r4) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0250, code lost:
    
        if (r5.a(r11, r0, r3) == r4) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x028e, code lost:
    
        if (r6.b(r11, r0, r3) == r4) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:71:0x01d8, B:96:0x02ae], limit reached: 105 */
    /* JADX WARN: Path cross not found for [B:96:0x02ae, B:71:0x01d8], limit reached: 105 */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ba  */
    /* JADX WARN: Type inference failed for: r18v0, types: [cfqm] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ezjj r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfqm.b(ezjj, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ezjj r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfqm.c(ezjj, fcxy):java.lang.Object");
    }
}
