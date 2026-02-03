package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qls extends fdbr implements fdae {
    final /* synthetic */ fdap a;
    final /* synthetic */ WorkDatabase b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qls(fdap fdapVar, WorkDatabase workDatabase) {
        super(0);
        this.a = fdapVar;
        this.b = workDatabase;
    }

    @Override // defpackage.fdae
    public final Object invoke() {
        return this.a.invoke(this.b);
    }
}
