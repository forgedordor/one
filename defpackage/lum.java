package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lum implements lvh {
    private final luu[] a;

    public lum(luu[] luuVarArr) {
        this.a = luuVarArr;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        luu[] luuVarArr;
        new HashMap();
        int i = 0;
        while (true) {
            luuVarArr = this.a;
            if (i >= luuVarArr.length) {
                break;
            }
            luuVarArr[i].a();
            i++;
        }
        for (luu luuVar : luuVarArr) {
            luuVar.a();
        }
    }
}
