package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cphu {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil");
    public final fcsu a;
    private final Context c;
    private final bxgr d;
    private final cpbn e;

    public cphu(Context context, bxgr bxgrVar, cpbn cpbnVar, fcsu fcsuVar) {
        this.c = context;
        this.d = bxgrVar;
        this.e = cpbnVar;
        this.a = fcsuVar;
    }

    public final Bitmap a(Context context, Uri uri, int i, int i2) {
        bxgh bxghVar = (bxgh) this.d.b(new bxfq(this.e, uri, i, i2, true).g(context));
        try {
            if (bxghVar == null) {
                return null;
            }
            try {
                try {
                    Bitmap bitmapD = bxghVar.d();
                    bitmapD.getClass();
                    Bitmap bitmapC = cqsu.c(bitmapD);
                    bxghVar.q();
                    return bitmapC;
                } catch (OutOfMemoryError unused) {
                    ekrw ekrwVarJ = b.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getAvatarBitmapForNotification", 106, "AvatarImageUtil.java")).q("OOM creating avatarBitmap");
                    bxghVar.q();
                    return null;
                }
            } catch (bxgg unused2) {
                ekrw ekrwVarJ2 = b.j();
                ekrwVarJ2.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getAvatarBitmapForNotification", 108, "AvatarImageUtil.java")).q("Could not get bitmap from image type for building notifications");
                bxghVar.q();
                return null;
            }
        } catch (Throwable th) {
            bxghVar.q();
            throw th;
        }
    }

    public final Bitmap b(Context context, Uri uri, int i, int i2, int i3, boolean z) {
        bxgh bxghVar = (bxgh) this.d.b(c(uri, i, i2, i3, z).g(context));
        if (bxghVar == null) {
            return null;
        }
        try {
            return bxghVar.d();
        } catch (bxgg unused) {
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getAvatarBitmapSync", 78, "AvatarImageUtil.java")).q("Could not retrieve avatar image bitmap from image type.");
            return null;
        }
    }

    public final bxgf c(Uri uri, int i, int i2, int i3, boolean z) {
        Uri uri2;
        int i4;
        boolean z2;
        int i5;
        if (Objects.equals(cpbr.t(uri), "s")) {
            uri2 = uri;
            i4 = i2;
            z2 = z;
            i5 = i;
        } else {
            if (!cpbr.y(this.c, uri)) {
                return new bxhb(uri, i, i2, true, z, i3);
            }
            uri2 = uri;
            i5 = i;
            i4 = i2;
            z2 = z;
        }
        boolean z3 = z2;
        return new bxfq(this.e, uri2, i5, i4, z3);
    }

    public final Bitmap d(Context context, Uri uri, int i, int i2) {
        if (!cqmz.v(uri)) {
            return null;
        }
        bxgw bxgwVar = new bxgw(context, new bxhb(uri, i, i2, true, false, 0));
        bxgwVar.f = 0;
        bxgh bxghVar = (bxgh) this.d.b(bxgwVar);
        try {
            if (bxghVar == null) {
                return null;
            }
            try {
                Bitmap bitmapD = bxghVar.d();
                bitmapD.getClass();
                Bitmap bitmapC = cqsu.c(bitmapD);
                bxghVar.q();
                return bitmapC;
            } catch (bxgg unused) {
                ekrw ekrwVarJ = b.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getRemoteAvatarBitmap", 157, "AvatarImageUtil.java")).q("Could not get bitmap from image type for remote URI");
                bxghVar.q();
                return null;
            } catch (OutOfMemoryError unused2) {
                ekrw ekrwVarJ2 = b.j();
                ekrwVarJ2.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getRemoteAvatarBitmap", 155, "AvatarImageUtil.java")).q("OOM creating avatarBitmap from remote URI ");
                bxghVar.q();
                return null;
            }
        } catch (Throwable th) {
            bxghVar.q();
            throw th;
        }
    }
}
