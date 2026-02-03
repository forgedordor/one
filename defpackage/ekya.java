package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekya {
    public final List a;
    public int b;

    public ekya(List list) {
        this.a = list;
    }

    public final ekxz a() {
        return (ekxz) this.a.get(this.b);
    }

    public final void b(ekxp ekxpVar) {
        int size = this.a.size() - 1;
        int i = 0;
        while (i <= size) {
            this.b = (i + size) / 2;
            int iCompareTo = ekxy.b(this).compareTo(ekxpVar);
            if (iCompareTo > 0) {
                size = this.b - 1;
            } else if (iCompareTo < 0) {
                i = this.b + 1;
            } else {
                size = this.b;
                if (i == size) {
                    return;
                }
            }
        }
        this.b = i;
    }

    public final boolean c() {
        return this.b == 0;
    }

    public final boolean d() {
        return this.b == this.a.size();
    }

    public final void e() {
        int i = this.b;
        if (i > 0) {
            this.b = i - 1;
        }
    }
}
