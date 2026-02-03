package defpackage;

import android.view.inputmethod.BaseInputConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kfb extends fdbr implements fdae {
    final /* synthetic */ kfh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfb(kfh kfhVar) {
        super(0);
        this.a = kfhVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new BaseInputConnection(this.a.a, false);
    }
}
