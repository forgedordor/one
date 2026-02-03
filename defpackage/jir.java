package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.car.app.model.Alert;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jir extends lcl {
    public static final cth a = cti.a(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    public final cuh A;
    public jog B;
    public boolean C;
    public final cuf D;
    public final Runnable E;
    public final List F;
    private final long I;
    private final jij J;
    private final css K;
    private final fdoa L;
    private ctj M;
    private final kgo N;
    private final fdap O;
    public final AndroidComposeView b;
    public final AccessibilityManager d;
    public final AccessibilityManager.AccessibilityStateChangeListener e;
    public final AccessibilityManager.TouchExplorationStateChangeListener f;
    public List g;
    public final Handler h;
    public int i;
    public int j;
    public lhg k;
    public lhg l;
    public boolean m;
    public final cuh n;
    public final cuh o;
    public final cvx p;
    public final cvx q;
    public int r;
    public Integer s;
    public boolean t;
    public jik u;
    public final cui v;
    public final cuf w;
    public final cuf x;
    public final String y;
    public final String z;
    public int c = Integer.MIN_VALUE;
    private final fdap H = new jim(this);

    public jir(AndroidComposeView androidComposeView) {
        this.b = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.d = accessibilityManager;
        this.I = 100L;
        this.e = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: jif
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                jir jirVar = this.a;
                jirVar.g = z ? jirVar.d.getEnabledAccessibilityServiceList(-1) : fcvo.a;
            }
        };
        this.f = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: jig
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                jir jirVar = this.a;
                jirVar.g = jirVar.d.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.g = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.h = new Handler(Looper.getMainLooper());
        this.J = new jij(this);
        this.i = Integer.MIN_VALUE;
        this.j = Integer.MIN_VALUE;
        this.n = new cuh((byte[]) null);
        this.o = new cuh((byte[]) null);
        this.p = new cvx(null);
        this.q = new cvx(null);
        this.r = -1;
        this.K = new css((byte[]) null);
        this.L = fdod.a(1, 0, 6);
        this.t = true;
        this.M = ctk.a();
        this.v = new cui((byte[]) null);
        this.w = new cuf((byte[]) null);
        this.x = new cuf((byte[]) null);
        this.y = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.z = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.N = new kgo();
        this.A = new cuh((byte[]) null);
        this.B = new jog(androidComposeView.q.a(), ctk.a());
        int i = ctf.a;
        this.D = new cuf((byte[]) null);
        androidComposeView.addOnAttachStateChangeListener(new jii(this));
        this.E = new Runnable() { // from class: jih
            /* JADX WARN: Code restructure failed: missing block: B:269:0x075b, code lost:
            
                r24 = r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:270:0x0765, code lost:
            
                if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L274;
             */
            /* JADX WARN: Code restructure failed: missing block: B:271:0x0767, code lost:
            
                r15 = -1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:319:0x0849, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:321:0x084d, code lost:
            
                throw r0;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:250:0x06ba  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x013f A[Catch: all -> 0x083f, Merged into TryCatch #1 {all -> 0x0849, all -> 0x0844, all -> 0x083a, all -> 0x083f, blocks: (B:5:0x0016, B:9:0x002e, B:225:0x0636, B:307:0x082f, B:311:0x083b, B:312:0x083e, B:314:0x0840, B:315:0x0843, B:317:0x0845, B:318:0x0848, B:6:0x001b, B:8:0x0021, B:226:0x063e, B:229:0x0651, B:231:0x065d, B:233:0x066b, B:235:0x0671, B:237:0x0682, B:240:0x0688, B:242:0x0692, B:244:0x069f, B:246:0x06ab, B:247:0x06b0, B:251:0x06bc, B:252:0x06bf, B:255:0x06cc, B:257:0x06d8, B:259:0x06e6, B:261:0x06ec, B:262:0x0700, B:265:0x0741, B:273:0x076a, B:276:0x0782, B:268:0x0752, B:269:0x075b, B:274:0x076e, B:282:0x0797, B:283:0x079d, B:286:0x07b5, B:288:0x07c1, B:290:0x07cf, B:292:0x07d5, B:294:0x07ea, B:296:0x07f0, B:298:0x07fe, B:299:0x080a, B:305:0x0819, B:306:0x081c, B:10:0x0036, B:13:0x005b, B:15:0x0069, B:17:0x0075, B:19:0x007b, B:22:0x008c, B:24:0x0098, B:27:0x009e, B:30:0x00bb, B:32:0x00cb, B:34:0x00d6, B:36:0x00dc, B:38:0x00f8, B:42:0x0105, B:46:0x0115, B:53:0x0137, B:55:0x013f, B:197:0x052e, B:57:0x014c, B:58:0x0152, B:60:0x015c, B:63:0x0166, B:65:0x016e, B:66:0x0189, B:68:0x0194, B:91:0x0224, B:71:0x01a3, B:73:0x01ab, B:75:0x01b9, B:79:0x01da, B:81:0x01e3, B:83:0x01f1, B:86:0x0201, B:88:0x0206, B:89:0x020d, B:90:0x0211, B:92:0x023f, B:94:0x024a, B:96:0x0260, B:99:0x026a, B:101:0x0272, B:104:0x027c, B:107:0x0284, B:109:0x029e, B:115:0x02ba, B:117:0x02be, B:122:0x02d7, B:136:0x0304, B:138:0x0358, B:141:0x0364, B:137:0x0333, B:120:0x02d2, B:112:0x02ad, B:142:0x0381, B:143:0x039f, B:145:0x03b5, B:147:0x03bb, B:151:0x03c2, B:152:0x03fe, B:154:0x0404, B:157:0x040e, B:159:0x0416, B:161:0x0421, B:162:0x042e, B:163:0x043f, B:165:0x0447, B:167:0x0457, B:169:0x0464, B:170:0x0476, B:172:0x0483, B:173:0x0491, B:175:0x0497, B:178:0x049e, B:181:0x04a5, B:183:0x04a9, B:186:0x04b7, B:189:0x04bc, B:192:0x04c9, B:194:0x04d1, B:195:0x04f3, B:45:0x010e, B:48:0x011a, B:203:0x0567, B:207:0x0592, B:208:0x0598, B:210:0x059e, B:212:0x05b4, B:214:0x05c6, B:215:0x05d0), top: B:327:0x0016 }] */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0152 A[Catch: all -> 0x083f, Merged into TryCatch #1 {all -> 0x0849, all -> 0x0844, all -> 0x083a, all -> 0x083f, blocks: (B:5:0x0016, B:9:0x002e, B:225:0x0636, B:307:0x082f, B:311:0x083b, B:312:0x083e, B:314:0x0840, B:315:0x0843, B:317:0x0845, B:318:0x0848, B:6:0x001b, B:8:0x0021, B:226:0x063e, B:229:0x0651, B:231:0x065d, B:233:0x066b, B:235:0x0671, B:237:0x0682, B:240:0x0688, B:242:0x0692, B:244:0x069f, B:246:0x06ab, B:247:0x06b0, B:251:0x06bc, B:252:0x06bf, B:255:0x06cc, B:257:0x06d8, B:259:0x06e6, B:261:0x06ec, B:262:0x0700, B:265:0x0741, B:273:0x076a, B:276:0x0782, B:268:0x0752, B:269:0x075b, B:274:0x076e, B:282:0x0797, B:283:0x079d, B:286:0x07b5, B:288:0x07c1, B:290:0x07cf, B:292:0x07d5, B:294:0x07ea, B:296:0x07f0, B:298:0x07fe, B:299:0x080a, B:305:0x0819, B:306:0x081c, B:10:0x0036, B:13:0x005b, B:15:0x0069, B:17:0x0075, B:19:0x007b, B:22:0x008c, B:24:0x0098, B:27:0x009e, B:30:0x00bb, B:32:0x00cb, B:34:0x00d6, B:36:0x00dc, B:38:0x00f8, B:42:0x0105, B:46:0x0115, B:53:0x0137, B:55:0x013f, B:197:0x052e, B:57:0x014c, B:58:0x0152, B:60:0x015c, B:63:0x0166, B:65:0x016e, B:66:0x0189, B:68:0x0194, B:91:0x0224, B:71:0x01a3, B:73:0x01ab, B:75:0x01b9, B:79:0x01da, B:81:0x01e3, B:83:0x01f1, B:86:0x0201, B:88:0x0206, B:89:0x020d, B:90:0x0211, B:92:0x023f, B:94:0x024a, B:96:0x0260, B:99:0x026a, B:101:0x0272, B:104:0x027c, B:107:0x0284, B:109:0x029e, B:115:0x02ba, B:117:0x02be, B:122:0x02d7, B:136:0x0304, B:138:0x0358, B:141:0x0364, B:137:0x0333, B:120:0x02d2, B:112:0x02ad, B:142:0x0381, B:143:0x039f, B:145:0x03b5, B:147:0x03bb, B:151:0x03c2, B:152:0x03fe, B:154:0x0404, B:157:0x040e, B:159:0x0416, B:161:0x0421, B:162:0x042e, B:163:0x043f, B:165:0x0447, B:167:0x0457, B:169:0x0464, B:170:0x0476, B:172:0x0483, B:173:0x0491, B:175:0x0497, B:178:0x049e, B:181:0x04a5, B:183:0x04a9, B:186:0x04b7, B:189:0x04bc, B:192:0x04c9, B:194:0x04d1, B:195:0x04f3, B:45:0x010e, B:48:0x011a, B:203:0x0567, B:207:0x0592, B:208:0x0598, B:210:0x059e, B:212:0x05b4, B:214:0x05c6, B:215:0x05d0), top: B:327:0x0016 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2131
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.jih.run():void");
            }
        };
        this.F = new ArrayList();
        this.O = new jio(this);
    }

    public static final boolean G(jry jryVar, float f) {
        if (f >= 0.0f || ((Number) jryVar.a.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) jryVar.a.invoke()).floatValue() < ((Number) jryVar.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean H(jry jryVar) {
        fdae fdaeVar = jryVar.a;
        if (((Number) fdaeVar.invoke()).floatValue() <= 0.0f || jryVar.c) {
            return ((Number) fdaeVar.invoke()).floatValue() < ((Number) jryVar.b.invoke()).floatValue() && jryVar.c;
        }
        return true;
    }

    public static final boolean I(jry jryVar) {
        fdae fdaeVar = jryVar.a;
        if (((Number) fdaeVar.invoke()).floatValue() >= ((Number) jryVar.b.invoke()).floatValue() || jryVar.c) {
            return ((Number) fdaeVar.invoke()).floatValue() > 0.0f && jryVar.c;
        }
        return true;
    }

    static /* synthetic */ void K(jir jirVar, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        jirVar.M(i, i2, num, null);
    }

    public static final juo L(jsc jscVar) {
        return (juo) jsd.a(jscVar, jte.E);
    }

    public static final CharSequence N(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i = 100000;
        if (charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
        charSequenceSubSequence.getClass();
        return charSequenceSubSequence;
    }

    public static final String O(jsl jslVar) {
        List list;
        juo juoVarL;
        if (jslVar != null) {
            jsc jscVar = jslVar.c;
            jtn jtnVar = jte.a;
            if (jscVar.f(jtnVar)) {
                return kjw.d((List) jscVar.b(jtnVar), ",", null, 62);
            }
            if (!jscVar.f(jte.E) ? !((list = (List) jsd.a(jscVar, jte.A)) == null || (juoVarL = (juo) fcva.P(list)) == null) : (juoVarL = L(jscVar)) != null) {
                return juoVarL.b;
            }
        }
        return null;
    }

    private final ijz R(ikp ikpVar, jsl jslVar) {
        return ikpVar.a(kjh.d(jslVar.b()), jslVar.b.s, this.b.l());
    }

    private static final Rect S(ihu ihuVar) {
        return new Rect((int) ihuVar.b, (int) ihuVar.c, (int) ihuVar.d, (int) ihuVar.e);
    }

    private static final float[] T(ijz ijzVar) {
        if (!(ijzVar instanceof ijy)) {
            return null;
        }
        ihw ihwVar = ((ijy) ijzVar).a;
        long j = ihwVar.e;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long j2 = ihwVar.f;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long j3 = ihwVar.g;
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j4 = ihwVar.h;
        return new float[]{fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5, fIntBitsToFloat6, Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (4294967295L & j4))};
    }

    private static final Rect U(ijz ijzVar) {
        if ((ijzVar instanceof ijx) || (ijzVar instanceof ijy)) {
            return S(ijzVar.a());
        }
        return null;
    }

    private static final Region V(ijz ijzVar) {
        if (!(ijzVar instanceof ijw)) {
            return null;
        }
        ijw ijwVar = (ijw) ijzVar;
        Region region = new Region(S(ijwVar.a()));
        Region region2 = new Region();
        region2.setPath(((iik) ijwVar.a).a, region);
        return region2;
    }

    public static final float j(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    public final void A(int i) {
        int i2 = this.c;
        if (i2 == i) {
            return;
        }
        this.c = i;
        K(this, i, 128, null, 12);
        K(this, i2, 256, null, 12);
    }

    public final boolean B(boolean z, int i, long j) {
        long[] jArr;
        int i2;
        Object[] objArr;
        int i3;
        long[] jArr2;
        char c;
        Object[] objArr2;
        boolean z2;
        jry jryVar;
        int i4 = 0;
        if (!fdbq.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        ctj ctjVarQ = q();
        if (!ihs.h(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
            jtn jtnVar = z ? jte.u : jte.t;
            Object[] objArr3 = ctjVarQ.c;
            long[] jArr3 = ctjVarQ.a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return false;
            }
            int i5 = 0;
            boolean z3 = false;
            while (true) {
                long j2 = jArr3[i5];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = i5 - length;
                    int i7 = i4;
                    while (true) {
                        i2 = i4;
                        i3 = 8 - ((~i6) >>> 31);
                        if (i7 >= i3) {
                            break;
                        }
                        if ((j2 & 255) < 128) {
                            jsn jsnVar = (jsn) objArr3[(i5 << 3) + i7];
                            kjd kjdVar = jsnVar.b;
                            c = '\b';
                            jArr2 = jArr3;
                            objArr2 = objArr3;
                            z2 = z3;
                            if (new ihu(kjdVar.b, kjdVar.c, kjdVar.d, kjdVar.e).g(j) && (jryVar = (jry) jsd.a(jsnVar.a.c, jtnVar)) != null) {
                                boolean z4 = jryVar.c;
                                int i8 = z4 ? -i : i;
                                if ((i != 0 || !z4) && i8 >= 0 ? ((Number) jryVar.a.invoke()).floatValue() < ((Number) jryVar.b.invoke()).floatValue() : ((Number) jryVar.a.invoke()).floatValue() > 0.0f) {
                                    z3 = true;
                                }
                            }
                            j2 >>= c;
                            i7++;
                            i4 = i2;
                            jArr3 = jArr2;
                            objArr3 = objArr2;
                        } else {
                            jArr2 = jArr3;
                            c = '\b';
                            objArr2 = objArr3;
                            z2 = z3;
                        }
                        z3 = z2;
                        j2 >>= c;
                        i7++;
                        i4 = i2;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                    }
                    jArr = jArr3;
                    objArr = objArr3;
                    boolean z5 = z3;
                    if (i3 != 8) {
                        return z5;
                    }
                    z3 = z5;
                } else {
                    jArr = jArr3;
                    i2 = i4;
                    objArr = objArr3;
                }
                if (i5 == length) {
                    return z3;
                }
                i5++;
                i4 = i2;
                jArr3 = jArr;
                objArr3 = objArr;
            }
        }
        return false;
    }

    public final boolean C(int i) {
        return this.i == i;
    }

    public final boolean D() {
        return this.d.isEnabled() && !this.g.isEmpty();
    }

    public final boolean E() {
        if (fdbq.f(null, true)) {
            return true;
        }
        if (fdbq.f(null, false)) {
            return false;
        }
        AccessibilityManager accessibilityManager = this.d;
        if (Build.VERSION.SDK_INT >= 34) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
        return true;
    }

    public final boolean F() {
        AccessibilityManager accessibilityManager = this.d;
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final boolean J(jsl jslVar, int i, int i2, boolean z) {
        String strO;
        jsc jscVar = jslVar.c;
        jtn jtnVar = jsa.i;
        if (jscVar.f(jtnVar) && jiv.d(jslVar)) {
            return ((Boolean) ((fdau) ((jrn) jscVar.b(jtnVar)).b).a(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        }
        if ((i == i2 && i2 == this.r) || (strO = O(jslVar)) == null) {
            return false;
        }
        if (i < 0 || i != i2 || i2 > strO.length()) {
            i = -1;
        }
        this.r = i;
        boolean z2 = strO.length() > 0;
        int i3 = jslVar.e;
        P(p(m(i3), z2 ? Integer.valueOf(this.r) : null, z2 ? Integer.valueOf(this.r) : null, z2 ? Integer.valueOf(strO.length()) : null, strO));
        y(i3);
        return true;
    }

    public final void M(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !D()) {
            return;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(kjw.d(list, ",", null, 62));
        }
        P(accessibilityEventO);
    }

    public final void P(AccessibilityEvent accessibilityEvent) {
        if (D()) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                this.m = true;
            }
            try {
                ((Boolean) this.H.invoke(accessibilityEvent)).booleanValue();
            } finally {
                this.m = false;
            }
        }
    }

    @Override // defpackage.lcl
    public final lhj a(View view) {
        return this.J;
    }

    public final int k(jsl jslVar) {
        jsc jscVar = jslVar.c;
        if (!jscVar.f(jte.a)) {
            jtn jtnVar = jte.F;
            if (jscVar.f(jtnVar)) {
                return jyo.a(((jyo) jscVar.b(jtnVar)).b);
            }
        }
        return this.r;
    }

    public final int l(jsl jslVar) {
        jsc jscVar = jslVar.c;
        if (!jscVar.f(jte.a)) {
            jtn jtnVar = jte.F;
            if (jscVar.f(jtnVar)) {
                return jyo.e(((jyo) jscVar.b(jtnVar)).b);
            }
        }
        return this.r;
    }

    public final int m(int i) {
        if (i == this.b.q.a().e) {
            return -1;
        }
        return i;
    }

    public final Rect n(jsn jsnVar) {
        kjd kjdVar = jsnVar.b;
        long jFloatToRawIntBits = Float.floatToRawIntBits(kjdVar.b);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(kjdVar.c);
        AndroidComposeView androidComposeView = this.b;
        long jH = androidComposeView.h((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L));
        long jH2 = androidComposeView.h((Float.floatToRawIntBits(kjdVar.d) << 32) | (Float.floatToRawIntBits(kjdVar.e) & 4294967295L));
        int i = (int) (jH2 >> 32);
        int i2 = (int) (jH >> 32);
        int i3 = (int) (jH2 & 4294967295L);
        int i4 = (int) (jH & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i))), (int) Math.floor(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3))));
    }

    public final AccessibilityEvent o(int i, int i2) {
        jsn jsnVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.b;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i);
        if (D() && (jsnVar = (jsn) q().a(i)) != null) {
            jsc jscVar = jsnVar.a.c;
            accessibilityEventObtain.setPassword(jscVar.f(jte.J));
            boolean zF = fdbq.f(jsd.a(jscVar, jte.n), true);
            if (Build.VERSION.SDK_INT >= 34) {
                accessibilityEventObtain.setAccessibilityDataSensitive(zF);
            }
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final ctj q() {
        if (this.t) {
            this.t = false;
            AndroidComposeView androidComposeView = this.b;
            this.M = jsp.c(androidComposeView.q);
            if (D()) {
                ctj ctjVar = this.M;
                cuf cufVar = this.w;
                cuf cufVar2 = this.x;
                Resources resources = androidComposeView.getContext().getResources();
                cufVar.c();
                cufVar2.c();
                jsn jsnVar = (jsn) ctjVar.a(-1);
                jsl jslVar = jsnVar != null ? jsnVar.a : null;
                jslVar.getClass();
                List listA = jtw.a(jslVar, new jit(ctjVar), new jiu(resources), fcva.b(jslVar));
                int iE = fcva.e(listA);
                if (iE > 0) {
                    int i = 1;
                    while (true) {
                        int i2 = ((jsl) listA.get(i - 1)).e;
                        int i3 = ((jsl) listA.get(i)).e;
                        cufVar.d(i2, i3);
                        cufVar2.d(i3, i2);
                        if (i == iE) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.M;
    }

    public final lhg r() {
        if (this.d.isEnabled()) {
            return null;
        }
        return lhg.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[Catch: all -> 0x01ad, TryCatch #0 {all -> 0x01ad, blocks: (B:13:0x002a, B:22:0x004d, B:25:0x005e, B:27:0x0066, B:29:0x006f, B:31:0x0077, B:33:0x0083, B:35:0x0091, B:40:0x00a5, B:43:0x00ac, B:45:0x00b0, B:49:0x00bb, B:51:0x00c3, B:38:0x009d, B:52:0x00d0, B:66:0x0148, B:55:0x00d7, B:57:0x00e5, B:60:0x00fb, B:62:0x0103, B:64:0x0125, B:65:0x0145, B:67:0x014c, B:69:0x0154, B:70:0x0172, B:72:0x0179, B:73:0x0182, B:18:0x003a, B:21:0x0041), top: B:82:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01a0 -> B:22:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jir.s(fcxy):java.lang.Object");
    }

    public final void t(int i, lhg lhgVar, String str, Bundle bundle) {
        jsl jslVar;
        ikp ikpVar;
        Region regionV;
        float[] fArrT;
        Rect rectU;
        jyi jyiVar;
        int i2;
        jsn jsnVar = (jsn) q().a(i);
        if (jsnVar == null || (jslVar = jsnVar.a) == null) {
            return;
        }
        String str2 = this.y;
        String strO = O(jslVar);
        if (fdbq.f(str, str2)) {
            int iB = this.w.b(i);
            if (iB != -1) {
                lhgVar.a().putInt(str, iB);
                return;
            }
            return;
        }
        if (fdbq.f(str, this.z)) {
            int iB2 = this.x.b(i);
            if (iB2 != -1) {
                lhgVar.a().putInt(str, iB2);
                return;
            }
            return;
        }
        jsc jscVar = jslVar.c;
        if (jscVar.f(jsa.a) && bundle != null && fdbq.f(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 > 0 && i3 >= 0) {
                if (i3 < (strO != null ? strO.length() : Alert.DURATION_SHOW_INDEFINITELY)) {
                    jyi jyiVarC = joh.c(jscVar);
                    if (jyiVarC != null) {
                        ArrayList arrayList = new ArrayList();
                        int i5 = 0;
                        while (i5 < i4) {
                            int i6 = i3 + i5;
                            RectF rectF = null;
                            if (i6 >= jyiVarC.a.a.a()) {
                                arrayList.add(null);
                                jyiVar = jyiVarC;
                                i2 = i5;
                            } else {
                                ihu ihuVarF = jyiVarC.m(i6).f(jslVar.a());
                                ihu ihuVarC = jslVar.c();
                                ihu ihuVarD = ihuVarF.i(ihuVarC) ? ihuVarF.d(ihuVarC) : null;
                                if (ihuVarD != null) {
                                    AndroidComposeView androidComposeView = this.b;
                                    long jFloatToRawIntBits = Float.floatToRawIntBits(ihuVarD.b);
                                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(ihuVarD.c);
                                    float f = ihuVarD.d;
                                    long jH = androidComposeView.h((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L));
                                    long jFloatToRawIntBits3 = Float.floatToRawIntBits(f);
                                    i2 = i5;
                                    long jH2 = androidComposeView.h((jFloatToRawIntBits3 << 32) | (Float.floatToRawIntBits(ihuVarD.e) & 4294967295L));
                                    int i7 = (int) (jH2 >> 32);
                                    int i8 = (int) (jH >> 32);
                                    jyiVar = jyiVarC;
                                    int i9 = (int) (jH2 & 4294967295L);
                                    int i10 = (int) (jH & 4294967295L);
                                    rectF = new RectF(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i7)), Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i7)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i9)));
                                } else {
                                    jyiVar = jyiVarC;
                                    i2 = i5;
                                }
                                arrayList.add(rectF);
                            }
                            i5 = i2 + 1;
                            jyiVarC = jyiVar;
                        }
                        lhgVar.a().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                        return;
                    }
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        jtn jtnVar = jte.y;
        if (jscVar.f(jtnVar) && bundle != null && fdbq.f(str, "androidx.compose.ui.semantics.testTag")) {
            String str3 = (String) jsd.a(jscVar, jtnVar);
            if (str3 != null) {
                lhgVar.a().putCharSequence(str, str3);
                return;
            }
            return;
        }
        if (fdbq.f(str, "androidx.compose.ui.semantics.id")) {
            lhgVar.a().putInt(str, jslVar.e);
            return;
        }
        if (fdbq.f(str, "androidx.compose.ui.semantics.shapeType")) {
            ikp ikpVar2 = (ikp) jsd.a(jscVar, jte.O);
            if (ikpVar2 != null) {
                ijz ijzVarR = R(ikpVar2, jslVar);
                if (ijzVarR instanceof ijx) {
                    lhgVar.a().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    lhgVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", U(ijzVarR));
                    return;
                } else if (ijzVarR instanceof ijy) {
                    lhgVar.a().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    lhgVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", U(ijzVarR));
                    lhgVar.a().putFloatArray("androidx.compose.ui.semantics.shapeCorners", T(ijzVarR));
                    return;
                } else {
                    if (!(ijzVarR instanceof ijw)) {
                        throw new fctg();
                    }
                    lhgVar.a().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    lhgVar.a().putParcelable("androidx.compose.ui.semantics.shapeRegion", V(ijzVarR));
                    return;
                }
            }
            return;
        }
        if (fdbq.f(str, "androidx.compose.ui.semantics.shapeRect")) {
            ikp ikpVar3 = (ikp) jsd.a(jscVar, jte.O);
            if (ikpVar3 == null || (rectU = U(R(ikpVar3, jslVar))) == null) {
                return;
            }
            lhgVar.a().putParcelable("androidx.compose.ui.semantics.shapeRect", rectU);
            return;
        }
        if (fdbq.f(str, "androidx.compose.ui.semantics.shapeCorners")) {
            ikp ikpVar4 = (ikp) jsd.a(jscVar, jte.O);
            if (ikpVar4 == null || (fArrT = T(R(ikpVar4, jslVar))) == null) {
                return;
            }
            lhgVar.a().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrT);
            return;
        }
        if (!fdbq.f(str, "androidx.compose.ui.semantics.shapeRegion") || (ikpVar = (ikp) jsd.a(jscVar, jte.O)) == null || (regionV = V(R(ikpVar, jslVar))) == null) {
            return;
        }
        lhgVar.a().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionV);
    }

    public final void u(jcr jcrVar) {
        if (this.K.add(jcrVar)) {
            this.L.b(fctx.a);
        }
    }

    public final void v(jof jofVar) {
        if (jofVar.B()) {
            AndroidComposeView androidComposeView = this.b;
            androidComposeView.A.d(jofVar, this.O, new jin(jofVar, this));
        }
    }

    public final void w(jsl jslVar, jog jogVar) {
        int[] iArr = ctm.a;
        cui cuiVar = new cui((byte[]) null);
        List listJ = jslVar.j();
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            jsl jslVar2 = (jsl) listJ.get(i);
            ctj ctjVarQ = q();
            int i2 = jslVar2.e;
            if (ctjVarQ.b(i2)) {
                if (!jogVar.b.a(i2)) {
                    u(jslVar.b);
                    return;
                }
                cuiVar.d(i2);
            }
        }
        cui cuiVar2 = jogVar.b;
        int[] iArr2 = cuiVar2.b;
        long[] jArr = cuiVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else if ((255 & j) < 128 && !cuiVar.a(iArr2[(i3 << 3) + i5])) {
                            u(jslVar.b);
                            return;
                        } else {
                            j >>= 8;
                            i5++;
                        }
                    }
                } else if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List listJ2 = jslVar.j();
        int size2 = listJ2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            jsl jslVar3 = (jsl) listJ2.get(i7);
            ctj ctjVarQ2 = q();
            int i8 = jslVar3.e;
            if (ctjVarQ2.b(i8)) {
                Object objA = this.A.a(i8);
                objA.getClass();
                w(jslVar3, (jog) objA);
            }
        }
    }

    public final void x(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventO = o(m(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        P(accessibilityEventO);
    }

    public final void y(int i) {
        jik jikVar = this.u;
        if (jikVar != null) {
            jsl jslVar = jikVar.a;
            int i2 = jslVar.e;
            if (i != i2) {
                return;
            }
            if (SystemClock.uptimeMillis() - jikVar.f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(m(i2), 131072);
                accessibilityEventO.setFromIndex(jikVar.d);
                accessibilityEventO.setToIndex(jikVar.e);
                accessibilityEventO.setAction(jikVar.b);
                accessibilityEventO.setMovementGranularity(jikVar.c);
                accessibilityEventO.getText().add(O(jslVar));
                P(accessibilityEventO);
            }
        }
        this.u = null;
    }

    public final void z(jsl jslVar, lhg lhgVar) {
        SpannableString spannableString;
        List arrayList;
        int i;
        List arrayList2;
        int i2;
        juo juoVarB = jiv.b(jslVar);
        if (juoVarB != null) {
            AndroidComposeView androidComposeView = this.b;
            kgo kgoVar = this.N;
            kbi kbiVarK = androidComposeView.k();
            kio kioVarL = androidComposeView.l();
            SpannableString spannableString2 = new SpannableString(juoVarB.b);
            List list = juoVarB.c;
            if (list != null) {
                int size = list.size();
                int i3 = 0;
                while (i3 < size) {
                    jum jumVar = (jum) list.get(i3);
                    jxx jxxVar = (jxx) jumVar.a;
                    int i4 = jumVar.b;
                    int i5 = jumVar.c;
                    int i6 = size;
                    long jB = jxxVar.b();
                    long j = jxxVar.b;
                    kcc kccVar = jxxVar.c;
                    kbw kbwVar = jxxVar.d;
                    kbx kbxVar = jxxVar.e;
                    String str = jxxVar.g;
                    long j2 = jxxVar.h;
                    kgw kgwVar = jxxVar.i;
                    kht khtVar = jxxVar.j;
                    kfu kfuVar = jxxVar.k;
                    long j3 = jxxVar.l;
                    khl khlVar = jxxVar.m;
                    iko ikoVar = jxxVar.n;
                    jvs jvsVar = jxxVar.o;
                    ina inaVar = jxxVar.p;
                    long jB2 = jxxVar.b();
                    long j4 = ije.a;
                    int i7 = i3;
                    jxx jxxVar2 = new jxx(fcts.a(jB, jB2) ? jxxVar.a : khq.a(jB), j, kccVar, kbwVar, kbxVar, null, str, j2, kgwVar, khtVar, kfuVar, j3, khlVar, ikoVar, jvsVar, inaVar);
                    kgr.d(spannableString2, jxxVar2.b(), i4, i5);
                    kgr.e(spannableString2, jxxVar2.b, kioVarL, i4, i5);
                    kcc kccVar2 = jxxVar2.c;
                    if (kccVar2 == null && jxxVar2.d == null) {
                        i2 = 33;
                    } else {
                        if (kccVar2 == null) {
                            kccVar2 = kcc.e;
                        }
                        kbw kbwVar2 = jxxVar2.d;
                        StyleSpan styleSpan = new StyleSpan(kas.b(kccVar2, kbwVar2 != null ? kbwVar2.a : 0));
                        i2 = 33;
                        spannableString2.setSpan(styleSpan, i4, i5, 33);
                    }
                    kbj kbjVar = jxxVar2.f;
                    if (kbjVar != null) {
                        if (kbjVar instanceof kce) {
                            spannableString2.setSpan(new TypefaceSpan(((kce) kbjVar).f), i4, i5, i2);
                        } else if (Build.VERSION.SDK_INT >= 28) {
                            kbx kbxVar2 = jxxVar2.e;
                            Object objA = kbiVarK.a(kbjVar, kcc.e, 0, kbxVar2 != null ? kbxVar2.a : 65535).a();
                            objA.getClass();
                            TypefaceSpan typefaceSpan = new TypefaceSpan((Typeface) objA);
                            i2 = 33;
                            spannableString2.setSpan(typefaceSpan, i4, i5, 33);
                        } else {
                            i2 = 33;
                        }
                    }
                    khl khlVar2 = jxxVar2.m;
                    if (khlVar2 != null) {
                        if (khlVar2.a(khl.b)) {
                            spannableString2.setSpan(new UnderlineSpan(), i4, i5, i2);
                        }
                        if (khlVar2.a(khl.c)) {
                            spannableString2.setSpan(new StrikethroughSpan(), i4, i5, i2);
                        }
                    }
                    kht khtVar2 = jxxVar2.j;
                    if (khtVar2 != null) {
                        spannableString2.setSpan(new ScaleXSpan(khtVar2.b), i4, i5, i2);
                    }
                    kgr.f(spannableString2, jxxVar2.k, i4, i5);
                    kgr.c(spannableString2, jxxVar2.l, i4, i5);
                    i3 = i7 + 1;
                    size = i6;
                }
            }
            int iA = juoVarB.a();
            List list2 = juoVarB.a;
            if (list2 != null) {
                arrayList = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    Object obj = list2.get(i8);
                    jum jumVar2 = (jum) obj;
                    if ((jumVar2.a instanceof jys) && jur.b(0, iA, jumVar2.b, jumVar2.c)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = fcvo.a;
            }
            int size3 = arrayList.size();
            for (int i9 = 0; i9 < size3; i9++) {
                jum jumVar3 = (jum) arrayList.get(i9);
                jys jysVar = (jys) jumVar3.a;
                int i10 = jumVar3.b;
                int i11 = jumVar3.c;
                if (!(jysVar instanceof jyu)) {
                    throw new fctg();
                }
                spannableString2.setSpan(new TtsSpan.VerbatimBuilder(((jyu) jysVar).a).build(), i10, i11, 33);
            }
            int iA2 = juoVarB.a();
            if (list2 != null) {
                arrayList2 = new ArrayList(list2.size());
                int size4 = list2.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    Object obj2 = list2.get(i12);
                    jum jumVar4 = (jum) obj2;
                    if ((jumVar4.a instanceof jyt) && jur.b(0, iA2, jumVar4.b, jumVar4.c)) {
                        arrayList2.add(obj2);
                    }
                }
                i = 0;
            } else {
                i = 0;
                arrayList2 = fcvo.a;
            }
            int size5 = arrayList2.size();
            for (int i13 = i; i13 < size5; i13++) {
                jum jumVar5 = (jum) arrayList2.get(i13);
                jyt jytVar = (jyt) jumVar5.a;
                int i14 = jumVar5.b;
                int i15 = jumVar5.c;
                WeakHashMap weakHashMap = kgoVar.a;
                Object obj3 = weakHashMap.get(jytVar);
                if (obj3 == null) {
                    URLSpan uRLSpan = new URLSpan(jytVar.a);
                    weakHashMap.put(jytVar, uRLSpan);
                    obj3 = uRLSpan;
                }
                spannableString2.setSpan((URLSpan) obj3, i14, i15, 33);
            }
            List listG = juoVarB.g(juoVarB.a());
            int size6 = listG.size();
            for (int i16 = i; i16 < size6; i16++) {
                jum jumVar6 = (jum) listG.get(i16);
                int i17 = jumVar6.b;
                int i18 = jumVar6.c;
                if (i17 != i18) {
                    Object obj4 = jumVar6.a;
                    juy juyVar = (juy) obj4;
                    if (juyVar instanceof jux) {
                        obj4.getClass();
                        jum jumVar7 = new jum((jux) obj4, i17, i18);
                        WeakHashMap weakHashMap2 = kgoVar.b;
                        Object obj5 = weakHashMap2.get(jumVar7);
                        if (obj5 == null) {
                            URLSpan uRLSpan2 = new URLSpan(((jux) jumVar7.a).a);
                            weakHashMap2.put(jumVar7, uRLSpan2);
                            obj5 = uRLSpan2;
                        }
                        spannableString2.setSpan((URLSpan) obj5, i17, i18, 33);
                    } else {
                        WeakHashMap weakHashMap3 = kgoVar.c;
                        Object kgeVar = weakHashMap3.get(jumVar6);
                        if (kgeVar == null) {
                            kgeVar = new kge(juyVar);
                            weakHashMap3.put(jumVar6, kgeVar);
                        }
                        spannableString2.setSpan((ClickableSpan) kgeVar, i17, i18, 33);
                    }
                }
            }
            spannableString = (SpannableString) N(spannableString2);
        } else {
            spannableString = null;
        }
        lhgVar.S(spannableString);
    }
}
