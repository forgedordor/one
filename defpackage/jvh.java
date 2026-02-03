package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvh {
    public static final int a(List list, int i) {
        int i2;
        int i3 = ((jvj) fcva.S(list)).c;
        if (i > ((jvj) fcva.S(list)).c) {
            kfq.b(a.s(i3, i, "Index ", " should be less or equal than last line's end "));
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            jvj jvjVar = (jvj) list.get(i2);
            char c = jvjVar.b <= i ? jvjVar.c <= i ? (char) 65535 : (char) 0 : (char) 1;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        kfq.b("Found paragraph index " + i2 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i + ", paragraphs=[" + kjw.d(list, null, new fdap() { // from class: jvg
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                jvj jvjVar2 = (jvj) obj;
                return "[" + jvjVar2.b + ", " + jvjVar2.c + ')';
            }
        }, 31) + ']');
        return i2;
    }

    public static final int b(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (true) {
            if (i2 > size) {
                return -(i2 + 1);
            }
            int i3 = (i2 + size) >>> 1;
            jvj jvjVar = (jvj) list.get(i3);
            char c = jvjVar.d <= i ? jvjVar.e <= i ? (char) 65535 : (char) 0 : (char) 1;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
    }

    public static final int c(List list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((jvj) fcva.S(list)).g) {
            return fcva.e(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                return -(i + 1);
            }
            int i2 = (i + size) >>> 1;
            jvj jvjVar = (jvj) list.get(i2);
            char c = jvjVar.f <= f ? jvjVar.g <= f ? (char) 65535 : (char) 0 : (char) 1;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
    }

    public static final void d(List list, long j, fdap fdapVar) {
        int size = list.size();
        for (int iA = a(list, jyo.d(j)); iA < size; iA++) {
            jvj jvjVar = (jvj) list.get(iA);
            int i = jvjVar.b;
            if (i >= jyo.c(j)) {
                return;
            }
            if (i != jvjVar.c) {
                fdapVar.invoke(jvjVar);
            }
        }
    }
}
