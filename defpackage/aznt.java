package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aznt implements dqoe {
    public static final aznt a = new aznt();
    public static final Map b = fcwa.h(new fcti(c("_id"), d("_id")), new fcti(c("message_id"), d("message_id")), new fcti(c("content_type"), d("content_type")), new fcti(c("source"), d("source")), new fcti(c(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT), d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT)), new fcti(c("width"), d("width")), new fcti(c("height"), d("height")), new fcti(c("longitude"), d("longitude")), new fcti(c("latitude"), d("latitude")), new fcti(c("cms_full_size_blob_id"), d("cms_full_size_blob_id")), new fcti(c("cms_media_encryption_key"), d("cms_media_encryption_key")), new fcti(c("cms_compressed_media_encryption_key"), d("cms_compressed_media_encryption_key")), new fcti(c("cms_compressed_blob_id"), d("cms_compressed_blob_id")), new fcti(c("file_name"), d("file_name")), new fcti(c("duration"), d("duration")));

    private aznt() {
    }

    private static final azmq c(String str) {
        dqpo[] dqpoVarArrC = aznn.c();
        for (int i = 0; i < 15; i++) {
            dqpo dqpoVar = dqpoVarArrC[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (azmq) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final bsgs d(String str) {
        dqpo[] dqpoVarArrB = bsja.b();
        for (int i = 0; i < 53; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (bsgs) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dqoe
    public final void a() {
        String[] strArr = azns.a;
        aznj aznjVar = new aznj();
        aznjVar.f("clearBackupTable");
        aznjVar.e();
        aznjVar.b().b();
    }

    @Override // defpackage.dqoe
    public final void b() {
        String[] strArr = azns.a;
        dqtq dqtqVar = new dqtq("parts_backup", "backup");
        dqtqVar.d = 5;
        Map map = b;
        azmq[] azmqVarArr = (azmq[]) map.keySet().toArray(new azmq[0]);
        dqtqVar.b((dqpo[]) Arrays.copyOf(azmqVarArr, azmqVarArr.length));
        bsje bsjeVarC = PartsTable.c();
        bsjeVarC.s();
        bsgs[] bsgsVarArr = (bsgs[]) map.values().toArray(new bsgs[0]);
        bsjeVarC.c((bsgs[]) Arrays.copyOf(bsgsVarArr, bsgsVarArr.length));
        dqtqVar.c = bsjeVarC.b();
        dqtqVar.a().a();
    }
}
