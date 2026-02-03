package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwy {
    public static final fcsu a = new fcsu() { // from class: azwx
        @Override // defpackage.fcsu
        public final Object b() {
            String[] strArr = aywb.a;
            ayvy ayvyVar = new ayvy(aywb.a);
            ayvyVar.A("duplicateConversationPinQuery");
            ayvyVar.v();
            ayvk ayvkVar = aywb.c;
            ayvyVar.n(new dqxl("$V", new Object[]{ayvkVar.a}), "backup_id");
            bocx bocxVar = bodn.c;
            ayvyVar.n(new dqxl("$V{J:bugle_conversation_pin}", new Object[]{bocxVar.a}), "bugle_id");
            ayvy ayvyVar2 = (ayvy) ayvyVar.j(azvg.c(ayvkVar.b, azvt.a, "convo_id_map", false, 16));
            bodk bodkVar = new bodk(bodn.a);
            bodkVar.v();
            dqtr dqtrVarH = dqts.h(bodkVar.a());
            String[] strArr2 = bmkn.a;
            bmkm bmkmVar = new bmkm();
            bmkmVar.ar(new dqxl("$V{J:bugle_conversation_pin} = $V{J:convo_id_map}", new Object[]{bocxVar.b, bmkn.c.d}));
            dqos dqosVar = (dqos) dqtrVarH;
            dqosVar.d = new bmkl(bmkmVar);
            dqosVar.e = "bugle_conversation_pin";
            return fcva.b((ayvy) ayvyVar2.j(dqtrVarH));
        }
    };
}
