package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpr {
    public final dfoa a;
    public final dfoa b;
    public final dfoa c;
    public final dfoa d;

    public dfpr(dfps dfpsVar) {
        this.a = dfpsVar.g("tls_socket_read_timeout_millis", 60000L);
        this.b = dfpsVar.h("tls_exclusively_enabled_protocols", "");
        this.c = dfpsVar.h("tls_explicitly_disabled_protocols", "");
        this.d = dfpsVar.h("tls_explicitly_disabled_ciphers", "");
    }
}
