package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aznn {
    public static dqsq a() {
        return new dqry(azns.d, "parts_backup", new dqrx() { // from class: aznk
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = azns.a;
                numValueOf.getClass();
                if (i == 10) {
                    dqsyVar.v("ALTER TABLE parts_backup ADD COLUMN source INT DEFAULT(13);");
                } else if (i == 100) {
                    dqsyVar.v("ALTER TABLE parts_backup ADD COLUMN file_name TEXT;");
                } else {
                    if (i != 130) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE parts_backup ADD COLUMN duration INT;");
                }
            }
        });
    }

    public static dqsq b() {
        return new dqry(azns.e, true, "parts_backup", new dqrx() { // from class: aznl
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = azns.a;
                numValueOf.getClass();
                if (i != 90) {
                    return;
                }
                dqru.K(dqsyVar, "parts_backup", azns.d(90, "TEMP___parts_backup"), azns.a, azns.f());
            }
        });
    }

    public static dqpo[] c() {
        return azns.c.p;
    }
}
