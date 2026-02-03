package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum emng implements evst {
    BACKUP_TABLE_UNKNOWN(0),
    BACKUP_TABLE_METADATA(1),
    BACKUP_TABLE_MY_IDENTITIES(2),
    BACKUP_TABLE_PARTICIPANTS(3),
    BACKUP_TABLE_CONVERSATIONS(4),
    BACKUP_TABLE_CONVERSATION_PARTICIPANTS(5),
    BACKUP_TABLE_CONVERSATION_PINS(6),
    BACKUP_TABLE_MESSAGES(7),
    BACKUP_TABLE_PARTS(8),
    BACKUP_TABLE_MESSAGE_STARS(9),
    BACKUP_TABLE_MESSAGE_CAPTIONS(10),
    BACKUP_TABLE_MESSAGE_REACTIONS(11),
    BACKUP_TABLE_MESSAGE_REPLIES(12),
    BACKUP_TABLE_READ_REPORTS(13),
    BACKUP_TABLE_LINK_PREVIEWS(14);

    public final int p;

    emng(int i) {
        this.p = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
