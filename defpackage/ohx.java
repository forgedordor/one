package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohx extends oia {
    public static final boolean[] g(String str) {
        str.getClass();
        return new boolean[]{((Boolean) okq.k.c(str)).booleanValue()};
    }

    @Override // defpackage.oia
    public final /* bridge */ /* synthetic */ Object a() {
        return new boolean[0];
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!pis.g(bundle, str) || pis.h(bundle, str)) {
            return null;
        }
        return pis.m(bundle, str);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            return g(str);
        }
        boolean[] zArrG = g(str);
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        System.arraycopy(zArrG, 0, zArrCopyOf, length, 1);
        zArrCopyOf.getClass();
        return zArrCopyOf;
    }

    @Override // defpackage.okq
    public final String e() {
        return "boolean[]";
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        str.getClass();
        if (zArr != null) {
            bundle.putBooleanArray(str, zArr);
        } else {
            pjc.a(bundle, str);
        }
    }
}
