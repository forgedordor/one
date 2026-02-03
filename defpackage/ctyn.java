package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class ctyn extends fdbb implements fdav {
    public ctyn(Object obj) {
        super(4, obj, ctzg.class, "transformPersonal", "transformPersonal(Lcom/google/android/apps/messaging/startchat/suggestion/PersonalSearchResults;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;Ljava/util/Map;)Lcom/google/android/apps/messaging/startchat/suggestion/ContactSuggestionListUiData;", 4);
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        ctmo ctmoVar;
        final cuaz cuazVar = (cuaz) obj;
        cudx cudxVar = (cudx) obj2;
        Map map = (Map) obj3;
        String str = cuazVar.a;
        final ctzg ctzgVar = (ctzg) this.b;
        ArrayList arrayList = new ArrayList();
        for (ajpq ajpqVar : cuazVar.b) {
            String strF = ajpqVar.f();
            Pattern pattern = cuazVar.c;
            int i = 1;
            if (ctzgVar.k.a() && (ctmoVar = (ctmo) map.get(ajpqVar.b())) != null) {
                i = ctmoVar.a;
            }
            arrayList.add(ctzgVar.g(ajpqVar, "personal_contact_".concat(strF), cudxVar, pattern, i));
        }
        return new ctye(str, arrayList, new fdae() { // from class: ctyh
            @Override // defpackage.fdae
            public final Object invoke() {
                dzub dzubVar = cuazVar.d;
                if (dzubVar != null) {
                    ((dzuc) ctzgVar.d.b()).f(dzubVar, cqjd.d, null, dzua.SUCCESS);
                }
                return fctx.a;
            }
        }, ctzgVar.b.getString(R.string.a11y_contact_suggestions), new ctyd(((asdu) ctzgVar.h.b()).a(), ctzgVar.i.a(), ctzgVar.j.a()), new fdae() { // from class: ctyi
            @Override // defpackage.fdae
            public final Object invoke() {
                dzub dzubVar;
                ctzg ctzgVar2 = ctzgVar;
                if (ctzgVar2.k.a() && (dzubVar = cuazVar.d) != null) {
                    ((dzuc) ctzgVar2.d.b()).f(dzubVar, cqjd.o, null, dzua.SUCCESS);
                }
                return fctx.a;
            }
        }, 16);
    }
}
