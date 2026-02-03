package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azuv implements dqoe {
    public static final azuv a = new azuv();
    public static final Map b = fcwa.h(new fcti(d("_id"), e("_id")), new fcti(d("my_identity_token_foreign_key"), e("my_identity_token_foreign_key")), new fcti(d("normalized_destination"), e("normalized_destination")), new fcti(d("send_destination"), e("send_destination")), new fcti(d("display_destination"), e("display_destination")), new fcti(d("first_name"), e("first_name")), new fcti(d("full_name"), e("full_name")), new fcti(d("blocked"), e("blocked")), new fcti(d("participant_type"), e("participant_type")), new fcti(d("is_spam"), e("is_spam")), new fcti(d("is_spam_source"), e("is_spam_source")), new fcti(d("country_code"), e("country_code")), new fcti(d("color_palette_index"), e("color_palette_index")), new fcti(d("color_type"), e("color_type")), new fcti(d("extended_color"), e("extended_color")), new fcti(d("cms_id"), e("cms_id")), new fcti(d("cms_life_cycle"), e("cms_life_cycle")));

    private azuv() {
    }

    public static final bsbo c() {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.s();
        brzi[] brziVarArr = (brzi[]) b.values().toArray(new brzi[0]);
        bsboVarE.c((brzi[]) Arrays.copyOf(brziVarArr, brziVarArr.length));
        return bsboVarE;
    }

    private static final azto d(String str) {
        dqpo[] dqpoVarArrC = azuo.c();
        for (int i = 0; i < 18; i++) {
            dqpo dqpoVar = dqpoVarArrC[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (azto) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final brzi e(String str) {
        dqpo[] dqpoVarArrC = bsbk.c();
        for (int i = 0; i < 46; i++) {
            dqpo dqpoVar = dqpoVarArrC[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (brzi) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dqoe
    public final void a() {
        String[] strArr = azut.a;
        azuk azukVar = new azuk();
        azukVar.f("clearBackupTable");
        azukVar.e();
        azukVar.b().b();
    }

    @Override // defpackage.dqoe
    public final void b() {
        String[] strArr = azut.a;
        dqtq dqtqVar = new dqtq("participants_backup", "backup");
        dqtqVar.d = 5;
        azto[] aztoVarArr = (azto[]) b.keySet().toArray(new azto[0]);
        dqtqVar.b((dqpo[]) Arrays.copyOf(aztoVarArr, aztoVarArr.length));
        dqtqVar.c = c().b();
        dqtqVar.a().a();
    }
}
