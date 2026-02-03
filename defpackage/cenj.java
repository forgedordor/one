package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenj {
    private final Context a;
    private final cnki b;
    private final fcsu c;

    public cenj(Context context, cnki cnkiVar, fcsu fcsuVar) {
        this.a = context;
        this.b = cnkiVar;
        this.c = fcsuVar;
    }

    private final ezpo c(String str, boolean z) throws PackageManager.NameNotFoundException {
        ezpo ezpoVar = (ezpo) ezpp.a.createBuilder();
        ezod ezodVar = (ezod) ezoe.a.createBuilder();
        Context context = this.a;
        int iB = cpge.b(context);
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).b = iB;
        int iC = cpge.c(context);
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).c = iC;
        int iA = cpge.a(context);
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).d = iA;
        String strD = cpge.d(context);
        ezodVar.copyOnWrite();
        ezoe ezoeVar = (ezoe) ezodVar.instance;
        strD.getClass();
        ezoeVar.h = strD;
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).e = 4;
        int iA2 = ((ceds) this.c.b()).a();
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).g = felo.a(iA2);
        ezpoVar.copyOnWrite();
        ezpp ezppVar = (ezpp) ezpoVar.instance;
        ezoe ezoeVar2 = (ezoe) ezodVar.build();
        ezoeVar2.getClass();
        ezppVar.g = ezoeVar2;
        ezppVar.b |= 1;
        String string = UUID.randomUUID().toString();
        ezpoVar.copyOnWrite();
        ezpp ezppVar2 = (ezpp) ezpoVar.instance;
        string.getClass();
        ezppVar2.c = string;
        ezpoVar.copyOnWrite();
        ezpp ezppVar3 = (ezpp) ezpoVar.instance;
        str.getClass();
        ezppVar3.e = str;
        if (z) {
            int iA3 = this.b.a() - 1;
            felf felfVar = (iA3 == 0 || iA3 == 1) ? felf.ACCESS_NETWORK_TYPE_UNSPECIFIED : iA3 != 2 ? iA3 != 3 ? felf.ETHERNET : felf.WIFI : felf.MOBILE;
            ezpoVar.copyOnWrite();
            ((ezpp) ezpoVar.instance).j = felfVar.a();
        }
        return ezpoVar;
    }

    public final ezpo a(String str) {
        return c(str, false);
    }

    public final ezpo b(String str) {
        return c(str, true);
    }
}
