package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class babk {
    public static final fcsu a = new fcsu() { // from class: babj
        @Override // defpackage.fcsu
        public final Object b() {
            String[] strArr = azph.a;
            azpe azpeVar = new azpe(azph.a);
            azpeVar.A("duplicateReadReportsQuery");
            azpeVar.v();
            azoo azooVar = azph.c;
            azpeVar.n(new dqxl("$V", new Object[]{azooVar.a}), "backup_id");
            btba btbaVar = btbt.c;
            azpeVar.n(new dqxl("$V{J:bugle_read_reports}", new Object[]{btbaVar.a}), "bugle_id");
            azpe azpeVar2 = (azpe) ((azpe) azpeVar.j(azvg.c(azooVar.b, azvt.b, "message_id_map", false, 16))).j(azvg.c(azooVar.c, azvt.c, "participant_id_map", false, 16));
            btbo btboVarB = btbt.b();
            btboVarB.v();
            dqtr dqtrVarH = dqts.h(btboVarB.a());
            String[] strArr2 = bmkn.a;
            bmkm bmkmVar = new bmkm();
            btbb btbbVar = btbaVar.b;
            bmju bmjuVar = bmkn.c.d;
            bmkmVar.ar(new dqxl("$V{J:bugle_read_reports} = $V{J:message_id_map}", new Object[]{btbbVar, bmjuVar}));
            bmkmVar.ar(new dqxl("$V{J:bugle_read_reports} = $V{J:participant_id_map}", new Object[]{btbaVar.c, bmjuVar}));
            dqos dqosVar = (dqos) dqtrVarH;
            dqosVar.d = new bmkl(bmkmVar);
            dqosVar.e = "bugle_read_reports";
            return fcva.b((azpe) azpeVar2.j(dqtrVarH));
        }
    };
}
