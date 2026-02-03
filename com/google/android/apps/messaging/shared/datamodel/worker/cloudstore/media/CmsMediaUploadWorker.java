package com.google.android.apps.messaging.shared.datamodel.worker.cloudstore.media;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.worker.cloudstore.media.CmsMediaUploadWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.axkg;
import defpackage.axlf;
import defpackage.bztj;
import defpackage.ehli;
import defpackage.ejvr;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.pzn;
import defpackage.pzs;
import defpackage.qaq;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class CmsMediaUploadWorker extends qaq {
    public final Context e;
    public final eosc f;
    private final axlf g;
    private final eosc h;

    /* compiled from: PG */
    public interface a {
        bztj ce();
    }

    /* compiled from: PG */
    public interface b {
        Context R();

        axlf aJ();

        eosc q();

        eosc r();
    }

    public CmsMediaUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        b bVar = (b) ehli.a(context, b.class);
        this.g = bVar.aJ();
        this.e = bVar.R();
        this.h = bVar.q();
        this.f = bVar.r();
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        pzs pzsVarF = f();
        pzn pznVar = new pzn();
        pznVar.b(pzsVarF);
        pznVar.g("attempt_count_key", e());
        final pzs pzsVarA = pznVar.a();
        return this.g.b(pzsVarF.a("account_id_key", -1)).i(new eooz() { // from class: bzso
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                CmsMediaUploadWorker cmsMediaUploadWorker = this.a;
                return ((CmsMediaUploadWorker.a) ehlh.a(cmsMediaUploadWorker.e, CmsMediaUploadWorker.a.class, (efwo) obj)).ce().b(pzsVarA).h(new ejvr() { // from class: bzsq
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return ((bzrp) obj2).a;
                    }
                }, cmsMediaUploadWorker.f);
            }
        }, this.h).e(axkg.class, new ejvr() { // from class: bzsp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new qam();
            }
        }, eoqg.a);
    }
}
