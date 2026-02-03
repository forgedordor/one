package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oih extends oia {
    public static final long[] g(String str) {
        str.getClass();
        return new long[]{((Number) okq.e.c(str)).longValue()};
    }

    @Override // defpackage.oia
    public final /* bridge */ /* synthetic */ Object a() {
        return new long[0];
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!pis.g(bundle, str) || pis.h(bundle, str)) {
            return null;
        }
        return pis.k(bundle, str);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        long[] jArr = (long[]) obj;
        if (jArr == null) {
            return g(str);
        }
        long[] jArrG = g(str);
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        System.arraycopy(jArrG, 0, jArrCopyOf, length, 1);
        jArrCopyOf.getClass();
        return jArrCopyOf;
    }

    @Override // defpackage.okq
    public final String e() {
        return "long[]";
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        long[] jArr = (long[]) obj;
        str.getClass();
        if (jArr != null) {
            bundle.putLongArray(str, jArr);
        } else {
            pjc.a(bundle, str);
        }
    }
}
