package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btbm {
    public static dqsq a() {
        return new dqry(btbt.d, "read_reports", new dqrx() { // from class: btbk
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = btbt.a;
                numValueOf.getClass();
                if (i == 10008) {
                    btbt.e(dqsyVar, 10008);
                } else {
                    if (i != 58880) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE read_reports ADD COLUMN ftd_time INTEGER DEFAULT(-1);");
                }
            }
        });
    }

    public static dqpo[] b() {
        return btbt.c.g;
    }
}
