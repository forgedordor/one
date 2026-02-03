package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcit extends fbqd {
    public final fbnc a;
    public final fbrg b;
    public final fbrk c;
    private final fbqb d;

    public fcit(fbrk fbrkVar, fbrg fbrgVar, fbnc fbncVar, fbqb fbqbVar) {
        fbrkVar.getClass();
        this.c = fbrkVar;
        fbrgVar.getClass();
        this.b = fbrgVar;
        fbncVar.getClass();
        this.a = fbncVar;
        fbqbVar.getClass();
        this.d = fbqbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fcit fcitVar = (fcit) obj;
            if (ejwh.a(this.a, fcitVar.a) && ejwh.a(this.b, fcitVar.b) && ejwh.a(this.c, fcitVar.c) && ejwh.a(this.d, fcitVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        fbnc fbncVar = this.a;
        fbrg fbrgVar = this.b;
        return "[method=" + this.c.toString() + " headers=" + fbrgVar.toString() + " callOptions=" + fbncVar.toString() + "]";
    }
}
