package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqke {
    public static dqsq a() {
        return new dqry(bqkl.d, "message_reactions", new dqrx() { // from class: bqkc
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bqkl.a;
                numValueOf.getClass();
                switch (i) {
                    case 42000:
                        bqkl.e(dqsyVar, 42000);
                        break;
                    case 46020:
                        dqsyVar.v("ALTER TABLE message_reactions ADD COLUMN reacted_message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ;");
                        dqsyVar.v("CREATE INDEX index_message_reactions_reacted_message_id ON message_reactions(reacted_message_id);");
                        break;
                    case 48000:
                        dqsyVar.v("ALTER TABLE message_reactions ADD COLUMN reaction INTEGER;");
                        break;
                    case 59060:
                        dqsyVar.v("ALTER TABLE message_reactions ADD COLUMN applied_reaction BLOB;");
                        break;
                    case 59520:
                        dqsyVar.v("ALTER TABLE message_reactions ADD COLUMN animation_effect BLOB;");
                        dqsyVar.v("CREATE INDEX index_message_reactions_animation_effect ON message_reactions(animation_effect) WHERE animation_effect NOT NULL;");
                        break;
                }
            }
        });
    }

    public static dqpo[] b() {
        return bqkl.c.h;
    }
}
