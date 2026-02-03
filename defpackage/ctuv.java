package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final /* synthetic */ class ctuv extends fdbb implements fdau {
    public ctuv(Object obj) {
        super(3, obj, ctuw.class, "transform", "transform(Lcom/google/android/apps/messaging/startchat/groupname/GroupNameUiData;Lcom/google/android/apps/messaging/startchat/tracker/ContactSelectionState;)Lcom/google/android/libraries/communications/ux/components/extendedfab/ExtendedFabUiData$Standard;", 4);
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ctte ctteVar = (ctte) obj;
        cudx cudxVar = (cudx) obj2;
        ctuw ctuwVar = (ctuw) this.b;
        if (ctteVar.l) {
            return new djpw(ctteVar.i, ctteVar.j, null, ctteVar.p, 4);
        }
        if (!cudxVar.e.isEmpty()) {
            cueh cuehVar = cudxVar.d;
            if (!cuehVar.d()) {
                if (cuehVar.a() && cudxVar.a.size() <= 1) {
                    return null;
                }
                String string = ctuwVar.a.getString(R.string.start_chat_mirror_extended_fab_text);
                string.getClass();
                return new djpw(string, false, djrr.v, ctuwVar.c.a(ctuwVar.b), 2);
            }
        }
        return null;
    }
}
