package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evow {
    public final String a;
    public final Map b;
    public final Map c;

    public evow() {
        EnumMap enumMap = new EnumMap(evot.class);
        this.a = "";
        this.b = enumMap;
        this.c = new EnumMap(evot.class);
    }

    public final void a(evot evotVar) {
        Map map = this.c;
        if (map.containsKey(evotVar)) {
            Object obj = ((evox) map.get(evotVar)).a;
        } else {
            this.b.containsKey(evotVar);
        }
        Map map2 = this.b;
        Map map3 = this.c;
        if (map3.containsKey(evotVar)) {
            if (((evox) map3.get(evotVar)).a != null) {
                boolean z = ((evox) map3.get(evotVar)).b;
            }
        } else if (map2.containsKey(evotVar)) {
            boolean z2 = ((evou) map2.get(evotVar)).c;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.evot r8, java.lang.Object r9) {
        /*
            r7 = this;
            int r0 = r8.bf
            int r1 = r0 + (-1)
            r2 = 0
            if (r0 == 0) goto L6e
            r3 = 0
            r4 = 1
            switch(r1) {
                case 0: goto L63;
                case 1: goto L4f;
                case 2: goto L45;
                case 3: goto L3a;
                case 4: goto L2c;
                case 5: goto L1c;
                case 6: goto L63;
                case 7: goto L63;
                default: goto Lc;
            }
        Lc:
            java.lang.String r8 = defpackage.evos.a(r0)
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "Unexpected option type: "
            java.lang.String r8 = r0.concat(r8)
            r9.<init>(r8)
            throw r9
        L1c:
            r0 = r9
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r1 = r0.isNaN()
            if (r1 != 0) goto L56
            boolean r0 = r0.isInfinite()
            if (r0 != 0) goto L56
            goto L43
        L2c:
            r0 = r9
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto L56
            goto L43
        L3a:
            r0 = r9
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L56
        L43:
            r3 = r4
            goto L56
        L45:
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            r3 = r0 ^ 1
            goto L56
        L4f:
            r0 = r9
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
        L56:
            if (r3 != 0) goto L63
            evox r9 = new evox
            r9.<init>(r2)
            java.util.Map r0 = r7.c
            r0.put(r8, r9)
            return
        L63:
            evox r0 = new evox
            r0.<init>(r9)
            java.util.Map r9 = r7.c
            r9.put(r8, r0)
            return
        L6e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evow.b(evot, java.lang.Object):void");
    }
}
