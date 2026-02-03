package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anfq extends fcyz implements fdat {
    final /* synthetic */ anfr a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anfq(anfr anfrVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = anfrVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anfq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final bbgw bbgwVar = (bbgw) this.a.a.b();
        final String str = this.b;
        if (TextUtils.isEmpty(str)) {
            eijx.e(null);
        } else {
            eijx.f(new Runnable() { // from class: bbgd
                @Override // java.lang.Runnable
                public final void run() {
                    bbgw bbgwVar2 = bbgwVar;
                    fcsu fcsuVar = bbgwVar2.g;
                    eieu eieuVarK = eiiy.k("LinkPreviewDatabaseOperations#incrementParticipantManualLinkPreviewCount");
                    String str2 = str;
                    try {
                        cqaz.h();
                        if (!TextUtils.isEmpty(str2)) {
                            long j = Long.parseLong(str2);
                            String[] strArr = bput.a;
                            bpuq bpuqVar = new bpuq();
                            bpuqVar.ag("manual_link_preview_count", dqxf.a(bbfz.a(str2)));
                            bpus bpusVar = new bpus();
                            bpusVar.b(j);
                            if (!bpuqVar.aj(new bpur(bpusVar), "link_preview_participants_table-buildAndUpdateForParticipantId")) {
                                bptv bptvVar = new bptv();
                                bptvVar.c(j);
                                bptvVar.b(1L);
                                bptvVar.a().m();
                            }
                        }
                        eieuVarK.close();
                        cczi ccziVar = ccze.s;
                        if (((Boolean) ccziVar.e()).booleanValue() && !((Boolean) afgs.c.e()).booleanValue()) {
                            bbgwVar2.j.c("Bugle.Share.WebLinkPreview.ManualPreviewButtonClick");
                        }
                        if (bbfz.d(str2) == ((Integer) ccze.t.e()).intValue() && ((Boolean) ccziVar.e()).booleanValue() && !((Boolean) afgs.c.e()).booleanValue()) {
                            bbgwVar2.j.c("Bugle.Share.WebLinkPreview.ManualPreviewThresholdReached");
                        }
                    } catch (Throwable th) {
                        try {
                            eieuVarK.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, bbgwVar.q);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anfq(this.a, this.b, fcxyVar);
    }
}
