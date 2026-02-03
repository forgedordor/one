package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iao {
    public final fdap a;
    public boolean c;
    public ian f;
    private hze j;
    public final AtomicReference b = new AtomicReference(null);
    private final fdat g = new fdat() { // from class: iaj
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            final iao iaoVar;
            AtomicReference atomicReference;
            Object obj3;
            Object objAh;
            Set set = (Set) obj;
            do {
                iaoVar = this.a;
                atomicReference = iaoVar.b;
                obj3 = atomicReference.get();
                if (obj3 == null) {
                    objAh = set;
                } else if (obj3 instanceof Set) {
                    objAh = fcva.g(obj3, set);
                } else {
                    if (!(obj3 instanceof List)) {
                        iao.g();
                        throw new fcta();
                    }
                    objAh = fcva.ah((Collection) obj3, fcva.b(set));
                }
            } while (!iah.a(atomicReference, obj3, objAh));
            if (iaoVar.f()) {
                iaoVar.a.invoke(new fdae() { // from class: iai
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        iao iaoVar2;
                        int i;
                        Object[] objArr;
                        int i2;
                        do {
                            iaoVar2 = iaoVar;
                            synchronized (iaoVar2.e) {
                                if (!iaoVar2.c) {
                                    iaoVar2.c = true;
                                    try {
                                        hum humVar = iaoVar2.d;
                                        Object[] objArr2 = humVar.a;
                                        int i3 = humVar.b;
                                        int i4 = 0;
                                        while (i4 < i3) {
                                            ian ianVar = (ian) objArr2[i4];
                                            cva cvaVar = ianVar.g;
                                            fdap fdapVar = ianVar.a;
                                            Object[] objArr3 = cvaVar.b;
                                            long[] jArr = cvaVar.a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i5 = 0;
                                                while (true) {
                                                    long j = jArr[i5];
                                                    objArr = objArr2;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i6 = i5 - length;
                                                        int i7 = 0;
                                                        while (true) {
                                                            i = i3;
                                                            i2 = 8 - ((~i6) >>> 31);
                                                            if (i7 >= i2) {
                                                                break;
                                                            }
                                                            if ((j & 255) < 128) {
                                                                fdapVar.invoke(objArr3[(i5 << 3) + i7]);
                                                            }
                                                            j >>= 8;
                                                            i7++;
                                                            i3 = i;
                                                        }
                                                        if (i2 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        i = i3;
                                                    }
                                                    if (i5 == length) {
                                                        break;
                                                    }
                                                    i5++;
                                                    objArr2 = objArr;
                                                    i3 = i;
                                                }
                                            } else {
                                                i = i3;
                                                objArr = objArr2;
                                            }
                                            cvaVar.a();
                                            i4++;
                                            objArr2 = objArr;
                                            i3 = i;
                                        }
                                        iaoVar2.c = false;
                                    } finally {
                                    }
                                }
                            }
                        } while (iaoVar2.f());
                        return fctx.a;
                    }
                });
            }
            return fctx.a;
        }
    };
    private final fdap h = new fdap() { // from class: iak
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            iao iaoVar = this.a;
            synchronized (iaoVar.e) {
                ian ianVar = iaoVar.f;
                ianVar.getClass();
                Object obj2 = ianVar.b;
                obj2.getClass();
                int i = ianVar.d;
                cuq cuqVar = ianVar.c;
                if (cuqVar == null) {
                    cuqVar = new cuq((byte[]) null);
                    ianVar.c = cuqVar;
                    ianVar.f.e(obj2, cuqVar);
                }
                ianVar.a(obj, i, obj2, cuqVar);
            }
            return fctx.a;
        }
    };
    public final hum d = new hum(new ian[16]);
    public final Object e = new Object();
    private long i = -1;

    public iao(fdap fdapVar) {
        this.a = fdapVar;
    }

    public static final void g() {
        hmz.h("Unexpected notification");
        throw new fcta();
    }

    public final void a() {
        synchronized (this.e) {
            hum humVar = this.d;
            Object[] objArr = humVar.a;
            int i = humVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ian ianVar = (ian) objArr[i2];
                ianVar.e.d();
                ianVar.f.d();
                ianVar.k.d();
                ianVar.l.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            java.lang.Object r2 = r1.e
            monitor-enter(r2)
            hum r3 = r1.d     // Catch: java.lang.Throwable -> L9e
            int r4 = r3.b     // Catch: java.lang.Throwable -> L9e
            r6 = 0
            r7 = 0
        Ld:
            if (r6 >= r4) goto L92
            java.lang.Object[] r8 = r3.a     // Catch: java.lang.Throwable -> L9e
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L9e
            ian r8 = (defpackage.ian) r8     // Catch: java.lang.Throwable -> L9e
            cuz r9 = r8.f     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r9 = r9.b(r0)     // Catch: java.lang.Throwable -> L9e
            cuq r9 = (defpackage.cuq) r9     // Catch: java.lang.Throwable -> L9e
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L79
        L22:
            java.lang.Object[] r10 = r9.b     // Catch: java.lang.Throwable -> L9e
            int[] r11 = r9.c     // Catch: java.lang.Throwable -> L9e
            long[] r9 = r9.a     // Catch: java.lang.Throwable -> L9e
            int r12 = r9.length     // Catch: java.lang.Throwable -> L9e
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L9e
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L9e
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L70
            int r5 = r13 - r12
            r6 = 0
        L46:
            int r1 = ~r5     // Catch: java.lang.Throwable -> L9e
            int r1 = r1 >>> 31
            r17 = r1
            r18 = 8
            int r1 = 8 - r17
            if (r6 >= r1) goto L6c
            r19 = 255(0xff, double:1.26E-321)
            long r19 = r14 & r19
            r21 = 128(0x80, double:6.32E-322)
            int r1 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r1 >= 0) goto L67
            int r1 = r13 << 3
            int r1 = r1 + r6
            r17 = r1
            r1 = r10[r17]     // Catch: java.lang.Throwable -> L9e
            r17 = r11[r17]     // Catch: java.lang.Throwable -> L9e
            r8.b(r0, r1)     // Catch: java.lang.Throwable -> L9e
        L67:
            long r14 = r14 >> r18
            int r6 = r6 + 1
            goto L46
        L6c:
            r6 = r18
            if (r1 != r6) goto L79
        L70:
            if (r13 == r12) goto L79
            int r13 = r13 + 1
            r1 = r23
            r6 = r16
            goto L2e
        L79:
            boolean r1 = r8.c()     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L82
            int r7 = r7 + 1
            goto L8c
        L82:
            if (r7 <= 0) goto L8c
            java.lang.Object[] r1 = r3.a     // Catch: java.lang.Throwable -> L9e
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L9e
            r1[r6] = r5     // Catch: java.lang.Throwable -> L9e
        L8c:
            int r6 = r16 + 1
            r1 = r23
            goto Ld
        L92:
            java.lang.Object[] r0 = r3.a     // Catch: java.lang.Throwable -> L9e
            int r1 = r4 - r7
            r5 = 0
            defpackage.fcur.d(r0, r5, r1, r4)     // Catch: java.lang.Throwable -> L9e
            r3.b = r1     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r2)
            return
        L9e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iao.b(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r23, defpackage.fdap r24, defpackage.fdae r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iao.c(java.lang.Object, fdap, fdae):void");
    }

    public final void d() {
        this.j = hzf.i(this.g);
    }

    public final void e() {
        hze hzeVar = this.j;
        if (hzeVar != null) {
            hzeVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0288 A[PHI: r25
      0x0288: PHI (r25v48 int) = (r25v47 int), (r25v49 int) binds: [B:120:0x025f, B:128:0x0286] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ae A[Catch: all -> 0x06c8, TryCatch #2 {all -> 0x06c8, blocks: (B:45:0x00b7, B:47:0x00bd, B:159:0x0317, B:51:0x00cd, B:53:0x00d3, B:55:0x00d9, B:57:0x00dd, B:60:0x00f2, B:62:0x0102, B:64:0x010d, B:66:0x0113, B:68:0x012e, B:69:0x0130, B:71:0x0140, B:73:0x0146, B:75:0x014a, B:78:0x015b, B:80:0x016b, B:82:0x0176, B:84:0x017c, B:86:0x018c, B:99:0x01d4, B:92:0x019e, B:93:0x01a9, B:95:0x01ba, B:134:0x02a8, B:136:0x02ae, B:138:0x02b2, B:141:0x02bf, B:143:0x02cb, B:145:0x02d8, B:147:0x02de, B:148:0x02e8, B:154:0x02f7, B:155:0x02fa, B:105:0x01fc, B:107:0x0212, B:109:0x0230, B:110:0x0232, B:112:0x023e, B:114:0x0244, B:116:0x0248, B:119:0x0255, B:121:0x0261, B:123:0x026e, B:125:0x0274, B:126:0x027e, B:130:0x028a, B:131:0x028d, B:132:0x0293, B:280:0x05c7, B:282:0x05cd, B:284:0x05d3, B:286:0x05eb, B:288:0x05ef, B:291:0x05fc, B:293:0x060b, B:295:0x0618, B:297:0x061e, B:299:0x062e, B:301:0x0642, B:303:0x064c, B:309:0x0668, B:317:0x069c, B:310:0x0672, B:312:0x0683, B:314:0x068e, B:318:0x06a6, B:166:0x0357, B:168:0x037c, B:169:0x038f, B:171:0x0395, B:173:0x039d, B:177:0x03a9, B:179:0x03b1, B:181:0x03b7, B:183:0x03bb, B:186:0x03c8, B:188:0x03d5, B:190:0x03e2, B:192:0x03e8, B:194:0x0403, B:195:0x0405, B:197:0x0417, B:199:0x041d, B:201:0x0421, B:204:0x0432, B:206:0x0440, B:208:0x044d, B:210:0x0453, B:212:0x0463, B:224:0x04a8, B:218:0x0477, B:219:0x047e, B:220:0x048c, B:258:0x0565, B:260:0x056b, B:262:0x056f, B:265:0x057c, B:267:0x0588, B:269:0x0595, B:271:0x059b, B:272:0x05a5, B:276:0x05b1, B:277:0x05b4, B:230:0x04d5, B:231:0x04e4, B:233:0x04f6, B:234:0x04f8, B:236:0x0504, B:238:0x050a, B:240:0x050e, B:243:0x051b, B:245:0x0527, B:247:0x0534, B:249:0x053a, B:250:0x0544, B:254:0x0550, B:255:0x0553, B:256:0x0559), top: B:348:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0315 A[EDGE_INSN: B:375:0x0315->B:158:0x0315 BREAK  A[LOOP:8: B:141:0x02bf->B:154:0x02f7], PHI: r3 r25 r29 r30 r34 r35 r36 r37 r38 r40 r44
      0x0315: PHI (r3v28 java.util.HashMap) = (r3v29 java.util.HashMap), (r3v31 java.util.HashMap), (r3v31 java.util.HashMap), (r3v31 java.util.HashMap) binds: [B:157:0x0306, B:135:0x02ac, B:139:0x02bb, B:375:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r25v38 int) = (r25v36 int), (r25v39 int), (r25v39 int), (r25v42 int) binds: [B:157:0x0306, B:135:0x02ac, B:139:0x02bb, B:375:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r29v21 int) = (r29v22 int), (r29v26 int), (r29v26 int), (r29v26 int) binds: [B:157:0x0306, B:135:0x02ac, B:139:0x02bb, B:375:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r30v10 long) = (r30v11 long), (r30v12 long), (r30v12 long), (r30v12 long) binds: [B:157:0x0306, B:135:0x02ac, B:139:0x02bb, B:375:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r34v8 java.util.Set) = (r34v9 java.util.Set), (r34v11 java.util.Set), (r34v11 java.util.Set), (r34v11 java.util.Set) binds: [B:157:0x0306, B:135:0x02ac, B:139:0x02bb, B:375:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r35v8 java.lang.Object[]) = (r35v9 java.lang.Object[]), (r35v11 java.lang.Object[]), (r35v11 java.lang.Object[]), (r35v11 java.lang.Object[]) binds: [B:157:0x0306, B:135:0x02ac, B:139:0x02bb, B:375:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r36v8 int) = (r36v9 int), (r36v11 int), (r36v11 int), (r36v11 int) binds: [B:157:0x0306, B:135:0x02ac, B:139:0x02bb, B:375:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r37v8 int) = (r37v9 int), (r37v11 int), (r37v11 int), (r37v11 int) binds: [B:157:0x0306, B:135:0x02ac, B:139:0x02bb, B:375:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r38v4 java.lang.Object[]) = (r38v5 java.lang.Object[]), (r38v7 java.lang.Object[]), (r38v7 java.lang.Object[]), (r38v7 java.lang.Object[]) binds: [B:157:0x0306, B:135:0x02ac, B:139:0x02bb, B:375:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r40v2 int) = (r40v3 int), (r40v5 int), (r40v5 int), (r40v5 int) binds: [B:157:0x0306, B:135:0x02ac, B:139:0x02bb, B:375:0x0315] A[DONT_GENERATE, DONT_INLINE]
      0x0315: PHI (r44v18 cuz) = (r44v19 cuz), (r44v21 cuz), (r44v21 cuz), (r44v21 cuz) binds: [B:157:0x0306, B:135:0x02ac, B:139:0x02bb, B:375:0x0315] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x054e A[PHI: r25
      0x054e: PHI (r25v13 int) = (r25v12 int), (r25v14 int) binds: [B:244:0x0525, B:252:0x054c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x056b A[Catch: all -> 0x06c8, TryCatch #2 {all -> 0x06c8, blocks: (B:45:0x00b7, B:47:0x00bd, B:159:0x0317, B:51:0x00cd, B:53:0x00d3, B:55:0x00d9, B:57:0x00dd, B:60:0x00f2, B:62:0x0102, B:64:0x010d, B:66:0x0113, B:68:0x012e, B:69:0x0130, B:71:0x0140, B:73:0x0146, B:75:0x014a, B:78:0x015b, B:80:0x016b, B:82:0x0176, B:84:0x017c, B:86:0x018c, B:99:0x01d4, B:92:0x019e, B:93:0x01a9, B:95:0x01ba, B:134:0x02a8, B:136:0x02ae, B:138:0x02b2, B:141:0x02bf, B:143:0x02cb, B:145:0x02d8, B:147:0x02de, B:148:0x02e8, B:154:0x02f7, B:155:0x02fa, B:105:0x01fc, B:107:0x0212, B:109:0x0230, B:110:0x0232, B:112:0x023e, B:114:0x0244, B:116:0x0248, B:119:0x0255, B:121:0x0261, B:123:0x026e, B:125:0x0274, B:126:0x027e, B:130:0x028a, B:131:0x028d, B:132:0x0293, B:280:0x05c7, B:282:0x05cd, B:284:0x05d3, B:286:0x05eb, B:288:0x05ef, B:291:0x05fc, B:293:0x060b, B:295:0x0618, B:297:0x061e, B:299:0x062e, B:301:0x0642, B:303:0x064c, B:309:0x0668, B:317:0x069c, B:310:0x0672, B:312:0x0683, B:314:0x068e, B:318:0x06a6, B:166:0x0357, B:168:0x037c, B:169:0x038f, B:171:0x0395, B:173:0x039d, B:177:0x03a9, B:179:0x03b1, B:181:0x03b7, B:183:0x03bb, B:186:0x03c8, B:188:0x03d5, B:190:0x03e2, B:192:0x03e8, B:194:0x0403, B:195:0x0405, B:197:0x0417, B:199:0x041d, B:201:0x0421, B:204:0x0432, B:206:0x0440, B:208:0x044d, B:210:0x0453, B:212:0x0463, B:224:0x04a8, B:218:0x0477, B:219:0x047e, B:220:0x048c, B:258:0x0565, B:260:0x056b, B:262:0x056f, B:265:0x057c, B:267:0x0588, B:269:0x0595, B:271:0x059b, B:272:0x05a5, B:276:0x05b1, B:277:0x05b4, B:230:0x04d5, B:231:0x04e4, B:233:0x04f6, B:234:0x04f8, B:236:0x0504, B:238:0x050a, B:240:0x050e, B:243:0x051b, B:245:0x0527, B:247:0x0534, B:249:0x053a, B:250:0x0544, B:254:0x0550, B:255:0x0553, B:256:0x0559), top: B:348:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05af A[PHI: r25
      0x05af: PHI (r25v7 int) = (r25v6 int), (r25v8 int) binds: [B:266:0x0586, B:274:0x05ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05cd A[Catch: all -> 0x06c8, TryCatch #2 {all -> 0x06c8, blocks: (B:45:0x00b7, B:47:0x00bd, B:159:0x0317, B:51:0x00cd, B:53:0x00d3, B:55:0x00d9, B:57:0x00dd, B:60:0x00f2, B:62:0x0102, B:64:0x010d, B:66:0x0113, B:68:0x012e, B:69:0x0130, B:71:0x0140, B:73:0x0146, B:75:0x014a, B:78:0x015b, B:80:0x016b, B:82:0x0176, B:84:0x017c, B:86:0x018c, B:99:0x01d4, B:92:0x019e, B:93:0x01a9, B:95:0x01ba, B:134:0x02a8, B:136:0x02ae, B:138:0x02b2, B:141:0x02bf, B:143:0x02cb, B:145:0x02d8, B:147:0x02de, B:148:0x02e8, B:154:0x02f7, B:155:0x02fa, B:105:0x01fc, B:107:0x0212, B:109:0x0230, B:110:0x0232, B:112:0x023e, B:114:0x0244, B:116:0x0248, B:119:0x0255, B:121:0x0261, B:123:0x026e, B:125:0x0274, B:126:0x027e, B:130:0x028a, B:131:0x028d, B:132:0x0293, B:280:0x05c7, B:282:0x05cd, B:284:0x05d3, B:286:0x05eb, B:288:0x05ef, B:291:0x05fc, B:293:0x060b, B:295:0x0618, B:297:0x061e, B:299:0x062e, B:301:0x0642, B:303:0x064c, B:309:0x0668, B:317:0x069c, B:310:0x0672, B:312:0x0683, B:314:0x068e, B:318:0x06a6, B:166:0x0357, B:168:0x037c, B:169:0x038f, B:171:0x0395, B:173:0x039d, B:177:0x03a9, B:179:0x03b1, B:181:0x03b7, B:183:0x03bb, B:186:0x03c8, B:188:0x03d5, B:190:0x03e2, B:192:0x03e8, B:194:0x0403, B:195:0x0405, B:197:0x0417, B:199:0x041d, B:201:0x0421, B:204:0x0432, B:206:0x0440, B:208:0x044d, B:210:0x0453, B:212:0x0463, B:224:0x04a8, B:218:0x0477, B:219:0x047e, B:220:0x048c, B:258:0x0565, B:260:0x056b, B:262:0x056f, B:265:0x057c, B:267:0x0588, B:269:0x0595, B:271:0x059b, B:272:0x05a5, B:276:0x05b1, B:277:0x05b4, B:230:0x04d5, B:231:0x04e4, B:233:0x04f6, B:234:0x04f8, B:236:0x0504, B:238:0x050a, B:240:0x050e, B:243:0x051b, B:245:0x0527, B:247:0x0534, B:249:0x053a, B:250:0x0544, B:254:0x0550, B:255:0x0553, B:256:0x0559), top: B:348:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x06d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x05bf A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iao.f():boolean");
    }
}
