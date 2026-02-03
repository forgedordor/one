package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekbf extends ekbd implements ListIterator {
    final /* synthetic */ ekbg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekbf(ekbg ekbgVar) {
        super(ekbgVar);
        this.d = ekbgVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ekbg ekbgVar = this.d;
        boolean zIsEmpty = ekbgVar.isEmpty();
        b().add(obj);
        ekbgVar.f.b++;
        if (zIsEmpty) {
            ekbgVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekbf(ekbg ekbgVar, int i) {
        super(ekbgVar, ekbgVar.d().listIterator(i));
        this.d = ekbgVar;
    }
}
