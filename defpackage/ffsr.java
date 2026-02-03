package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsr implements Serializable {
    private static final long serialVersionUID = 1;
    public int a;
    public transient int b;
    private transient ffte c;
    private final int d;
    private final List e;
    private int f;
    private fftr g;
    private List h;
    private Map i;
    private Stack j;
    private Map k;
    private boolean l;

    public ffsr(ffsr ffsrVar) {
        this.c = new ffte(ffsrVar.c.a);
        this.d = ffsrVar.d;
        this.f = ffsrVar.f;
        this.g = ffsrVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(ffsrVar.h);
        this.i = new TreeMap();
        for (Integer num : ffsrVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) ffsrVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(ffsrVar.j);
        this.e = new ArrayList();
        Iterator it = ffsrVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((ffst) it.next()).clone());
        }
        this.k = new TreeMap(ffsrVar.k);
        this.a = ffsrVar.a;
        this.b = ffsrVar.b;
        this.l = ffsrVar.l;
    }

    private final void a(byte[] bArr, byte[] bArr2, fftd fftdVar) {
        ffta fftaVar = new ffta();
        int i = fftdVar.d;
        fftaVar.e = i;
        long j = fftdVar.e;
        fftaVar.f = j;
        fftb fftbVar = new fftb(fftaVar);
        ffsx ffsxVar = new ffsx();
        ffsxVar.e = i;
        ffsxVar.f = j;
        ffsy ffsyVar = new ffsy(ffsxVar);
        int i2 = 0;
        while (true) {
            int i3 = this.d;
            if (i2 >= (1 << i3)) {
                this.g = (fftr) this.j.pop();
                return;
            }
            fftc fftcVar = new fftc();
            fftcVar.e = fftdVar.d;
            fftcVar.f = fftdVar.e;
            fftcVar.a = i2;
            fftcVar.b = fftdVar.b;
            fftcVar.c = fftdVar.c;
            fftcVar.g = fftdVar.f;
            fftdVar = new fftd(fftcVar);
            ffte ffteVar = this.c;
            ffteVar.b(ffteVar.c(bArr2, fftdVar), bArr);
            ffth ffthVarA = this.c.a(fftdVar);
            ffta fftaVar2 = new ffta();
            fftaVar2.e = fftbVar.d;
            fftaVar2.f = fftbVar.e;
            fftaVar2.a = i2;
            fftaVar2.b = fftbVar.b;
            fftaVar2.c = fftbVar.c;
            fftaVar2.g = fftbVar.f;
            fftbVar = new fftb(fftaVar2);
            fftr fftrVarA = ffts.a(this.c, ffthVarA, fftbVar);
            ffsx ffsxVar2 = new ffsx();
            ffsxVar2.e = ffsyVar.d;
            ffsxVar2.f = ffsyVar.e;
            ffsxVar2.b = i2;
            ffsxVar2.g = ffsyVar.f;
            ffsyVar = new ffsy(ffsxVar2);
            while (!this.j.isEmpty()) {
                int i4 = ((fftr) this.j.peek()).a;
                int i5 = fftrVarA.a;
                if (i4 == i5) {
                    int i6 = i2 / (1 << i5);
                    if (i6 == 1) {
                        this.h.add(fftrVarA);
                        i6 = 1;
                    }
                    if (i6 == 3) {
                        if (i5 < i3 - this.f) {
                            ffst ffstVar = (ffst) this.e.get(i5);
                            ffstVar.a = fftrVarA;
                            ffstVar.c = i5;
                            if (i5 == ffstVar.b) {
                                ffstVar.f = true;
                            }
                        }
                        i6 = 3;
                    }
                    if (i6 >= 3 && (i6 & 1) == 1 && i5 >= i3 - this.f && i5 <= i3 - 2) {
                        Map map = this.i;
                        Integer numValueOf = Integer.valueOf(i5);
                        if (map.get(numValueOf) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(fftrVarA);
                            this.i.put(numValueOf, linkedList);
                        } else {
                            ((LinkedList) this.i.get(numValueOf)).add(fftrVarA);
                        }
                    }
                    ffsx ffsxVar3 = new ffsx();
                    ffsxVar3.e = ffsyVar.d;
                    ffsxVar3.f = ffsyVar.e;
                    ffsxVar3.a = ffsyVar.a;
                    ffsxVar3.b = (ffsyVar.b - 1) / 2;
                    ffsxVar3.g = ffsyVar.f;
                    ffsy ffsyVar2 = new ffsy(ffsxVar3);
                    fftr fftrVarB = ffts.b(this.c, (fftr) this.j.pop(), fftrVarA, ffsyVar2);
                    fftr fftrVar = new fftr(fftrVarB.a + 1, fftrVarB.a());
                    ffsx ffsxVar4 = new ffsx();
                    ffsxVar4.e = ffsyVar2.d;
                    ffsxVar4.f = ffsyVar2.e;
                    ffsxVar4.a = ffsyVar2.a + 1;
                    ffsxVar4.b = ffsyVar2.b;
                    ffsxVar4.g = ffsyVar2.f;
                    ffsyVar = new ffsy(ffsxVar4);
                    fftrVarA = fftrVar;
                }
            }
            this.j.push(fftrVarA);
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b(byte[] bArr, byte[] bArr2, fftd fftdVar) {
        int i;
        int i2;
        fftd fftdVar2 = fftdVar;
        if (this.l) {
            throw new IllegalStateException("index already used");
        }
        int i3 = this.a;
        if (i3 > this.b - 1) {
            throw new IllegalStateException("index out of bounds");
        }
        int i4 = this.d;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= i4) {
                i6 = 0;
                break;
            } else if (((i3 >> i6) & 1) == 0) {
                break;
            } else {
                i6++;
            }
        }
        if (((this.a >> (i6 + 1)) & 1) == 0 && i6 < i4 - 1) {
            this.k.put(Integer.valueOf(i6), (fftr) this.h.get(i6));
        }
        ffta fftaVar = new ffta();
        int i7 = fftdVar2.d;
        fftaVar.e = i7;
        long j = fftdVar2.e;
        fftaVar.f = j;
        fftb fftbVar = new fftb(fftaVar);
        ffsx ffsxVar = new ffsx();
        ffsxVar.e = i7;
        ffsxVar.f = j;
        ffsy ffsyVar = new ffsy(ffsxVar);
        ffst ffstVar = null;
        if (i6 == 0) {
            fftc fftcVar = new fftc();
            fftcVar.e = i7;
            fftcVar.f = j;
            fftcVar.a = this.a;
            fftcVar.b = fftdVar2.b;
            fftcVar.c = fftdVar2.c;
            fftcVar.g = fftdVar2.f;
            fftdVar2 = new fftd(fftcVar);
            ffte ffteVar = this.c;
            ffteVar.b(ffteVar.c(bArr2, fftdVar2), bArr);
            ffth ffthVarA = this.c.a(fftdVar2);
            ffta fftaVar2 = new ffta();
            fftaVar2.e = fftbVar.d;
            fftaVar2.f = fftbVar.e;
            fftaVar2.a = this.a;
            fftaVar2.b = fftbVar.b;
            fftaVar2.c = fftbVar.c;
            fftaVar2.g = fftbVar.f;
            this.h.set(0, ffts.a(this.c, ffthVarA, new fftb(fftaVar2)));
        } else {
            ffsx ffsxVar2 = new ffsx();
            ffsxVar2.e = ffsyVar.d;
            ffsxVar2.f = ffsyVar.e;
            int i8 = i6 - 1;
            ffsxVar2.a = i8;
            ffsxVar2.b = this.a >> i6;
            ffsxVar2.g = ffsyVar.f;
            ffsy ffsyVar2 = new ffsy(ffsxVar2);
            ffte ffteVar2 = this.c;
            ffteVar2.b(ffteVar2.c(bArr2, fftdVar2), bArr);
            ffte ffteVar3 = this.c;
            fftr fftrVar = (fftr) this.h.get(i8);
            Map map = this.k;
            Integer numValueOf = Integer.valueOf(i8);
            fftr fftrVarB = ffts.b(ffteVar3, fftrVar, (fftr) map.get(numValueOf), ffsyVar2);
            this.h.set(i6, new fftr(fftrVarB.a + 1, fftrVarB.a()));
            this.k.remove(numValueOf);
            for (int i9 = 0; i9 < i6; i9++) {
                if (i9 < i4 - this.f) {
                    this.h.set(i9, ((ffst) this.e.get(i9)).a);
                } else {
                    this.h.set(i9, (fftr) ((LinkedList) this.i.get(Integer.valueOf(i9))).removeFirst());
                }
            }
            int iMin = Math.min(i6, i4 - this.f);
            for (int i10 = 0; i10 < iMin; i10++) {
                int i11 = 1 << i4;
                int i12 = this.a + 1 + ((1 << i10) * 3);
                if (i12 < i11) {
                    ffst ffstVar2 = (ffst) this.e.get(i10);
                    ffstVar2.a = null;
                    ffstVar2.c = ffstVar2.b;
                    ffstVar2.d = i12;
                    ffstVar2.e = true;
                    ffstVar2.f = false;
                }
            }
        }
        for (i = 1; i5 < ((i4 - this.f) >> i); i = 1) {
            ffst ffstVar3 = ffstVar;
            for (ffst ffstVar4 : this.e) {
                if (!ffstVar4.f && ffstVar4.e && (ffstVar3 == null || ffstVar4.a() < ffstVar3.a() || (ffstVar4.a() == ffstVar3.a() && ffstVar4.d < ffstVar3.d))) {
                    ffstVar3 = ffstVar4;
                }
            }
            if (ffstVar3 != null) {
                Stack stack = this.j;
                ffte ffteVar4 = this.c;
                if (ffstVar3.f || !ffstVar3.e) {
                    throw new IllegalStateException("finished or not initialized");
                }
                fftc fftcVar2 = new fftc();
                fftcVar2.e = fftdVar2.d;
                fftcVar2.f = fftdVar2.e;
                int i13 = ffstVar3.d;
                fftcVar2.a = i13;
                fftcVar2.b = fftdVar2.b;
                fftcVar2.c = fftdVar2.c;
                fftcVar2.g = fftdVar2.f;
                fftd fftdVar3 = new fftd(fftcVar2);
                ffta fftaVar3 = new ffta();
                int i14 = fftdVar3.d;
                fftaVar3.e = i14;
                i2 = i4;
                long j2 = fftdVar3.e;
                fftaVar3.f = j2;
                fftaVar3.a = i13;
                boolean z = i;
                fftb fftbVar2 = new fftb(fftaVar3);
                ffsx ffsxVar3 = new ffsx();
                ffsxVar3.e = i14;
                ffsxVar3.f = j2;
                ffsxVar3.b = i13;
                ffsy ffsyVar3 = new ffsy(ffsxVar3);
                ffteVar4.b(ffteVar4.c(bArr2, fftdVar3), bArr);
                fftr fftrVarA = ffts.a(ffteVar4, ffteVar4.a(fftdVar3), fftbVar2);
                while (!stack.isEmpty() && ((fftr) stack.peek()).a == fftrVarA.a && ((fftr) stack.peek()).a != ffstVar3.b) {
                    ffsx ffsxVar4 = new ffsx();
                    ffsxVar4.e = ffsyVar3.d;
                    ffsxVar4.f = ffsyVar3.e;
                    ffsxVar4.a = ffsyVar3.a;
                    ffsxVar4.b = (ffsyVar3.b - 1) / 2;
                    ffsxVar4.g = ffsyVar3.f;
                    ffsy ffsyVar4 = new ffsy(ffsxVar4);
                    fftr fftrVarB2 = ffts.b(ffteVar4, (fftr) stack.pop(), fftrVarA, ffsyVar4);
                    fftr fftrVar2 = new fftr(fftrVarB2.a + 1, fftrVarB2.a());
                    ffsx ffsxVar5 = new ffsx();
                    ffsxVar5.e = ffsyVar4.d;
                    ffsxVar5.f = ffsyVar4.e;
                    ffsxVar5.a = ffsyVar4.a + 1;
                    ffsxVar5.b = ffsyVar4.b;
                    ffsxVar5.g = ffsyVar4.f;
                    ffsyVar3 = new ffsy(ffsxVar5);
                    fftrVarA = fftrVar2;
                }
                fftr fftrVar3 = ffstVar3.a;
                if (fftrVar3 == null) {
                    ffstVar3.a = fftrVarA;
                } else {
                    if (fftrVar3.a == fftrVarA.a) {
                        ffsx ffsxVar6 = new ffsx();
                        ffsxVar6.e = ffsyVar3.d;
                        ffsxVar6.f = ffsyVar3.e;
                        ffsxVar6.a = ffsyVar3.a;
                        ffsxVar6.b = (ffsyVar3.b - 1) / 2;
                        ffsxVar6.g = ffsyVar3.f;
                        ffsy ffsyVar5 = new ffsy(ffsxVar6);
                        fftr fftrVar4 = new fftr(ffstVar3.a.a + 1, ffts.b(ffteVar4, fftrVar3, fftrVarA, ffsyVar5).a());
                        ffstVar3.a = fftrVar4;
                        ffsx ffsxVar7 = new ffsx();
                        ffsxVar7.e = ffsyVar5.d;
                        ffsxVar7.f = ffsyVar5.e;
                        ffsxVar7.a = ffsyVar5.a + 1;
                        ffsxVar7.b = ffsyVar5.b;
                        ffsxVar7.g = ffsyVar5.f;
                        fftrVarA = fftrVar4;
                    } else {
                        stack.push(fftrVarA);
                    }
                }
                if (ffstVar3.a.a == ffstVar3.b) {
                    ffstVar3.f = z;
                } else {
                    ffstVar3.c = fftrVarA.a;
                    ffstVar3.d += z ? 1 : 0;
                }
            } else {
                i2 = i4;
            }
            i5++;
            i4 = i2;
            ffstVar = null;
        }
        this.a++;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i;
        objectInputStream.defaultReadObject();
        if (objectInputStream.available() != 0) {
            i = objectInputStream.readInt();
            this.b = i;
        } else {
            i = (1 << this.d) - 1;
            this.b = i;
        }
        if (i > (1 << this.d) - 1 || this.a > i + 1 || objectInputStream.available() != 0) {
            throw new IOException("inconsistent BDS data detected");
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.b);
    }

    public ffsr(ffsr ffsrVar, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.c = new ffte(new fftg(aSN1ObjectIdentifier));
        this.d = ffsrVar.d;
        this.f = ffsrVar.f;
        this.g = ffsrVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(ffsrVar.h);
        this.i = new TreeMap();
        for (Integer num : ffsrVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) ffsrVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(ffsrVar.j);
        this.e = new ArrayList();
        Iterator it = ffsrVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((ffst) it.next()).clone());
        }
        this.k = new TreeMap(ffsrVar.k);
        int i = ffsrVar.a;
        this.a = i;
        this.b = ffsrVar.b;
        this.l = ffsrVar.l;
        if (this.h != null) {
            if (this.i != null) {
                if (this.j != null) {
                    if (!ffua.f(this.d, i)) {
                        throw new IllegalStateException("index in BDS state out of bounds");
                    }
                    return;
                }
                throw new IllegalStateException("stack == null");
            }
            throw new IllegalStateException("retain == null");
        }
        throw new IllegalStateException("authenticationPath == null");
    }

    public ffsr(ffsr ffsrVar, byte[] bArr, byte[] bArr2, fftd fftdVar) {
        this.c = new ffte(ffsrVar.c.a);
        this.d = ffsrVar.d;
        this.f = ffsrVar.f;
        this.g = ffsrVar.g;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        arrayList.addAll(ffsrVar.h);
        this.i = new TreeMap();
        for (Integer num : ffsrVar.i.keySet()) {
            this.i.put(num, (LinkedList) ((LinkedList) ffsrVar.i.get(num)).clone());
        }
        Stack stack = new Stack();
        this.j = stack;
        stack.addAll(ffsrVar.j);
        this.e = new ArrayList();
        Iterator it = ffsrVar.e.iterator();
        while (it.hasNext()) {
            this.e.add(((ffst) it.next()).clone());
        }
        this.k = new TreeMap(ffsrVar.k);
        this.a = ffsrVar.a;
        this.b = ffsrVar.b;
        this.l = false;
        b(bArr, bArr2, fftdVar);
    }

    private ffsr(ffte ffteVar, int i, int i2, int i3) {
        this.c = ffteVar;
        this.d = i;
        this.b = i3;
        this.f = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.h = new ArrayList();
                this.i = new TreeMap();
                this.j = new Stack();
                this.e = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.e.add(new ffst(i5));
                }
                this.k = new TreeMap();
                this.a = 0;
                this.l = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public ffsr(fftu fftuVar, int i, int i2) {
        this(fftuVar.a(), fftuVar.c, fftuVar.d, i2);
        this.b = i;
        this.a = i2;
        this.l = true;
    }

    public ffsr(fftu fftuVar, byte[] bArr, byte[] bArr2, fftd fftdVar) {
        this(fftuVar.a(), fftuVar.c, fftuVar.d, (1 << r1) - 1);
        a(bArr, bArr2, fftdVar);
    }

    public ffsr(fftu fftuVar, byte[] bArr, byte[] bArr2, fftd fftdVar, int i) {
        this(fftuVar.a(), fftuVar.c, fftuVar.d, (1 << r1) - 1);
        a(bArr, bArr2, fftdVar);
        while (this.a < i) {
            b(bArr, bArr2, fftdVar);
            this.l = false;
        }
    }
}
