package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aytf {
    public final List a;
    public final List b;

    public aytf(aytd aytdVar, aytd aytdVar2, aytd aytdVar3, aytd aytdVar4, aytd aytdVar5, aytd aytdVar6, aytd aytdVar7, aytd aytdVar8, aytd aytdVar9, aytd aytdVar10, aytd aytdVar11, aytd aytdVar12, aytd aytdVar13, aytd aytdVar14, arjm arjmVar, arjn arjnVar, ariz arizVar) {
        List listA;
        arjmVar.getClass();
        arjnVar.getClass();
        aytg[] aytgVarArr = new aytg[6];
        aytgVarArr[0] = new aytg(aytdVar, true != arizVar.a() ? "myIdentities" : "my_identities_backup", emng.BACKUP_TABLE_MY_IDENTITIES);
        aytgVarArr[1] = new aytg(aytdVar2, true != arizVar.a() ? "participants" : "participants_backup", emng.BACKUP_TABLE_PARTICIPANTS);
        aytgVarArr[2] = new aytg(aytdVar3, true != arizVar.a() ? "conversations" : "conversations_backup", emng.BACKUP_TABLE_CONVERSATIONS);
        aytgVarArr[3] = new aytg(aytdVar4, true != arizVar.a() ? "conversation-participants" : "conversation_participants_backup", emng.BACKUP_TABLE_CONVERSATION_PARTICIPANTS);
        aytgVarArr[4] = new aytg(aytdVar5, true != arizVar.a() ? "messages" : "messages_backup", emng.BACKUP_TABLE_MESSAGES);
        aytgVarArr[5] = new aytg(aytdVar6, true != arizVar.a() ? "parts" : "parts_backup", emng.BACKUP_TABLE_PARTS);
        this.a = fcva.g(aytgVarArr);
        if (arjmVar.a() || arjnVar.a()) {
            fcww fcwwVar = new fcww((byte[]) null);
            fcwwVar.add(new aytg(aytdVar7, true == arizVar.a() ? "backup_metadata" : "metadata", emng.BACKUP_TABLE_METADATA));
            fcwwVar.add(new aytg(aytdVar8, true != arizVar.a() ? "conversation-pins-backup" : "conversation_pins_backup", emng.BACKUP_TABLE_CONVERSATION_PINS));
            fcwwVar.add(new aytg(aytdVar10, true != arizVar.a() ? "message-reactions-backup" : "message_reactions_backup", emng.BACKUP_TABLE_MESSAGE_REACTIONS));
            fcwwVar.add(new aytg(aytdVar9, true != arizVar.a() ? "message-replies-backup" : "message_replies_backup", emng.BACKUP_TABLE_MESSAGE_REPLIES));
            fcwwVar.add(new aytg(aytdVar11, true != arizVar.a() ? "message-star-backup" : "message_star_backup", emng.BACKUP_TABLE_MESSAGE_STARS));
            fcwwVar.add(new aytg(aytdVar12, true != arizVar.a() ? "link-preview-backup" : "link_preview_backup", emng.BACKUP_TABLE_LINK_PREVIEWS));
            if (arjmVar.a()) {
                fcwwVar.add(new aytg(aytdVar13, true != arizVar.a() ? "message-captions" : "message_captions_backup", emng.BACKUP_TABLE_MESSAGE_CAPTIONS));
            }
            if (arjnVar.a()) {
                fcwwVar.add(new aytg(aytdVar14, true != arizVar.a() ? "read-reports" : "read_reports_backup", emng.BACKUP_TABLE_READ_REPORTS));
            }
            listA = fcva.a(fcwwVar);
        } else {
            emng emngVar = emng.BACKUP_TABLE_UNKNOWN;
            listA = fcva.g(new aytg(aytdVar7, "metadata", emngVar), new aytg(aytdVar8, "conversation-pins", emngVar), new aytg(aytdVar10, "message-reactions", emngVar), new aytg(aytdVar9, "message-replies", emngVar), new aytg(aytdVar11, "message-stars", emngVar), new aytg(aytdVar12, "link-previews", emngVar));
        }
        this.b = listA;
    }
}
