package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class ctrf extends fdbb implements fdau {
    public ctrf(Object obj) {
        super(3, obj, ctrg.class, "transform", "transform(Lcom/google/common/collect/ImmutableList;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)Lcom/google/android/apps/messaging/startchat/favorites/FavoriteContactsUiData;", 4);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
        ekgb ekgbVar = (ekgb) obj;
        final cudx cudxVar = (cudx) obj2;
        final ctrg ctrgVar = (ctrg) this.b;
        String string = ctrgVar.e.getString(R.string.favorites_title);
        string.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        final int i = 0;
        for (Object obj4 : ekgbVar) {
            int i2 = i + 1;
            if (i < 0) {
                fcva.m();
            }
            final ajou ajouVar = (ajou) obj4;
            arrayList.add(new djqq(new fdae() { // from class: ctrd
                @Override // defpackage.fdae
                public final Object invoke() {
                    ctrg ctrgVar2 = ctrgVar;
                    uds udsVar = (uds) ctrgVar2.d.b();
                    ajou ajouVar2 = ajouVar;
                    ajouVar2.getClass();
                    cudx cudxVar2 = cudxVar;
                    cueh cuehVar = cudxVar2.d;
                    boolean z = false;
                    if (cuehVar.e() && cudxVar2.a(ajouVar2)) {
                        z = true;
                    }
                    return new djqp(udsVar.b(ajouVar2, z), ajouVar2.d(), ctrgVar2.a.c(ajouVar2, i, cuehVar, true, null), null, 8);
                }
            }));
            i = i2;
        }
        return new ctrh(new djqn(string, ekfv.a(arrayList)), true);
    }
}
