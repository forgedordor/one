package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmni {
    public static dqsq a() {
        return new dqry(bmnn.c, "cms_backup_dependency_cache_table", new dqrx() { // from class: bmng
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bmnn.a;
                numValueOf.getClass();
                if (i == 59580) {
                    bmnn.b(dqsyVar, 59580);
                } else {
                    if (i != 59620) {
                        return;
                    }
                    dqsyVar.v("DROP INDEX IF EXISTS index_cms_backup_dependency_cache_table_dependent_id");
                    dqsyVar.v("CREATE INDEX index_cms_backup_dependency_cache_table_dependent_id ON cms_backup_dependency_cache_table(dependent_id);");
                    dqsyVar.v("DROP INDEX IF EXISTS index_cms_backup_dependency_cache_table_inserted_at_timestamp");
                    dqsyVar.v("CREATE INDEX index_cms_backup_dependency_cache_table_inserted_at_timestamp ON cms_backup_dependency_cache_table(inserted_at_timestamp);");
                }
            }
        });
    }
}
