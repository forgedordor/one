package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class pho {
    public static final void a(pgz pgzVar) throws Exception {
        fcww fcwwVar = new fcww((byte[]) null);
        phi phiVarA = pgzVar.a("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (phiVarA.j()) {
            try {
                fcwwVar.add(phiVarA.d(0));
            } finally {
            }
        }
        fdaa.a(phiVarA, null);
        for (String str : fcva.a(fcwwVar)) {
            if (fdgn.t(str, "room_fts_content_sync_")) {
                pjk.a(pgzVar, "DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
            }
        }
    }
}
