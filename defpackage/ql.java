package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ql {
    final vn e;
    private final lcd f = new lce(30);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int d = 0;
    final uz c = new uz(this);

    public ql(vn vnVar) {
        this.e = vnVar;
    }

    private final int m(int i, int i2) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            qk qkVar = (qk) arrayList.get(size);
            int i3 = qkVar.a;
            if (i3 == 8) {
                int i4 = qkVar.b;
                int i5 = qkVar.d;
                int i6 = i4 < i5 ? i5 : i4;
                int i7 = i4 < i5 ? i4 : i5;
                if (i < i7 || i > i6) {
                    if (i < i4) {
                        if (i2 == 1) {
                            qkVar.b = i4 + 1;
                            qkVar.d = i5 + 1;
                        } else if (i2 == 2) {
                            qkVar.b = i4 - 1;
                            qkVar.d = i5 - 1;
                        }
                    }
                } else if (i7 == i4) {
                    if (i2 == 1) {
                        qkVar.d = i5 + 1;
                    } else if (i2 == 2) {
                        qkVar.d = i5 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        qkVar.b = i4 + 1;
                    } else if (i2 == 2) {
                        qkVar.b = i4 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = qkVar.b;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= qkVar.d;
                    } else if (i3 == 2) {
                        i += qkVar.d;
                    }
                } else if (i2 == 1) {
                    qkVar.b = i8 + 1;
                } else if (i2 == 2) {
                    qkVar.b = i8 - 1;
                }
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            qk qkVar2 = (qk) arrayList.get(size2);
            if (qkVar2.a == 8) {
                int i9 = qkVar2.d;
                if (i9 == qkVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    h(qkVar2);
                }
            } else if (qkVar2.d <= 0) {
                arrayList.remove(size2);
                h(qkVar2);
            }
        }
    }

    private final void n(qk qkVar) {
        int i;
        int i2 = qkVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM = m(qkVar.b, i2);
        int i3 = qkVar.b;
        int i4 = qkVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                Objects.toString(qkVar);
                throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(qkVar)));
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < qkVar.d; i6++) {
            int iM2 = m(qkVar.b + (i * i6), qkVar.a);
            int i7 = qkVar.a;
            if (i7 == 2 ? iM2 != iM : !(i7 == 4 && iM2 == iM + 1)) {
                qk qkVarC = c(i7, iM, i5, qkVar.c);
                f(qkVarC, i3);
                h(qkVarC);
                if (qkVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM = iM2;
            } else {
                i5++;
            }
        }
        Object obj = qkVar.c;
        h(qkVar);
        if (i5 > 0) {
            qk qkVarC2 = c(qkVar.a, iM, i5, obj);
            f(qkVarC2, i3);
            h(qkVarC2);
        }
    }

    private final void o(qk qkVar) {
        this.b.add(qkVar);
        int i = qkVar.a;
        if (i == 1) {
            this.e.d(qkVar.b, qkVar.d);
            return;
        }
        if (i == 2) {
            vn vnVar = this.e;
            int i2 = qkVar.b;
            int i3 = qkVar.d;
            RecyclerView recyclerView = vnVar.a;
            recyclerView.U(i2, i3, false);
            recyclerView.O = true;
            return;
        }
        if (i == 4) {
            this.e.c(qkVar.b, qkVar.d, qkVar.c);
        } else if (i == 8) {
            this.e.e(qkVar.b, qkVar.d);
        } else {
            Objects.toString(qkVar);
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(qkVar)));
        }
    }

    private final boolean p(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            qk qkVar = (qk) arrayList.get(i2);
            int i4 = qkVar.a;
            if (i4 == 8) {
                if (b(qkVar.d, i3) == i) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = qkVar.b;
                int i6 = qkVar.d + i5;
                while (i5 < i6) {
                    if (b(i5, i3) == i) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
            i2 = i3;
        }
        return false;
    }

    final int a(int i) {
        return b(i, 0);
    }

    final int b(int i, int i2) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (i2 < size) {
            qk qkVar = (qk) arrayList.get(i2);
            int i3 = qkVar.a;
            if (i3 == 8) {
                int i4 = qkVar.b;
                if (i4 == i) {
                    i = qkVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (qkVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = qkVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = qkVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += qkVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final qk c(int i, int i2, int i3, Object obj) {
        qk qkVar = (qk) this.f.a();
        if (qkVar == null) {
            return new qk(i, i2, i3, obj);
        }
        qkVar.a = i;
        qkVar.b = i2;
        qkVar.d = i3;
        qkVar.c = obj;
        return qkVar;
    }

    public final void d() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.b((qk) arrayList.get(i));
        }
        i(arrayList);
        this.d = 0;
    }

    public final void e() {
        d();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qk qkVar = (qk) arrayList.get(i);
            int i2 = qkVar.a;
            if (i2 == 1) {
                vn vnVar = this.e;
                vnVar.b(qkVar);
                vnVar.d(qkVar.b, qkVar.d);
            } else if (i2 == 2) {
                vn vnVar2 = this.e;
                vnVar2.b(qkVar);
                vnVar2.f(qkVar.b, qkVar.d);
            } else if (i2 == 4) {
                vn vnVar3 = this.e;
                vnVar3.b(qkVar);
                vnVar3.c(qkVar.b, qkVar.d, qkVar.c);
            } else if (i2 == 8) {
                vn vnVar4 = this.e;
                vnVar4.b(qkVar);
                vnVar4.e(qkVar.b, qkVar.d);
            }
        }
        i(arrayList);
        this.d = 0;
    }

    final void f(qk qkVar, int i) {
        vn vnVar = this.e;
        vnVar.b(qkVar);
        int i2 = qkVar.a;
        if (i2 == 2) {
            vnVar.f(i, qkVar.d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            vnVar.c(i, qkVar.d, qkVar.c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql.g():void");
    }

    public final void h(qk qkVar) {
        qkVar.c = null;
        this.f.b(qkVar);
    }

    final void i(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            h((qk) list.get(i));
        }
        list.clear();
    }

    public final void j() {
        i(this.a);
        i(this.b);
        this.d = 0;
    }

    public final boolean k(int i) {
        return (i & this.d) != 0;
    }

    public final boolean l() {
        return this.a.size() > 0;
    }
}
