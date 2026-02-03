package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfop {
    public final dfoa a;
    public final dfoa b;
    public final dfoa c;
    public final dfoa d;
    public final dfoa e;
    public final dfoa f;
    public final dfoa g;
    public final dfoa h;
    public final dfoa i;
    public final dfoa j;

    public dfop(dfoq dfoqVar) {
        this.a = dfoqVar.i("enable_cema", false);
        this.b = dfoqVar.f("wait_for_failure_response_timeout_seconds", 30);
        this.c = dfoqVar.f("connection_init_timeout_seconds", 15);
        this.d = dfoqVar.i("enable_discard_duplicate_messages", false);
        this.e = dfoqVar.i("outgoing_chat_is_active_passive", false);
        this.f = dfoqVar.i("enable_rfc6135_compliance", false);
        this.g = dfoqVar.i("enable_report_to_imdn_translation", false);
        this.h = dfoqVar.f("max_content_per_msrp_chunk_size", 61536);
        this.i = dfoqVar.f("slm_max_content_per_msrp_chunk_size", 1048576);
        this.j = dfoqVar.i("enable_recording_io_streams", false);
    }
}
