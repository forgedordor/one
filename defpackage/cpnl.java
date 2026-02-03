package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cpnl {
    protected final fcsu a;

    public cpnl(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public static final void k(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            throw new cpyx("Missing dependency even after check dependency first\n", ekgb.r(new cpyp(str, i)));
        }
    }

    public static final void l(byte[] bArr, bnar bnarVar, epkg epkgVar) {
        byte[] bArrQ = bnarVar.q();
        if (bArrQ == null) {
            throw new cpny("No encryption key available in cmsTable");
        }
        int iK = bnarVar.k();
        try {
            byte[] bArrB = cpob.b(bArr, bArrQ);
            epkgVar.copyOnWrite();
            epkh epkhVar = (epkh) epkgVar.instance;
            epkh epkhVar2 = epkh.a;
            epkhVar.c = iK;
            evqs evqsVarX = evqs.x(bArrB);
            epkgVar.copyOnWrite();
            ((epkh) epkgVar.instance).b = evqsVarX;
        } catch (Exception e) {
            throw new cpoa(a.g(iK, "Unable to encrypt content with key index "), e);
        }
    }
}
