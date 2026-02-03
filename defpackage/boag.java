package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boag {
    public static dqsq a() {
        return new dqry(boal.c, "conversation_participants_audit_log", new dqrx() { // from class: boae
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = boal.a;
                numValueOf.getClass();
                if (i == 59370) {
                    boal.d(dqsyVar, 59370);
                } else {
                    if (i != 59440) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE conversation_participants_audit_log ADD COLUMN last_modified_by_key TEXT;");
                }
            }
        });
    }
}
