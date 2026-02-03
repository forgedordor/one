package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kpa {
    public final kqt a;

    public kpa() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kpa) {
            return fdbq.f(this.a, ((kpa) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public kpa(byte[] bArr) {
        new ArrayList();
        this.a = new kqt(new char[0]);
    }
}
