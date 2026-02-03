package defpackage;

import j$.util.List;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fczc extends fcuh implements Serializable, List, fcza {
    private final Enum[] a;

    public fczc(Enum[] enumArr) {
        this.a = enumArr;
    }

    private final Object writeReplace() {
        return new fczd(this.a);
    }

    @Override // defpackage.fcub
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.fcub, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        return ((Enum) fcur.J(this.a, r4.ordinal())) == r4;
    }

    @Override // defpackage.fcuh, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        Enum[] enumArr = this.a;
        fcud.b(i, enumArr.length);
        return enumArr[i];
    }

    @Override // defpackage.fcuh, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        r4.getClass();
        Enum[] enumArr = this.a;
        int iOrdinal = r4.ordinal();
        if (((Enum) fcur.J(enumArr, iOrdinal)) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.fcuh, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        r2.getClass();
        return indexOf(r2);
    }
}
