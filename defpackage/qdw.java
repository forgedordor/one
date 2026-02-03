package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdw extends phj {
    public qdw() {
        super(20, 21);
    }

    @Override // defpackage.phj
    public final void a(pjo pjoVar) {
        pjoVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
