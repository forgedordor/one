package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class afwc extends fdbb implements fdaw {
    public afwc(Object obj) {
        super(5, obj, afwu.class, "transformWithGroupChats", "transformWithGroupChats(Lcom/google/android/apps/messaging/multishare/suggestion/SuggestionListUiData;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/google/android/apps/messaging/multishare/suggestion/SuggestionListUiData;", 4);
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        final afvt afvtVar = (afvt) obj;
        List list = (List) obj2;
        List list2 = (List) obj3;
        final List list3 = (List) obj4;
        final afwu afwuVar = (afwu) this.b;
        if (((CharSequence) afwuVar.e.a().a()).length() == 0) {
            return afwuVar.m;
        }
        afwu.a.m("combining personal, work and corp contact and group chat suggestions");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(afvtVar.b);
        if (!list3.isEmpty()) {
            String string = afwuVar.b.getString(R.string.multi_share_group_directory_header);
            string.getClass();
            arrayList.add(new afvc("group_header", new djyp(string)));
            arrayList.addAll(list3);
        }
        if (!list.isEmpty() || !list2.isEmpty()) {
            String string2 = afwuVar.b.getString(R.string.multi_share_contact_work_directory_header);
            string2.getClass();
            arrayList.add(new afvc("work_header", new djyp(string2)));
            arrayList.addAll(list);
            arrayList.addAll(list2);
        }
        return new afvt(afvtVar.a, arrayList, new fdae() { // from class: afvv
            @Override // defpackage.fdae
            public final Object invoke() {
                afvtVar.c.invoke();
                afwu afwuVar2 = afwuVar;
                afxx afxxVar = (afxx) afwuVar2.h.b();
                if (!list3.isEmpty()) {
                    afxxVar.c(16, afwuVar2.j);
                    fcsu fcsuVar = afxxVar.a;
                    ((dzuc) fcsuVar.b()).g(afxy.i, null, null, dzua.SUCCESS);
                    ((dzuc) fcsuVar.b()).e(afxy.j);
                }
                return fctx.a;
            }
        }, new afvs(afwuVar.k.a()));
    }
}
