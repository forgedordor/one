package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azzw {
    public static final fcsu a = new fcsu() { // from class: azzv
        @Override // defpackage.fcsu
        public final Object b() {
            String[] strArr = azgl.a;
            azgi azgiVar = new azgi(azgl.a);
            azgiVar.A("duplicateMessageStarQuery");
            azgiVar.v();
            azfv azfvVar = azgl.c;
            azgiVar.n(new dqxl("$V", new Object[]{azfvVar.a}), "backup_id");
            bqrv bqrvVar = bqsm.c;
            azgiVar.n(new dqxl("$V{J:bugle_message_star}", new Object[]{bqrvVar.a}), "bugle_id");
            azgi azgiVar2 = (azgi) azgiVar.j(azvg.c(azfvVar.b, azvt.b, "message_star_id_map", false, 16));
            bqsh bqshVar = new bqsh(bqsm.a);
            bqshVar.v();
            dqtr dqtrVarH = dqts.h(bqshVar.a());
            String[] strArr2 = bmkn.a;
            bmkm bmkmVar = new bmkm();
            bmkmVar.ar(new dqxl("$V{J:bugle_message_star} = $V{J:message_star_id_map}", new Object[]{bqrvVar.b, bmkn.c.d}));
            dqos dqosVar = (dqos) dqtrVarH;
            dqosVar.d = new bmkl(bmkmVar);
            dqosVar.e = "bugle_message_star";
            return fcva.b((azgi) azgiVar2.j(dqtrVarH));
        }
    };
}
