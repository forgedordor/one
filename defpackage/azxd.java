package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azxd {
    public static final dqxe a = new dqxl("SELECT DISTINCT backup_participants_by_conversation.conversation_id AS backup_id, bugle_participants_by_conversation.conversation_id AS bugle_id, $V AS table_name, $V AS status FROM ( SELECT conversation_participants_backup.conversation_id, group_concat(p_map.bugle_id) OVER (PARTITION BY conversation_participants_backup.conversation_id ORDER BY p_map.bugle_id RANGE BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING) AS grouped_participants FROM backup_id_map AS p_map JOIN conversation_participants_backup ON p_map.backup_id = conversation_participants_backup.participant_id WHERE p_map.table_name = $V ) AS backup_participants_by_conversation INNER JOIN ( SELECT conversation_participants.conversation_id, group_concat(conversation_participants.participant_id) OVER (PARTITION BY conversation_participants.conversation_id ORDER BY conversation_participants.participant_id RANGE BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING) AS grouped_participants FROM conversation_participants ) AS bugle_participants_by_conversation ON backup_participants_by_conversation.grouped_participants = bugle_participants_by_conversation.grouped_participants INNER JOIN conversations ON conversations._id = bugle_participants_by_conversation.conversation_id INNER JOIN conversations_backup ON conversations_backup._id = backup_participants_by_conversation.conversation_id INNER JOIN backup_id_map AS c_map ON c_map.backup_id = backup_participants_by_conversation.conversation_id WHERE conversations.conv_type <> 2 AND conversations_backup.conversation_type <> 2 AND c_map.status = $V", new Object[]{azvt.a.a, -1L, azvt.c.a, 1L});
    public static final fcsu b = new fcsu() { // from class: azxc
        @Override // defpackage.fcsu
        public final Object b() {
            dqxe dqxeVar = azxd.a;
            ayze ayzeVarA = ayzh.a();
            ayzeVarA.A("duplicateRcsGroupIdQuery");
            ayzeVarA.v();
            ayxz ayxzVar = ayzh.c;
            ayya ayyaVar = ayxzVar.a;
            ayzeVarA.n(new dqxl("$V", new Object[]{ayyaVar}), "backup_id");
            bopp boppVar = botm.c;
            bopq bopqVar = boppVar.a;
            ayzeVarA.n(new dqxl("$V{J:bugle_conversations}", new Object[]{bopqVar}), "bugle_id");
            ayzeVarA.c(ayyaVar);
            botb botbVarE = botm.e();
            botbVarE.v();
            dqtr dqtrVarI = dqts.i(botbVarE.b(), boppVar.aa, ayxzVar.k);
            ((dqos) dqtrVarI).e = "bugle_conversations";
            ayze ayzeVarA2 = ayzh.a();
            ayzeVarA2.A("duplicateCmsIdQuery");
            ayzeVarA2.v();
            ayzeVarA2.n(new dqxl("$V", new Object[]{ayyaVar}), "backup_id");
            ayzeVarA2.n(new dqxl("$V{J:bugle_conversations}", new Object[]{bopqVar}), "bugle_id");
            botb botbVarE2 = botm.e();
            botbVarE2.v();
            dqtr dqtrVarI2 = dqts.i(botbVarE2.b(), boppVar.Z, ayxzVar.s);
            ((dqos) dqtrVarI2).e = "bugle_conversations";
            return fcva.g((ayze) ayzeVarA.j(dqtrVarI), (ayze) ayzeVarA2.j(dqtrVarI2));
        }
    };
}
