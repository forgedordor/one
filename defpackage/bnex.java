package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnex {
    public static dqsq a() {
        return new dqry(bnfe.d, "contacts", new dqrx() { // from class: bnev
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bnfe.a;
                numValueOf.getClass();
                switch (i) {
                    case 58630:
                        bnfe.e(dqsyVar, 58630);
                        break;
                    case 59070:
                        dqsyVar.v("ALTER TABLE contacts ADD COLUMN sort_key TEXT NOT NULL;");
                        dqsyVar.v("ALTER TABLE contacts ADD COLUMN phonebook_label TEXT NOT NULL;");
                        dqsyVar.v("ALTER TABLE contacts ADD COLUMN phonebook_bucket INTEGER;");
                        dqsyVar.v("DROP INDEX IF EXISTS contacts_sort");
                        dqsyVar.v("CREATE INDEX contacts_sort ON contacts(phonebook_bucket, sort_key);");
                        break;
                    case 59080:
                        dqsyVar.v("DROP INDEX IF EXISTS index_contacts_phonebook_label");
                        dqsyVar.v("CREATE INDEX index_contacts_phonebook_label ON contacts(phonebook_label);");
                        dqsyVar.v("ALTER TABLE contacts ADD COLUMN contact_type INTEGER;");
                        break;
                    case 59120:
                        dqsyVar.v("ALTER TABLE contacts ADD COLUMN display_destination TEXT NOT NULL;");
                        break;
                    case 60150:
                        dqsyVar.v("ALTER TABLE contacts ADD COLUMN type_label TEXT;");
                        break;
                    case 60690:
                        dqsyVar.v("ALTER TABLE contacts ADD COLUMN contact_fingerprint TEXT UNIQUE ON CONFLICT REPLACE;");
                        break;
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(bnfe.e, true, "contacts", new dqrx() { // from class: bneu
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bnfe.a;
                numValueOf.getClass();
                switch (i) {
                    case 59070:
                        dqru.r(dqsyVar, "contacts");
                        bnfe.f(dqsyVar, 59070);
                        break;
                    case 59080:
                        dqru.r(dqsyVar, "contacts");
                        bnfe.f(dqsyVar, 59080);
                        break;
                    case 59120:
                        dqru.r(dqsyVar, "contacts");
                        bnfe.f(dqsyVar, 59120);
                        break;
                    case 60690:
                        bnfe.f(dqsyVar, 60690);
                        break;
                }
            }
        });
    }
}
