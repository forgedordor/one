package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kse extends krz {
    public krz[] aL = new krz[4];
    public int aM = 0;

    public final void af(krz krzVar) {
        if (krzVar == this || krzVar == null) {
            return;
        }
        int i = this.aM + 1;
        krz[] krzVarArr = this.aL;
        int length = krzVarArr.length;
        if (i > length) {
            this.aL = (krz[]) Arrays.copyOf(krzVarArr, length + length);
        }
        krz[] krzVarArr2 = this.aL;
        int i2 = this.aM;
        krzVarArr2[i2] = krzVar;
        this.aM = i2 + 1;
    }

    public final void ag(ArrayList arrayList, int i, ksz kszVar) {
        for (int i2 = 0; i2 < this.aM; i2++) {
            kszVar.d(this.aL[i2]);
        }
        for (int i3 = 0; i3 < this.aM; i3++) {
            kss.a(this.aL[i3], i, arrayList, kszVar);
        }
    }

    public void ah() {
    }
}
