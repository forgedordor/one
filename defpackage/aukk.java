package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aukk {
    private static final ekgp a = ekgp.p(1, ekgp.n(Integer.valueOf(bzas.a(17)), emcd.MESSAGE_BACKUP, Integer.valueOf(bzas.a(33)), emcd.MESSAGE_UPDATE, Integer.valueOf(bzas.a(9)), emcd.MESSAGE_DELETE), 5, ekgp.o(Integer.valueOf(byxy.a(3)), emcd.PARTS_FREQ_UPDATE, Integer.valueOf(byxy.a(5)), emcd.PARTS_RARE_UPDATE, Integer.valueOf(byxy.a(4)), emcd.PARTS_CUSTOM_PART_FLAG_URI_UPDATE, Integer.valueOf(bzas.a(9)), emcd.PARTS_DELETE), 7, ekgp.o(Integer.valueOf(byrx.c(1)), emcd.KEY_BACKUP, Integer.valueOf(byrx.c(3)), emcd.KEY_BACKUP, Integer.valueOf(byrx.c(2)), emcd.KEY_BACKUP, 2, emcd.KEY_DELETE), 2, ekgp.o(Integer.valueOf(bzas.a(3)), emcd.CONVERSATION_FREQ_UPDATE, Integer.valueOf(bzas.a(5)), emcd.CONVERSATION_RARE_UPDATE, Integer.valueOf(bzas.a(17)), emcd.CONVERSATION_BACKUP, Integer.valueOf(bzas.a(9)), emcd.CONVERSATION_DELETE), 3, ekgp.n(Integer.valueOf(bzas.a(5)), emcd.PARTICIPANT_RARE_UPDATE, Integer.valueOf(bzas.a(17)), emcd.PARTICIPANT_BACKUP, Integer.valueOf(bzas.a(9)), emcd.PARTICIPANT_DELETE));

    public static emcd a(int i, int i2) {
        return (emcd) Map.EL.getOrDefault((java.util.Map) a.getOrDefault(Integer.valueOf(i), ekoj.a), Integer.valueOf(i2), emcd.UNSPECIFIED_BACKUP_TYPE);
    }
}
