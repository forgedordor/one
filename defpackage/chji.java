package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chji extends fcyz implements fdat {
    final /* synthetic */ chjj a;
    final /* synthetic */ chif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chji(chjj chjjVar, chif chifVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = chjjVar;
        this.b = chifVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chji) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        baxe baxeVar = (baxe) this.a.c.b();
        UUID uuid = this.b.b;
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#readMessageDataByPersistenceId");
        try {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.B(Optional.of(uuid));
            MessageCoreData messageCoreDataB = baxeVar.B(new brdv(brecVar));
            eieuVarK.close();
            if (messageCoreDataB != null) {
                ekrw ekrwVarH = chjj.a.h();
                ekrwVarH.X(eksq.a, "SmsToBugleDbWriter");
                ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/pipeline/sms/receive/SmsToBugleDbWriter$execute$2", "invokeSuspend", 45, "SmsToBugleDbWriter.kt");
                chif chifVar = this.b;
                ekrdVar.t("Message already exists with persistence ID %s. Skipping BugleDb insertion.", chifVar.b);
                return chif.a(chifVar, chhz.a(chifVar.f, null, messageCoreDataB.C(), 63));
            }
            chjj chjjVar = this.a;
            chif chifVar2 = this.b;
            chia chiaVar = chifVar2.d;
            chjn chjnVar = chiaVar.e;
            int i = chjnVar.b;
            ContentValues contentValues = chifVar2.g;
            aydh aydhVar = chjjVar.b;
            ParticipantsTable.BindData bindData = ((axly) aydhVar.d(contentValues.getAsString("address"), i)).b;
            chhu chhuVar = chifVar2.e;
            long jA = chhuVar.b.a();
            Instant instant = chiaVar.d;
            ConversationIdType conversationIdType = chhuVar.a;
            boolean z = chhuVar.c;
            long epochMilli = instant.toEpochMilli();
            chhz chhzVar = chifVar2.f;
            aydd ayddVarB = aydhVar.b(new axlv(i, contentValues, bindData, jA, conversationIdType, z, epochMilli, chhzVar.f, chhzVar.a, false, chhzVar.e, chhzVar.c, bvdz.VERIFICATION_NA, chifVar2.a, chjnVar.f, chhzVar.b, chifVar2.b, chifVar2.c));
            return chif.a(chifVar2, chhz.a(chhzVar, null, ayddVarB != null ? ((axlw) ayddVarB).a : null, 63));
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chji(this.a, this.b, fcxyVar);
    }
}
