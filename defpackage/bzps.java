package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzps implements caar {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreWorkItemProcessor");
    private static final List b = fcva.g(bvdl.CMS_MEDIA_DOWNLOAD_NOT_STARTED, bvdl.CMS_MEDIA_DOWNLOAD_FAILED, bvdl.CMS_MEDIA_DOWNLOADING);
    private final axlf c;
    private final bzop d;
    private final bzqa e;
    private final Context f;
    private final cqmr g;
    private final feav h;
    private final aukz i;
    private final appe j;
    private final appu k;
    private final cogw l;
    private final aqef m;
    private final fcsu n;

    public bzps(axlf axlfVar, bzop bzopVar, bzqa bzqaVar, Context context, cqmr cqmrVar, feav feavVar, aukz aukzVar, appe appeVar, appu appuVar, cogw cogwVar, aqef aqefVar, fcsu fcsuVar) {
        axlfVar.getClass();
        context.getClass();
        cqmrVar.getClass();
        feavVar.getClass();
        aukzVar.getClass();
        cogwVar.getClass();
        fcsuVar.getClass();
        this.c = axlfVar;
        this.d = bzopVar;
        this.e = bzqaVar;
        this.f = context;
        this.g = cqmrVar;
        this.h = feavVar;
        this.i = aukzVar;
        this.j = appeVar;
        this.k = appuVar;
        this.l = cogwVar;
        this.m = aqefVar;
        this.n = fcsuVar;
    }

    private final cbcw f(Exception exc, String str, MessageIdType messageIdType, ConversationIdType conversationIdType) {
        boolean z = this.k.a() ? (exc instanceof CronetException) || (exc instanceof fbtf) : exc instanceof CronetException;
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleCmsMediaRestore");
        ((ekrd) ((ekrd) ekrwVarJ).g(exc).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsLocalMediaRestoreWorkItemProcessor", "failWithException", 294, "CmsLocalMediaRestoreWorkItemProcessor.kt")).D("Unexpected exception occurred during media restore for part %s. Failing %s retry.", str, true != z ? "without" : "with");
        this.e.b(((Boolean) ((cczi) cpxw.n.get()).e()).booleanValue() ? bvdl.CMS_MEDIA_DOWNLOAD_FAILED : bvdl.CMS_MEDIA_DOWNLOAD_NOT_STARTED, conversationIdType, messageIdType, str);
        return z ? cbcw.m() : cbcw.k();
    }

    private final void g(Throwable th, int i) {
        this.i.w(7, i, th, 0, null);
    }

    @Override // defpackage.caas
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((cand) obj).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r12v6, types: [cmfo, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cand r20, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzps.b(cand, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0260 A[Catch: all -> 0x02ac, Exception -> 0x02ae, TRY_ENTER, TRY_LEAVE, TryCatch #15 {Exception -> 0x02ae, all -> 0x02ac, blocks: (B:68:0x0260, B:79:0x02b4, B:80:0x02f8), top: B:132:0x025e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030f A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:15:0x0057, B:71:0x0285, B:87:0x0307, B:89:0x030f, B:90:0x0312), top: B:122:0x0035 }] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3, types: [fcyl, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r30, int r31, defpackage.cayy r32, defpackage.fcxy r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzps.c(java.lang.String, int, cayy, fcxy):java.lang.Object");
    }

    @Override // defpackage.caar
    public final /* bridge */ /* synthetic */ Object d(Object obj, cayy cayyVar, Object obj2, fcxy fcxyVar) {
        return e(cayyVar, (cand) obj2, fcxyVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
    
        if (r10 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
    
        if (b(r9, r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cayy r8, defpackage.cand r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzps.e(cayy, cand, fcxy):java.lang.Object");
    }
}
