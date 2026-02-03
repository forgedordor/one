package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cart {
    public static final Object a() {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("BugleDbCmsObjectCounter#countObjectsWithCmsId-messages");
        brec brecVar = new brec();
        int iIntValue = MessagesTable.g().intValue();
        if (iIntValue < 31010) {
            dqru.x("cms_id", iIntValue);
        }
        brecVar.ap(new dqpn("messages.cms_id", 6));
        brdrVarD.k(new brdv(brecVar));
        int iH = brdrVarD.b().h();
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("BugleDbCmsObjectCounter#countObjectsWithCmsId-participants");
        bsbx bsbxVar = new bsbx();
        bsbxVar.f();
        bsboVarE.k(new bsbt(bsbxVar));
        int iH2 = bsboVarE.b().h();
        botb botbVarE = botm.e();
        botbVarE.A("BugleDbCmsObjectCounter#countObjectsWithCmsId-conversations");
        botl botlVar = new botl();
        botlVar.f();
        botbVarE.k(new botf(botlVar));
        return new cars(iH, botbVarE.b().h(), iH2);
    }
}
