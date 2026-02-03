package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aaix extends fdbb implements fdat {
    public aaix(Object obj) {
        super(2, obj, aaja.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/shared/api/messaging/message/classification/Classification;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        final amkc amkcVar = (amkc) obj;
        final aaja aajaVar = (aaja) this.b;
        if (amkcVar == null) {
            return null;
        }
        String string = aajaVar.a.getString(R.string.nudge_dismiss_button_text);
        string.getClass();
        return new tdo("nudge", amkcVar.a, null, null, new tdk(string, new fdae() { // from class: aaiv
            @Override // defpackage.fdae
            public final Object invoke() {
                aaja aajaVar2 = aajaVar;
                auvw.k(aajaVar2.b, null, null, new aaiy(aajaVar2, amkcVar, null), 3);
                return fctx.a;
            }
        }), null, false, new fdae() { // from class: aaiw
            @Override // defpackage.fdae
            public final Object invoke() {
                aaja aajaVar2 = aajaVar;
                auvw.k(aajaVar2.b, null, null, new aaiz(aajaVar2, amkcVar, null), 3);
                return fctx.a;
            }
        }, null, 1448);
    }
}
