package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmwv {
    public static dqsq a() {
        return new dqry(bmxa.c, "cms_notifications", new dqrx() { // from class: bmwt
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bmxa.a;
                numValueOf.getClass();
                if (i == 38000) {
                    bmxa.d(dqsyVar, 38000);
                } else {
                    if (i != 46040) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE cms_notifications ADD COLUMN message_received_timestamp INTEGER DEFAULT(0);");
                }
            }
        });
    }
}
