package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bozs {
    public static dqsq a() {
        return new dqry(bpab.d, "desktop", new dqrx() { // from class: bozq
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bpab.a;
                numValueOf.getClass();
                switch (i) {
                    case 15020:
                        bpab.d(dqsyVar, 15020);
                        break;
                    case 18020:
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN browser_type INT DEFAULT(0);");
                        break;
                    case 20020:
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN needs_unpairing INT DEFAULT(0);");
                        break;
                    case 21030:
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN encryption_key BLOB;");
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN hmac_key BLOB;");
                        break;
                    case 22040:
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN operating_system TEXT DEFAULT('') NOT NULL;");
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN operating_system_version TEXT DEFAULT('') NOT NULL;");
                        break;
                    case 41010:
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN backend_type INT;");
                        break;
                    case 58010:
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN is_active INT DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN request_id TEXT DEFAULT('');");
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN is_persistent INT DEFAULT(0);");
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN desktop_type INT DEFAULT(0);");
                        break;
                    case 58960:
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN pairing_type INT DEFAULT(0);");
                        break;
                    case 59290:
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN destination_registration_id BLOB;");
                        break;
                    case 59560:
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN gaia_email TEXT;");
                        break;
                    case 59870:
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN creation_time INT DEFAULT(0);");
                        break;
                    case 60540:
                        dqsyVar.v("ALTER TABLE desktop ADD COLUMN get_updates_request_time_millis INT DEFAULT(0);");
                        break;
                }
            }
        });
    }
}
