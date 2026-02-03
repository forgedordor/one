package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class tfl extends fdbb implements fdat {
    public tfl(Object obj) {
        super(2, obj, tfq.class, "loadContent", "loadContent(Lcom/google/android/apps/messaging/birthday/banner/dataservice/SaveBirthdayBannerData;)Lcom/google/android/apps/messaging/banner/api/FullBannerContent;", 4);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Resources.NotFoundException {
        final tfr tfrVar = (tfr) obj;
        String str = tfrVar.b;
        boolean z = tfrVar.a;
        final tfq tfqVar = (tfq) this.b;
        if (!z || str == null) {
            return null;
        }
        String str2 = tfrVar.c;
        tdq tdqVar = new tdq(djrr.O);
        String string = tfqVar.a.getResources().getString(R.string.save_banner_positive_button);
        string.getClass();
        return new tdo("save_birthday", str, str2, tdqVar, new tdk(string, new fdae() { // from class: tfi
            @Override // defpackage.fdae
            public final Object invoke() {
                ResolvedRecipient resolvedRecipient = tfrVar.d;
                tfq tfqVar2 = tfqVar;
                auvw.k(tfqVar2.c, null, null, new tfp(resolvedRecipient, tfqVar2, null), 3);
                return fctx.a;
            }
        }), null, false, new fdae() { // from class: tfj
            @Override // defpackage.fdae
            public final Object invoke() {
                tfq tfqVar2 = tfqVar;
                auvw.k(tfqVar2.c, tfqVar2.b, null, new tfn(tfqVar2, null), 2);
                return fctx.a;
            }
        }, new fdae() { // from class: tfk
            @Override // defpackage.fdae
            public final Object invoke() {
                tfq tfqVar2 = tfqVar;
                auvw.k(tfqVar2.c, tfqVar2.b, null, new tfm(tfqVar2, null), 2);
                return fctx.a;
            }
        }, 480);
    }
}
