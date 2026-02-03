package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awhq {
    static {
        eksp.c("BugleRcsCapabilities");
    }

    public static awhp a(asts astsVar) {
        return c(astsVar, !astsVar.b().equals(Instant.EPOCH));
    }

    public static awhp b(asva asvaVar) {
        return d(asvaVar).d();
    }

    public static awhp c(asts astsVar, boolean z) {
        awho awhoVarD = d(astsVar.a());
        awhoVarD.c(z);
        return awhoVarD.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.awho d(defpackage.asva r7) {
        /*
            awho r0 = defpackage.awhp.d()
            evtg r7 = r7.b
            java.util.Iterator r7 = r7.iterator()
        La:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r7.next()
            asvc r1 = (defpackage.asvc) r1
            int r2 = r1.b
            r3 = 2
            r2 = r2 & r3
            if (r2 == 0) goto L90
            java.lang.String r2 = r1.c
            java.lang.String r4 = "+g.gsma.rcs.botversion"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L77
            java.lang.String r2 = r1.c
            java.lang.String r1 = r1.d
            int r4 = r1.hashCode()
            r5 = 32502573(0x1eff32d, float:8.8143674E-38)
            r6 = 1
            if (r4 == r5) goto L53
            r5 = 1170214697(0x45c00f29, float:6145.895)
            if (r4 == r5) goto L49
            r5 = 1916000975(0x7233dacf, float:3.5623898E30)
            if (r4 == r5) goto L3f
            goto L5d
        L3f:
            java.lang.String r4 = "\"#=0.92\""
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L5d
            r4 = 0
            goto L5e
        L49:
            java.lang.String r4 = "\"#=1.2\""
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L5d
            r4 = r3
            goto L5e
        L53:
            java.lang.String r4 = "\"#=1\""
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L5d
            r4 = r6
            goto L5e
        L5d:
            r4 = -1
        L5e:
            if (r4 == 0) goto L71
            if (r4 == r6) goto L6e
            if (r4 == r3) goto L6b
            java.lang.String r3 = "="
            java.lang.String r1 = defpackage.a.q(r1, r2, r3)
            goto L73
        L6b:
            java.lang.String r1 = "CHATBOT_VERSION_1_2"
            goto L73
        L6e:
            java.lang.String r1 = "CHATBOT_VERSION_1_0"
            goto L73
        L71:
            java.lang.String r1 = "CHATBOT_VERSION_0_92"
        L73:
            r0.e(r1)
            goto La
        L77:
            java.lang.String r2 = r1.c
            java.lang.String r3 = "+g.3gpp.iari-ref"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L87
            java.lang.String r1 = r1.d
            r0.e(r1)
            goto La
        L87:
            java.lang.String r2 = r1.c
            java.lang.String r1 = r1.d
            r0.f(r2, r1)
            goto La
        L90:
            java.lang.String r1 = r1.c
            r0.e(r1)
            goto La
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awhq.d(asva):awho");
    }
}
