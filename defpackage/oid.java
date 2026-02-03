package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oid extends okq {
    public oid() {
        super(false);
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return Float.valueOf(f);
        }
        pit.a(str);
        throw new fcta();
    }

    @Override // defpackage.okq
    public final /* bridge */ /* synthetic */ Object c(String str) {
        str.getClass();
        return Float.valueOf(Float.parseFloat(str));
    }

    @Override // defpackage.okq
    public final String e() {
        return "float";
    }

    @Override // defpackage.okq
    public final /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        bundle.putFloat(str, ((Number) obj).floatValue());
    }
}
