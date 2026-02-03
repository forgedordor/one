package defpackage;

import android.content.Context;
import android.util.Log;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebxs implements ebxr {
    public String a;
    private final Context b;
    private final eryv c;
    private final dbyl d;
    private final dbzq e;

    public ebxs(Context context, eryv eryvVar, dbyl dbylVar, dbzq dbzqVar) {
        this.b = context;
        this.c = eryvVar;
        this.d = dbylVar;
        this.e = dbzqVar;
    }

    @Override // defpackage.ebxr
    public final void a(String str, eryy eryyVar, boolean z) {
        erza erzaVar = (erza) erzb.a.createBuilder();
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).b = eryz.a(true != z ? 11 : 10);
        erzaVar.copyOnWrite();
        erzb erzbVar = (erzb) erzaVar.instance;
        str.getClass();
        erzbVar.d = str;
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).e = eryyVar.a();
        f((erzb) erzaVar.build());
    }

    @Override // defpackage.ebxr
    public final void b(String str, eryy eryyVar) throws NoSuchAlgorithmException, NumberFormatException {
        if (str.contains("/stickers/")) {
            String strC = ebve.c(str);
            dbzq dbzqVar = this.e;
            int i = Integer.parseInt(strC.substring(strC.lastIndexOf(47) + 1));
            int i2 = Integer.parseInt(str.substring(str.lastIndexOf(47) + 1));
            ejul ejulVar = ejul.e;
            ejul ejulVar2 = ejul.d;
            ejulVar2.getClass();
            String string = "STICKER_SENT";
            if (ejulVar2 != ejulVar) {
                if (ejulVar2 == ejuk.a) {
                    string = ejuf.c("STICKER-SENT");
                } else if (ejulVar2 == ejuk.b) {
                    string = ejuf.c("STICKER_SENT");
                } else {
                    StringBuilder sb = null;
                    int length = 0;
                    int iE = -1;
                    while (true) {
                        iE = ejulVar.f.e("STICKER_SENT", iE + 1);
                        if (iE == -1) {
                            break;
                        }
                        if (length == 0) {
                            StringBuilder sb2 = new StringBuilder((ejulVar2.g.length() * 4) + 12);
                            sb2.append(ejulVar2.a("STICKER_SENT".substring(0, iE)));
                            sb = sb2;
                        } else {
                            sb.getClass();
                            sb.append(ejulVar2.a("STICKER_SENT".substring(length, iE)));
                        }
                        sb.append(ejulVar2.g);
                        length = ejulVar.g.length() + iE;
                    }
                    if (length == 0) {
                        string = ejulVar2.a("STICKER_SENT");
                    } else {
                        sb.getClass();
                        sb.append(ejulVar2.a("STICKER_SENT".substring(length)));
                        string = sb.toString();
                    }
                }
            }
            erys erysVar = (erys) eryt.a.createBuilder();
            int iB = eryr.b(this.c.b);
            if (iB == 0) {
                iB = 1;
            }
            erysVar.copyOnWrite();
            ((eryt) erysVar.instance).d = eryr.a(iB);
            erysVar.copyOnWrite();
            ((eryt) erysVar.instance).b = 1;
            erysVar.copyOnWrite();
            ((eryt) erysVar.instance).c = i;
            eryt erytVar = (eryt) erysVar.build();
            dbzn dbznVarE = dbzqVar.e(string);
            long j = i2;
            dbzj dbzjVarA = dbzj.a(erytVar);
            dbzh dbzhVar = dbznVarE.f;
            dbznVarE.a(j, 1L, dbzjVarA);
            dbzqVar.f();
            str = strC;
        }
        erza erzaVar = (erza) erzb.a.createBuilder();
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).b = eryz.a(13);
        erzaVar.copyOnWrite();
        erzb erzbVar = (erzb) erzaVar.instance;
        str.getClass();
        erzbVar.d = str;
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).e = eryyVar.a();
        f((erzb) erzaVar.build());
    }

    @Override // defpackage.ebxr
    public final void c() {
        erza erzaVar = (erza) erzb.a.createBuilder();
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).b = eryz.a(41);
        f((erzb) erzaVar.build());
    }

    @Override // defpackage.ebxr
    public final void d() {
        erza erzaVar = (erza) erzb.a.createBuilder();
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).b = eryz.a(42);
        f((erzb) erzaVar.build());
    }

    @Override // defpackage.ebxr
    public final void e(int i) {
        erza erzaVar = (erza) erzb.a.createBuilder();
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).b = eryz.a(43);
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).f = i - 2;
        f((erzb) erzaVar.build());
    }

    public final void f(erzb erzbVar) {
        if (Log.isLoggable("StickerLogger", 3)) {
            Log.d("StickerLogger", "log: ".concat(String.valueOf(String.valueOf(erzbVar))));
        }
        dbyl dbylVar = this.d;
        String strB = ejwk.b(this.a);
        ebxt ebxtVar = new ebxt();
        eryw erywVar = (eryw) eryx.a.createBuilder();
        eryv eryvVar = this.c;
        erywVar.copyOnWrite();
        eryx eryxVar = (eryx) erywVar.instance;
        eryxVar.c = eryvVar;
        eryxVar.b |= 1;
        erza erzaVar = (erza) erzb.a.createBuilder(erzbVar);
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).c = strB;
        erywVar.copyOnWrite();
        eryx eryxVar2 = (eryx) erywVar.instance;
        erzb erzbVar2 = (erzb) erzaVar.build();
        erzbVar2.getClass();
        eryxVar2.d = erzbVar2;
        eryxVar2.b |= 4;
        dbyk dbykVarJ = dbylVar.j(erywVar.build());
        dbykVarJ.k = "EXPRESSION";
        dbykVarJ.p = dqnz.b(this.b, ebxtVar);
        dbykVarJ.c();
    }

    public final void g(int i) {
        erza erzaVar = (erza) erzb.a.createBuilder();
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).b = eryz.a(i);
        f((erzb) erzaVar.build());
    }

    public final void h(String str) {
        erza erzaVar = (erza) erzb.a.createBuilder();
        erzaVar.copyOnWrite();
        ((erzb) erzaVar.instance).b = eryz.a(16);
        erzaVar.copyOnWrite();
        erzb erzbVar = (erzb) erzaVar.instance;
        str.getClass();
        erzbVar.d = str;
        f((erzb) erzaVar.build());
    }
}
