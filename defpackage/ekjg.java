package defpackage;

import java.util.ListIterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekjg extends ekqf {
    final /* synthetic */ ekjl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekjg(ListIterator listIterator, ekjl ekjlVar) {
        super(listIterator);
        this.a = ekjlVar;
    }

    @Override // defpackage.ekqe
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override // defpackage.ekqf, java.util.ListIterator
    public final void set(Object obj) {
        ekjl ekjlVar = this.a;
        ejwl.l(ekjlVar.c != null);
        ekjlVar.c.b = obj;
    }
}
