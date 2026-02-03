package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyi implements Cloneable {
    private static final fgzh[] c = new fgzh[0];
    private static final fgze[] d = new fgze[0];
    public fgxq a;
    public List[] b;
    private int e;

    public fgyi(fgxq fgxqVar) {
        this.b = new List[4];
        this.a = fgxqVar;
    }

    public final int a() {
        int iD = this.a.d();
        fgyx fgyxVarB = b();
        return fgyxVarB != null ? iD + (fgyxVarB.f() << 4) : iD;
    }

    public final fgyx b() {
        for (fgzh fgzhVar : f(3)) {
            if (fgzhVar instanceof fgyx) {
                return (fgyx) fgzhVar;
            }
        }
        return null;
    }

    public final fgzh c() {
        List list = this.b[0];
        if (list == null || list.size() == 0) {
            return null;
        }
        return (fgzh) list.get(0);
    }

    public final Object clone() {
        fgyi fgyiVar = new fgyi();
        int i = 0;
        while (true) {
            List[] listArr = this.b;
            int length = listArr.length;
            if (i >= 4) {
                fgyiVar.a = (fgxq) this.a.clone();
                fgyiVar.e = this.e;
                return fgyiVar;
            }
            List list = listArr[i];
            if (list != null) {
                fgyiVar.b[i] = new LinkedList(list);
            }
            i++;
        }
    }

    public final void d(fgzh fgzhVar, int i) {
        List[] listArr = this.b;
        if (listArr[i] == null) {
            listArr[i] = new LinkedList();
        }
        int[] iArr = this.a.b;
        int i2 = iArr[i];
        if (i2 == 65535) {
            throw new IllegalStateException("DNS section count cannot be incremented");
        }
        iArr[i] = i2 + 1;
        this.b[i].add(fgzhVar);
    }

    public final fgze[] e(int i) {
        if (this.b[i] == null) {
            return d;
        }
        LinkedList linkedList = new LinkedList();
        fgzh[] fgzhVarArrF = f(i);
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < fgzhVarArrF.length; i2++) {
            fgyu fgyuVar = fgzhVarArrF[i2].f;
            if (hashSet.contains(fgyuVar)) {
                int size = linkedList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    fgze fgzeVar = (fgze) linkedList.get(size);
                    if (fgzeVar.c() == fgzhVarArrF[i2].g() && fgzeVar.d() == fgzhVarArrF[i2].h && fgzeVar.g().equals(fgyuVar)) {
                        fgzeVar.i(fgzhVarArrF[i2]);
                        break;
                    }
                }
            } else {
                linkedList.add(new fgze(fgzhVarArrF[i2]));
                hashSet.add(fgyuVar);
            }
        }
        return (fgze[]) linkedList.toArray(new fgze[linkedList.size()]);
    }

    public final fgzh[] f(int i) {
        List list = this.b[i];
        return list == null ? c : (fgzh[]) list.toArray(new fgzh[list.size()]);
    }

    public final byte[] g() {
        byte[] bArrH;
        int i;
        int i2;
        int i3;
        fgxe fgxeVar = new fgxe();
        fgyx fgyxVarB = b();
        int length = 65535;
        fgzh fgzhVar = null;
        int i4 = 3;
        if (fgyxVarB != null) {
            fgxe fgxeVar2 = new fgxe();
            fgyxVarB.n(fgxeVar2, 3, null);
            bArrH = fgxeVar2.h();
            length = 65535 - bArrH.length;
        } else {
            bArrH = null;
        }
        int i5 = fgxeVar.a;
        fgxq fgxqVar = this.a;
        fgxeVar.d(fgxqVar.b());
        fgxeVar.d(fgxqVar.a);
        int i6 = 0;
        while (true) {
            int[] iArr = fgxqVar.b;
            int length2 = iArr.length;
            i = 4;
            if (i6 >= 4) {
                break;
            }
            fgxeVar.d(iArr[i6]);
            i6++;
        }
        fgww fgwwVar = new fgww();
        int iH = this.a.a;
        int i7 = 0;
        int iA = 0;
        while (true) {
            if (i7 >= i) {
                i2 = i5;
                break;
            }
            List list = this.b[i7];
            if (list != null) {
                int size = list.size();
                int i8 = fgxeVar.a;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i9 >= size) {
                        i2 = i5;
                        break;
                    }
                    fgzh fgzhVar2 = (fgzh) this.b[i7].get(i9);
                    if (i7 == i4) {
                        if (fgzhVar2 instanceof fgyx) {
                            i10++;
                            i2 = i5;
                        }
                        i9++;
                        i5 = i2;
                        i4 = 3;
                    } else {
                        i4 = i7;
                    }
                    int i12 = i4;
                    i2 = i5;
                    if (fgzhVar != null) {
                        i3 = i12;
                        if (fgzhVar2.g() != fgzhVar.g() || fgzhVar2.h != fgzhVar.h || !fgzhVar2.f.equals(fgzhVar.f)) {
                            i8 = fgxeVar.a;
                            i11 = i9;
                        }
                    } else {
                        i3 = i12;
                    }
                    fgzhVar2.n(fgxeVar, i4, fgwwVar);
                    int i13 = fgxeVar.a;
                    if (i13 <= length) {
                        fgzhVar = fgzhVar2;
                        i9++;
                        i5 = i2;
                        i4 = 3;
                    } else {
                        if (i8 > i13) {
                            throw new IllegalArgumentException("cannot jump past end of data");
                        }
                        fgxeVar.a = i8;
                        i10 = (size - i11) + i10;
                        i7 = i3;
                    }
                }
                if (i10 != 0 && i7 != 3) {
                    iH = fgxq.h(iH, 6);
                    int i14 = i2 + 4;
                    fgxeVar.e(this.a.a(i7) - i10, i7 + i7 + i14);
                    for (int i15 = i7 + 1; i15 < 3; i15++) {
                        fgxeVar.e(0, i15 + i15 + i14);
                    }
                } else if (i7 == 3) {
                    iA = this.a.a(3) - i10;
                }
            } else {
                i2 = i5;
            }
            i7++;
            i5 = i2;
            fgzhVar = null;
            i4 = 3;
            i = 4;
        }
        if (bArrH != null) {
            fgxeVar.a(bArrH);
            iA++;
        }
        if (iH != this.a.a) {
            fgxeVar.e(iH, i2 + 2);
        }
        if (iA != this.a.a(3)) {
            fgxeVar.e(iA, i2 + 10);
        }
        this.e = fgxeVar.a;
        return fgxeVar.h();
    }

    public final String toString() {
        String string;
        StringBuffer stringBuffer = new StringBuffer();
        if (b() != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(this.a.e(a()));
            stringBuffer2.append("\n");
            stringBuffer.append(stringBuffer2.toString());
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(this.a);
            stringBuffer3.append("\n");
            stringBuffer.append(stringBuffer3.toString());
        }
        for (int i = 0; i < 4; i++) {
            if (this.a.c() != 5) {
                StringBuffer stringBuffer4 = new StringBuffer(";; ");
                fgzs.a.a(i);
                stringBuffer4.append(fgzs.b[i]);
                stringBuffer4.append(":\n");
                stringBuffer.append(stringBuffer4.toString());
            } else {
                StringBuffer stringBuffer5 = new StringBuffer(";; ");
                fgzs.a.a(i);
                stringBuffer5.append(fgzs.c[i]);
                stringBuffer5.append(":\n");
                stringBuffer.append(stringBuffer5.toString());
            }
            StringBuffer stringBuffer6 = new StringBuffer();
            if (i > 3) {
                string = null;
            } else {
                StringBuffer stringBuffer7 = new StringBuffer();
                for (fgzh fgzhVar : f(i)) {
                    if (i == 0) {
                        StringBuffer stringBuffer8 = new StringBuffer(";;\t");
                        stringBuffer8.append(fgzhVar.f);
                        stringBuffer7.append(stringBuffer8.toString());
                        StringBuffer stringBuffer9 = new StringBuffer(", type = ");
                        stringBuffer9.append(fhag.a(fgzhVar.g));
                        stringBuffer7.append(stringBuffer9.toString());
                        StringBuffer stringBuffer10 = new StringBuffer(", class = ");
                        stringBuffer10.append(fgwy.a(fgzhVar.h));
                        stringBuffer7.append(stringBuffer10.toString());
                    } else {
                        stringBuffer7.append(fgzhVar);
                    }
                    stringBuffer7.append("\n");
                }
                string = stringBuffer7.toString();
            }
            stringBuffer6.append(string);
            stringBuffer6.append("\n");
            stringBuffer.append(stringBuffer6.toString());
        }
        StringBuffer stringBuffer11 = new StringBuffer(";; Message size: ");
        stringBuffer11.append(this.e);
        stringBuffer11.append(" bytes");
        stringBuffer.append(stringBuffer11.toString());
        return stringBuffer.toString();
    }

    public fgyi() {
        this(new fgxq());
    }

    public fgyi(byte[] bArr) throws fhao {
        fgzh fgzhVarK;
        int i;
        fgxc fgxcVar = new fgxc(bArr);
        this(new fgxq(fgxcVar));
        int iC = this.a.c();
        boolean zG = this.a.g(6);
        for (int i2 = 0; i2 < 4; i2++) {
            try {
                int iA = this.a.a(i2);
                if (iA > 0) {
                    this.b[i2] = new ArrayList(iA);
                }
                for (int i3 = 0; i3 < iA; i3++) {
                    fgxcVar.a();
                    int i4 = fgzh.j;
                    fgyu fgyuVar = new fgyu(fgxcVar);
                    int iB = fgxcVar.b();
                    int iB2 = fgxcVar.b();
                    if (i2 == 0) {
                        fgzhVarK = fgzh.l(fgyuVar, iB, iB2);
                    } else {
                        long jE = fgxcVar.e();
                        int iB3 = fgxcVar.b();
                        if (iB3 == 0) {
                            if (iC == 5) {
                                if (i2 != 1) {
                                    i = 2;
                                    if (i2 == 2) {
                                    }
                                } else {
                                    i = i2;
                                }
                                fgzhVarK = fgzh.m(fgyuVar, iB, iB2, jE);
                                this.b[i].add(fgzhVarK);
                                if (i != 3 && fgzhVarK.g == 24) {
                                }
                            }
                            iB3 = 0;
                        }
                        fgzhVarK = fgzh.k(fgyuVar, iB, iB2, jE, true);
                        if (fgxcVar.d() >= iB3) {
                            fgxcVar.g(iB3);
                            fgzhVarK.c(fgxcVar);
                            if (fgxcVar.d() <= 0) {
                                ByteBuffer byteBuffer = fgxcVar.a;
                                byteBuffer.limit(byteBuffer.capacity());
                            } else {
                                throw new fhao("invalid record length");
                            }
                        } else {
                            throw new fhao("truncated record");
                        }
                    }
                    i = i2;
                    this.b[i].add(fgzhVarK);
                    if (i != 3) {
                    }
                }
            } catch (fhao e) {
                if (!zG) {
                    throw e;
                }
            }
        }
        this.e = fgxcVar.a();
    }
}
