package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayzi implements dqoe {
    public static final ayzi a = new ayzi();
    public static final Map b = fcwa.h(new fcti(c("_id"), d("_id")), new fcti(c("current_my_identity"), d("current_my_identity_foreign_key")), new fcti(c("snippet_text"), d("snippet_text")), new fcti(c("archive_status"), d("archive_status")), new fcti(c("most_recent_timestamp_ms"), d("cms_most_recent_read_message_timestamp_ms")), new fcti(c("subject"), d("subject_text")), new fcti(c("name"), d("name")), new fcti(c("name_is_automatic"), d("name_is_automatic")), new fcti(c("has_rbm_participant"), d("has_ea2p_bot_recipient")), new fcti(c("rcs_group_self_msisdn"), d("rcs_group_self_msisdn")), new fcti(c("rcs_group_id"), d("rcs_group_id")), new fcti(c("rcs_conference_uri"), d("rcs_conference_uri")), new fcti(c("rcs_group_capabilities"), d("rcs_group_capabilities")), new fcti(c("error_state"), d("error_state")), new fcti(c("rcs_subject_change_timestamp_ms"), d("rcs_subject_change_timestamp_ms")), new fcti(c("join_state"), d("join_state")), new fcti(c("conversation_type"), d("conv_type")), new fcti(c("send_mode"), d("send_mode")), new fcti(c("cms_id"), d("cms_id")), new fcti(c("cms_life_cycle"), d("cms_life_cycle")));

    private ayzi() {
    }

    private static final ayya c(String str) {
        dqpo[] dqpoVarArrC = ayzc.c();
        for (int i = 0; i < 20; i++) {
            dqpo dqpoVar = dqpoVarArrC[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (ayya) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bopq d(String str) {
        dqpo[] dqpoVarArrC = bosx.c();
        for (int i = 0; i < 77; i++) {
            dqpo dqpoVar = dqpoVarArrC[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (bopq) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dqoe
    public final void a() {
        String[] strArr = ayzh.a;
        ayyy ayyyVar = new ayyy();
        ayyyVar.f("clearBackupTable");
        ayyyVar.e();
        ayyyVar.b().b();
    }

    @Override // defpackage.dqoe
    public final void b() {
        String[] strArr = ayzh.a;
        dqtq dqtqVar = new dqtq("conversations_backup", "backup");
        dqtqVar.d = 5;
        Map map = b;
        ayya[] ayyaVarArr = (ayya[]) map.keySet().toArray(new ayya[0]);
        dqtqVar.b((dqpo[]) Arrays.copyOf(ayyaVarArr, ayyaVarArr.length));
        botb botbVarE = botm.e();
        botbVarE.s();
        bopq[] bopqVarArr = (bopq[]) map.values().toArray(new bopq[0]);
        botbVarE.c((bopq[]) Arrays.copyOf(bopqVarArr, bopqVarArr.length));
        dqtqVar.c = botbVarE.b();
        dqtqVar.a().a();
    }
}
