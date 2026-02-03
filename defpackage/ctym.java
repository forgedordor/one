package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class ctym extends fdbb implements fday {
    public ctym(Object obj) {
        super(7, obj, ctzg.class, "transformWithGroupChats", "transformWithGroupChats(Lcom/google/android/apps/messaging/startchat/suggestion/ProfileSuggestionUiData;Lcom/google/android/apps/messaging/startchat/suggestion/ContactSuggestionListUiData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/android/apps/messaging/startchat/emergency/EmergencyRowUiData;)Lcom/google/android/apps/messaging/startchat/suggestion/ContactSuggestionListUiData;", 4);
    }

    @Override // defpackage.fday
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        List listA;
        cuba cubaVar = (cuba) obj;
        final ctye ctyeVar = (ctye) obj2;
        List list = (List) obj3;
        List list2 = (List) obj4;
        final List list3 = (List) obj5;
        ctqg ctqgVar = (ctqg) obj6;
        final ctzg ctzgVar = (ctzg) this.b;
        if (((CharSequence) ctzgVar.c.a().a()).length() == 0) {
            return ctzgVar.m;
        }
        cubn cubnVar = cubaVar.a;
        if (cubnVar == null && list.isEmpty() && list2.isEmpty()) {
            fcww fcwwVar = new fcww((byte[]) null);
            fcwwVar.addAll(ctyeVar.b);
            if (!list3.isEmpty()) {
                fcwwVar.add(ctzgVar.b());
                fcwwVar.addAll(list3);
            }
            listA = fcva.a(fcwwVar);
        } else {
            fcww fcwwVar2 = new fcww((byte[]) null);
            ekrw ekrwVarE = ctzg.a.e();
            ekrwVarE.X(eksq.a, "BugleContacts");
            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl", "transformWithGroupChats", 347, "ContactSuggestionsAdapterImpl.kt")).q("combining personal, work and corp contact and group chat suggestions");
            if (cubnVar != null) {
                fcwwVar2.add((ctzh) cubnVar);
            }
            fcwwVar2.addAll(ctyeVar.b);
            if (!list3.isEmpty()) {
                fcwwVar2.add(ctzgVar.b());
                fcwwVar2.addAll(list3);
            }
            if (!list.isEmpty() || !list2.isEmpty()) {
                String string = ctzgVar.b.getString(R.string.work_directory_header);
                string.getClass();
                fcwwVar2.add(new ctzh("work_header", new djyp(string)));
            }
            fcwwVar2.addAll(list);
            fcwwVar2.addAll(list2);
            listA = fcva.a(fcwwVar2);
        }
        List list4 = listA;
        boolean z = false;
        if (ctzgVar.k.a()) {
            if ((list4 instanceof Collection) && list4.isEmpty()) {
                z = true;
            } else {
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    djyu djyuVar = ((cubn) it.next()).a().a;
                    djym djymVar = djyuVar instanceof djym ? (djym) djyuVar : null;
                    if ((djymVar != null ? djymVar.h : null) == djyi.c) {
                        break;
                    }
                }
                z = true;
            }
        }
        return new ctye(ctyeVar.a, list4, new fdae() { // from class: ctyk
            @Override // defpackage.fdae
            public final Object invoke() {
                ctyeVar.c.invoke();
                boolean z2 = !list3.isEmpty();
                ctuu ctuuVar = ctzgVar.e;
                ctuuVar.b.c(7, ctuuVar.f);
                ctuuVar.f(z2);
                return fctx.a;
            }
        }, ctzgVar.b.getString(R.string.a11y_contact_suggestions), ctqgVar, new ctyd(((asdu) ctzgVar.h.b()).a(), ctzgVar.i.a(), ctzgVar.j.a()), z ? ctyeVar.g : null);
    }
}
