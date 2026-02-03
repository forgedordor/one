package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azld implements dqoe {
    public static final azld a = new azld();
    public static final Map b = fcwa.h(new fcti(c("_id"), d("_id")), new fcti(c("message_persistence_id"), d("message_persistence_id")), new fcti(c("my_identity"), d("my_identity_foreign_key")), new fcti(c("message_status"), d("message_status")), new fcti(c("seen"), d("seen")), new fcti(c("read"), d("read")), new fcti(c("conversation_id"), d("conversation_id")), new fcti(c("sender_participant_id"), d("sender_id")), new fcti(c("sender_send_destination"), d("sender_send_destination")), new fcti(c("msisdn_receiving_rcs_message"), d("msisdn_receiving_rcs_message")), new fcti(c("self_participant_id"), d("self_id")), new fcti(c("mms_subject"), d("mms_subject")), new fcti(c("received_timestamp"), d("received_timestamp")), new fcti(c("sent_timestamp"), d("sent_timestamp")), new fcti(c("protocol"), d("message_protocol")), new fcti(c("message_priority"), d("sms_priority")), new fcti(c("rcs_encryption_status"), d("etouffee_status")), new fcti(c("cloud_sync_id"), d("cloud_sync_id")), new fcti(c("correlation_id"), d("correlation_id")), new fcti(c("sms_error_code"), d("sms_error_code")), new fcti(c("sms_error_desc_map_name"), d("sms_error_desc_map_name")), new fcti(c("mms_transaction_id"), d("mms_transaction_id")), new fcti(c("mms_content_location"), d("mms_content_location")), new fcti(c("is_hidden"), d("is_hidden")), new fcti(c("rcs_message_id"), d("rcs_message_id_with_text_type")), new fcti(c("custom_headers"), d("custom_headers")), new fcti(c("cms_id"), d("cms_id")), new fcti(c("cms_life_cycle"), d("cms_life_cycle")), new fcti(c("cms_correlation_id"), d("cms_correlation_id")), new fcti(c("cms_last_mod_seq"), d("cms_last_mod_seq")));

    private azld() {
    }

    private static final azjj c(String str) {
        dqpo[] dqpoVarArrC = azkv.c();
        for (int i = 0; i < 30; i++) {
            dqpo dqpoVar = dqpoVarArrC[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (azjj) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final brao d(String str) {
        dqpo[] dqpoVarArrB = brdn.b();
        for (int i = 0; i < 70; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (brao) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dqoe
    public final void a() {
        String[] strArr = azlc.a;
        azkr azkrVar = new azkr();
        azkrVar.f("clearBackupTable");
        azkrVar.e();
        azkrVar.b().b();
    }

    @Override // defpackage.dqoe
    public final void b() {
        String[] strArr = azlc.a;
        dqtq dqtqVar = new dqtq("messages_backup", "backup");
        dqtqVar.d = 5;
        Map map = b;
        azjj[] azjjVarArr = (azjj[]) map.keySet().toArray(new azjj[0]);
        dqtqVar.b((dqpo[]) Arrays.copyOf(azjjVarArr, azjjVarArr.length));
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.s();
        brao[] braoVarArr = (brao[]) map.values().toArray(new brao[0]);
        brdrVarD.c((brao[]) Arrays.copyOf(braoVarArr, braoVarArr.length));
        dqtqVar.c = brdrVarD.b();
        dqtqVar.a().a();
    }
}
