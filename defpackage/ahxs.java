package defpackage;

import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxs extends fcyz implements fdat {
    int a;
    final /* synthetic */ UUID b;
    final /* synthetic */ ahxy c;
    final /* synthetic */ File d;
    final /* synthetic */ szf e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxs(fcxy fcxyVar, UUID uuid, ahxy ahxyVar, File file, szf szfVar) {
        super(2, fcxyVar);
        this.b = uuid;
        this.c = ahxyVar;
        this.d = file;
        this.e = szfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahxs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        if (r1.g(r2, r8.k, r7) != r0) goto L15;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L11
            defpackage.fctl.b(r8)
            if (r1 == r3) goto L55
            if (r1 == r2) goto L8d
            goto La5
        L11:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.f
            fdjx r8 = (defpackage.fdjx) r8
            ekrg r8 = defpackage.ahxy.a
            ekrw r8 = r8.h()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r4 = "BugleRestore"
            r8.X(r1, r4)
            ekrd r8 = (defpackage.ekrd) r8
            r1 = 10
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r8.V(r1, r4)
            r1 = 167(0xa7, float:2.34E-43)
            java.lang.String r4 = "BasicRestoreWorkflowSteps.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/restore/impl/BasicRestoreWorkflowSteps$requestAttachmentRestore$lambda$6$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r6 = "invokeSuspend"
            ekrw r8 = r8.h(r5, r6, r1, r4)
            ekrd r8 = (defpackage.ekrd) r8
            java.util.UUID r1 = r7.b
            java.lang.String r4 = "Requested attachment restore [%s]"
            r8.t(r4, r1)
            ahxy r8 = r7.c
            fcsu r8 = r8.b
            java.lang.Object r8 = r8.b()
            ahwd r8 = (defpackage.ahwd) r8
            r7.a = r3
            java.lang.Object r8 = r8.z(r1)
            if (r8 == r0) goto La8
        L55:
            aiad r8 = defpackage.aiad.a
            evsf r8 = r8.createBuilder()
            aiac r8 = (defpackage.aiac) r8
            r8.getClass()
            java.io.File r1 = r7.d
            java.lang.String r1 = r1.getAbsolutePath()
            r1.getClass()
            defpackage.aiae.d(r1, r8)
            szf r1 = r7.e
            ahzy r1 = r1.a()
            defpackage.aiae.b(r1, r8)
            ahxy r1 = r7.c
            aiad r8 = defpackage.aiae.a(r8)
            fcsu r1 = r1.b
            java.lang.Object r1 = r1.b()
            ahwd r1 = (defpackage.ahwd) r1
            java.util.UUID r3 = r7.b
            r7.a = r2
            java.lang.Object r8 = r1.d(r3, r8, r7)
            if (r8 == r0) goto La8
        L8d:
            ahxy r8 = r7.c
            fcsu r1 = r8.d
            java.lang.Object r1 = r1.b()
            ahtn r1 = (defpackage.ahtn) r1
            java.util.UUID r2 = r7.b
            r3 = 3
            r7.a = r3
            ahtq r8 = r8.k
            java.lang.Object r8 = r1.g(r2, r8, r7)
            if (r8 != r0) goto La5
            goto La8
        La5:
            fctx r8 = defpackage.fctx.a
            return r8
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahxs ahxsVar = new ahxs(fcxyVar, this.b, this.c, this.d, this.e);
        ahxsVar.f = obj;
        return ahxsVar;
    }
}
