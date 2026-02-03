package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zml implements fdae {
    final /* synthetic */ zmo a;
    final /* synthetic */ zmc b;
    final /* synthetic */ aoer c;

    public zml(zmo zmoVar, zmc zmcVar, aoer aoerVar) {
        this.a = zmoVar;
        this.b = zmcVar;
        this.c = aoerVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        int iA = this.b.b.a() - 1;
        final zmo zmoVar = this.a;
        if (iA == 2) {
            final aoer aoerVar = this.c;
            zmoVar.c.d(true, new fdap() { // from class: zmd
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ahat ahatVar = (ahat) obj;
                    ahatVar.getClass();
                    zmo zmoVar2 = zmoVar;
                    Context context = zmoVar2.b;
                    String string = context.getString(R.string.satellite_messaging_toolstone_link);
                    string.getClass();
                    djzh[] djzhVarArr = new djzh[3];
                    djzhVarArr[0] = zmoVar2.a(R.string.sky_view_list_item, djrr.ek);
                    aoer aoerVar2 = aoerVar;
                    int i = R.string.message_time_list_item;
                    if (aoerVar2 != null && aoerVar2.v()) {
                        i = R.string.message_time_list_item_media_allowed;
                    }
                    djzhVarArr[1] = zmoVar2.a(i, djrr.cB);
                    djzhVarArr[2] = zmoVar2.a(R.string.message_recipient_list_item_v2, djrr.by);
                    List listG = fcva.g(djzhVarArr);
                    String string2 = context.getString(R.string.got_it_button);
                    string2.getClass();
                    dktq dktqVar = new dktq(string2, new zmm(ahatVar));
                    String string3 = context.getString(R.string.more_about_satellite_button);
                    string3.getClass();
                    return new djmn(string, listG, null, null, null, null, dktqVar, new dktq(string3, new zmn(zmoVar2.d)), null, 316);
                }
            });
            ((ajmh) zmoVar.e.b()).S();
        } else if (iA == 4) {
            zmoVar.h.h(new agdi(Uri.parse("https://support.google.com/families?p=gff_help_find")));
        }
        return fctx.a;
    }
}
