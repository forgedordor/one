package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atmq {
    public static dqsq a() {
        return new dqry(atmx.c, "file_processing", new dqrx() { // from class: atmo
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = atmx.a;
                numValueOf.getClass();
                if (i == 60260) {
                    atmx.d(dqsyVar, 60260);
                } else {
                    if (i != 60700) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE file_processing ADD COLUMN mls_file_metadata BLOB;");
                }
            }
        });
    }
}
