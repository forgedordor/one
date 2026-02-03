package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azzp {
    public static final fcsu a = new fcsu() { // from class: azzo
        @Override // defpackage.fcsu
        public final Object b() {
            String[] strArr = azfi.a;
            azff azffVar = new azff(azfi.a);
            azffVar.A("duplicateMessageRepliesQuery");
            azffVar.v();
            azer azerVar = azfi.c.a;
            azffVar.n(new dqxl("$V", new Object[]{azerVar}), "backup_id");
            bqlj bqljVar = bqmc.c.a;
            azffVar.n(new dqxl("$V{J:bugle_message_replies}", new Object[]{bqljVar}), "bugle_id");
            azff azffVar2 = (azff) azffVar.j(azvg.c(azerVar, azvt.b, "messages_id_map", false, 16));
            bqlw bqlwVar = new bqlw(bqmc.a);
            bqlwVar.v();
            dqtr dqtrVarH = dqts.h(bqlwVar.a());
            String[] strArr2 = bmkn.a;
            bmkm bmkmVar = new bmkm();
            bmkmVar.ar(new dqxl("$V{J:bugle_message_replies} = $V{J:messages_id_map}", new Object[]{bqljVar, bmkn.c.d}));
            dqos dqosVar = (dqos) dqtrVarH;
            dqosVar.d = new bmkl(bmkmVar);
            dqosVar.e = "bugle_message_replies";
            return fcva.b((azff) azffVar2.j(dqtrVarH));
        }
    };
}
