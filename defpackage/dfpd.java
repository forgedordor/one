package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpd {
    public final dfoa a;
    public final dfoa b;
    public final dfoa c;
    public final dfoa d;

    public dfpd(dfpe dfpeVar) {
        this.a = dfpeVar.f("download_timeout_seconds", 60);
        this.b = dfpeVar.f("upload_timeout_seconds", 180);
        this.c = dfpeVar.i("enable_domain_logging", false);
        this.d = dfpeVar.i("enable_reconfiguration_on_forbidden", false);
    }
}
