package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzb extends ncn implements mse {
    private mau A;
    private mau B;
    private long C;
    private boolean D;
    private int E;
    public final mxt j;
    public boolean k;
    public boolean l;
    private final mxz w;
    private final ncc x;
    private int y;
    private boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzb(Context context, nce nceVar, ncp ncpVar, Handler handler, mrk mrkVar, mxz mxzVar) {
        super(1, nceVar, ncpVar, 44100.0f);
        ncc nccVar = Build.VERSION.SDK_INT >= 35 ? new ncc() : null;
        context.getApplicationContext();
        this.w = mxzVar;
        this.x = nccVar;
        this.E = -1000;
        this.j = new mxt(handler, mrkVar);
        ((myx) mxzVar).W = new mza(this);
    }

    private static List aB(ncp ncpVar, mau mauVar, boolean z, mxz mxzVar) {
        nci nciVarA;
        if (mauVar.o != null) {
            return (!mxzVar.g(mauVar) || (nciVarA = ncy.a()) == null) ? ncy.g(mauVar, z, false) : ekgb.r(nciVarA);
        }
        int i = ekgb.d;
        return ekoe.a;
    }

    private final void aC() {
        long jMax;
        ArrayDeque arrayDeque;
        long j;
        T();
        final myx myxVar = (myx) this.w;
        if (!myxVar.t() || myxVar.C) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(myxVar.h.a(), myxVar.n.a(myxVar.i()));
            while (true) {
                arrayDeque = myxVar.i;
                if (arrayDeque.isEmpty() || jMin < ((myp) arrayDeque.getFirst()).c) {
                    break;
                } else {
                    myxVar.v = (myp) arrayDeque.remove();
                }
            }
            myp mypVar = myxVar.v;
            long jY = jMin - mypVar.c;
            long jU = mgb.u(jY, mypVar.a.b);
            if (arrayDeque.isEmpty()) {
                mdr mdrVar = myxVar.U.c;
                if (mdrVar.h()) {
                    if (mdrVar.i >= 1024) {
                        long j2 = mdrVar.h;
                        mee.f(mdrVar.g);
                        long jB = j2 - r8.b();
                        int i = mdrVar.e.b;
                        int i2 = mdrVar.d.b;
                        jY = i == i2 ? mgb.y(jY, jB, mdrVar.i) : mgb.y(jY, jB * i, mdrVar.i * i2);
                    } else {
                        jY = (long) (mdrVar.b * jY);
                    }
                }
                myp mypVar2 = myxVar.v;
                j = mypVar2.b + jY;
                mypVar2.d = jY - jU;
            } else {
                myp mypVar3 = myxVar.v;
                j = mypVar3.b + jU + mypVar3.d;
            }
            long j3 = myxVar.U.b.f;
            jMax = j + myxVar.n.a(j3);
            long j4 = myxVar.R;
            if (j3 > j4) {
                long jA = myxVar.n.a(j3 - j4);
                myxVar.R = j3;
                myxVar.S += jA;
                if (myxVar.T == null) {
                    myxVar.T = new Handler(Looper.myLooper());
                }
                myxVar.T.removeCallbacksAndMessages(null);
                myxVar.T.postDelayed(new Runnable() { // from class: myg
                    @Override // java.lang.Runnable
                    public final void run() {
                        myx myxVar2 = myxVar;
                        if (myxVar2.S >= 300000) {
                            myxVar2.W.a.l = true;
                            myxVar2.S = 0L;
                        }
                    }
                }, 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.k) {
                jMax = Math.max(this.C, jMax);
            }
            this.C = jMax;
            this.k = false;
        }
    }

    private static final int aD(nci nciVar, mau mauVar) {
        "OMX.google.raw.decoder".equals(nciVar.a);
        return mauVar.p;
    }

    @Override // defpackage.mpc
    protected final void A() throws IllegalStateException {
        aC();
        myx myxVar = (myx) this.w;
        myxVar.J = false;
        if (myxVar.t()) {
            myc mycVar = myxVar.h;
            mycVar.d();
            if (mycVar.p == -9223372036854775807L) {
                myb mybVar = mycVar.c;
                mee.f(mybVar);
                mybVar.c();
            } else {
                mycVar.r = mycVar.b();
                if (!myx.u(myxVar.p)) {
                    return;
                }
            }
            myxVar.p.pause();
        }
    }

    @Override // defpackage.mth, defpackage.mtk
    public final String R() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.ncn, defpackage.mth
    public final boolean T() {
        if (!((ncn) this).r) {
            return false;
        }
        myx myxVar = (myx) this.w;
        if (myxVar.t()) {
            return myxVar.H && !myxVar.f();
        }
        return true;
    }

    @Override // defpackage.ncn, defpackage.mth
    public final boolean U() {
        return this.w.f() || super.U();
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    @Override // defpackage.ncn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final int W(defpackage.ncp r17, defpackage.mau r18) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzb.W(ncp, mau):int");
    }

    @Override // defpackage.ncn
    protected final mpe X(nci nciVar, mau mauVar, mau mauVar2) throws NumberFormatException {
        int i;
        int i2;
        mpe mpeVarB = nciVar.b(mauVar, mauVar2);
        int i3 = mpeVarB.e;
        if (au(mauVar2)) {
            i3 |= 32768;
        }
        if (aD(nciVar, mauVar2) > this.y) {
            i3 |= 64;
        }
        String str = nciVar.a;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = mpeVarB.d;
        }
        return new mpe(str, mauVar, mauVar2, i2, i);
    }

    @Override // defpackage.ncn
    protected final mpe Y(msa msaVar) {
        final mau mauVar = msaVar.b;
        mee.f(mauVar);
        this.A = mauVar;
        final mxt mxtVar = this.j;
        Handler handler = mxtVar.a;
        final mpe mpeVarY = super.Y(msaVar);
        if (handler != null) {
            handler.post(new Runnable() { // from class: mxp
                @Override // java.lang.Runnable
                public final void run() {
                    String str = mgb.a;
                    mwk mwkVar = (mwk) mxtVar.b.a.j;
                    mwkVar.J(mwkVar.I(), 1009, new mez() { // from class: mvs
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
        return mpeVarY;
    }

    @Override // defpackage.ncn
    protected final ncd Z(nci nciVar, mau mauVar, MediaCrypto mediaCrypto, float f) throws NumberFormatException {
        mau[] mauVarArrO = O();
        int length = mauVarArrO.length;
        int iAD = aD(nciVar, mauVar);
        if (length != 1) {
            for (mau mauVar2 : mauVarArrO) {
                if (nciVar.b(mauVar, mauVar2).d != 0) {
                    iAD = Math.max(iAD, aD(nciVar, mauVar2));
                }
            }
        }
        this.y = iAD;
        String str = nciVar.a;
        this.z = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = nciVar.c;
        int i = this.y;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        int i2 = mauVar.G;
        mediaFormat.setInteger("channel-count", i2);
        int i3 = mauVar.H;
        mediaFormat.setInteger("sample-rate", i3);
        mfi.f(mediaFormat, mauVar.r);
        mfi.d(mediaFormat, "max-input-size", i);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        String str3 = mauVar.o;
        if ("audio/ac4".equals(str3)) {
            Pair pairA = mek.a(mauVar);
            if (pairA != null) {
                mfi.d(mediaFormat, "profile", ((Integer) pairA.first).intValue());
                mfi.d(mediaFormat, "level", ((Integer) pairA.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.w.a(mgb.H(4, i2, i3)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (Build.VERSION.SDK_INT >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Math.max(0, -this.E));
        }
        mau mauVar3 = null;
        if ("audio/raw".equals(nciVar.b) && !"audio/raw".equals(str3)) {
            mauVar3 = mauVar;
        }
        this.B = mauVar3;
        return new ncd(nciVar, mediaFormat, mauVar, null, mediaCrypto, this.x);
    }

    @Override // defpackage.mse
    public final long a() {
        if (this.c == 2) {
            aC();
        }
        return this.C;
    }

    @Override // defpackage.ncn
    protected final List aa(ncp ncpVar, mau mauVar, boolean z) {
        return ncy.d(aB(ncpVar, mauVar, z, this.w), mauVar);
    }

    @Override // defpackage.ncn
    protected final void ab(mix mixVar) {
        mau mauVar;
        if (Build.VERSION.SDK_INT < 29 || (mauVar = mixVar.b) == null || !Objects.equals(mauVar.o, "audio/opus") || !((ncn) this).q) {
            return;
        }
        ByteBuffer byteBuffer = mixVar.g;
        mee.f(byteBuffer);
        mee.f(mixVar.b);
        if (byteBuffer.remaining() == 8) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong();
            AudioTrack audioTrack = ((myx) this.w).p;
            if (audioTrack != null) {
                myx.u(audioTrack);
            }
        }
    }

    @Override // defpackage.ncn
    protected final void ac(final Exception exc) {
        mff.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        final mxt mxtVar = this.j;
        Handler handler = mxtVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: mxn
                @Override // java.lang.Runnable
                public final void run() {
                    String str = mgb.a;
                    mwk mwkVar = (mwk) mxtVar.b.a.j;
                    mwkVar.J(mwkVar.I(), 1029, new mez() { // from class: mvz
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.ncn
    protected final void ad(final String str) {
        final mxt mxtVar = this.j;
        Handler handler = mxtVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: mxs
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = mgb.a;
                    mwk mwkVar = (mwk) mxtVar.b.a.j;
                    mwkVar.J(mwkVar.I(), 1012, new mez() { // from class: mud
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.ncn
    protected final void ae(mau mauVar, MediaFormat mediaFormat) throws mxv, mpn {
        mau mauVar2;
        int i;
        int iIntValue;
        mdj mdjVar;
        int iO;
        int i2;
        int i3;
        int i4;
        int iD;
        mau mauVar3 = mauVar;
        mau mauVar4 = this.B;
        int[] iArr = null;
        int i5 = 2;
        if (mauVar4 != null) {
            mauVar2 = mauVar4;
        } else {
            if (((ncn) this).n != null) {
                mee.f(mediaFormat);
                int integer = "audio/raw".equals(mauVar3.o) ? mauVar3.I : mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : mediaFormat.containsKey("v-bits-per-sample") ? mgb.n(mediaFormat.getInteger("v-bits-per-sample")) : 2;
                mat matVar = new mat();
                matVar.c("audio/raw");
                matVar.G = integer;
                matVar.H = mauVar3.J;
                matVar.I = mauVar3.K;
                matVar.k = mauVar3.l;
                Object obj = mauVar3.m;
                matVar.a = mauVar3.a;
                matVar.b = mauVar3.b;
                matVar.c = ekgb.n(mauVar3.c);
                matVar.d = mauVar3.d;
                matVar.e = mauVar3.e;
                matVar.f = mauVar3.f;
                matVar.E = mediaFormat.getInteger("channel-count");
                matVar.F = mediaFormat.getInteger("sample-rate");
                mauVar3 = new mau(matVar);
                if (this.z) {
                    int i6 = mauVar3.G;
                    if (i6 == 3) {
                        iArr = new int[]{0, 2, 1};
                    } else if (i6 == 5) {
                        iArr = new int[]{0, 2, 1, 3, 4};
                    } else if (i6 == 6) {
                        iArr = new int[]{0, 2, 1, 5, 3, 4};
                    } else if (i6 == 7) {
                        iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                    } else if (i6 == 8) {
                        iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                    }
                }
            }
            mauVar2 = mauVar3;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (((ncn) this).q) {
                    Q();
                }
                mee.c(Build.VERSION.SDK_INT >= 29);
            }
            mxz mxzVar = this.w;
            ((myx) mxzVar).m();
            if ("audio/raw".equals(mauVar2.o)) {
                int i7 = mauVar2.I;
                mee.a(mgb.Y(i7));
                int iO2 = mgb.o(i7, mauVar2.G);
                ekfw ekfwVar = new ekfw();
                ekfwVar.j(((myx) mxzVar).f);
                ekfwVar.i(((myx) mxzVar).U.a);
                mdj mdjVar2 = new mdj(ekfwVar.g());
                if (mdjVar2.equals(((myx) mxzVar).o)) {
                    mdjVar2 = ((myx) mxzVar).o;
                }
                mzf mzfVar = ((myx) mxzVar).e;
                int i8 = mauVar2.J;
                int i9 = mauVar2.K;
                mzfVar.e = i8;
                mzfVar.f = i9;
                ((myx) mxzVar).d.e = iArr;
                try {
                    mdk mdkVarA = mdjVar2.a(new mdk(mauVar2));
                    iIntValue = mdkVarA.d;
                    i = mdkVarA.b;
                    int i10 = mdkVarA.c;
                    int iH = mgb.h(i10);
                    iO = mgb.o(iIntValue, i10);
                    i3 = iO2;
                    i2 = iH;
                    mdjVar = mdjVar2;
                    i5 = 0;
                } catch (mdl e) {
                    throw new mxv(e, mauVar2);
                }
            } else {
                int i11 = ekgb.d;
                mdj mdjVar3 = new mdj(ekoe.a);
                i = mauVar2.H;
                mxg mxgVar = mxg.a;
                Pair pairA = ((myx) mxzVar).q.a(mauVar2, ((myx) mxzVar).t);
                if (pairA == null) {
                    throw new mxv("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(mauVar2))), mauVar2);
                }
                iIntValue = ((Integer) pairA.first).intValue();
                int iIntValue2 = ((Integer) pairA.second).intValue();
                mdjVar = mdjVar3;
                iO = -1;
                i2 = iIntValue2;
                i3 = -1;
            }
            if (iIntValue == 0) {
                throw new mxv("Invalid output encoding (mode=" + i5 + ") for: " + String.valueOf(mauVar2), mauVar2);
            }
            if (i2 == 0) {
                throw new mxv("Invalid output channel config (mode=" + i5 + ") for: " + String.valueOf(mauVar2), mauVar2);
            }
            int i12 = mauVar2.j;
            if ("audio/vnd.dts.hd;profile=lbr".equals(mauVar2.o) && i12 == -1) {
                i12 = 768000;
            }
            int minBufferSize = AudioTrack.getMinBufferSize(i, i2, iIntValue);
            mee.c(minBufferSize != -2);
            int i13 = iO != -1 ? iO : 1;
            int i14 = 250000;
            if (i5 == 0) {
                i4 = i2;
                iD = mgb.d(minBufferSize * 4, myy.a(250000, i, i13), myy.a(750000, i, i13));
            } else if (i5 != 1) {
                if (iIntValue == 5) {
                    i14 = 500000;
                } else if (iIntValue == 8) {
                    i14 = 1000000;
                    iIntValue = 8;
                }
                i4 = i2;
                iD = eonc.a((i14 * (i12 != -1 ? eoln.b(i12, 8, RoundingMode.CEILING) : myy.b(iIntValue))) / 1000000);
            } else {
                i4 = i2;
                iD = eonc.a((myy.b(iIntValue) * 50000000) / 1000000);
            }
            int i15 = iIntValue;
            ((myx) mxzVar).O = false;
            myn mynVar = new myn(mauVar2, i3, i5, iO, i, i4, i15, (((Math.max(minBufferSize, iD) + i13) - 1) / i13) * i13, mdjVar);
            if (((myx) mxzVar).t()) {
                ((myx) mxzVar).m = mynVar;
            } else {
                ((myx) mxzVar).n = mynVar;
            }
        } catch (mxv e2) {
            throw h(e2, e2.a, 5001);
        }
    }

    @Override // defpackage.ncn
    protected final void af() {
        this.w.c();
    }

    @Override // defpackage.ncn
    protected final void ag() throws IllegalStateException, mpn {
        try {
            mxz mxzVar = this.w;
            if (!((myx) mxzVar).H && ((myx) mxzVar).t() && ((myx) mxzVar).r()) {
                ((myx) mxzVar).n();
                ((myx) mxzVar).H = true;
            }
        } catch (mxy e) {
            throw i(e, e.c, e.b, true != ((ncn) this).q ? 5002 : 5003);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0559, code lost:
    
        if (r8 != 0) goto L207;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0333 A[Catch: mxy -> 0x06d2, mxw -> 0x06e5, TryCatch #1 {mxy -> 0x06d2, blocks: (B:14:0x0034, B:20:0x0043, B:22:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:43:0x00be, B:40:0x00a9, B:42:0x00b8, B:44:0x00c4, B:48:0x00d1, B:50:0x00dd, B:60:0x013d, B:62:0x014f, B:64:0x015d, B:65:0x016c, B:66:0x0186, B:68:0x018c, B:70:0x0194, B:72:0x01a8, B:73:0x01ab, B:75:0x01f3, B:77:0x0201, B:79:0x023d, B:81:0x024e, B:82:0x0259, B:84:0x0261, B:85:0x0272, B:87:0x0281, B:89:0x0293, B:54:0x00f1, B:56:0x00fe, B:58:0x012e, B:249:0x06b5, B:250:0x06b8, B:251:0x06bf, B:90:0x029b, B:92:0x02ac, B:94:0x02d4, B:95:0x02db, B:97:0x0301, B:99:0x0311, B:101:0x0323, B:102:0x032b, B:104:0x0333, B:108:0x033e, B:111:0x0349, B:113:0x0353, B:115:0x035b, B:120:0x036d, B:122:0x0372, B:123:0x0375, B:124:0x0380, B:125:0x0381, B:205:0x0553, B:127:0x03a0, B:129:0x03af, B:131:0x03bb, B:136:0x03c6, B:140:0x03e1, B:132:0x03bd, B:143:0x03f8, B:160:0x042b, B:161:0x0430, B:146:0x0408, B:149:0x040f, B:152:0x0415, B:157:0x0423, B:162:0x0431, B:164:0x0441, B:168:0x0460, B:167:0x0452, B:170:0x046c, B:172:0x0478, B:175:0x0483, B:178:0x0490, B:183:0x04a0, B:187:0x04d5, B:189:0x04ef, B:184:0x04b2, B:186:0x04d3, B:185:0x04c3, B:188:0x04da, B:190:0x04f3, B:200:0x052a, B:202:0x053f, B:204:0x0546, B:193:0x04fd, B:195:0x0509, B:196:0x0513, B:198:0x051d, B:199:0x0528, B:207:0x055b, B:209:0x0563, B:211:0x056d, B:212:0x057b, B:214:0x05a9, B:216:0x05b6, B:218:0x05be, B:219:0x05c6, B:220:0x05cd, B:222:0x05d5, B:224:0x05df, B:228:0x060a, B:229:0x060f, B:231:0x0619, B:233:0x0642, B:232:0x062c, B:234:0x064e, B:236:0x0661, B:237:0x0670, B:241:0x0689, B:243:0x0698, B:253:0x06c1, B:255:0x06c5, B:257:0x06d1), top: B:271:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x042b A[Catch: mxy -> 0x06d2, mxw -> 0x06e5, TryCatch #1 {mxy -> 0x06d2, blocks: (B:14:0x0034, B:20:0x0043, B:22:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:43:0x00be, B:40:0x00a9, B:42:0x00b8, B:44:0x00c4, B:48:0x00d1, B:50:0x00dd, B:60:0x013d, B:62:0x014f, B:64:0x015d, B:65:0x016c, B:66:0x0186, B:68:0x018c, B:70:0x0194, B:72:0x01a8, B:73:0x01ab, B:75:0x01f3, B:77:0x0201, B:79:0x023d, B:81:0x024e, B:82:0x0259, B:84:0x0261, B:85:0x0272, B:87:0x0281, B:89:0x0293, B:54:0x00f1, B:56:0x00fe, B:58:0x012e, B:249:0x06b5, B:250:0x06b8, B:251:0x06bf, B:90:0x029b, B:92:0x02ac, B:94:0x02d4, B:95:0x02db, B:97:0x0301, B:99:0x0311, B:101:0x0323, B:102:0x032b, B:104:0x0333, B:108:0x033e, B:111:0x0349, B:113:0x0353, B:115:0x035b, B:120:0x036d, B:122:0x0372, B:123:0x0375, B:124:0x0380, B:125:0x0381, B:205:0x0553, B:127:0x03a0, B:129:0x03af, B:131:0x03bb, B:136:0x03c6, B:140:0x03e1, B:132:0x03bd, B:143:0x03f8, B:160:0x042b, B:161:0x0430, B:146:0x0408, B:149:0x040f, B:152:0x0415, B:157:0x0423, B:162:0x0431, B:164:0x0441, B:168:0x0460, B:167:0x0452, B:170:0x046c, B:172:0x0478, B:175:0x0483, B:178:0x0490, B:183:0x04a0, B:187:0x04d5, B:189:0x04ef, B:184:0x04b2, B:186:0x04d3, B:185:0x04c3, B:188:0x04da, B:190:0x04f3, B:200:0x052a, B:202:0x053f, B:204:0x0546, B:193:0x04fd, B:195:0x0509, B:196:0x0513, B:198:0x051d, B:199:0x0528, B:207:0x055b, B:209:0x0563, B:211:0x056d, B:212:0x057b, B:214:0x05a9, B:216:0x05b6, B:218:0x05be, B:219:0x05c6, B:220:0x05cd, B:222:0x05d5, B:224:0x05df, B:228:0x060a, B:229:0x060f, B:231:0x0619, B:233:0x0642, B:232:0x062c, B:234:0x064e, B:236:0x0661, B:237:0x0670, B:241:0x0689, B:243:0x0698, B:253:0x06c1, B:255:0x06c5, B:257:0x06d1), top: B:271:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0431 A[Catch: mxy -> 0x06d2, mxw -> 0x06e5, TryCatch #1 {mxy -> 0x06d2, blocks: (B:14:0x0034, B:20:0x0043, B:22:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:43:0x00be, B:40:0x00a9, B:42:0x00b8, B:44:0x00c4, B:48:0x00d1, B:50:0x00dd, B:60:0x013d, B:62:0x014f, B:64:0x015d, B:65:0x016c, B:66:0x0186, B:68:0x018c, B:70:0x0194, B:72:0x01a8, B:73:0x01ab, B:75:0x01f3, B:77:0x0201, B:79:0x023d, B:81:0x024e, B:82:0x0259, B:84:0x0261, B:85:0x0272, B:87:0x0281, B:89:0x0293, B:54:0x00f1, B:56:0x00fe, B:58:0x012e, B:249:0x06b5, B:250:0x06b8, B:251:0x06bf, B:90:0x029b, B:92:0x02ac, B:94:0x02d4, B:95:0x02db, B:97:0x0301, B:99:0x0311, B:101:0x0323, B:102:0x032b, B:104:0x0333, B:108:0x033e, B:111:0x0349, B:113:0x0353, B:115:0x035b, B:120:0x036d, B:122:0x0372, B:123:0x0375, B:124:0x0380, B:125:0x0381, B:205:0x0553, B:127:0x03a0, B:129:0x03af, B:131:0x03bb, B:136:0x03c6, B:140:0x03e1, B:132:0x03bd, B:143:0x03f8, B:160:0x042b, B:161:0x0430, B:146:0x0408, B:149:0x040f, B:152:0x0415, B:157:0x0423, B:162:0x0431, B:164:0x0441, B:168:0x0460, B:167:0x0452, B:170:0x046c, B:172:0x0478, B:175:0x0483, B:178:0x0490, B:183:0x04a0, B:187:0x04d5, B:189:0x04ef, B:184:0x04b2, B:186:0x04d3, B:185:0x04c3, B:188:0x04da, B:190:0x04f3, B:200:0x052a, B:202:0x053f, B:204:0x0546, B:193:0x04fd, B:195:0x0509, B:196:0x0513, B:198:0x051d, B:199:0x0528, B:207:0x055b, B:209:0x0563, B:211:0x056d, B:212:0x057b, B:214:0x05a9, B:216:0x05b6, B:218:0x05be, B:219:0x05c6, B:220:0x05cd, B:222:0x05d5, B:224:0x05df, B:228:0x060a, B:229:0x060f, B:231:0x0619, B:233:0x0642, B:232:0x062c, B:234:0x064e, B:236:0x0661, B:237:0x0670, B:241:0x0689, B:243:0x0698, B:253:0x06c1, B:255:0x06c5, B:257:0x06d1), top: B:271:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0661 A[Catch: mxy -> 0x06d2, mxw -> 0x06e5, TryCatch #1 {mxy -> 0x06d2, blocks: (B:14:0x0034, B:20:0x0043, B:22:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:43:0x00be, B:40:0x00a9, B:42:0x00b8, B:44:0x00c4, B:48:0x00d1, B:50:0x00dd, B:60:0x013d, B:62:0x014f, B:64:0x015d, B:65:0x016c, B:66:0x0186, B:68:0x018c, B:70:0x0194, B:72:0x01a8, B:73:0x01ab, B:75:0x01f3, B:77:0x0201, B:79:0x023d, B:81:0x024e, B:82:0x0259, B:84:0x0261, B:85:0x0272, B:87:0x0281, B:89:0x0293, B:54:0x00f1, B:56:0x00fe, B:58:0x012e, B:249:0x06b5, B:250:0x06b8, B:251:0x06bf, B:90:0x029b, B:92:0x02ac, B:94:0x02d4, B:95:0x02db, B:97:0x0301, B:99:0x0311, B:101:0x0323, B:102:0x032b, B:104:0x0333, B:108:0x033e, B:111:0x0349, B:113:0x0353, B:115:0x035b, B:120:0x036d, B:122:0x0372, B:123:0x0375, B:124:0x0380, B:125:0x0381, B:205:0x0553, B:127:0x03a0, B:129:0x03af, B:131:0x03bb, B:136:0x03c6, B:140:0x03e1, B:132:0x03bd, B:143:0x03f8, B:160:0x042b, B:161:0x0430, B:146:0x0408, B:149:0x040f, B:152:0x0415, B:157:0x0423, B:162:0x0431, B:164:0x0441, B:168:0x0460, B:167:0x0452, B:170:0x046c, B:172:0x0478, B:175:0x0483, B:178:0x0490, B:183:0x04a0, B:187:0x04d5, B:189:0x04ef, B:184:0x04b2, B:186:0x04d3, B:185:0x04c3, B:188:0x04da, B:190:0x04f3, B:200:0x052a, B:202:0x053f, B:204:0x0546, B:193:0x04fd, B:195:0x0509, B:196:0x0513, B:198:0x051d, B:199:0x0528, B:207:0x055b, B:209:0x0563, B:211:0x056d, B:212:0x057b, B:214:0x05a9, B:216:0x05b6, B:218:0x05be, B:219:0x05c6, B:220:0x05cd, B:222:0x05d5, B:224:0x05df, B:228:0x060a, B:229:0x060f, B:231:0x0619, B:233:0x0642, B:232:0x062c, B:234:0x064e, B:236:0x0661, B:237:0x0670, B:241:0x0689, B:243:0x0698, B:253:0x06c1, B:255:0x06c5, B:257:0x06d1), top: B:271:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0670 A[Catch: mxy -> 0x06d2, mxw -> 0x06e5, TryCatch #1 {mxy -> 0x06d2, blocks: (B:14:0x0034, B:20:0x0043, B:22:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:43:0x00be, B:40:0x00a9, B:42:0x00b8, B:44:0x00c4, B:48:0x00d1, B:50:0x00dd, B:60:0x013d, B:62:0x014f, B:64:0x015d, B:65:0x016c, B:66:0x0186, B:68:0x018c, B:70:0x0194, B:72:0x01a8, B:73:0x01ab, B:75:0x01f3, B:77:0x0201, B:79:0x023d, B:81:0x024e, B:82:0x0259, B:84:0x0261, B:85:0x0272, B:87:0x0281, B:89:0x0293, B:54:0x00f1, B:56:0x00fe, B:58:0x012e, B:249:0x06b5, B:250:0x06b8, B:251:0x06bf, B:90:0x029b, B:92:0x02ac, B:94:0x02d4, B:95:0x02db, B:97:0x0301, B:99:0x0311, B:101:0x0323, B:102:0x032b, B:104:0x0333, B:108:0x033e, B:111:0x0349, B:113:0x0353, B:115:0x035b, B:120:0x036d, B:122:0x0372, B:123:0x0375, B:124:0x0380, B:125:0x0381, B:205:0x0553, B:127:0x03a0, B:129:0x03af, B:131:0x03bb, B:136:0x03c6, B:140:0x03e1, B:132:0x03bd, B:143:0x03f8, B:160:0x042b, B:161:0x0430, B:146:0x0408, B:149:0x040f, B:152:0x0415, B:157:0x0423, B:162:0x0431, B:164:0x0441, B:168:0x0460, B:167:0x0452, B:170:0x046c, B:172:0x0478, B:175:0x0483, B:178:0x0490, B:183:0x04a0, B:187:0x04d5, B:189:0x04ef, B:184:0x04b2, B:186:0x04d3, B:185:0x04c3, B:188:0x04da, B:190:0x04f3, B:200:0x052a, B:202:0x053f, B:204:0x0546, B:193:0x04fd, B:195:0x0509, B:196:0x0513, B:198:0x051d, B:199:0x0528, B:207:0x055b, B:209:0x0563, B:211:0x056d, B:212:0x057b, B:214:0x05a9, B:216:0x05b6, B:218:0x05be, B:219:0x05c6, B:220:0x05cd, B:222:0x05d5, B:224:0x05df, B:228:0x060a, B:229:0x060f, B:231:0x0619, B:233:0x0642, B:232:0x062c, B:234:0x064e, B:236:0x0661, B:237:0x0670, B:241:0x0689, B:243:0x0698, B:253:0x06c1, B:255:0x06c5, B:257:0x06d1), top: B:271:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029b A[Catch: mxy -> 0x06d2, mxw -> 0x06e5, TRY_ENTER, TryCatch #1 {mxy -> 0x06d2, blocks: (B:14:0x0034, B:20:0x0043, B:22:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:43:0x00be, B:40:0x00a9, B:42:0x00b8, B:44:0x00c4, B:48:0x00d1, B:50:0x00dd, B:60:0x013d, B:62:0x014f, B:64:0x015d, B:65:0x016c, B:66:0x0186, B:68:0x018c, B:70:0x0194, B:72:0x01a8, B:73:0x01ab, B:75:0x01f3, B:77:0x0201, B:79:0x023d, B:81:0x024e, B:82:0x0259, B:84:0x0261, B:85:0x0272, B:87:0x0281, B:89:0x0293, B:54:0x00f1, B:56:0x00fe, B:58:0x012e, B:249:0x06b5, B:250:0x06b8, B:251:0x06bf, B:90:0x029b, B:92:0x02ac, B:94:0x02d4, B:95:0x02db, B:97:0x0301, B:99:0x0311, B:101:0x0323, B:102:0x032b, B:104:0x0333, B:108:0x033e, B:111:0x0349, B:113:0x0353, B:115:0x035b, B:120:0x036d, B:122:0x0372, B:123:0x0375, B:124:0x0380, B:125:0x0381, B:205:0x0553, B:127:0x03a0, B:129:0x03af, B:131:0x03bb, B:136:0x03c6, B:140:0x03e1, B:132:0x03bd, B:143:0x03f8, B:160:0x042b, B:161:0x0430, B:146:0x0408, B:149:0x040f, B:152:0x0415, B:157:0x0423, B:162:0x0431, B:164:0x0441, B:168:0x0460, B:167:0x0452, B:170:0x046c, B:172:0x0478, B:175:0x0483, B:178:0x0490, B:183:0x04a0, B:187:0x04d5, B:189:0x04ef, B:184:0x04b2, B:186:0x04d3, B:185:0x04c3, B:188:0x04da, B:190:0x04f3, B:200:0x052a, B:202:0x053f, B:204:0x0546, B:193:0x04fd, B:195:0x0509, B:196:0x0513, B:198:0x051d, B:199:0x0528, B:207:0x055b, B:209:0x0563, B:211:0x056d, B:212:0x057b, B:214:0x05a9, B:216:0x05b6, B:218:0x05be, B:219:0x05c6, B:220:0x05cd, B:222:0x05d5, B:224:0x05df, B:228:0x060a, B:229:0x060f, B:231:0x0619, B:233:0x0642, B:232:0x062c, B:234:0x064e, B:236:0x0661, B:237:0x0670, B:241:0x0689, B:243:0x0698, B:253:0x06c1, B:255:0x06c5, B:257:0x06d1), top: B:271:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ac A[Catch: mxy -> 0x06d2, mxw -> 0x06e5, TryCatch #1 {mxy -> 0x06d2, blocks: (B:14:0x0034, B:20:0x0043, B:22:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:43:0x00be, B:40:0x00a9, B:42:0x00b8, B:44:0x00c4, B:48:0x00d1, B:50:0x00dd, B:60:0x013d, B:62:0x014f, B:64:0x015d, B:65:0x016c, B:66:0x0186, B:68:0x018c, B:70:0x0194, B:72:0x01a8, B:73:0x01ab, B:75:0x01f3, B:77:0x0201, B:79:0x023d, B:81:0x024e, B:82:0x0259, B:84:0x0261, B:85:0x0272, B:87:0x0281, B:89:0x0293, B:54:0x00f1, B:56:0x00fe, B:58:0x012e, B:249:0x06b5, B:250:0x06b8, B:251:0x06bf, B:90:0x029b, B:92:0x02ac, B:94:0x02d4, B:95:0x02db, B:97:0x0301, B:99:0x0311, B:101:0x0323, B:102:0x032b, B:104:0x0333, B:108:0x033e, B:111:0x0349, B:113:0x0353, B:115:0x035b, B:120:0x036d, B:122:0x0372, B:123:0x0375, B:124:0x0380, B:125:0x0381, B:205:0x0553, B:127:0x03a0, B:129:0x03af, B:131:0x03bb, B:136:0x03c6, B:140:0x03e1, B:132:0x03bd, B:143:0x03f8, B:160:0x042b, B:161:0x0430, B:146:0x0408, B:149:0x040f, B:152:0x0415, B:157:0x0423, B:162:0x0431, B:164:0x0441, B:168:0x0460, B:167:0x0452, B:170:0x046c, B:172:0x0478, B:175:0x0483, B:178:0x0490, B:183:0x04a0, B:187:0x04d5, B:189:0x04ef, B:184:0x04b2, B:186:0x04d3, B:185:0x04c3, B:188:0x04da, B:190:0x04f3, B:200:0x052a, B:202:0x053f, B:204:0x0546, B:193:0x04fd, B:195:0x0509, B:196:0x0513, B:198:0x051d, B:199:0x0528, B:207:0x055b, B:209:0x0563, B:211:0x056d, B:212:0x057b, B:214:0x05a9, B:216:0x05b6, B:218:0x05be, B:219:0x05c6, B:220:0x05cd, B:222:0x05d5, B:224:0x05df, B:228:0x060a, B:229:0x060f, B:231:0x0619, B:233:0x0642, B:232:0x062c, B:234:0x064e, B:236:0x0661, B:237:0x0670, B:241:0x0689, B:243:0x0698, B:253:0x06c1, B:255:0x06c5, B:257:0x06d1), top: B:271:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0301 A[Catch: mxy -> 0x06d2, mxw -> 0x06e5, TryCatch #1 {mxy -> 0x06d2, blocks: (B:14:0x0034, B:20:0x0043, B:22:0x004e, B:25:0x005a, B:27:0x006a, B:29:0x0070, B:31:0x0076, B:33:0x007c, B:35:0x0082, B:37:0x009b, B:39:0x00a1, B:43:0x00be, B:40:0x00a9, B:42:0x00b8, B:44:0x00c4, B:48:0x00d1, B:50:0x00dd, B:60:0x013d, B:62:0x014f, B:64:0x015d, B:65:0x016c, B:66:0x0186, B:68:0x018c, B:70:0x0194, B:72:0x01a8, B:73:0x01ab, B:75:0x01f3, B:77:0x0201, B:79:0x023d, B:81:0x024e, B:82:0x0259, B:84:0x0261, B:85:0x0272, B:87:0x0281, B:89:0x0293, B:54:0x00f1, B:56:0x00fe, B:58:0x012e, B:249:0x06b5, B:250:0x06b8, B:251:0x06bf, B:90:0x029b, B:92:0x02ac, B:94:0x02d4, B:95:0x02db, B:97:0x0301, B:99:0x0311, B:101:0x0323, B:102:0x032b, B:104:0x0333, B:108:0x033e, B:111:0x0349, B:113:0x0353, B:115:0x035b, B:120:0x036d, B:122:0x0372, B:123:0x0375, B:124:0x0380, B:125:0x0381, B:205:0x0553, B:127:0x03a0, B:129:0x03af, B:131:0x03bb, B:136:0x03c6, B:140:0x03e1, B:132:0x03bd, B:143:0x03f8, B:160:0x042b, B:161:0x0430, B:146:0x0408, B:149:0x040f, B:152:0x0415, B:157:0x0423, B:162:0x0431, B:164:0x0441, B:168:0x0460, B:167:0x0452, B:170:0x046c, B:172:0x0478, B:175:0x0483, B:178:0x0490, B:183:0x04a0, B:187:0x04d5, B:189:0x04ef, B:184:0x04b2, B:186:0x04d3, B:185:0x04c3, B:188:0x04da, B:190:0x04f3, B:200:0x052a, B:202:0x053f, B:204:0x0546, B:193:0x04fd, B:195:0x0509, B:196:0x0513, B:198:0x051d, B:199:0x0528, B:207:0x055b, B:209:0x0563, B:211:0x056d, B:212:0x057b, B:214:0x05a9, B:216:0x05b6, B:218:0x05be, B:219:0x05c6, B:220:0x05cd, B:222:0x05d5, B:224:0x05df, B:228:0x060a, B:229:0x060f, B:231:0x0619, B:233:0x0642, B:232:0x062c, B:234:0x064e, B:236:0x0661, B:237:0x0670, B:241:0x0689, B:243:0x0698, B:253:0x06c1, B:255:0x06c5, B:257:0x06d1), top: B:271:0x0034 }] */
    @Override // defpackage.ncn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean ah(long r29, long r31, defpackage.ncf r33, java.nio.ByteBuffer r34, int r35, int r36, int r37, long r38, boolean r40, boolean r41, defpackage.mau r42) throws java.lang.IllegalStateException, defpackage.mpn, defpackage.mxw {
        /*
            Method dump skipped, instructions count: 1818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzb.ah(long, long, ncf, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, mau):boolean");
    }

    @Override // defpackage.ncn
    protected final boolean ai(mau mauVar) {
        Q();
        return this.w.g(mauVar);
    }

    @Override // defpackage.ncn
    protected final float aj(float f, mau[] mauVarArr) {
        int iMax = -1;
        for (mau mauVar : mauVarArr) {
            int i = mauVar.H;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // defpackage.ncn
    protected final void ak(final String str, final long j, final long j2) {
        final mxt mxtVar = this.j;
        Handler handler = mxtVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: mxr
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = mgb.a;
                    mwk mwkVar = (mwk) mxtVar.b.a.j;
                    mwkVar.J(mwkVar.I(), 1008, new mez() { // from class: mut
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.mse
    public final mca b() {
        return ((myx) this.w).w;
    }

    @Override // defpackage.mse
    public final void d(mca mcaVar) {
        mca mcaVar2 = new mca(mgb.a(mcaVar.b, 0.1f, 8.0f), mgb.a(mcaVar.c, 0.1f, 8.0f));
        myx myxVar = (myx) this.w;
        myxVar.w = mcaVar2;
        myxVar.p(mcaVar);
    }

    @Override // defpackage.mse
    public final boolean g() {
        boolean z = this.l;
        this.l = false;
        return z;
    }

    @Override // defpackage.ncn, defpackage.mpc, defpackage.mtd
    public final void r(int i, Object obj) throws IllegalStateException {
        ncc nccVar;
        if (i == 2) {
            mxz mxzVar = this.w;
            mee.f(obj);
            float fFloatValue = ((Float) obj).floatValue();
            myx myxVar = (myx) mxzVar;
            if (myxVar.E != fFloatValue) {
                myxVar.E = fFloatValue;
                myxVar.q();
                return;
            }
            return;
        }
        if (i == 3) {
            mac macVar = (mac) obj;
            mxz mxzVar2 = this.w;
            mee.f(macVar);
            myx myxVar2 = (myx) mxzVar2;
            if (myxVar2.t.equals(macVar)) {
                return;
            }
            myxVar2.t = macVar;
            mxd mxdVar = myxVar2.r;
            if (mxdVar != null) {
                mxdVar.h = macVar;
                mxdVar.a(mwz.b(mxdVar.a, macVar, mxdVar.g));
            }
            myxVar2.b();
            return;
        }
        if (i == 6) {
            mad madVar = (mad) obj;
            mxz mxzVar3 = this.w;
            mee.f(madVar);
            myx myxVar3 = (myx) mxzVar3;
            if (myxVar3.L.equals(madVar)) {
                return;
            }
            if (myxVar3.p != null) {
                int i2 = myxVar3.L.a;
            }
            myxVar3.L = madVar;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            myx myxVar4 = (myx) this.w;
            myxVar4.M = audioDeviceInfo != null ? new mxe(audioDeviceInfo) : null;
            mxd mxdVar2 = myxVar4.r;
            if (mxdVar2 != null) {
                mxdVar2.b(audioDeviceInfo);
            }
            AudioTrack audioTrack = myxVar4.p;
            if (audioTrack != null) {
                myj.a(audioTrack, myxVar4.M);
                return;
            }
            return;
        }
        if (i == 16) {
            mee.f(obj);
            this.E = ((Integer) obj).intValue();
            ncf ncfVar = ((ncn) this).n;
            if (ncfVar == null || Build.VERSION.SDK_INT < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.IMPORTANCE, Math.max(0, -this.E));
            ncfVar.l(bundle);
            return;
        }
        if (i == 9) {
            mxz mxzVar4 = this.w;
            mee.f(obj);
            myx myxVar5 = (myx) mxzVar4;
            myxVar5.x = ((Boolean) obj).booleanValue();
            myxVar5.p(myxVar5.w);
            return;
        }
        if (i != 10) {
            super.r(i, obj);
            return;
        }
        mee.f(obj);
        int iIntValue = ((Integer) obj).intValue();
        myx myxVar6 = (myx) this.w;
        if (myxVar6.K != iIntValue) {
            myxVar6.K = iIntValue;
            myxVar6.b();
        }
        if (Build.VERSION.SDK_INT < 35 || (nccVar = this.x) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = nccVar.b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            nccVar.b = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(iIntValue, eoqg.a, new ncb());
        nccVar.b = loudnessCodecControllerCreate;
        Iterator it = nccVar.a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    @Override // defpackage.ncn, defpackage.mpc
    protected final void u() {
        this.D = true;
        this.A = null;
        try {
            this.w.b();
            super.u();
        } catch (Throwable th) {
            super.u();
            throw th;
        } finally {
            this.j.a(this.t);
        }
    }

    @Override // defpackage.ncn, defpackage.mpc
    protected final void v(boolean z, boolean z2) {
        super.v(z, z2);
        final mxt mxtVar = this.j;
        Handler handler = mxtVar.a;
        final mpd mpdVar = this.t;
        if (handler != null) {
            handler.post(new Runnable() { // from class: mxh
                @Override // java.lang.Runnable
                public final void run() {
                    String str = mgb.a;
                    mwk mwkVar = (mwk) mxtVar.b.a.j;
                    mwkVar.J(mwkVar.I(), 1007, new mez() { // from class: mub
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
        Q();
        myx myxVar = (myx) this.w;
        myxVar.l = m();
        myxVar.h.v = eO();
    }

    @Override // defpackage.ncn, defpackage.mpc
    protected final void w(long j, boolean z) {
        super.w(j, z);
        this.w.b();
        this.C = j;
        this.l = false;
        this.k = true;
    }

    @Override // defpackage.mpc
    protected final void x() {
        ncc nccVar;
        mxd mxdVar = ((myx) this.w).r;
        if (mxdVar != null && mxdVar.i) {
            mxdVar.f = null;
            mxa mxaVar = mxdVar.c;
            if (mxaVar != null) {
                mdh.a(mxdVar.a).unregisterAudioDeviceCallback(mxaVar);
            }
            mxdVar.a.unregisterReceiver(mxdVar.d);
            mxb mxbVar = mxdVar.e;
            if (mxbVar != null) {
                mxbVar.a.unregisterContentObserver(mxbVar);
            }
            mxdVar.i = false;
        }
        if (Build.VERSION.SDK_INT < 35 || (nccVar = this.x) == null) {
            return;
        }
        nccVar.a.clear();
        LoudnessCodecController loudnessCodecController = nccVar.b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // defpackage.ncn, defpackage.mpc
    protected final void y() {
        this.l = false;
        try {
            super.y();
            if (this.D) {
                this.D = false;
                this.w.e();
            }
        } catch (Throwable th) {
            if (this.D) {
                this.D = false;
                this.w.e();
            }
            throw th;
        }
    }

    @Override // defpackage.mpc
    protected final void z() {
        this.w.d();
    }

    @Override // defpackage.mpc, defpackage.mth
    public final mse k() {
        return this;
    }
}
