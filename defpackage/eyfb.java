package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyfb implements Serializable, evst, eyfa {
    public static final eyfb k = new eyfb(-1);
    public final int l;

    public eyfb(int i) {
        this.l = i;
    }

    @Override // defpackage.evst
    public final int a() {
        if (this != k) {
            return this.l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(this.l);
    }
}
