package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekpr extends ekqe {
    final /* synthetic */ ekps a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekpr(ekps ekpsVar, Iterator it) {
        super(it);
        this.a = ekpsVar;
    }

    @Override // defpackage.ekqe
    public final /* synthetic */ Object a(Object obj) {
        return new ekpq(this, (Map.Entry) obj);
    }
}
