package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmw extends fdbr implements fdap {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmw(int i) {
        super(1);
        this.a = i;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(((View) obj).getId() == this.a);
    }
}
