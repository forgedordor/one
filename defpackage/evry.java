package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evry {
    public static final evry a = new evry(null);
    final evvf b = new evvb();
    public boolean c;
    public boolean d;

    private evry() {
    }

    static int a(evwh evwhVar, int i, Object obj) {
        int iU = evrf.U(i);
        if (evwhVar == evwh.GROUP) {
            evth.f((evuh) obj);
            iU += iU;
        }
        return iU + b(evwhVar, obj);
    }

    static int b(evwh evwhVar, Object obj) {
        evwh evwhVar2 = evwh.DOUBLE;
        evwi evwiVar = evwi.INT;
        switch (evwhVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                boolean z = evrf.e;
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                boolean z2 = evrf.e;
                return 4;
            case INT64:
                return evrf.Y(((Long) obj).longValue());
            case UINT64:
                return evrf.Y(((Long) obj).longValue());
            case INT32:
                return evrf.G(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                boolean z3 = evrf.e;
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                boolean z4 = evrf.e;
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                boolean z5 = evrf.e;
                return 1;
            case STRING:
                return obj instanceof evqs ? evrf.C((evqs) obj) : evrf.T((String) obj);
            case GROUP:
                boolean z6 = evrf.e;
                return ((evuh) obj).getSerializedSize();
            case MESSAGE:
                return obj instanceof evto ? evrf.J((evto) obj) : evrf.L((evuh) obj);
            case BYTES:
                if (obj instanceof evqs) {
                    return evrf.C((evqs) obj);
                }
                boolean z7 = evrf.e;
                return evrf.K(((byte[]) obj).length);
            case UINT32:
                return evrf.W(((Integer) obj).intValue());
            case ENUM:
                return obj instanceof evst ? evrf.G(((evst) obj).a()) : evrf.G(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                boolean z8 = evrf.e;
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                boolean z9 = evrf.e;
                return 8;
            case SINT32:
                return evrf.P(((Integer) obj).intValue());
            case SINT64:
                return evrf.R(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    static void h(evrf evrfVar, evwh evwhVar, int i, Object obj) {
        if (evwhVar == evwh.GROUP) {
            evuh evuhVar = (evuh) obj;
            evth.f(evuhVar);
            evrfVar.u(i, 3);
            evrfVar.ai(evuhVar);
            evrfVar.u(i, 4);
            return;
        }
        evrfVar.u(i, evwhVar.t);
        evwi evwiVar = evwi.INT;
        switch (evwhVar) {
            case DOUBLE:
                evrfVar.af(((Double) obj).doubleValue());
                break;
            case FLOAT:
                evrfVar.ah(((Float) obj).floatValue());
                break;
            case INT64:
                evrfVar.y(((Long) obj).longValue());
                break;
            case UINT64:
                evrfVar.y(((Long) obj).longValue());
                break;
            case INT32:
                evrfVar.n(((Integer) obj).intValue());
                break;
            case FIXED64:
                evrfVar.l(((Long) obj).longValue());
                break;
            case FIXED32:
                evrfVar.j(((Integer) obj).intValue());
                break;
            case BOOL:
                evrfVar.ax(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof evqs)) {
                    evrfVar.t((String) obj);
                    break;
                } else {
                    evrfVar.aA((evqs) obj);
                    break;
                }
            case GROUP:
                evrfVar.ai((evuh) obj);
                break;
            case MESSAGE:
                evrfVar.p((evuh) obj);
                break;
            case BYTES:
                if (!(obj instanceof evqs)) {
                    byte[] bArr = (byte[]) obj;
                    evrfVar.z(bArr, bArr.length);
                    break;
                } else {
                    evrfVar.aA((evqs) obj);
                    break;
                }
            case UINT32:
                evrfVar.w(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof evst)) {
                    evrfVar.n(((Integer) obj).intValue());
                    break;
                } else {
                    evrfVar.n(((evst) obj).a());
                    break;
                }
            case SFIXED32:
                evrfVar.j(((Integer) obj).intValue());
                break;
            case SFIXED64:
                evrfVar.l(((Long) obj).longValue());
                break;
            case SINT32:
                evrfVar.ak(((Integer) obj).intValue());
                break;
            case SINT64:
                evrfVar.am(((Long) obj).longValue());
                break;
        }
    }

    public static int k(evsk evskVar, Object obj) {
        evwh evwhVar = evskVar.c;
        int i = evskVar.b;
        if (!evskVar.d) {
            return a(evwhVar, i, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i2 = 0;
        if (!evskVar.e) {
            int iA = 0;
            while (i2 < size) {
                iA += a(evwhVar, i, list.get(i2));
                i2++;
            }
            return iA;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iB = 0;
        while (i2 < size) {
            iB += b(evwhVar, list.get(i2));
            i2++;
        }
        return evrf.U(i) + iB + evrf.W(iB);
    }

    private static Object p(Object obj) {
        if (obj instanceof evum) {
            return ((evum) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static boolean q(Map.Entry entry) {
        evsk evskVar = (evsk) entry.getKey();
        if (evskVar.a() != evwi.MESSAGE) {
            return true;
        }
        if (!evskVar.d) {
            return r(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!r(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof evui) {
            return ((evui) obj).isInitialized();
        }
        if (obj instanceof evto) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void s(defpackage.evsk r4, java.lang.Object r5) {
        /*
            defpackage.evth.d(r5)
            evwh r0 = defpackage.evwh.DOUBLE
            evwi r0 = defpackage.evwi.INT
            evwh r0 = r4.c
            evwi r0 = r0.s
            int r1 = r0.ordinal()
            switch(r1) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L13;
                default: goto L12;
            }
        L12:
            goto L42
        L13:
            boolean r1 = r5 instanceof defpackage.evuh
            if (r1 != 0) goto L41
            boolean r1 = r5 instanceof defpackage.evto
            if (r1 == 0) goto L42
            goto L41
        L1c:
            boolean r1 = r5 instanceof java.lang.Integer
            if (r1 != 0) goto L41
            boolean r1 = r5 instanceof defpackage.evst
            if (r1 == 0) goto L42
            goto L41
        L25:
            boolean r1 = r5 instanceof defpackage.evqs
            if (r1 != 0) goto L41
            boolean r1 = r5 instanceof byte[]
            if (r1 == 0) goto L42
            goto L41
        L2e:
            boolean r1 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r1 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r1 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r1 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r1 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r1 = r5 instanceof java.lang.Integer
        L3f:
            if (r1 == 0) goto L42
        L41:
            return
        L42:
            int r4 = r4.b
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r0
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evry.s(evsk, java.lang.Object):void");
    }

    public final int c(Map.Entry entry) {
        int iV;
        int iU;
        evsk evskVar = (evsk) entry.getKey();
        Object value = entry.getValue();
        if (evskVar.a() != evwi.MESSAGE || evskVar.d || evskVar.e) {
            return k(evskVar, value);
        }
        if (value instanceof evto) {
            int i = ((evsk) entry.getKey()).b;
            int iU2 = evrf.U(1);
            iV = iU2 + iU2 + evrf.V(2, i);
            iU = evrf.I(3, (evto) value);
        } else {
            int i2 = ((evsk) entry.getKey()).b;
            int iU3 = evrf.U(1);
            iV = iU3 + iU3 + evrf.V(2, i2);
            iU = evrf.U(3) + evrf.L((evuh) value);
        }
        return iV + iU;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final evry clone() {
        evry evryVar = new evry();
        evvf evvfVar = this.b;
        int i = evvfVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            evvc evvcVar = (evvc) evvfVar.d(i2);
            evryVar.n((evsk) evvcVar.a, evvcVar.b);
        }
        for (Map.Entry entry : evvfVar.a()) {
            evryVar.n((evsk) entry.getKey(), entry.getValue());
        }
        evryVar.d = this.d;
        return evryVar;
    }

    public final Iterator e() {
        return i() ? Collections.emptyIterator() : this.d ? new evtn(this.b.entrySet().iterator()) : this.b.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof evry) {
            return this.b.equals(((evry) obj).b);
        }
        return false;
    }

    public final void f() {
        if (this.c) {
            return;
        }
        evvf evvfVar = this.b;
        int i = evvfVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((evvc) evvfVar.d(i2)).b;
            if (obj instanceof evsn) {
                ((evsn) obj).makeImmutable();
            }
        }
        Iterator it = evvfVar.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof evsn) {
                ((evsn) value).makeImmutable();
            }
        }
        if (!evvfVar.d) {
            for (int i3 = 0; i3 < evvfVar.b; i3++) {
                Map.Entry entryD = evvfVar.d(i3);
                evvc evvcVar = (evvc) entryD;
                if (((evsk) evvcVar.a).d) {
                    entryD.setValue(DesugarCollections.unmodifiableList((List) evvcVar.b));
                }
            }
            for (Map.Entry entry : evvfVar.a()) {
                if (((evsk) entry.getKey()).d) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!evvfVar.d) {
            evvfVar.c = evvfVar.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(evvfVar.c);
            evvfVar.e = evvfVar.e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(evvfVar.e);
            evvfVar.d = true;
        }
        this.c = true;
    }

    public final void g(Map.Entry entry) {
        evsk evskVar = (evsk) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof evto;
        if (evskVar.d) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objL = l(evskVar);
            List list = (List) value;
            int size = list.size();
            if (objL == null) {
                objL = new ArrayList(size);
            }
            List list2 = (List) objL;
            for (int i = 0; i < size; i++) {
                list2.add(p(list.get(i)));
            }
            this.b.put(evskVar, objL);
            return;
        }
        if (evskVar.a() != evwi.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.b.put(evskVar, p(value));
            return;
        }
        Object objL2 = l(evskVar);
        if (objL2 == null) {
            this.b.put(evskVar, p(value));
            if (z) {
                this.d = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (objL2 instanceof evum) {
            throw new UnsupportedOperationException();
        }
        this.b.put(evskVar, ((evsf) ((evuh) objL2).toBuilder()).mergeFrom((evsf) ((evuh) value)).build());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    final boolean i() {
        return this.b.isEmpty();
    }

    public final boolean j() {
        evvf evvfVar = this.b;
        int i = evvfVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!q(evvfVar.d(i2))) {
                return false;
            }
        }
        Iterator it = evvfVar.a().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object l(evsk evskVar) {
        Object obj = this.b.get(evskVar);
        if (!(obj instanceof evto)) {
            return obj;
        }
        throw null;
    }

    public final void m(evsk evskVar, Object obj) {
        List arrayList;
        if (!evskVar.d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        s(evskVar, obj);
        Object objL = l(evskVar);
        if (objL == null) {
            arrayList = new ArrayList();
            this.b.put(evskVar, arrayList);
        } else {
            arrayList = (List) objL;
        }
        arrayList.add(obj);
    }

    public final void n(evsk evskVar, Object obj) {
        if (!evskVar.d) {
            s(evskVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                s(evskVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof evto) {
            this.d = true;
        }
        this.b.put(evskVar, obj);
    }

    public final boolean o(evsk evskVar) {
        if (evskVar.d) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.b.get(evskVar) != null;
    }

    private evry(byte[] bArr) {
        f();
        f();
    }
}
