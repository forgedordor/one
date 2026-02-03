package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eomb extends ekem {
    private final ListIterator a;

    public eomb(ListIterator listIterator) {
        this.a = listIterator;
    }

    @Override // defpackage.ekem, java.util.ListIterator
    public final void add(Object obj) {
        obj.getClass();
        this.a.add(obj);
    }

    @Override // defpackage.ekem, defpackage.ekek
    protected final /* synthetic */ Iterator b() {
        return this.a;
    }

    @Override // defpackage.ekem
    protected final ListIterator c() {
        return this.a;
    }

    @Override // defpackage.ekek, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.a;
    }

    @Override // defpackage.ekem, java.util.ListIterator
    public final void set(Object obj) {
        obj.getClass();
        this.a.set(obj);
    }
}
