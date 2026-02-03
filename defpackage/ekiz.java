package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekiz implements Iterator {
    public static final ekiz a;
    private static final /* synthetic */ ekiz[] b;

    static {
        ekiz ekizVar = new ekiz();
        a = ekizVar;
        b = new ekiz[]{ekizVar};
    }

    private ekiz() {
    }

    public static ekiz[] values() {
        return (ekiz[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ekcw.b(false);
    }
}
