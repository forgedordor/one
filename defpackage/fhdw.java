package defpackage;

import java.lang.reflect.InvocationHandler;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhdw implements InvocationHandler {
    final /* synthetic */ Class a;
    final /* synthetic */ fhdy b;
    private final fhdq c = fhdq.a;
    private final Object[] d = new Object[0];

    public fhdw(fhdy fhdyVar, Class cls) {
        this.a = cls;
        this.b = fhdyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0305, code lost:
    
        r5 = r14.responseType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x030b, code lost:
    
        if (r5 == defpackage.fezh.class) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x030f, code lost:
    
        if (r5 == defpackage.fhdv.class) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0319, code lost:
    
        if (r1.c.equals("HEAD") == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0321, code lost:
    
        if (java.lang.Void.class.equals(r5) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x032d, code lost:
    
        throw defpackage.fhef.b(r21, "HEAD method must use Void as response type.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0332, code lost:
    
        r5 = r3.b(r5, r21.getAnnotations());
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0336, code lost:
    
        r6 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0338, code lost:
    
        if (r4 != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x033a, code lost:
    
        r4 = new defpackage.fhcd(r1, r6, r5, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0340, code lost:
    
        if (r8 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0342, code lost:
    
        r4 = new defpackage.fhcf(r1, r6, r5, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0348, code lost:
    
        r4 = new defpackage.fhce(r1, r6, r5, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x034d, code lost:
    
        r3.a.put(r21, r4);
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0355, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0363, code lost:
    
        throw defpackage.fhef.c(r21, r0, "Unable to create converter for %s", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x036d, code lost:
    
        throw defpackage.fhef.b(r21, "Response must include generic type (e.g., Response<String>)", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0393, code lost:
    
        throw defpackage.fhef.b(r21, "'" + defpackage.fhef.a(r5).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0398, code lost:
    
        r0 = new java.lang.StringBuilder("Could not locate call adapter for ");
        r0.append(r10);
        r0.append(".\n  Tried:");
        r1 = r3.e;
        r3 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03ab, code lost:
    
        if (r6 >= r3) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03ad, code lost:
    
        r0.append("\n   * ");
        r0.append(((defpackage.fhbl) r1.get(r6)).getClass().getName());
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03cf, code lost:
    
        throw new java.lang.IllegalArgumentException(r0.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r20, java.lang.reflect.Method r21, java.lang.Object[] r22) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhdw.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
