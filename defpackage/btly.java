package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btly {
    public static dqsq a() {
        return new dqry(btmf.c, "remote_registrations_table", new dqrx() { // from class: btlw
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = btmf.a;
                numValueOf.getClass();
                if (i == 45000) {
                    btmf.d(dqsyVar, 45000);
                } else if (i == 46000) {
                    dqsyVar.v("ALTER TABLE remote_registrations_table ADD COLUMN better_etouffee INT DEFAULT(0);");
                } else {
                    if (i != 58800) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE remote_registrations_table ADD COLUMN messages_feature_hash INTEGER DEFAULT(0);");
                }
            }
        });
    }
}
