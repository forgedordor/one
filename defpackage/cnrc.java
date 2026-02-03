package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnrc extends cayv {
    private final Context a;
    private final fcsu b;
    private final fcsu c;

    public cnrc(Context context, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = context;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caze cazeVarA = cnrt.a();
        caxz caxzVarL = caya.l();
        caxzVarL.c(((Integer) cnrt.a.e()).intValue());
        caxzVarL.b(cazeVarA);
        if (caze.FOREGROUND_SERVICE.equals(cazeVarA)) {
            ((caxk) caxzVarL).b = ((cgbn) this.b.b()).c(this.a.getString(R.string.forward_sync_foreground_notification_text));
        }
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("ForwardSyncBatchWorkItemHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cnre.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cnre cnreVar = (cnre) evuhVar;
        final cnqz cnqzVar = (cnqz) this.c.b();
        if (((Boolean) ((cczi) cmqf.a.get()).e()).booleanValue()) {
            cnqz.a.p("Legacy Forward Sync cannot start: sync redesign is enabled.");
            ((cnvb) cnqzVar.n.b()).b(cnru.b(cnreVar.i), enqm.REDESIGN_ENABLED_DURING_EXECUTION);
            return eijx.e(cbcw.i());
        }
        if (!((asfb) cnqzVar.s.b()).a() || ((crma) cnqzVar.r.b()).j()) {
            return ((cmqf) cnqzVar.j.b()).d().h(new ejvr() { // from class: cnqx
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:121:0x03db  */
                /* JADX WARN: Removed duplicated region for block: B:122:0x044e  */
                /* JADX WARN: Type inference failed for: r19v21 */
                /* JADX WARN: Type inference failed for: r19v4, types: [cogw] */
                /* JADX WARN: Type inference failed for: r19v5 */
                /* JADX WARN: Type inference failed for: r19v6, types: [cnsx] */
                /* JADX WARN: Type inference failed for: r19v7, types: [cnsx] */
                /* JADX WARN: Type inference failed for: r19v8 */
                @Override // defpackage.ejvr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r50) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 2181
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cnqx.apply(java.lang.Object):java.lang.Object");
                }
            }, cnqzVar.b);
        }
        cnqz.a.p("Legacy Forward Sync cannot start: missing permissions.");
        return eijx.e(cbcw.k());
    }
}
