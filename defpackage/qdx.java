package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdx extends phj {
    public qdx() {
        super(22, 23);
    }

    @Override // defpackage.phj
    public final void a(pjo pjoVar) {
        pjoVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
