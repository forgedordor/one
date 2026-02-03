package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wfc implements fdae {
    final /* synthetic */ wfk a;
    final /* synthetic */ boolean b;

    public wfc(wfk wfkVar, boolean z) {
        this.a = wfkVar;
        this.b = z;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        ekrw ekrwVarE = wfk.a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ekrd ekrdVar = (ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter", "showImageCompressionBottomSheet", 71, "DirectSendImageCompressionUiAdapter.kt");
        final boolean z = this.b;
        ekrdVar.t("Showing image compression bottom sheet, fastImageSendingEnabled: %b", Boolean.valueOf(z));
        final wfk wfkVar = this.a;
        auvw.k(wfkVar.c, null, null, new wfj(wfkVar, null), 3);
        wfkVar.e.b(new fdap() { // from class: wer
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                final ahat ahatVar = (ahat) obj;
                ahatVar.getClass();
                final wfk wfkVar2 = wfkVar;
                Context context = wfkVar2.b;
                String string = context.getString(R.string.direct_send_image_compression_bottom_sheet_title);
                String string2 = context.getString(R.string.direct_send_image_compression_bottom_sheet_subtitle);
                String string3 = context.getString(R.string.direct_send_image_compression_bottom_sheet_compressed_option_title);
                string3.getClass();
                String string4 = context.getString(R.string.direct_send_image_compression_bottom_sheet_compressed_option_text);
                string4.getClass();
                djrr djrrVar = djrr.bI;
                String string5 = context.getString(R.string.direct_send_image_compression_bottom_sheet_original_option_title);
                string5.getClass();
                String string6 = context.getString(R.string.direct_send_image_compression_bottom_sheet_original_option_text);
                string6.getClass();
                return new zzo(fcva.g(new zzn(string3, string4, new fdae() { // from class: wet
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        wfk wfkVar3 = wfkVar2;
                        auvw.k(wfkVar3.c, null, null, new wfg(wfkVar3, null), 3);
                        ahatVar.a();
                        return fctx.a;
                    }
                }, djrrVar), new zzn(string5, string6, new fdae() { // from class: weu
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        wfk wfkVar3 = wfkVar2;
                        auvw.k(wfkVar3.c, null, null, new wfi(wfkVar3, null), 3);
                        ahatVar.a();
                        return fctx.a;
                    }
                }, djrr.bJ)), (z ? wfm.a : wfm.b).c, string, string2, new fdae() { // from class: wev
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        wfk wfkVar3 = wfkVar2;
                        auvw.k(wfkVar3.c, null, null, new wfe(wfkVar3, null), 3);
                        return fctx.a;
                    }
                });
            }
        });
        return fctx.a;
    }
}
