package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxlj implements dxlh {
    public static final eksp a = eksp.c("GnpSdk");
    public final Context b;
    public final fdjx c;
    public final dxlw d;
    public final dxtx e;
    public final String f;
    public final String g;
    public fdkf h;

    public dxlj(Context context, fdjx fdjxVar, dxlw dxlwVar, dxtx dxtxVar, String str, String str2) {
        context.getClass();
        fdjxVar.getClass();
        dxlwVar.getClass();
        dxtxVar.getClass();
        str.getClass();
        str2.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.d = dxlwVar;
        this.e = dxtxVar;
        this.f = str;
        this.g = str2;
    }

    public final void a(akz akzVar, Activity activity) {
        akzVar.a(activity, Uri.parse("https://accounts.google.com/AccountChooser").buildUpon().appendQueryParameter("Email", this.f).appendQueryParameter("continue", this.g).build());
    }
}
