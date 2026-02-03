package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oib extends oia {
    public static final float[] g(String str) {
        str.getClass();
        return new float[]{((Number) okq.h.c(str)).floatValue()};
    }

    @Override // defpackage.oia
    public final /* bridge */ /* synthetic */ Object a() {
        return new float[0];
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!pis.g(bundle, str) || pis.h(bundle, str)) {
            return null;
        }
        return pis.i(bundle, str);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        float[] fArr = (float[]) obj;
        if (fArr == null) {
            return g(str);
        }
        float[] fArrG = g(str);
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        System.arraycopy(fArrG, 0, fArrCopyOf, length, 1);
        fArrCopyOf.getClass();
        return fArrCopyOf;
    }

    @Override // defpackage.okq
    public final String e() {
        return "float[]";
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        float[] fArr = (float[]) obj;
        str.getClass();
        if (fArr != null) {
            bundle.putFloatArray(str, fArr);
        } else {
            pjc.a(bundle, str);
        }
    }
}
