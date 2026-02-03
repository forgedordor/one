package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdy extends phj {
    public qdy() {
        super(23, 24);
    }

    @Override // defpackage.phj
    public final void a(pjo pjoVar) {
        pjoVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `backoff_on_system_interruptions` INTEGER DEFAULT NULL");
    }
}
