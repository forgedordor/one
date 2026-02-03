package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhuy extends dhph {
    public static final dhuy a = new dhuy(null, 0 == true ? 1 : 0, false, 127);
    public final Set b;
    public final dhvj c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX WARN: Multi-variable type inference failed */
    public dhuy() {
        this(null, 0 == true ? 1 : 0, false, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhuy)) {
            return false;
        }
        dhuy dhuyVar = (dhuy) obj;
        if (!fdbq.f(this.b, dhuyVar.b) || !fdbq.f(this.c, dhuyVar.c) || this.d != dhuyVar.d || this.e != dhuyVar.e) {
            return false;
        }
        int i = dhuyVar.f;
        int i2 = dhuyVar.g;
        int i3 = dhuyVar.h;
        return true;
    }

    public final int hashCode() {
        return (((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + dhux.a(this.d)) * 31) + dhux.a(this.e)) * 31) + 1) * 31) + 1) * 31) + 1;
    }

    public /* synthetic */ dhuy(Set set, dhvj dhvjVar, boolean z, int i) {
        set = (i & 1) != 0 ? fcvq.a : set;
        dhvjVar = (i & 2) != 0 ? dhuz.a : dhvjVar;
        boolean z2 = (i & 4) != 0;
        boolean z3 = (i & 8) == 0;
        set.getClass();
        dhvjVar.getClass();
        this.b = set;
        this.c = dhvjVar;
        this.d = z2;
        this.e = z | (!z3);
        this.f = 1;
        this.g = 1;
        this.h = 1;
    }
}
