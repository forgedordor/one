package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azfd {
    public static dqsq a() {
        return new dqry(azfi.d, "message_replies_backup", new dqrx() { // from class: azfa
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = azfi.a;
                numValueOf.getClass();
                if (i != 60) {
                    return;
                }
                azfi.e(dqsyVar);
            }
        });
    }

    public static dqsq b() {
        return new dqry(azfi.e, true, "message_replies_backup", new dqrx() { // from class: azfb
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = azfi.a;
                numValueOf.getClass();
                if (i != 90) {
                    return;
                }
                dqru.K(dqsyVar, "message_replies_backup", azfi.c("TEMP___message_replies_backup"), azfi.a, azfi.d());
            }
        });
    }

    public static dqpo[] c() {
        return azfi.c.e;
    }
}
