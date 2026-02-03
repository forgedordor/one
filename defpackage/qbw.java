package defpackage;

import androidx.work.Worker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbw extends fdbr implements fdae {
    final /* synthetic */ Worker a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbw(Worker worker) {
        super(0);
        this.a = worker;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        return this.a.c();
    }
}
