package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekqw {
    public final int a;
    public final TimeUnit b;

    public ekqw(int i, TimeUnit timeUnit) {
        this.a = i;
        timeUnit.getClass();
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ekqw) {
            ekqw ekqwVar = (ekqw) obj;
            if (this.a == ekqwVar.a && this.b == ekqwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 37) ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a + " " + this.b.toString();
    }
}
