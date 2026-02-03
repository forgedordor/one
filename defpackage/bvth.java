package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.ditto.workers.PreUploadAttachmentsRecurringWorker;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvth {
    private static final cqce a = cqce.g("BugleJobs", "PreUploadAttachmentsWorkerScheduler");
    private final Context b;

    public bvth(Context context) {
        this.b = context;
    }

    public final void a() {
        a.m("Canceling pre-upload jobs.");
        Context context = this.b;
        qbq.a(context).a("pre_upload_attachments_recurring_worker_unique");
        qbq.a(context).a("pre_upload_attachments_recurring_worker");
    }

    public final void b() {
        Context context = this.b;
        qbq.a(context).a("pre_upload_attachments_recurring_worker");
        a.m("Scheduling pre-upload jobs.");
        qbr qbrVarA = qbq.a(context);
        pzy pzyVar = pzy.b;
        Duration duration = PreUploadAttachmentsRecurringWorker.e;
        ((PreUploadAttachmentsRecurringWorker.b) ehli.a(context, PreUploadAttachmentsRecurringWorker.b.class)).iu().a();
        qbg qbgVar = new qbg(PreUploadAttachmentsRecurringWorker.class, PreUploadAttachmentsRecurringWorker.e);
        qbgVar.d("pre_upload_attachments_recurring_worker_unique");
        pzh pzhVar = new pzh();
        pzhVar.c(3);
        pzhVar.c = true;
        pzhVar.b = true;
        qbgVar.g(pzhVar.a());
        qbrVarA.f("pre_upload_attachments_worker_unique_name", pzyVar, (qbh) qbgVar.b());
    }
}
