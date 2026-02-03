package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtj extends fdbr implements fdap {
    final /* synthetic */ fdae a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtj(fdae fdaeVar) {
        super(1);
        this.a = fdaeVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((List) obj).add(this.a.invoke());
        return true;
    }
}
