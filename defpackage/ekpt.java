package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekpt extends ekqe {
    final /* synthetic */ ekpu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekpt(ekpu ekpuVar, Iterator it) {
        super(it);
        this.a = ekpuVar;
    }

    @Override // defpackage.ekqe
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ekqd.a((Collection) obj, this.a.g);
    }
}
