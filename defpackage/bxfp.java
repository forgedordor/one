package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import j$.util.OptionalInt;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxfp extends bxha implements cpbm {
    private static final eksp g = eksp.c("BugleImage");
    private final cpbn h;

    public bxfp(Context context, cpbn cpbnVar, bxfq bxfqVar) {
        super(context, bxfqVar);
        this.h = cpbnVar;
    }

    @Override // defpackage.cpbm
    public final Bitmap g(int i, int i2, int i3) {
        return m().a(i, i2, i3);
    }

    @Override // defpackage.bxha, defpackage.bxge
    protected bxgh h(List list) {
        eieu eieuVarK = eiiy.k("AvatarRequest.loadMediaInternal");
        try {
            ecem.b();
            Uri uriN = ((bxfq) this.b).k;
            int i = 1;
            boolean z = cqmz.p(uriN) || "r".equals(cpbr.t(uriN));
            Bitmap bitmapD = null;
            if (z) {
                try {
                    bxgh bxghVarH = super.h(list);
                    bitmapD = bxghVarH.d();
                    i = bxghVarH.d;
                } catch (Exception e) {
                    ((eksl) ((eksl) ((eksl) g.j()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/media/avatar/AvatarRequest", "loadMediaInternal", 110, "AvatarRequest.java")).q("failed to load local avatar resource, switching to fallback rendering.");
                }
            }
            int i2 = i;
            bxfq bxfqVar = (bxfq) this.b;
            boolean z2 = z;
            int i3 = bxfqVar.b;
            int i4 = bxfqVar.c;
            if (bitmapD == null) {
                if (z2 && (uriN = cpbr.n(uriN)) == null) {
                    uriN = cpbr.m(this.a);
                }
                Integer numR = cpbr.r(uriN);
                String strU = cpbr.u(uriN);
                String strT = cpbr.t(uriN);
                bitmapD = "l".equals(strT) ? this.h.j(cpbr.v(uriN), strU, i3, i4, numR, this, false, OptionalInt.empty()) : "z".equals(strT) ? this.h.h(strU, i3, i4, true, false, numR, this, false, false, false) : "p".equals(strT) ? this.h.h(strU, i3, i4, false, false, numR, this, true, false, false) : "o".equals(strT) ? this.h.h(strU, i3, i4, false, false, numR, this, false, true, false) : "sm".equals(strT) ? this.h.h(strU, i3, i4, false, false, numR, this, false, false, true) : this.h.h(strU, i3, i4, false, "b".equals(strT), numR, this, false, false, false);
            }
            bxfz bxfzVar = new bxfz(f(), bitmapD, i2, this.c, this.d);
            eieuVarK.close();
            return bxfzVar;
        } finally {
        }
    }

    @Override // defpackage.bxha, defpackage.bxge
    protected final InputStream i() {
        Uri uri = ((bxfq) this.b).k;
        if (uri == null) {
            return null;
        }
        if (cqmz.p(uri)) {
            return super.i();
        }
        Uri uriO = cpbr.o(uri);
        if (uriO == null) {
            return null;
        }
        cqaz.k(cqmz.p(uriO));
        try {
            this.a.getContentResolver().takePersistableUriPermission(uriO, 3);
        } catch (SecurityException unused) {
            ekrw ekrwVarN = g.n();
            ekrwVarN.X(bxhf.h, uriO);
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/datamodel/media/avatar/AvatarRequest", "getInputStreamForResource", 76, "AvatarRequest.java")).q("Failed to grant persistable URI permissions.");
        }
        return this.a.getContentResolver().openInputStream(uriO);
    }
}
