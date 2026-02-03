package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmqw {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (defpackage.ddp.k(r1, r2, r3, null, r5, 12) != r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ddp r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof defpackage.dmqv
            if (r0 == 0) goto L13
            r0 = r13
            dmqv r0 = (defpackage.dmqv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dmqv r0 = new dmqv
            r0.<init>(r13)
        L18:
            r5 = r0
            java.lang.Object r13 = r5.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.b
            r7 = 3
            r2 = 1
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r11 = 2
            if (r1 == 0) goto L49
            if (r1 == r2) goto L42
            if (r1 == r11) goto L3b
            if (r1 != r7) goto L33
            defpackage.fctl.b(r13)
            goto Lad
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            ddp r12 = r5.c
            defpackage.fctl.b(r13)
            r1 = r12
            goto L8e
        L42:
            ddp r12 = r5.c
            defpackage.fctl.b(r13)
            r1 = r12
            goto L65
        L49:
            defpackage.fctl.b(r13)
            r13 = r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r9)
            dgg r3 = new dgg
            r3.<init>(r8)
            r5.c = r12
            r5.b = r13
            r4 = 0
            r6 = 12
            r1 = r12
            java.lang.Object r12 = defpackage.ddp.k(r1, r2, r3, r4, r5, r6)
            if (r12 == r0) goto Lb0
        L65:
            java.lang.Float r2 = new java.lang.Float
            r12 = 1067030938(0x3f99999a, float:1.2)
            r2.<init>(r12)
            den r12 = new den
            r13 = 1061997773(0x3f4ccccd, float:0.8)
            r3 = 1041865114(0x3e19999a, float:0.15)
            r4 = 1050253722(0x3e99999a, float:0.3)
            r12.<init>(r4, r10, r13, r3)
            r13 = 100
            dia r3 = defpackage.dea.c(r13, r8, r12, r11)
            r5.c = r1
            r5.b = r11
            r4 = 0
            r6 = 12
            java.lang.Object r12 = defpackage.ddp.k(r1, r2, r3, r4, r5, r6)
            if (r12 == r0) goto Lb0
        L8e:
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r9)
            den r12 = new den
            r12.<init>(r10, r10, r10, r9)
            r13 = 300(0x12c, float:4.2E-43)
            dia r3 = defpackage.dea.c(r13, r8, r12, r11)
            r12 = 0
            r5.c = r12
            r5.b = r7
            r4 = 0
            r6 = 12
            java.lang.Object r12 = defpackage.ddp.k(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto Lad
            goto Lb0
        Lad:
            fctx r12 = defpackage.fctx.a
            return r12
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmqw.a(ddp, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v25, types: [int] */
    /* JADX WARN: Type inference failed for: r5v26 */
    public static final void b(final fdae fdaeVar, final dmqz dmqzVar, boolean z, final Duration duration, int i, final ics icsVar, hml hmlVar, final int i2) {
        int i3;
        hmw hmwVar;
        ddp ddpVar;
        boolean z2;
        long j;
        float f;
        boolean z3;
        float f2;
        boolean z4;
        final ?? r5;
        final boolean z5;
        ?? r3 = i;
        icsVar.getClass();
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(843546418);
        if (i4 == 0) {
            i3 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? hmlVarC.D(dmqzVar) : hmlVarC.F(dmqzVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.F(duration) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.B(r3 == true ? 1 : 0) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 65536 : 131072;
        }
        if ((74899 & i3) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            r5 = r3 == true ? 1 : 0;
            z5 = z;
        } else {
            final String strB = jqu.b(r3 == 1 ? R.string.camera_shutter_button_photo_content_description : z ? R.string.camera_shutter_button_video_stop_recording_content_description : R.string.camera_shutter_button_video_start_recording_content_description, hmlVarC);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS = hmwVar2.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = hob.a(fcyi.a, hmlVarC);
                hmwVar2.af(objS);
            }
            final fdjx fdjxVar = (fdjx) objS;
            hmlVarC.v(1849434622);
            Object objS2 = hmwVar2.S();
            if (objS2 == obj) {
                objS2 = ddq.a(1.0f);
                hmwVar2.af(objS2);
            }
            final ddp ddpVar2 = (ddp) objS2;
            hmwVar2.ab();
            hmlVarC.v(-1224400529);
            boolean zF = ((i3 & 57344) == 16384) | hmlVarC.F(fdjxVar) | hmlVarC.F(ddpVar2);
            boolean z6 = (i3 & 14) == 4;
            Object objS3 = hmwVar2.S();
            if ((z6 | zF) || objS3 == obj) {
                final int i5 = r3 == true ? 1 : 0;
                objS3 = new fdae() { // from class: dmqj
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        if (i5 == 1) {
                            fdil.d(fdjxVar, null, null, new dmqu(ddpVar2, null), 3);
                        }
                        fdaeVar.invoke();
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS3);
            }
            final fdae fdaeVar2 = (fdae) objS3;
            hmwVar2.ab();
            hmlVarC.v(1849434622);
            Object objS4 = hmwVar2.S();
            if (objS4 == obj) {
                hpl hplVar = new hpl(false, hsi.a);
                hmwVar2.af(hplVar);
                objS4 = hplVar;
            }
            hox hoxVar = (hox) objS4;
            hmwVar2.ab();
            lvj lvjVar = (lvj) hmlVarC.e(lyj.a);
            iby ibyVar = ibw.e;
            hmlVarC.v(-1633490746);
            boolean zD = hmlVarC.D(fdaeVar2) | hmlVarC.D(strB);
            Object objS5 = hmwVar2.S();
            if (zD || objS5 == obj) {
                objS5 = new fdap() { // from class: dmqk
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        jto jtoVar = (jto) obj2;
                        jtoVar.getClass();
                        final fdae fdaeVar3 = fdaeVar2;
                        jtk.h(jtoVar, null, new fdae() { // from class: dmqi
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                fdaeVar3.invoke();
                                return true;
                            }
                        });
                        jtk.k(jtoVar, strB);
                        jtk.q(jtoVar, 0);
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS5);
            }
            hmwVar2.ab();
            ics icsVarB = jsh.b(icsVar, (fdap) objS5);
            hmlVarC.v(-1224400529);
            boolean zF2 = ((i3 & 112) == 32 || ((i3 & 64) != 0 && hmlVarC.F(dmqzVar))) | hmlVarC.F(lvjVar) | hmlVarC.D(fdaeVar2);
            Object objS6 = hmwVar2.S();
            if (zF2 || objS6 == obj) {
                objS6 = new dmqq(dmqzVar, lvjVar, hoxVar, fdaeVar2);
                hmwVar2.af(objS6);
            }
            hmwVar2.ab();
            ics icsVarA = itf.a(icsVarB, fdaeVar, (PointerInputEventHandler) objS6);
            ixm ixmVarA = ecz.a(ibyVar, false);
            long jB = hmg.b(hmlVarC);
            long j2 = jB ^ (jB >>> 32);
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar3 = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar3);
            } else {
                hmlVarC.z();
            }
            int i6 = (int) j2;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(i6))) {
                Integer numValueOf = Integer.valueOf(i6);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB2, jbb.c);
            hmlVarC.v(5004770);
            int i7 = i3 & 896;
            Object objS7 = hmwVar2.S();
            if (i7 == 256 || objS7 == obj) {
                objS7 = ddq.a(0.0f);
                hmwVar2.af(objS7);
            }
            final ddp ddpVar3 = (ddp) objS7;
            hmwVar2.ab();
            hmlVarC.v(-1779321099);
            if (z) {
                ics icsVarC = egq.c(ics.e, 1.0f);
                long jD = ijg.d(4281545523L);
                long j3 = ije.d;
                hmlVarC.v(5004770);
                boolean zF3 = hmlVarC.F(ddpVar3);
                Object objS8 = hmwVar2.S();
                if (zF3 || objS8 == obj) {
                    objS8 = new fdae() { // from class: dmql
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            return Float.valueOf(((Number) ddpVar3.d()).floatValue());
                        }
                    };
                    hmwVar2.af(objS8);
                }
                fdae fdaeVar4 = (fdae) objS8;
                hmwVar2.ab();
                ddpVar = ddpVar2;
                z2 = true;
                hmwVar = hmwVar2;
                gqs.e(fdaeVar4, icsVarC, j3, 4.0f, jD, 0, 0.0f, hmlVarC, 1600944, 0);
                hmlVarC = hmlVarC;
                fctx fctxVar = fctx.a;
                hmlVarC.v(-1633490746);
                boolean zF4 = hmlVarC.F(ddpVar3) | hmlVarC.F(duration);
                Object objS9 = hmwVar.S();
                if (zF4 || objS9 == obj) {
                    objS9 = new dmqt(ddpVar3, duration, null);
                    hmwVar.af(objS9);
                }
                hmwVar.ab();
                hob.g(fctxVar, (fdat) objS9, hmlVarC);
            } else {
                hmwVar = hmwVar2;
                ddpVar = ddpVar2;
                z2 = true;
            }
            hmwVar.ab();
            if (z) {
                long j4 = dmpj.a;
                j = dmpj.a;
            } else {
                long j5 = dmpj.a;
                j = dmpj.c;
            }
            hsf hsfVarB = dcs.b(j, f(), hmlVarC, 384, 8);
            hsf hsfVarB2 = dcs.b(z ? ije.g : ije.d, f(), hmlVarC, 384, 8);
            if (z) {
                f = 7.0f;
                z3 = z2;
            } else {
                f = 0.0f;
                z3 = false;
            }
            hsf hsfVarB3 = ddu.b(f, f(), hmlVarC, 384, 8);
            dky dkyVarA = dkz.a(3.0f, ((ije) hsfVarB2.a()).i);
            evm evmVar = evn.a;
            ecz.b(dkl.a(egq.c(efy.d(dkr.b(icsVar, dkyVarA, evmVar), ((kir) hsfVarB3.a()).a), 1.0f), ((ije) hsfVarB.a()).i, evmVar), hmlVarC, 0);
            if (r3 == z2) {
                f2 = 56.0f;
                z4 = z2;
            } else {
                f2 = 20.0f;
                z4 = r3;
            }
            ecz.b(dkl.a(iex.a(egq.k(ics.e, ((kir) ddu.b(f2, d(hoxVar) ? e() : dea.c(500, 0, dev.a, 2), hmlVarC, 384, 8).a()).a * ((Number) ddpVar.d()).floatValue()), evn.a(((Number) ddu.d(z2 != z ? 50 : 20, e(), null, hmlVarC, 384, 8).a()).intValue())), ije.d, ikj.a), hmlVarC, 0);
            hmlVarC.n();
            r5 = z4;
            z5 = z3;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dmqm
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    fdae fdaeVar5 = fdaeVar;
                    dmqz dmqzVar2 = dmqzVar;
                    boolean z7 = z5;
                    Duration duration2 = duration;
                    int i8 = r5;
                    dmqw.b(fdaeVar5, dmqzVar2, z7, duration2, i8, icsVar, (hml) obj2, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    public static final boolean d(hox hoxVar) {
        return ((Boolean) hoxVar.a()).booleanValue();
    }

    private static final dia e() {
        return dea.c(1000, 0, new den(0.13f, 1.62f, 0.0f, 0.92f), 2);
    }

    private static final dia f() {
        return dea.c(BasePaymentResult.ERROR_REQUEST_FAILED, 0, dev.d, 2);
    }
}
