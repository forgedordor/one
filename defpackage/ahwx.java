package defpackage;

import android.content.Context;
import android.util.Base64;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwx implements cdfg {
    public final Context a;
    public final fcsu b;
    private final fcsu c;
    private final fdjx d;

    public ahwx(fcsu fcsuVar, Context context, fdjx fdjxVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        context.getClass();
        fdjxVar.getClass();
        fcsuVar2.getClass();
        this.c = fcsuVar;
        this.a = context;
        this.d = fdjxVar;
        this.b = fcsuVar2;
    }

    private static final String f(ahto ahtoVar) {
        Instant instant;
        UUID uuid = ahtoVar.a;
        String strEncodeToString = Base64.encodeToString(cobs.d(uuid), 2);
        String strName = ahtoVar.b.name();
        String strName2 = ahtoVar.c.name();
        Instant instantTruncatedTo = ahtoVar.d.truncatedTo(ChronoUnit.SECONDS);
        Instant instant2 = ahtoVar.e;
        String str = null;
        Instant instantTruncatedTo2 = instant2 != null ? instant2.truncatedTo(ChronoUnit.SECONDS) : null;
        aiaa aiaaVar = ahtoVar.f;
        if (aiaaVar != null) {
            String str2 = aiaaVar.d;
            evvp evvpVar = aiaaVar.e;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            evvo evvoVar = (evvo) evvpVar.toBuilder();
            evvoVar.copyOnWrite();
            ((evvp) evvoVar.instance).c = 0;
            evsn evsnVarBuild = evvoVar.build();
            evsnVarBuild.getClass();
            instant = instantTruncatedTo2;
            str = "backupId: [" + str2 + "], backupTimestamp: [" + evxd.d((evvp) evsnVarBuild) + ", schemaVersion: [" + aiaaVar.c + "], minBackupSchemaVersion: [" + aiaaVar.f + "], restoreWorkflowVersion: [" + aiaaVar.g + "]";
        } else {
            instant = instantTruncatedTo2;
        }
        return "{sessionId = [" + uuid + "], sessionId64 = [" + strEncodeToString + "], feature = [" + strName + "], status = [" + strName2 + "], startTime = [" + instantTruncatedTo + "], finishTime = [" + instant + "], dbMetaData = [" + str + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ahwq
            if (r0 == 0) goto L13
            r0 = r6
            ahwq r0 = (defpackage.ahwq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahwq r0 = new ahwq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.StringBuilder r0 = r0.d
            defpackage.fctl.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.fctl.b(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = "Section: RestoreWorkflow\n"
            r6.append(r2)
            r0.d = r6
            r0.c = r3
            java.lang.Object r0 = r5.e(r0)
            if (r0 == r1) goto L8a
            r4 = r0
            r0 = r6
            r6 = r4
        L4b:
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
        L51:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r6.next()
            cdff r1 = (defpackage.cdff) r1
            java.lang.String r2 = r1.a()
            java.lang.String r1 = r1.b()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ": "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = "\n"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            goto L51
        L82:
            java.lang.String r6 = r0.toString()
            r6.getClass()
            return r6
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahwx.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.cdfg
    public final eiju b() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new ahwu(this, null));
    }

    @Override // defpackage.cdfg
    public final eiju c() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new ahwv(this, null));
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new ahww(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0128 A[LOOP:0: B:27:0x0122->B:29:0x0128, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r14) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahwx.e(fcxy):java.lang.Object");
    }
}
