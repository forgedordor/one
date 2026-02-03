package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfpp {
    public final dfoa a;
    public final dfoa b;
    public final dfoa c;
    public final dfoa d;

    public dfpp(dfpq dfpqVar) {
        this.a = dfpqVar.i("enable_sms_sharing", false);
        this.b = dfpqVar.i("force_env_support", false);
        this.c = dfpqVar.i("process_incoming_file_transfer_link", false);
        this.d = dfpqVar.i("process_incoming_geolocation_link", false);
    }
}
