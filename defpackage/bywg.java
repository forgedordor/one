package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bywg implements bzaf {
    private static final eksp a = eksp.c("BugleCms");
    private final bzad c;

    public bywg(bzad bzadVar) {
        this.c = bzadVar;
    }

    @Override // defpackage.bzaf
    public final List a() {
        ArrayList arrayList = new ArrayList();
        bzad bzadVar = this.c;
        arrayList.add(bzadVar.a(1, bbml.INSERT, bzas.a(17)).a());
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsObjectTriggers", "getCreateTriggersSqls", 57, "CmsObjectTriggers.java")).q("Creating trigger SQL for delete object");
        bbmm bbmmVarE = bzadVar.e(1, bbml.DELETE, bzas.a(9), true);
        bbmmVarE.i = "cms_id";
        arrayList.add(bbmmVarE.a());
        bbml bbmlVar = bbml.UPDATE;
        bbmm bbmmVarA = bzadVar.a(1, bbmlVar, bzas.a(33));
        bbmmVarA.d = ekjz.c("conversation_id");
        bbmmVarA.f = 1;
        arrayList.add(bbmmVarA.a());
        bbmm bbmmVarA2 = bzadVar.a(1, bbmlVar, bzas.a(3));
        bbmmVarA2.a = "conv";
        bbmmVarA2.i = "conversation_id";
        bbmmVarA2.d = ekjz.c("read");
        bbmmVarA2.f = 2;
        bbmmVarA2.b("NEW.read");
        bbmmVarA2.b("NEW.received_timestamp > (select cms_most_recent_read_message_timestamp_ms from conversations where NEW.conversation_id = conversations._id)");
        arrayList.add(bbmmVarA2.a());
        return arrayList;
    }

    @Override // defpackage.bzaf
    public final List b() {
        bbml bbmlVar = bbml.UPDATE;
        List listAsList = Arrays.asList(bbml.INSERT, bbml.DELETE, bbmlVar);
        ekfw ekfwVar = new ekfw();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            ekfwVar.h(this.c.c(1, (bbml) it.next()));
        }
        ArrayList arrayList = new ArrayList(ekfwVar.g());
        arrayList.add(this.c.d(1, bbmlVar, "conv"));
        return arrayList;
    }
}
