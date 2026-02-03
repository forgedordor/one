package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byxe implements bzaf {
    private static final eksp a = eksp.c("BugleCms");
    private final bzad c;

    public byxe(bzad bzadVar) {
        this.c = bzadVar;
    }

    @Override // defpackage.bzaf
    public final List a() {
        ArrayList arrayList = new ArrayList();
        bzad bzadVar = this.c;
        arrayList.add(bzadVar.a(3, bbml.INSERT, bzas.a(17)).a());
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsParticipantTriggers", "getCreateTriggersSqls", 37, "CmsParticipantTriggers.java")).q("Creating trigger SQL for delete participants");
        bbmm bbmmVarE = bzadVar.e(3, bbml.DELETE, bzas.a(9), true);
        bbmmVarE.i = "cms_id";
        arrayList.add(bbmmVarE.a());
        bbmm bbmmVarA = bzadVar.a(3, bbml.UPDATE, bzas.a(5));
        bbmmVarA.d = ekjz.c("sub_id", "normalized_destination", "profile_photo_blob_id", "profile_photo_encryption_key", "send_destination", "full_name", "first_name", "profile_photo_uri", "lookup_key", "extended_color", "blocked", "participant_type", "is_spam", "is_spam_source");
        arrayList.add(bbmmVarA.a());
        return arrayList;
    }

    @Override // defpackage.bzaf
    public final List b() {
        ArrayList arrayList = new ArrayList();
        bbml bbmlVar = bbml.INSERT;
        bzad bzadVar = this.c;
        arrayList.add(bzadVar.c(3, bbmlVar));
        arrayList.add(bzadVar.c(3, bbml.DELETE));
        arrayList.add(bzadVar.c(3, bbml.UPDATE));
        return arrayList;
    }
}
