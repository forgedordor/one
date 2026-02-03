package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qci extends phj {
    public static final qci c = new qci();

    private qci() {
        super(12, 13);
    }

    @Override // defpackage.phj
    public final void a(pjo pjoVar) {
        pjoVar.g("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        pjoVar.g("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
