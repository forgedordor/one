package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dnyf extends fdbo implements fdap {
    public dnyf(Object obj) {
        super(1, obj, dnyn.class, "onStickerLongClicked", "onStickerLongClicked(Lcom/google/android/libraries/compose/emotify/data/CustomSticker;)Z", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final dnvg dnvgVar = (dnvg) obj;
        dnvgVar.getClass();
        final dnyn dnynVar = (dnyn) this.g;
        ((ekrd) dnyn.a.e().h("com/google/android/libraries/compose/emotify/ui/screen/EmotifyScreen", "onStickerLongClicked", 241, "EmotifyScreen.kt")).t("Custom sticker %s long clicked", dnvgVar.a);
        eeji eejiVar = new eeji(dnynVar.A());
        eejiVar.u(R.string.delete_sticker_dialog_title);
        eejiVar.k(R.string.delete_sticker_dialog_body);
        eejiVar.r(R.string.delete_sticker_dialog_positive, new DialogInterface.OnClickListener() { // from class: dnxr
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dnyn dnynVar2 = dnynVar;
                fdil.d(dnynVar2.p(), null, null, new dnyb(dnvgVar, dnynVar2, null), 3);
            }
        });
        eejiVar.m(R.string.delete_sticker_dialog_negative, new DialogInterface.OnClickListener() { // from class: dnxs
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ekrg ekrgVar = dnyn.a;
                dialogInterface.dismiss();
            }
        });
        eejiVar.a();
        return true;
    }
}
