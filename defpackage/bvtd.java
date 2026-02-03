package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvtd {
    public static final cqce a = cqce.g("BugleJobs", "PreUploadAttachmentsRecurringWorker");
    private static final cczi n = cdag.e(cdag.b, "ditto_max_conversations_to_pre_upload", 25);
    private static final cczi o = cdag.e(cdag.b, "ditto_pre_upload_attachments_job_max_messages_per_conversation", 20);
    public final ayqp b;
    public final bvsl c;
    public final baeb d;
    public final eosc e;
    public final bael f;
    public final baes g;
    public final aqmq h;
    public final int i;
    public final int j;
    public final ceku k;
    public final Optional l;
    public final eygg m;

    public bvtd(ayqp ayqpVar, bvsl bvslVar, baeb baebVar, cczn ccznVar, eosc eoscVar, bael baelVar, baes baesVar, aqmq aqmqVar, ceku cekuVar, Optional optional, eygg eyggVar) {
        this.b = ayqpVar;
        this.c = bvslVar;
        this.d = baebVar;
        this.e = eoscVar;
        this.f = baelVar;
        this.g = baesVar;
        this.h = aqmqVar;
        this.k = cekuVar;
        this.l = optional;
        this.m = eyggVar;
        ccznVar.a();
        this.i = ((Integer) n.e()).intValue();
        this.j = ((Integer) o.e()).intValue();
    }
}
