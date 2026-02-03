package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aijh implements aijg, aiiy, cqla {
    public static final Intent H(Context context, Uri uri, String str) {
        String str2;
        if (bxlf.j(uri, context) || cqmz.s(uri)) {
            str2 = str;
            uri = bxli.b(context, uri, null, str2, 0L);
        } else {
            str2 = str;
        }
        return new Intent("android.intent.action.SEND").setType(str2).putExtra("android.intent.extra.STREAM", uri);
    }

    public abstract void A(Context context, efwo efwoVar);

    public abstract void B(Context context);

    public abstract void C(Context context);

    public abstract void D(Context context, efwo efwoVar);

    public abstract void E(Context context, efwo efwoVar);

    public abstract void F(Uri uri, String str, Uri uri2, String str2);

    public abstract Intent G(String str, Uri uri, Uri uri2);

    public abstract void I(Context context, efwo efwoVar);

    public abstract void J(Activity activity, Uri uri, Uri uri2);

    public abstract void K(Activity activity, String str, int i);

    public abstract void L(Context context, alqm alqmVar, aisq aisqVar);

    public abstract void M(Context context);

    public abstract Intent i(Context context);

    public abstract Intent j(Context context);

    public abstract Intent k(Context context, int i, String str);

    public abstract Intent l(Activity activity);

    public abstract Intent m(Context context);

    public abstract Intent n(Context context);

    public abstract Intent o(Context context);

    public abstract Intent p(Context context);

    public abstract Intent q(Context context);

    public abstract void r(Context context, efwo efwoVar);

    public abstract void s(Context context);

    public abstract void t(Context context, String str);

    public abstract void u(Context context, ContentValues contentValues);

    public abstract void v(Context context);

    public abstract void w(Context context, Uri uri, String str);

    public abstract void x(Context context, Uri uri, String str);

    public abstract void y(Context context);

    public abstract void z(Context context);
}
