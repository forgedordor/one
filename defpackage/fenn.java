package defpackage;

import androidx.car.app.model.Alert;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fenn extends ArrayList implements Serializable {
    private static final long serialVersionUID = -1667481795613729889L;
    private final int a;
    private final int b;
    private final boolean c;

    public fenn() {
        this(Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY, true);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        if (obj instanceof Integer) {
            return super.add(obj);
        }
        throw new IllegalArgumentException("Argument not a ".concat(String.valueOf(Integer.class.getName())));
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            if (it.hasNext()) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    public fenn(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public fenn(String str, int i, int i2, boolean z) {
        this(i, i2, z);
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            int iA = fewz.a(stringTokenizer.nextToken());
            Integer numValueOf = Integer.valueOf(iA);
            numValueOf.getClass();
            if (((iA >> 31) | ((-iA) >>> 31)) < 0) {
                if (this.c) {
                    iA = Math.abs(iA);
                } else {
                    Objects.toString(numValueOf);
                    throw new IllegalArgumentException("Negative value not allowed: ".concat(numValueOf.toString()));
                }
            }
            int i3 = this.a;
            if (iA >= i3 && iA <= this.b) {
                add(numValueOf);
            } else {
                throw new IllegalArgumentException("Value not in range [" + i3 + ".." + this.b + "]: " + numValueOf);
            }
        }
    }
}
