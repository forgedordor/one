package defpackage;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqe {
    public static WebMessage a(ppk ppkVar) {
        WebMessagePort[] webMessagePortArr;
        String strA = ppkVar.a();
        ppm[] ppmVarArr = ppkVar.a;
        if (ppmVarArr == null) {
            webMessagePortArr = null;
        } else {
            int length = ppmVarArr.length;
            WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
            for (int i = 0; i < length; i++) {
                webMessagePortArr2[i] = ppmVarArr[i].a();
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return new WebMessage(strA, webMessagePortArr);
    }
}
