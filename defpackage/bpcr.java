package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpcr {
    public static dqsq a() {
        return new dqry(bpcy.c, "drafts", new dqrx() { // from class: bpcp
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bpcy.a;
                numValueOf.getClass();
                switch (i) {
                    case 59150:
                        bpcy.d(dqsyVar, 59150);
                        break;
                    case 59170:
                        dqsyVar.v("ALTER TABLE drafts ADD COLUMN subject TEXT;");
                        dqsyVar.v("ALTER TABLE drafts ADD COLUMN is_urgent INT DEFAULT(0) NOT NULL;");
                        break;
                    case 59420:
                        dqsyVar.v("ALTER TABLE drafts ADD COLUMN attachments BLOB;");
                        break;
                    case 59540:
                        dqsyVar.v("ALTER TABLE drafts ADD COLUMN replied_to_message_id TEXT;");
                        break;
                    case 59720:
                        dqsyVar.v("ALTER TABLE drafts ADD COLUMN is_encrypted INT DEFAULT(0) NOT NULL;");
                        break;
                }
            }
        });
    }
}
