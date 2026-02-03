package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ole extends oia {
    public static final String[] g(String str) {
        str.getClass();
        return new String[]{str};
    }

    @Override // defpackage.oia
    public final /* bridge */ /* synthetic */ Object a() {
        return new String[0];
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!pis.g(bundle, str) || pis.h(bundle, str)) {
            return null;
        }
        return pis.l(bundle, str);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null) {
            return g(str);
        }
        String[] strArrG = g(str);
        int length = strArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, length + 1);
        System.arraycopy(strArrG, 0, objArrCopyOf, length, 1);
        objArrCopyOf.getClass();
        return (String[]) objArrCopyOf;
    }

    @Override // defpackage.okq
    public final String e() {
        return "string[]";
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        String[] strArr = (String[]) obj;
        str.getClass();
        if (strArr != null) {
            pjc.e(bundle, str, strArr);
        } else {
            pjc.a(bundle, str);
        }
    }
}
