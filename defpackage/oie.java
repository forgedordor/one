package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oie extends oia {
    public static final int[] g(String str) {
        str.getClass();
        return new int[]{((Number) okq.a.c(str)).intValue()};
    }

    @Override // defpackage.oia
    public final /* bridge */ /* synthetic */ Object a() {
        return new int[0];
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!pis.g(bundle, str) || pis.h(bundle, str)) {
            return null;
        }
        return pis.j(bundle, str);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        int[] iArr = (int[]) obj;
        return iArr != null ? fcur.f(iArr, g(str)) : g(str);
    }

    @Override // defpackage.okq
    public final String e() {
        return "integer[]";
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        int[] iArr = (int[]) obj;
        str.getClass();
        if (iArr != null) {
            bundle.putIntArray(str, iArr);
        } else {
            pjc.a(bundle, str);
        }
    }
}
