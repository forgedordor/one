package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class my {
    public Object[] a;
    public final mx b;
    public int c = 0;
    public final Class d;

    public my(Class cls, mx mxVar) {
        this.d = cls;
        this.a = (Object[]) Array.newInstance((Class<?>) cls, 10);
        this.b = mxVar;
    }

    public final Object a(int i) {
        if (i < this.c && i >= 0) {
            return this.a[i];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.c);
    }

    public final void b() {
        int i = this.c;
        if (i == 0) {
            return;
        }
        Arrays.fill(this.a, 0, i, (Object) null);
        this.c = 0;
        this.b.d(0, i);
    }

    public final int c(Object obj, Object[] objArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = (i3 + i) / 2;
            Object obj2 = objArr[i4];
            mx mxVar = this.b;
            int iCompare = mxVar.compare(obj2, obj);
            if (iCompare < 0) {
                i3 = i4 + 1;
            } else {
                if (iCompare == 0) {
                    if (!mxVar.e(obj2, obj)) {
                        int i5 = i4 - 1;
                        while (i5 >= i3) {
                            Object obj3 = this.a[i5];
                            if (mxVar.compare(obj3, obj) == 0) {
                                if (mxVar.e(obj3, obj)) {
                                    break;
                                }
                                i5--;
                            } else {
                                break;
                            }
                        }
                        i5 = i4 + 1;
                        while (i5 < i) {
                            Object obj4 = this.a[i5];
                            if (mxVar.compare(obj4, obj) == 0) {
                                if (mxVar.e(obj4, obj)) {
                                    break;
                                }
                                i5++;
                            } else {
                                break;
                            }
                        }
                        i5 = -1;
                        if (i2 != 1 || i5 != -1) {
                            return i5;
                        }
                    }
                    return i4;
                }
                i = i4;
            }
        }
        if (i2 == 1) {
            return i3;
        }
        return -1;
    }
}
