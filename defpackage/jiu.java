package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jiu extends fdbr implements fdap {
    final /* synthetic */ Resources a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jiu(Resources resources) {
        super(1);
        this.a = resources;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(jiv.g((jsl) obj, this.a));
    }
}
