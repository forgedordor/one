package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eklr extends ekqe {
    final /* synthetic */ ejvr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eklr(Iterator it, ejvr ejvrVar) {
        super(it);
        this.a = ejvrVar;
    }

    @Override // defpackage.ekqe
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new ekfo(obj, this.a.apply(obj));
    }
}
