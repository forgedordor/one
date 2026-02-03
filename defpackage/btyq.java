package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btyq {
    public static dqsq a() {
        return new dqry(btyx.d, "self_participants", new dqrx() { // from class: btyo
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = btyx.a;
                numValueOf.getClass();
                if (i == 29050) {
                    btyx.d(dqsyVar, 29050);
                } else {
                    if (i != 29080) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE self_participants ADD COLUMN smsc TEXT;");
                }
            }
        });
    }
}
