package defpackage;

import j$.time.Instant;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnxl implements cnxb {
    private static final cqce a = cqce.g("Bugle", "ForwardSyncEngineImpl");
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/telephony/forwardsync/syncengine/impl/ForwardSyncEngineImpl");
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final cogw l;
    private final dzuc m;
    private final cmqj n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;

    public cnxl(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, cogw cogwVar, dzuc dzucVar, cmqj cmqjVar, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        fcsuVar9.getClass();
        cogwVar.getClass();
        dzucVar.getClass();
        cmqjVar.getClass();
        fcsuVar10.getClass();
        fcsuVar12.getClass();
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
        this.i = fcsuVar7;
        this.j = fcsuVar8;
        this.k = fcsuVar9;
        this.l = cogwVar;
        this.m = dzucVar;
        this.n = cmqjVar;
        this.o = fcsuVar10;
        this.p = fcsuVar11;
        this.q = fcsuVar12;
    }

    private final int e(Instant instant) throws IOException {
        cnsx cnsxVarA = ((cnsy) this.c.b()).a(instant.toEpochMilli(), 9223372036854774807L);
        try {
            cnsxVarA.i(-1);
            int iD = cnsxVarA.d();
            fczl.a(cnsxVarA, null);
            return iD;
        } finally {
        }
    }

    @Override // defpackage.cnxb
    public final cnyx a(Instant instant, Instant instant2) throws IOException {
        instant.getClass();
        instant2.getClass();
        cnsx cnsxVarA = ((cnsy) this.c.b()).a(instant.toEpochMilli(), instant2.toEpochMilli());
        try {
            cnyw cnywVar = (cnyw) cnyx.a.createBuilder();
            cnywVar.getClass();
            int iB = cnsx.b(cnsxVarA.d);
            cnywVar.copyOnWrite();
            ((cnyx) cnywVar.instance).c = iB;
            int iE = cnsxVarA.e(cnsxVarA.e, cnsxVarA.f);
            cnywVar.copyOnWrite();
            ((cnyx) cnywVar.instance).b = iE;
            evsn evsnVarBuild = cnywVar.build();
            evsnVarBuild.getClass();
            cnyx cnyxVar = (cnyx) evsnVarBuild;
            fczl.a(cnsxVarA, null);
            ((ekrd) b.h().h("com/google/android/apps/messaging/shared/telephony/forwardsync/syncengine/impl/ForwardSyncEngineImpl", "getDatabaseMessageCounts", 523, "ForwardSyncEngineImpl.kt")).u("Found [%d] messages in Telephony and [%d] messages in BugleDb.", cnyxVar.b, cnyxVar.c);
            return cnyxVar;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 34, insn: 0x0281: MOVE (r7 I:??[OBJECT, ARRAY]) = (r34 I:??[OBJECT, ARRAY]) (LINE:642), block:B:98:0x0280 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c8 A[Catch: all -> 0x027f, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x027f, blocks: (B:56:0x01cb, B:58:0x01e3, B:104:0x02c8, B:59:0x01f0, B:95:0x025c, B:88:0x023f, B:89:0x0242), top: B:221:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0388 A[Catch: all -> 0x0598, TRY_ENTER, TryCatch #26 {all -> 0x0598, blocks: (B:108:0x02d8, B:116:0x038a, B:120:0x039b, B:115:0x0388), top: B:237:0x02d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0404 A[Catch: all -> 0x0594, TryCatch #23 {all -> 0x0594, blocks: (B:122:0x03b3, B:130:0x03c7, B:136:0x040b, B:138:0x044d, B:157:0x055d, B:163:0x057e, B:164:0x0581, B:165:0x0582, B:131:0x03d1, B:132:0x03ef, B:133:0x03f0, B:134:0x03fa, B:135:0x0404, B:139:0x0453, B:141:0x0459, B:144:0x0479, B:150:0x0517, B:151:0x051a, B:152:0x051b, B:154:0x0545, B:155:0x0550, B:142:0x0469, B:148:0x0515, B:161:0x057c), top: B:232:0x03b3, inners: #9, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x044d A[Catch: all -> 0x0594, TRY_LEAVE, TryCatch #23 {all -> 0x0594, blocks: (B:122:0x03b3, B:130:0x03c7, B:136:0x040b, B:138:0x044d, B:157:0x055d, B:163:0x057e, B:164:0x0581, B:165:0x0582, B:131:0x03d1, B:132:0x03ef, B:133:0x03f0, B:134:0x03fa, B:135:0x0404, B:139:0x0453, B:141:0x0459, B:144:0x0479, B:150:0x0517, B:151:0x051a, B:152:0x051b, B:154:0x0545, B:155:0x0550, B:142:0x0469, B:148:0x0515, B:161:0x057c), top: B:232:0x03b3, inners: #9, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0582 A[Catch: all -> 0x0594, TRY_LEAVE, TryCatch #23 {all -> 0x0594, blocks: (B:122:0x03b3, B:130:0x03c7, B:136:0x040b, B:138:0x044d, B:157:0x055d, B:163:0x057e, B:164:0x0581, B:165:0x0582, B:131:0x03d1, B:132:0x03ef, B:133:0x03f0, B:134:0x03fa, B:135:0x0404, B:139:0x0453, B:141:0x0459, B:144:0x0479, B:150:0x0517, B:151:0x051a, B:152:0x051b, B:154:0x0545, B:155:0x0550, B:142:0x0469, B:148:0x0515, B:161:0x057c), top: B:232:0x03b3, inners: #9, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x037d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r10v1, types: [eieu] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r16v0, types: [fcsu] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r22v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // defpackage.cnxb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cobo r39, defpackage.fcxy r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnxl.b(cobo, fcxy):java.lang.Object");
    }

    @Override // defpackage.cnxb
    public final boolean c(Instant instant, Instant instant2) throws IOException {
        instant.getClass();
        instant2.getClass();
        cnsx cnsxVarA = ((cnsy) this.c.b()).a(instant.toEpochMilli(), instant2.toEpochMilli());
        try {
            boolean zJ = cnsxVarA.j();
            fczl.a(cnsxVarA, null);
            return zJ;
        } finally {
        }
    }

    @Override // defpackage.cnxb
    public final Object d(cnyz cnyzVar) throws IOException {
        int iE;
        int iA = cobq.a(cnyzVar) - 1;
        if (iA == 0) {
            Instant instant = Instant.EPOCH;
            instant.getClass();
            iE = e(instant);
        } else if (iA != 1) {
            iE = cobt.a(cnyzVar).size();
        } else {
            evvp evvpVar = (cnyzVar.c == 4 ? (cnyr) cnyzVar.d : cnyr.a).c;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            Instant instantD = evwz.d(evvpVar);
            instantD.getClass();
            iE = e(instantD);
        }
        return new Integer(iE);
    }
}
