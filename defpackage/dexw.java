package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dexw {
    public static final dhip a = new dhip("ClearcutUtil");
    private static ekgb b;
    private final cmlb c;
    private final String d = UUID.randomUUID().toString();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final eosc g;
    private final fcsu h;

    public dexw(cmlb cmlbVar, eosc eoscVar, fcsu fcsuVar) {
        this.c = cmlbVar;
        this.h = fcsuVar;
        this.g = eoscVar;
    }

    protected static final emkl f(String str, Context context) throws PackageManager.NameNotFoundException {
        emkk emkkVar = (emkk) emkl.a.createBuilder();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            int i = packageInfo.versionCode;
            emkkVar.copyOnWrite();
            emkl emklVar = (emkl) emkkVar.instance;
            emklVar.b |= 1;
            emklVar.c = i;
            if (packageInfo.versionName != null) {
                String str2 = packageInfo.versionName;
                emkkVar.copyOnWrite();
                emkl emklVar2 = (emkl) emkkVar.instance;
                str2.getClass();
                emklVar2.b |= 2;
                emklVar2.d = str2;
            }
            dhja.d(a, "%s client info: %s", str, Integer.valueOf(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            dhja.i(e, "Failed to get %s client info", str);
        }
        return (emkl) emkkVar.build();
    }

    public final emkm a(Context context, emko emkoVar) throws PackageManager.NameNotFoundException {
        emkm emkmVar = (emkm) emkr.a.createBuilder();
        emkmVar.copyOnWrite();
        emkr emkrVar = (emkr) emkmVar.instance;
        emkrVar.j = emkoVar.e;
        emkrVar.b |= 128;
        d(emkmVar, context);
        return emkmVar;
    }

    public final enpl b(dggn dggnVar) {
        String str = dggo.a(dggnVar).a;
        cmlb cmlbVar = this.c;
        cmmh cmmhVar = (cmmh) cmlbVar.j(dggnVar).orElse(cmmh.a);
        cmmb cmmbVarA = cmlbVar.a();
        enpk enpkVar = (enpk) enpl.a.createBuilder();
        String str2 = cmmhVar.p;
        enpkVar.copyOnWrite();
        enpl enplVar = (enpl) enpkVar.instance;
        str2.getClass();
        enplVar.b |= 1;
        enplVar.c = str2;
        boolean zEquals = cmmbVarA.c.equals(str);
        enpkVar.copyOnWrite();
        enpl enplVar2 = (enpl) enpkVar.instance;
        enplVar2.b |= 2;
        enplVar2.d = zEquals;
        boolean zEquals2 = cmmbVarA.d.equals(str);
        enpkVar.copyOnWrite();
        enpl enplVar3 = (enpl) enpkVar.instance;
        enplVar3.b |= 4;
        enplVar3.e = zEquals2;
        boolean zEquals3 = cmmbVarA.e.equals(str);
        enpkVar.copyOnWrite();
        enpl enplVar4 = (enpl) enpkVar.instance;
        enplVar4.b |= 8;
        enplVar4.f = zEquals3;
        return (enpl) enpkVar.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r9, defpackage.emkr r10, defpackage.ewqu r11) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dexw.c(android.content.Context, emkr, ewqu):void");
    }

    public final void d(emkm emkmVar, Context context) throws PackageManager.NameNotFoundException {
        boolean zEquals;
        emkr emkrVar = (emkr) emkmVar.instance;
        if ((emkrVar.b & 256) != 0) {
            int iA = emkq.a(emkrVar.k);
            zEquals = iA != 0 && iA == 2;
        } else {
            zEquals = "com.google.android.apps.messaging".equals(context.getPackageName());
        }
        if (zEquals) {
            emkl emklVarF = f("com.google.android.apps.messaging", context);
            emkmVar.copyOnWrite();
            emkr emkrVar2 = (emkr) emkmVar.instance;
            emklVarF.getClass();
            emkrVar2.h = emklVarF;
            emkrVar2.b |= 4;
            emkl emklVar = emkl.a;
            emkmVar.copyOnWrite();
            emkr emkrVar3 = (emkr) emkmVar.instance;
            emklVar.getClass();
            emkrVar3.g = emklVar;
            emkrVar3.b |= 2;
            emkmVar.copyOnWrite();
            emkr emkrVar4 = (emkr) emkmVar.instance;
            emkrVar4.k = 1;
            emkrVar4.b |= 256;
        } else if ("com.google.android.apps.tycho".equals(context.getPackageName())) {
            emkl emklVarF2 = f("com.google.android.apps.tycho", context);
            emkmVar.copyOnWrite();
            emkr emkrVar5 = (emkr) emkmVar.instance;
            emklVarF2.getClass();
            emkrVar5.g = emklVarF2;
            emkrVar5.b |= 2;
            emkmVar.copyOnWrite();
            emkr emkrVar6 = (emkr) emkmVar.instance;
            emkrVar6.k = 3;
            emkrVar6.b |= 256;
        } else {
            emkl emklVarF3 = f("com.google.android.apps.messaging", context);
            emkmVar.copyOnWrite();
            emkr emkrVar7 = (emkr) emkmVar.instance;
            emklVarF3.getClass();
            emkrVar7.h = emklVarF3;
            emkrVar7.b |= 4;
            emkl emklVarF4 = f("com.google.android.ims", context);
            emkmVar.copyOnWrite();
            emkr emkrVar8 = (emkr) emkmVar.instance;
            emklVarF4.getClass();
            emkrVar8.g = emklVarF4;
            emkrVar8.b |= 2;
            emkmVar.copyOnWrite();
            emkr emkrVar9 = (emkr) emkmVar.instance;
            emkrVar9.k = 2;
            emkrVar9.b |= 256;
        }
        dbhd dbhdVar = dfbu.j;
        if (TextUtils.isEmpty((CharSequence) dbhdVar.a())) {
            return;
        }
        String str = (String) dbhdVar.a();
        emkmVar.copyOnWrite();
        emkr emkrVar10 = (emkr) emkmVar.instance;
        str.getClass();
        emkrVar10.b |= 1024;
        emkrVar10.m = str;
    }

    public final synchronized boolean e(String str) {
        ekgb ekgbVarP;
        ekgbVarP = b;
        if (ekgbVarP == null) {
            ekgbVarP = ekgb.p(((String) dfog.o().a.q.a()).split(","));
            b = ekgbVarP;
        }
        return ekgbVarP.contains(str);
    }
}
