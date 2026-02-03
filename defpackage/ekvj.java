package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekvj extends ekvk {
    private final ekvi[] a;

    public ekvj(ekvi[] ekviVarArr) {
        this.a = ekviVarArr;
    }

    @Override // defpackage.ekvk
    public final ekvi a(int i) {
        return this.a[i];
    }

    @Override // defpackage.ekte
    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.ekte
    public final Object d(ekrz ekrzVar) {
        ekvi ekviVar;
        ekwr.a(!ekrzVar.b, "metadata key must be single valued");
        ekvi[] ekviVarArr = this.a;
        int length = ekviVarArr.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
            ekviVar = ekviVarArr[length];
        } while (!ekviVar.a.equals(ekrzVar));
        return ekviVar.b;
    }

    @Override // defpackage.ekvk
    public final ekvk f(ekvk ekvkVar) {
        int iB = ekvkVar.b();
        if (iB == 0) {
            return this;
        }
        ekvi[] ekviVarArr = this.a;
        int length = ekviVarArr.length;
        if (length == 0) {
            return ekvkVar;
        }
        ekvi[] ekviVarArr2 = (ekvi[]) Arrays.copyOf(ekviVarArr, length + iB);
        for (int i = 0; i < iB; i++) {
            ekviVarArr2[ekviVarArr.length + i] = ekvkVar.a(i);
        }
        return new ekvj(ekviVarArr2);
    }
}
