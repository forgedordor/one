package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buam {
    public static dqsq a() {
        return new dqry(buat.c, "self_profiles", new dqrx() { // from class: buaj
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = buat.a;
                numValueOf.getClass();
                if (i == 59920) {
                    buat.e(dqsyVar, 59920);
                } else {
                    if (i != 60400) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE self_profiles ADD COLUMN is_self_profile_shareable INT DEFAULT(1);");
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(buat.d, true, "self_profiles", new dqrx() { // from class: buak
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = buat.a;
                numValueOf.getClass();
                if (i != 60140) {
                    return;
                }
                dqru.K(dqsyVar, "self_profiles", buat.d(60140, "TEMP___self_profiles"), buat.a, buat.g());
            }
        });
    }
}
