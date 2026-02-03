package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpxc {
    public static dqsq a() {
        return new dqry(bpxj.d, "link_preview", new dqrx() { // from class: bpxa
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = bpxj.a;
                numValueOf.getClass();
                if (i == 21010) {
                    dqsyVar.v("ALTER TABLE link_preview ADD COLUMN link_preview_prevented INTEGER DEFAULT(0);");
                } else if (i == 22020) {
                    dqsyVar.v("ALTER TABLE link_preview ADD COLUMN link_preview_failed INTEGER DEFAULT(0);");
                } else {
                    if (i != 61000) {
                        return;
                    }
                    dqsyVar.v("ALTER TABLE link_preview ADD COLUMN deferred INTEGER DEFAULT(0);");
                }
            }
        });
    }

    public static dqpo[] b() {
        return bpxj.c.m;
    }
}
