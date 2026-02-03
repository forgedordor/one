package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiff {
    public final int[] a;
    public final eifd b;
    public eifd c;
    public int d;
    public int e;
    public int f;

    public eiff(int[] iArr) {
        this.a = iArr;
        eifd eifdVar = new eifd(-1, -1);
        this.b = eifdVar;
        this.c = eifdVar;
    }

    private final void d(eifd eifdVar, StringBuilder sb) {
        for (eifd eifdVar2 : eifdVar.d.values()) {
            sb.append("  ");
            sb.append(eifdVar);
            sb.append(" -> ");
            sb.append(eifdVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, eifdVar2.a, Math.min(iArr.length, eifdVar2.b + 1))));
            sb.append("\"]\n");
            d(eifdVar2, sb);
        }
    }

    final void a() {
        eifd eifdVar = this.c.c;
        if (eifdVar != null) {
            this.c = eifdVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        b();
    }

    final void b() {
        if (this.e == 0) {
            return;
        }
        Map map = this.c.d;
        int[] iArr = this.a;
        eifd eifdVar = (eifd) map.get(Integer.valueOf(iArr[this.d]));
        while (true) {
            int i = (eifdVar.b - eifdVar.a) + 1;
            int i2 = this.e;
            if (i > i2) {
                return;
            }
            int i3 = this.d + i;
            this.d = i3;
            this.c = eifdVar;
            int i4 = i2 - i;
            this.e = i4;
            if (i4 > 0) {
                eifdVar = (eifd) eifdVar.d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int[] iArr = this.a;
            int length = iArr.length;
            int iMin = Math.min(length, i2);
            if (iMin - i == Math.min(length, i4) - i3) {
                for (int i5 = i; i5 <= iMin; i5++) {
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        d(this.b, sb);
        sb.append("}");
        return sb.toString();
    }
}
