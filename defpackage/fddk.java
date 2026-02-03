package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fddk extends fcuz {
    private final int a;
    private boolean b;
    private int c;

    public fddk(char c, char c2) {
        this.a = c2;
        int iA = fdbq.a(c, c2);
        this.b = iA <= 0;
        this.c = iA > 0 ? c2 : c;
    }

    @Override // defpackage.fcuz
    public final char a() {
        int i = this.c;
        if (i != this.a) {
            this.c = i + 1;
        } else {
            if (!this.b) {
                throw new NoSuchElementException();
            }
            this.b = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }
}
