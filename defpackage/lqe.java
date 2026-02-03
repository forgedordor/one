package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lqe implements lqc {
    private final String a;

    public lqe(String str) {
        this.a = str;
    }

    @Override // defpackage.lqc
    public final boolean b(CharSequence charSequence, int i, int i2, lqq lqqVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
            return true;
        }
        lqqVar.c = lqqVar.c() | 4;
        return false;
    }

    @Override // defpackage.lqc
    public final /* bridge */ /* synthetic */ Object a() {
        return this;
    }
}
