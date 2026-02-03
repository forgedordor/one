package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cglb {
    public static final cczv a = cdag.e(cdag.b, "max_lines_in_inbox_style_notification", 5);
    public static final eksp b = eksp.c("BugleNotifications");
    public final Context c;
    public final ehrb d;
    public final eosd e;
    public final eosc f;
    public final cgiv g;

    public cglb(Context context, ehrb ehrbVar, eosd eosdVar, eosc eoscVar, cgiv cgivVar) {
        this.c = context;
        this.d = ehrbVar;
        this.e = eosdVar;
        this.f = eoscVar;
        this.g = cgivVar;
    }

    final eiju a(String str, Uri uri, Uri uri2) {
        final kwz kwzVar = new kwz();
        kwzVar.a = str;
        if (uri2 != null) {
            kwzVar.c = uri2.toString();
        }
        eijx.e(null);
        Resources resources = this.c.getResources();
        return eiju.g(rdo.a(((rbr) this.d.a().A()).q(new rtj().Q((int) resources.getDimension(R.dimen.notification_large_icon_width), (int) resources.getDimension(R.dimen.notification_large_icon_height))).i(uri))).h(new ejvr() { // from class: cgkx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                cczv cczvVar = cglb.a;
                kwz kwzVar2 = kwzVar;
                if (bitmap != null) {
                    kwzVar2.b = IconCompat.g(bitmap);
                }
                return new kxa(kwzVar2);
            }
        }, this.e);
    }
}
