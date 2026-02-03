package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmym {
    public static dqsq a() {
        return new dqry(bmyr.c, "cms_restore_dependency_cache_table", new dqrx() { // from class: bmyk
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bmyr.a;
                numValueOf.getClass();
                if (i == 59650) {
                    bmyr.d(dqsyVar, 59650);
                } else {
                    if (i != 59660) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE cms_restore_dependency_cache_table ADD COLUMN cms_data_provider_type INT DEFAULT(0) NOT NULL;");
                }
            }
        });
    }
}
