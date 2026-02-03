package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzvb implements caar {
    public final aurx b;
    private final Context d;
    private final fcsu e;
    private final fcsu f;
    private final dqsn g;
    private final bzsn h;
    private final bahv i;
    private final aukz j;
    private final cogw k;
    private final apou l;
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/queuer/CmsMediaUploadQueuerWorkItemProcessor");
    public static final List a = fcva.g(cpyi.SUCCEED_VIA_BATCH_BACKUP, cpyi.MERGED_FROM_CMS);

    /* compiled from: PG */
    public interface a {
        bzrq cd();
    }

    public bzvb(Context context, fcsu fcsuVar, fcsu fcsuVar2, dqsn dqsnVar, aurx aurxVar, bzsn bzsnVar, bahv bahvVar, aukz aukzVar, cogw cogwVar, apou apouVar) {
        context.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        dqsnVar.getClass();
        aurxVar.getClass();
        bahvVar.getClass();
        aukzVar.getClass();
        cogwVar.getClass();
        apouVar.getClass();
        this.d = context;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = dqsnVar;
        this.b = aurxVar;
        this.h = bzsnVar;
        this.i = bahvVar;
        this.j = aukzVar;
        this.k = cogwVar;
        this.l = apouVar;
    }

    private final Object h() {
        emcy emcyVar = (emcy) emcz.a.createBuilder();
        emcyVar.getClass();
        emly.g(2, emcyVar);
        emly.d(0L, emcyVar);
        emly.c(0.0d, emcyVar);
        emly.e(emec.MEDIA_BACKUP, emcyVar);
        emly.b(true, emcyVar);
        this.j.o(emly.a(emcyVar));
        return fctx.a;
    }

    @Override // defpackage.caas
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((bzzx) obj).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.bzvd
            if (r0 == 0) goto L13
            r0 = r6
            bzvd r0 = (defpackage.bzvd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bzvd r0 = new bzvd
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Class r5 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r6)
            goto L55
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r6)
            android.content.Context r6 = r4.d
            fcsu r2 = r4.f
            java.lang.Object r2 = r2.b()
            axlf r2 = (defpackage.axlf) r2
            eiju r5 = r2.b(r5)
            r0.a = r6
            java.lang.Class<bzvb$a> r2 = bzvb.a.class
            r0.e = r2
            r0.d = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto L64
            r0 = r6
            r6 = r5
            r5 = r2
        L55:
            efwo r6 = (defpackage.efwo) r6
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r5 = defpackage.ehlh.a(r0, r5, r6)
            bzvb$a r5 = (bzvb.a) r5
            bzrq r5 = r5.cd()
            return r5
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzvb.b(int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r17, int r18, defpackage.evvp r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzvb.c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, int, evvp, fcxy):java.lang.Object");
    }

    @Override // defpackage.caar
    public final /* bridge */ /* synthetic */ Object d(Object obj, cayy cayyVar, Object obj2, fcxy fcxyVar) {
        return f((bzzx) obj2, fcxyVar);
    }

    public final boolean e(String str, cpyj cpyjVar, aumq aumqVar, bzrq bzrqVar, evvp evvpVar) {
        try {
            ekrw ekrwVarH = c.h();
            ekrwVarH.X(eksq.a, "BugleCmsMediaBackup");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/queuer/CmsMediaUploadQueuerWorkItemProcessor", "enqueueSinglePartIdForMediaBackup", 236, "CmsMediaUploadQueuerWorkItemProcessor.kt")).I("%s Queuing part ID = %s of type %s for media upload", "CmsMediaUploadQueuerWorkItemProcessor:", str, cpyjVar);
            if (this.l.a()) {
                bzrqVar.d(str, cpyjVar, true, aumqVar.d, bzvc.a(aumqVar), 0, evvpVar);
                return true;
            }
            bzrqVar.c(str, cpyjVar, true, aumqVar.d, bzvc.a(aumqVar), 0);
            return true;
        } catch (Exception e) {
            ekrw ekrwVarI = c.i();
            ekrwVarI.X(eksq.a, "BugleCmsMediaBackup");
            ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/queuer/CmsMediaUploadQueuerWorkItemProcessor", "enqueueSinglePartIdForMediaBackup", 271, "CmsMediaUploadQueuerWorkItemProcessor.kt")).D("%s Exception when queuing media upload for part ID = %s", "CmsMediaUploadQueuerWorkItemProcessor:", str);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x02c8, code lost:
    
        if (h() == r8) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0307, code lost:
    
        if (r0 == r8) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0337, code lost:
    
        if (g(3, r3, r4, true, r6, r7) != r8) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a9 A[Catch: all -> 0x035d, LOOP:2: B:62:0x02a3->B:64:0x02a9, LOOP_END, TRY_LEAVE, TryCatch #3 {all -> 0x035d, blocks: (B:61:0x02a0, B:62:0x02a3, B:64:0x02a9), top: B:111:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0307 -> B:83:0x030a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.bzzx r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzvb.f(bzzx, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (defpackage.fdxs.c(r0, r3) == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r17, defpackage.evvp r18, int r19, boolean r20, int r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzvb.g(int, evvp, int, boolean, int, fcxy):java.lang.Object");
    }
}
