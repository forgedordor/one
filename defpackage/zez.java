package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zez {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/LinkPreviewUiAdapter");
    public final afzc b;
    public final afhk c;
    public final cssx d;
    public final zqm e;
    public final afgn f;
    public final ctfq g;
    public final efwo h;
    public final xuz i;
    public final aqkb j;
    public final arhq k;
    public boolean l;
    public boolean m;
    public final fdap n;
    private final fdjx o;
    private final fcyh p;

    public zez(Context context, afzc afzcVar, afhk afhkVar, cssx cssxVar, zqm zqmVar, afgn afgnVar, ctfq ctfqVar, fdjx fdjxVar, fcyh fcyhVar, efwo efwoVar, xuz xuzVar, aqkb aqkbVar, dbap dbapVar, arhq arhqVar, ahax ahaxVar) {
        context.getClass();
        afzcVar.getClass();
        afhkVar.getClass();
        cssxVar.getClass();
        zqmVar.getClass();
        afgnVar.getClass();
        ctfqVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        efwoVar.getClass();
        xuzVar.getClass();
        dbapVar.getClass();
        ahaxVar.getClass();
        this.b = afzcVar;
        this.c = afhkVar;
        this.d = cssxVar;
        this.e = zqmVar;
        this.f = afgnVar;
        this.g = ctfqVar;
        this.o = fdjxVar;
        this.p = fcyhVar;
        this.h = efwoVar;
        this.i = xuzVar;
        this.j = aqkbVar;
        this.k = arhqVar;
        auvw.k(fdjxVar, fcyhVar, null, new zex(this, null), 2);
        this.n = auxh.a(new zey(this), 1000L, fdjxVar);
    }

    public static final String a(String str) {
        if (str.length() <= 250) {
            return str;
        }
        String strSubstring = str.substring(0, 250);
        strSubstring.getClass();
        return strSubstring;
    }
}
