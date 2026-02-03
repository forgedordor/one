package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.Optional;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class dhey extends dheg implements dher, dheo {
    public static final dhip a = new dhip("(Sim)");
    SubscriptionManager.OnSubscriptionsChangedListener c;
    volatile Handler d;
    HandlerThread e;
    public final dhem f;
    public final dhep g;
    public final Context h;
    public final fcsu i;
    private final dhet m;
    private final dhes n;
    private final dhhc o;
    private final Executor p;
    private final dhkh q;
    private final SparseArray j = new SparseArray();
    public int b = 1;
    private int k = -1;
    private int l = -1;

    public dhey(Context context, dhhc dhhcVar, dhep dhepVar, dhet dhetVar, dhes dhesVar, dhem dhemVar, fcsu fcsuVar, Executor executor) {
        this.h = context;
        this.o = dhhcVar;
        this.g = dhepVar;
        this.m = dhetVar;
        this.n = dhesVar;
        this.f = dhemVar;
        this.p = new eoss(executor);
        this.i = fcsuVar;
        this.q = new dhkh(fcsuVar);
    }

    public static final int B(Context context) {
        return dhks.b(context).a.getActiveSubscriptionInfoCountMax();
    }

    protected static final String C(Context context, int i) {
        dhkv dhkvVarG = G(context, i);
        String strI = dhkvVarG == null ? "" : dhkvVarG.i();
        return TextUtils.isEmpty(strI) ? "" : strI;
    }

    protected static final String D(Context context, int i) {
        dhkv dhkvVarG = G(context, i);
        String strN = dhkvVarG == null ? "" : dhkvVarG.n();
        if (TextUtils.isEmpty(strN)) {
            throw new IllegalStateException("SIM card is not available");
        }
        return strN;
    }

    static final void E(Context context, ewkl ewklVar) {
        Intent intentA = dhet.a(ewklVar);
        String action = intentA.getAction();
        if (action != null && action.equals("com.google.android.ims.SIM_LOADED")) {
            dhja.l(a, "Handling SIM_LOADED in PhoneSimsStateUpdater.", new Object[0]);
        } else {
            dhja.l(a, "Broadcasting %s", intentA.toString());
            lzx.a(context).b(intentA);
        }
    }

    private final synchronized dhex F(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            dhex dhexVar = (dhex) this.j.get(i2);
            if (dhexVar != null && dhexVar.b == i) {
                return dhexVar;
            }
        }
        return null;
    }

    private static dhkv G(Context context, int i) {
        return dhkv.g(context).f(i);
    }

    private final Optional H(String str) {
        return !TextUtils.isEmpty(str) ? Optional.of(this.o.b(str)) : Optional.empty();
    }

    private final void I(String str) {
        try {
            Optional optionalH = H(str);
            if (optionalH.isPresent()) {
                dhja.l(a, "Caching isFiDevice for iccid: %s", dhiz.SIM_ICCID.c(optionalH.get()));
                this.o.e((String) optionalH.get());
            }
        } catch (dhhd e) {
            dhja.t(e, a, "exception when try to set isFiDeviceToIccid", new Object[0]);
        }
    }

    private final void J(Context context, int i) {
        dhes dhesVar = this.n;
        dbho dbhoVar = dhesVar.e;
        String strC = C(context, i);
        dbhoVar.e(strC);
        String strS = s(context, strC, i);
        dhesVar.f.e(strS);
        dhip dhipVar = a;
        dhiz dhizVar = dhiz.PHONE_NUMBER;
        dhja.d(dhipVar, "Updated raw MSISDN:%s, formatted MSISDN:%s in SimPreferences", dhizVar.c(strC), dhizVar.c(strS));
        if (!dhka.f(context)) {
            dhja.l(dhipVar, "Skipping writing to Msisdn because this is not main bugle process.", new Object[0]);
            return;
        }
        ecem.b();
        try {
            this.o.j("currentActiveMsisdn", strS, "RcsApplicationData");
            dhja.d(dhipVar, "Updated formatted MSISDN:%s in BugleSharedPreferences", dhizVar.c(strS));
        } catch (dhhd e) {
            dhja.j(e, a, "Failed to update from bugleSharedPreferences", new Object[0]);
        }
    }

    private static final String K(Context context, int i) throws dhke, NoSuchMethodException, SecurityException {
        String strM;
        int iB = B(context);
        if (iB <= 1 || i < 0) {
            dhja.d(a, "Don't use sub id to get mcc/mnc: slot_num=%d; sub_id=%d;", Integer.valueOf(iB), Integer.valueOf(i));
            strM = dhkv.g(context).m();
        } else {
            dhja.d(a, "Use sub id %d to get mcc/mnc", Integer.valueOf(i));
            if (craf.b) {
                dhkv dhkvVarG = G(context, i);
                strM = dhkvVarG == null ? "" : dhkvVarG.m();
            } else {
                try {
                    try {
                        TelephonyManager telephonyManager = dhkv.g(context).a;
                        Method declaredMethod = telephonyManager.getClass().getDeclaredMethod("getSimOperator", Integer.TYPE);
                        declaredMethod.setAccessible(true);
                        strM = (String) String.class.cast(declaredMethod.invoke(telephonyManager, Integer.valueOf(i)));
                    } catch (Exception e) {
                        throw new dhke(a.a("getSimOperator", "Invoking ", " failed"), e);
                    }
                } catch (dhke e2) {
                    dhja.j(e2, a, "Failed to get sim operator from telephony for sub id %d", Integer.valueOf(i));
                }
            }
        }
        return TextUtils.isEmpty(strM) ? "" : strM;
    }

    public static IntentFilter q() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ims.SIM_LOADED");
        intentFilter.addAction("com.google.android.ims.SIM_ABSENT");
        return intentFilter;
    }

    final synchronized boolean A(Context context, String str) {
        ewkl ewklVarC = this.m.c();
        if (this.k == b(context) && ewklVarC != null) {
            int iA = ewry.a(ewklVarC.c);
            if (iA == 0) {
                iA = 1;
            }
            if (iA == ("LOADED".equals(str) ? 2 : "ABSENT".equals(str) ? 3 : 1)) {
                if (B(context) > 1) {
                    return this.l == a(context);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dher
    public final int a(Context context) {
        dhks.b(context);
        return SubscriptionManager.getDefaultDataSubscriptionId();
    }

    @Override // defpackage.dher
    public final int b(Context context) {
        dhks.b(context);
        return SubscriptionManager.getDefaultSubscriptionId();
    }

    @Override // defpackage.dheg
    public final /* bridge */ /* synthetic */ void c(Context context, Intent intent) {
        dhja.l(a, "Unexpected action: %s", intent.getAction());
    }

    @Override // defpackage.dheg
    protected final Executor d() {
        return this.p;
    }

    @Override // defpackage.dheg
    public final boolean e(Context context, Intent intent) {
        if ("android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction()) || "android.intent.action.ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED".equals(intent.getAction()) || "android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED".equals(intent.getAction())) {
            dhja.d(a, "Received intent %s", intent.getAction());
            return true;
        }
        dhja.r(a, "Unexpected action: %s", intent.getAction());
        return false;
    }

    @Override // defpackage.dher
    public final int f() {
        return this.n.a();
    }

    @Override // defpackage.dher
    public final synchronized int g() {
        return this.n.b();
    }

    @Override // defpackage.dher
    public final Optional h(int i) {
        String str;
        dhex dhexVarF = F(i);
        return (dhexVarF == null || (str = dhexVarF.e) == null) ? Optional.empty() : Optional.of(str);
    }

    @Override // defpackage.dher
    public final String i() {
        String strH;
        synchronized (this) {
            dhes dhesVar = this.n;
            strH = dhesVar.h();
            if (dhim.d(strH) && dhesVar.t()) {
                try {
                    Context context = this.h;
                    int iG = g();
                    if (p(context)) {
                        J(context, iG);
                    }
                    strH = dhesVar.h();
                } catch (dhkf unused) {
                    dhja.h(a, "Exception updating MSISDN", new Object[0]);
                }
                dhja.d(a, "Formatted MSISDN: %s", dhiz.PHONE_NUMBER.c(strH));
            } else {
                dhja.d(a, "Formatted MSISDN: %s", dhiz.PHONE_NUMBER.c(strH));
            }
        }
        return strH;
    }

    @Override // defpackage.dher
    public final String j() {
        return this.n.j();
    }

    @Override // defpackage.dher
    public final synchronized void k(PrintWriter printWriter) {
        printWriter.println("- SimStateTracker -");
        printWriter.println("  default subId: " + this.k);
        dhes dhesVar = this.n;
        printWriter.println("  stored subId: " + dhesVar.b());
        printWriter.println("  stored slotIndex: " + dhesVar.a());
        printWriter.println("  stored SIM ID: ".concat(String.valueOf(dhiz.SIM_ID.c(dhesVar.l()))));
        printWriter.println("  stored IMSI: ".concat(String.valueOf(dhiz.IMSI.c(dhesVar.j()))));
        printWriter.println("  stored raw MSISDN: ".concat(String.valueOf(dhiz.PHONE_NUMBER.c(dhesVar.k()))));
        printWriter.println("  stored SIM operator: ".concat(String.valueOf(dhesVar.m())));
        printWriter.println("  stored GID1: ".concat(String.valueOf(dhesVar.i())));
        printWriter.println("  isFiDevice: " + dhesVar.t());
        printWriter.println("  # of SIM slot: " + this.b);
        for (int i = 0; i < this.b; i++) {
            printWriter.printf("  SIM slot#%d : %s\n", Integer.valueOf(i), this.j.get(i));
        }
    }

    @Override // defpackage.dher
    public final void l(int i) {
        String str;
        int i2;
        Context context = this.h;
        x(context);
        v();
        dhip dhipVar = a;
        dhja.d(dhipVar, "DefaultSubId=%d", Integer.valueOf(b(context)));
        if (!z()) {
            dhja.d(dhipVar, "SIM subscription update is not finished.", new Object[0]);
            return;
        }
        dhex dhexVarR = r(context);
        if (dhexVarR == null) {
            dhja.r(dhipVar, "Default SIM info not updated.", new Object[0]);
            i2 = -1;
            str = "ABSENT";
        } else {
            str = dhexVarR.f;
            i2 = dhexVarR.b;
        }
        dhja.l(dhipVar, "Processing an intent", new Object[0]);
        w(context, str, i2, i);
    }

    @Override // defpackage.dher
    public final synchronized void m() {
        if (this.d == null) {
            HandlerThread handlerThread = new HandlerThread("SimStateTrackerHandler");
            this.e = handlerThread;
            dqli.a(handlerThread);
            this.e.start();
            this.d = new Handler(this.e.getLooper());
        }
        dhep dhepVar = this.g;
        if (dhepVar != null) {
            Context context = this.h;
            Handler handler = this.d;
            handler.getClass();
            dhepVar.a(context, this, handler);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SIM_STATE_CHANGED");
        intentFilter.addAction("android.intent.action.ACTION_DEFAULT_DATA_SUBSCRIPTION_CHANGED");
        intentFilter.addAction("android.intent.action.ACTION_DEFAULT_VOICE_SUBSCRIPTION_CHANGED");
        Context context2 = this.h;
        context2.registerReceiver(this, intentFilter);
        dhip dhipVar = a;
        dhja.d(dhipVar, "Registered sim events broadcast receiver", new Object[0]);
        Handler handler2 = this.d;
        handler2.getClass();
        handler2.post(new Runnable() { // from class: dheu
            @Override // java.lang.Runnable
            public final void run() {
                dhey dheyVar = this.a;
                dhew dhewVar = new dhew(dheyVar);
                try {
                    dhks.b(dheyVar.h).f(dhewVar);
                    dheyVar.c = dhewVar;
                    dhja.d(dhey.a, "SubscriptionsChangedListener is added.", new Object[0]);
                } catch (dhkf e) {
                    dhja.j(e, dhey.a, "Failed to add onSubscriptionsChangedListener.", new Object[0]);
                }
            }
        });
        dhja.d(dhipVar, "Number of SIM slot: %d", Integer.valueOf(B(context2)));
    }

    @Override // defpackage.dher
    public final void n(String str, String str2) throws dhhd {
        this.o.j("msisdn_for_iccid_".concat(str), str2, "bugle");
    }

    @Override // defpackage.dher
    public final synchronized void o() {
        try {
            this.h.unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            dhja.j(e, a, "Failed to unregister intent receiver.", new Object[0]);
        }
        HandlerThread handlerThread = this.e;
        if (handlerThread != null) {
            handlerThread.quit();
            this.e = null;
            this.d = null;
        }
        SubscriptionManager.OnSubscriptionsChangedListener onSubscriptionsChangedListener = this.c;
        if (onSubscriptionsChangedListener != null) {
            this.c = null;
            try {
                try {
                    dhks.b(this.h).a.removeOnSubscriptionsChangedListener(onSubscriptionsChangedListener);
                    dhja.d(a, "SubscriptionsChangedListener is removed.", new Object[0]);
                } catch (SecurityException e2) {
                    throw new dhkf("READ_PHONE_STATE permission is missing.", e2);
                }
            } catch (Exception e3) {
                dhja.j(e3, a, "Failed to remove onSubscriptionsChangedListener.", new Object[0]);
            }
        }
        dhep dhepVar = this.g;
        if (dhepVar != null) {
            dhepVar.b();
        }
    }

    @Override // defpackage.dher
    public final boolean p(Context context) {
        dhex dhexVarR = r(context);
        return "LOADED".equals(dhexVarR != null ? dhexVarR.f : "");
    }

    final synchronized dhex r(Context context) {
        if (this.b == 1) {
            return (dhex) this.j.get(0);
        }
        return F(b(context));
    }

    protected final String s(Context context, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        dhkv dhkvVarG = G(context, i);
        String strD = dhkvVarG == null ? "" : ejuf.d(dhkvVarG.l());
        if (((ephj) this.i.b()).h(str, strD)) {
            return ejwk.b(this.q.a(str, strD));
        }
        dhja.r(a, "line1number from telephony is invalid! (%s) %s", strD, dhiz.PHONE_NUMBER.c(str));
        return "";
    }

    public final synchronized List t() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.j;
            if (i < sparseArray.size()) {
                dhex dhexVar = (dhex) sparseArray.valueAt(i);
                if (dhexVar != null) {
                    arrayList.add(dhexVar);
                }
                i++;
            }
        }
        return arrayList;
    }

    final synchronized void u(ewkl ewklVar) {
        ewkl ewklVar2;
        try {
            Context context = this.h;
            dhks.b(context);
            int defaultVoiceSubscriptionId = SubscriptionManager.getDefaultVoiceSubscriptionId();
            dhks.b(context);
            int defaultSmsSubscriptionId = SubscriptionManager.getDefaultSmsSubscriptionId();
            int iA = a(context);
            ewkk ewkkVar = (ewkk) ewklVar.toBuilder();
            for (dhex dhexVar : t()) {
                if (dhexVar != null && "LOADED".equals(dhexVar.f)) {
                    int i = dhexVar.b;
                    SubscriptionInfo subscriptionInfoA = dhks.b(context).a(i);
                    String number = subscriptionInfoA != null ? subscriptionInfoA.getNumber() : "";
                    ewkh ewkhVar = (ewkh) ewki.a.createBuilder();
                    boolean z = i == defaultVoiceSubscriptionId;
                    ewkhVar.copyOnWrite();
                    ewki ewkiVar = (ewki) ewkhVar.instance;
                    ewkiVar.b |= 1;
                    ewkiVar.c = z;
                    boolean z2 = i == defaultSmsSubscriptionId;
                    ewkhVar.copyOnWrite();
                    ewki ewkiVar2 = (ewki) ewkhVar.instance;
                    ewkiVar2.b |= 2;
                    ewkiVar2.d = z2;
                    boolean z3 = i == iA;
                    ewkhVar.copyOnWrite();
                    ewki ewkiVar3 = (ewki) ewkhVar.instance;
                    ewkiVar3.b |= 4;
                    ewkiVar3.e = z3;
                    ewki ewkiVar4 = (ewki) ewkhVar.build();
                    ewkf ewkfVar = (ewkf) ewkj.a.createBuilder();
                    ewkfVar.copyOnWrite();
                    ewkj ewkjVar = (ewkj) ewkfVar.instance;
                    ewkjVar.b |= 1;
                    ewkjVar.c = i;
                    int i2 = true != TextUtils.isEmpty(number) ? 2 : 3;
                    ewkfVar.copyOnWrite();
                    ewkj ewkjVar2 = (ewkj) ewkfVar.instance;
                    ewkjVar2.d = i2 - 1;
                    ewkjVar2.b |= 2;
                    ewkfVar.copyOnWrite();
                    ewkj ewkjVar3 = (ewkj) ewkfVar.instance;
                    ewkiVar4.getClass();
                    ewkjVar3.e = ewkiVar4;
                    ewkjVar3.b |= 4;
                    ewkj ewkjVar4 = (ewkj) ewkfVar.build();
                    ewkkVar.copyOnWrite();
                    ewkl ewklVar3 = (ewkl) ewkkVar.instance;
                    ewkjVar4.getClass();
                    evtg evtgVar = ewklVar3.g;
                    if (!evtgVar.c()) {
                        ewklVar3.g = evsn.mutableCopy(evtgVar);
                    }
                    ewklVar3.g.add(ewkjVar4);
                }
            }
            ewklVar2 = (ewkl) ewkkVar.build();
        } catch (dhkf e) {
            dhja.j(e, a, "Attempted to get device SIM configuration without phone permission", new Object[0]);
            ewklVar2 = ewklVar;
        }
        this.f.b(ewklVar2);
    }

    public final synchronized void v() {
        for (int i = 0; i < this.b; i++) {
            dhja.d(a, "SIM slot#%d : %s", Integer.valueOf(i), this.j.get(i));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:24|250|25|26|27|28|246|29|(2:31|32)|58|(3:252|86|(2:88|(1:90)(1:94))(0))(1:95)|96|(31:237|98|(1:100)(1:102)|101|108|(1:110)(2:258|112)|113|(1:115)|116|(6:118|(6:121|(4:123|239|124|127)|128|(6:130|248|131|132|134|267)(1:268)|135|119)|266|136|(5:139|243|140|(3:142|271|166)(6:143|(6:146|(4:148|241|149|(4:151|(1:153)(1:154)|155|(4:276|157|279|277)(5:275|158|(1:160)|161|162))(2:274|163))(1:273)|164|278|277|144)|272|165|270|166)|137)|269)|169|(1:171)|172|(1:174)(1:175)|176|(1:178)|179|(1:181)(1:182)|183|(1:185)|186|(1:188)(1:189)|190|262|191|(1:193)(1:194)|195|(1:197)(2:198|(1:200))|206|(1:208)|209)(1:106)|107|108|(0)(0)|113|(0)|116|(0)|169|(0)|172|(0)(0)|176|(0)|179|(0)(0)|183|(0)|186|(0)(0)|190|262|191|(0)(0)|195|(0)(0)|206|(0)|209) */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0552, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0555, code lost:
    
        defpackage.dhja.t(r0, defpackage.dhey.a, "Exception getting groupIdLevel1", new java.lang.Object[0]);
        r0 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02da A[Catch: IllegalStateException -> 0x0639, dhkf -> 0x0645, all -> 0x06c4, TryCatch #8 {IllegalStateException -> 0x0639, blocks: (B:13:0x0068, B:20:0x0083, B:22:0x0090, B:25:0x009c, B:29:0x00a8, B:31:0x00b8, B:86:0x01ab, B:88:0x01b5, B:90:0x01d1, B:96:0x0224, B:98:0x0242, B:108:0x0263, B:113:0x02c6, B:116:0x02ce, B:118:0x02da, B:119:0x02f7, B:121:0x02fd, B:124:0x030d, B:127:0x032e, B:126:0x031d, B:128:0x033f, B:131:0x0349, B:134:0x036d, B:133:0x035b, B:136:0x0382, B:137:0x0386, B:139:0x038c, B:140:0x03cf, B:142:0x03d5, B:143:0x03e2, B:144:0x03e6, B:146:0x03ec, B:149:0x03fe, B:151:0x0404, B:153:0x0419, B:155:0x0424, B:157:0x0432, B:158:0x0451, B:160:0x045d, B:161:0x0460, B:168:0x0498, B:169:0x04a5, B:171:0x04ad, B:172:0x04b7, B:176:0x04e4, B:179:0x04ec, B:183:0x04fe, B:186:0x0506, B:190:0x051a, B:191:0x052b, B:195:0x0538, B:206:0x0561, B:208:0x05e8, B:209:0x0602, B:198:0x0541, B:194:0x0534, B:205:0x0555, B:182:0x04fa, B:175:0x04de, B:112:0x02c0, B:211:0x0631, B:212:0x0638, B:102:0x024d, B:105:0x0253, B:94:0x0208, B:95:0x0220, B:93:0x01ff, B:45:0x00f9, B:47:0x010c, B:49:0x0112, B:56:0x0121, B:61:0x0133, B:64:0x0145, B:65:0x0153, B:67:0x0159, B:69:0x0169, B:71:0x0173, B:73:0x0184, B:80:0x0190, B:83:0x019d, B:60:0x012a, B:44:0x00f0, B:19:0x0080, B:16:0x007a), top: B:245:0x0068, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04ad A[Catch: IllegalStateException -> 0x0639, dhkf -> 0x0645, all -> 0x06c4, TryCatch #8 {IllegalStateException -> 0x0639, blocks: (B:13:0x0068, B:20:0x0083, B:22:0x0090, B:25:0x009c, B:29:0x00a8, B:31:0x00b8, B:86:0x01ab, B:88:0x01b5, B:90:0x01d1, B:96:0x0224, B:98:0x0242, B:108:0x0263, B:113:0x02c6, B:116:0x02ce, B:118:0x02da, B:119:0x02f7, B:121:0x02fd, B:124:0x030d, B:127:0x032e, B:126:0x031d, B:128:0x033f, B:131:0x0349, B:134:0x036d, B:133:0x035b, B:136:0x0382, B:137:0x0386, B:139:0x038c, B:140:0x03cf, B:142:0x03d5, B:143:0x03e2, B:144:0x03e6, B:146:0x03ec, B:149:0x03fe, B:151:0x0404, B:153:0x0419, B:155:0x0424, B:157:0x0432, B:158:0x0451, B:160:0x045d, B:161:0x0460, B:168:0x0498, B:169:0x04a5, B:171:0x04ad, B:172:0x04b7, B:176:0x04e4, B:179:0x04ec, B:183:0x04fe, B:186:0x0506, B:190:0x051a, B:191:0x052b, B:195:0x0538, B:206:0x0561, B:208:0x05e8, B:209:0x0602, B:198:0x0541, B:194:0x0534, B:205:0x0555, B:182:0x04fa, B:175:0x04de, B:112:0x02c0, B:211:0x0631, B:212:0x0638, B:102:0x024d, B:105:0x0253, B:94:0x0208, B:95:0x0220, B:93:0x01ff, B:45:0x00f9, B:47:0x010c, B:49:0x0112, B:56:0x0121, B:61:0x0133, B:64:0x0145, B:65:0x0153, B:67:0x0159, B:69:0x0169, B:71:0x0173, B:73:0x0184, B:80:0x0190, B:83:0x019d, B:60:0x012a, B:44:0x00f0, B:19:0x0080, B:16:0x007a), top: B:245:0x0068, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04de A[Catch: IllegalStateException -> 0x0639, dhkf -> 0x0645, all -> 0x06c4, TryCatch #8 {IllegalStateException -> 0x0639, blocks: (B:13:0x0068, B:20:0x0083, B:22:0x0090, B:25:0x009c, B:29:0x00a8, B:31:0x00b8, B:86:0x01ab, B:88:0x01b5, B:90:0x01d1, B:96:0x0224, B:98:0x0242, B:108:0x0263, B:113:0x02c6, B:116:0x02ce, B:118:0x02da, B:119:0x02f7, B:121:0x02fd, B:124:0x030d, B:127:0x032e, B:126:0x031d, B:128:0x033f, B:131:0x0349, B:134:0x036d, B:133:0x035b, B:136:0x0382, B:137:0x0386, B:139:0x038c, B:140:0x03cf, B:142:0x03d5, B:143:0x03e2, B:144:0x03e6, B:146:0x03ec, B:149:0x03fe, B:151:0x0404, B:153:0x0419, B:155:0x0424, B:157:0x0432, B:158:0x0451, B:160:0x045d, B:161:0x0460, B:168:0x0498, B:169:0x04a5, B:171:0x04ad, B:172:0x04b7, B:176:0x04e4, B:179:0x04ec, B:183:0x04fe, B:186:0x0506, B:190:0x051a, B:191:0x052b, B:195:0x0538, B:206:0x0561, B:208:0x05e8, B:209:0x0602, B:198:0x0541, B:194:0x0534, B:205:0x0555, B:182:0x04fa, B:175:0x04de, B:112:0x02c0, B:211:0x0631, B:212:0x0638, B:102:0x024d, B:105:0x0253, B:94:0x0208, B:95:0x0220, B:93:0x01ff, B:45:0x00f9, B:47:0x010c, B:49:0x0112, B:56:0x0121, B:61:0x0133, B:64:0x0145, B:65:0x0153, B:67:0x0159, B:69:0x0169, B:71:0x0173, B:73:0x0184, B:80:0x0190, B:83:0x019d, B:60:0x012a, B:44:0x00f0, B:19:0x0080, B:16:0x007a), top: B:245:0x0068, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04fa A[Catch: IllegalStateException -> 0x0639, dhkf -> 0x0645, all -> 0x06c4, TryCatch #8 {IllegalStateException -> 0x0639, blocks: (B:13:0x0068, B:20:0x0083, B:22:0x0090, B:25:0x009c, B:29:0x00a8, B:31:0x00b8, B:86:0x01ab, B:88:0x01b5, B:90:0x01d1, B:96:0x0224, B:98:0x0242, B:108:0x0263, B:113:0x02c6, B:116:0x02ce, B:118:0x02da, B:119:0x02f7, B:121:0x02fd, B:124:0x030d, B:127:0x032e, B:126:0x031d, B:128:0x033f, B:131:0x0349, B:134:0x036d, B:133:0x035b, B:136:0x0382, B:137:0x0386, B:139:0x038c, B:140:0x03cf, B:142:0x03d5, B:143:0x03e2, B:144:0x03e6, B:146:0x03ec, B:149:0x03fe, B:151:0x0404, B:153:0x0419, B:155:0x0424, B:157:0x0432, B:158:0x0451, B:160:0x045d, B:161:0x0460, B:168:0x0498, B:169:0x04a5, B:171:0x04ad, B:172:0x04b7, B:176:0x04e4, B:179:0x04ec, B:183:0x04fe, B:186:0x0506, B:190:0x051a, B:191:0x052b, B:195:0x0538, B:206:0x0561, B:208:0x05e8, B:209:0x0602, B:198:0x0541, B:194:0x0534, B:205:0x0555, B:182:0x04fa, B:175:0x04de, B:112:0x02c0, B:211:0x0631, B:212:0x0638, B:102:0x024d, B:105:0x0253, B:94:0x0208, B:95:0x0220, B:93:0x01ff, B:45:0x00f9, B:47:0x010c, B:49:0x0112, B:56:0x0121, B:61:0x0133, B:64:0x0145, B:65:0x0153, B:67:0x0159, B:69:0x0169, B:71:0x0173, B:73:0x0184, B:80:0x0190, B:83:0x019d, B:60:0x012a, B:44:0x00f0, B:19:0x0080, B:16:0x007a), top: B:245:0x0068, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0534 A[Catch: dhkf | SecurityException -> 0x0552, SecurityException -> 0x0554, IllegalStateException -> 0x0639, all -> 0x06c4, TryCatch #8 {IllegalStateException -> 0x0639, blocks: (B:13:0x0068, B:20:0x0083, B:22:0x0090, B:25:0x009c, B:29:0x00a8, B:31:0x00b8, B:86:0x01ab, B:88:0x01b5, B:90:0x01d1, B:96:0x0224, B:98:0x0242, B:108:0x0263, B:113:0x02c6, B:116:0x02ce, B:118:0x02da, B:119:0x02f7, B:121:0x02fd, B:124:0x030d, B:127:0x032e, B:126:0x031d, B:128:0x033f, B:131:0x0349, B:134:0x036d, B:133:0x035b, B:136:0x0382, B:137:0x0386, B:139:0x038c, B:140:0x03cf, B:142:0x03d5, B:143:0x03e2, B:144:0x03e6, B:146:0x03ec, B:149:0x03fe, B:151:0x0404, B:153:0x0419, B:155:0x0424, B:157:0x0432, B:158:0x0451, B:160:0x045d, B:161:0x0460, B:168:0x0498, B:169:0x04a5, B:171:0x04ad, B:172:0x04b7, B:176:0x04e4, B:179:0x04ec, B:183:0x04fe, B:186:0x0506, B:190:0x051a, B:191:0x052b, B:195:0x0538, B:206:0x0561, B:208:0x05e8, B:209:0x0602, B:198:0x0541, B:194:0x0534, B:205:0x0555, B:182:0x04fa, B:175:0x04de, B:112:0x02c0, B:211:0x0631, B:212:0x0638, B:102:0x024d, B:105:0x0253, B:94:0x0208, B:95:0x0220, B:93:0x01ff, B:45:0x00f9, B:47:0x010c, B:49:0x0112, B:56:0x0121, B:61:0x0133, B:64:0x0145, B:65:0x0153, B:67:0x0159, B:69:0x0169, B:71:0x0173, B:73:0x0184, B:80:0x0190, B:83:0x019d, B:60:0x012a, B:44:0x00f0, B:19:0x0080, B:16:0x007a), top: B:245:0x0068, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0541 A[Catch: dhkf | SecurityException -> 0x0552, SecurityException -> 0x0554, IllegalStateException -> 0x0639, all -> 0x06c4, TryCatch #8 {IllegalStateException -> 0x0639, blocks: (B:13:0x0068, B:20:0x0083, B:22:0x0090, B:25:0x009c, B:29:0x00a8, B:31:0x00b8, B:86:0x01ab, B:88:0x01b5, B:90:0x01d1, B:96:0x0224, B:98:0x0242, B:108:0x0263, B:113:0x02c6, B:116:0x02ce, B:118:0x02da, B:119:0x02f7, B:121:0x02fd, B:124:0x030d, B:127:0x032e, B:126:0x031d, B:128:0x033f, B:131:0x0349, B:134:0x036d, B:133:0x035b, B:136:0x0382, B:137:0x0386, B:139:0x038c, B:140:0x03cf, B:142:0x03d5, B:143:0x03e2, B:144:0x03e6, B:146:0x03ec, B:149:0x03fe, B:151:0x0404, B:153:0x0419, B:155:0x0424, B:157:0x0432, B:158:0x0451, B:160:0x045d, B:161:0x0460, B:168:0x0498, B:169:0x04a5, B:171:0x04ad, B:172:0x04b7, B:176:0x04e4, B:179:0x04ec, B:183:0x04fe, B:186:0x0506, B:190:0x051a, B:191:0x052b, B:195:0x0538, B:206:0x0561, B:208:0x05e8, B:209:0x0602, B:198:0x0541, B:194:0x0534, B:205:0x0555, B:182:0x04fa, B:175:0x04de, B:112:0x02c0, B:211:0x0631, B:212:0x0638, B:102:0x024d, B:105:0x0253, B:94:0x0208, B:95:0x0220, B:93:0x01ff, B:45:0x00f9, B:47:0x010c, B:49:0x0112, B:56:0x0121, B:61:0x0133, B:64:0x0145, B:65:0x0153, B:67:0x0159, B:69:0x0169, B:71:0x0173, B:73:0x0184, B:80:0x0190, B:83:0x019d, B:60:0x012a, B:44:0x00f0, B:19:0x0080, B:16:0x007a), top: B:245:0x0068, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05e8 A[Catch: IllegalStateException -> 0x0639, dhkf -> 0x0645, all -> 0x06c4, TryCatch #8 {IllegalStateException -> 0x0639, blocks: (B:13:0x0068, B:20:0x0083, B:22:0x0090, B:25:0x009c, B:29:0x00a8, B:31:0x00b8, B:86:0x01ab, B:88:0x01b5, B:90:0x01d1, B:96:0x0224, B:98:0x0242, B:108:0x0263, B:113:0x02c6, B:116:0x02ce, B:118:0x02da, B:119:0x02f7, B:121:0x02fd, B:124:0x030d, B:127:0x032e, B:126:0x031d, B:128:0x033f, B:131:0x0349, B:134:0x036d, B:133:0x035b, B:136:0x0382, B:137:0x0386, B:139:0x038c, B:140:0x03cf, B:142:0x03d5, B:143:0x03e2, B:144:0x03e6, B:146:0x03ec, B:149:0x03fe, B:151:0x0404, B:153:0x0419, B:155:0x0424, B:157:0x0432, B:158:0x0451, B:160:0x045d, B:161:0x0460, B:168:0x0498, B:169:0x04a5, B:171:0x04ad, B:172:0x04b7, B:176:0x04e4, B:179:0x04ec, B:183:0x04fe, B:186:0x0506, B:190:0x051a, B:191:0x052b, B:195:0x0538, B:206:0x0561, B:208:0x05e8, B:209:0x0602, B:198:0x0541, B:194:0x0534, B:205:0x0555, B:182:0x04fa, B:175:0x04de, B:112:0x02c0, B:211:0x0631, B:212:0x0638, B:102:0x024d, B:105:0x0253, B:94:0x0208, B:95:0x0220, B:93:0x01ff, B:45:0x00f9, B:47:0x010c, B:49:0x0112, B:56:0x0121, B:61:0x0133, B:64:0x0145, B:65:0x0153, B:67:0x0159, B:69:0x0169, B:71:0x0173, B:73:0x0184, B:80:0x0190, B:83:0x019d, B:60:0x012a, B:44:0x00f0, B:19:0x0080, B:16:0x007a), top: B:245:0x0068, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0242 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141 A[PHI: r9
      0x0141: PHI (r9v8 int) = (r9v1 int), (r9v2 int) binds: [B:62:0x013f, B:280:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145 A[Catch: IllegalStateException -> 0x0639, dhkf -> 0x0645, all -> 0x06c4, TryCatch #8 {IllegalStateException -> 0x0639, blocks: (B:13:0x0068, B:20:0x0083, B:22:0x0090, B:25:0x009c, B:29:0x00a8, B:31:0x00b8, B:86:0x01ab, B:88:0x01b5, B:90:0x01d1, B:96:0x0224, B:98:0x0242, B:108:0x0263, B:113:0x02c6, B:116:0x02ce, B:118:0x02da, B:119:0x02f7, B:121:0x02fd, B:124:0x030d, B:127:0x032e, B:126:0x031d, B:128:0x033f, B:131:0x0349, B:134:0x036d, B:133:0x035b, B:136:0x0382, B:137:0x0386, B:139:0x038c, B:140:0x03cf, B:142:0x03d5, B:143:0x03e2, B:144:0x03e6, B:146:0x03ec, B:149:0x03fe, B:151:0x0404, B:153:0x0419, B:155:0x0424, B:157:0x0432, B:158:0x0451, B:160:0x045d, B:161:0x0460, B:168:0x0498, B:169:0x04a5, B:171:0x04ad, B:172:0x04b7, B:176:0x04e4, B:179:0x04ec, B:183:0x04fe, B:186:0x0506, B:190:0x051a, B:191:0x052b, B:195:0x0538, B:206:0x0561, B:208:0x05e8, B:209:0x0602, B:198:0x0541, B:194:0x0534, B:205:0x0555, B:182:0x04fa, B:175:0x04de, B:112:0x02c0, B:211:0x0631, B:212:0x0638, B:102:0x024d, B:105:0x0253, B:94:0x0208, B:95:0x0220, B:93:0x01ff, B:45:0x00f9, B:47:0x010c, B:49:0x0112, B:56:0x0121, B:61:0x0133, B:64:0x0145, B:65:0x0153, B:67:0x0159, B:69:0x0169, B:71:0x0173, B:73:0x0184, B:80:0x0190, B:83:0x019d, B:60:0x012a, B:44:0x00f0, B:19:0x0080, B:16:0x007a), top: B:245:0x0068, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0208 A[Catch: IllegalStateException -> 0x0639, dhkf -> 0x0645, all -> 0x06c4, TryCatch #8 {IllegalStateException -> 0x0639, blocks: (B:13:0x0068, B:20:0x0083, B:22:0x0090, B:25:0x009c, B:29:0x00a8, B:31:0x00b8, B:86:0x01ab, B:88:0x01b5, B:90:0x01d1, B:96:0x0224, B:98:0x0242, B:108:0x0263, B:113:0x02c6, B:116:0x02ce, B:118:0x02da, B:119:0x02f7, B:121:0x02fd, B:124:0x030d, B:127:0x032e, B:126:0x031d, B:128:0x033f, B:131:0x0349, B:134:0x036d, B:133:0x035b, B:136:0x0382, B:137:0x0386, B:139:0x038c, B:140:0x03cf, B:142:0x03d5, B:143:0x03e2, B:144:0x03e6, B:146:0x03ec, B:149:0x03fe, B:151:0x0404, B:153:0x0419, B:155:0x0424, B:157:0x0432, B:158:0x0451, B:160:0x045d, B:161:0x0460, B:168:0x0498, B:169:0x04a5, B:171:0x04ad, B:172:0x04b7, B:176:0x04e4, B:179:0x04ec, B:183:0x04fe, B:186:0x0506, B:190:0x051a, B:191:0x052b, B:195:0x0538, B:206:0x0561, B:208:0x05e8, B:209:0x0602, B:198:0x0541, B:194:0x0534, B:205:0x0555, B:182:0x04fa, B:175:0x04de, B:112:0x02c0, B:211:0x0631, B:212:0x0638, B:102:0x024d, B:105:0x0253, B:94:0x0208, B:95:0x0220, B:93:0x01ff, B:45:0x00f9, B:47:0x010c, B:49:0x0112, B:56:0x0121, B:61:0x0133, B:64:0x0145, B:65:0x0153, B:67:0x0159, B:69:0x0169, B:71:0x0173, B:73:0x0184, B:80:0x0190, B:83:0x019d, B:60:0x012a, B:44:0x00f0, B:19:0x0080, B:16:0x007a), top: B:245:0x0068, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0220 A[Catch: IllegalStateException -> 0x0639, dhkf -> 0x0645, all -> 0x06c4, TryCatch #8 {IllegalStateException -> 0x0639, blocks: (B:13:0x0068, B:20:0x0083, B:22:0x0090, B:25:0x009c, B:29:0x00a8, B:31:0x00b8, B:86:0x01ab, B:88:0x01b5, B:90:0x01d1, B:96:0x0224, B:98:0x0242, B:108:0x0263, B:113:0x02c6, B:116:0x02ce, B:118:0x02da, B:119:0x02f7, B:121:0x02fd, B:124:0x030d, B:127:0x032e, B:126:0x031d, B:128:0x033f, B:131:0x0349, B:134:0x036d, B:133:0x035b, B:136:0x0382, B:137:0x0386, B:139:0x038c, B:140:0x03cf, B:142:0x03d5, B:143:0x03e2, B:144:0x03e6, B:146:0x03ec, B:149:0x03fe, B:151:0x0404, B:153:0x0419, B:155:0x0424, B:157:0x0432, B:158:0x0451, B:160:0x045d, B:161:0x0460, B:168:0x0498, B:169:0x04a5, B:171:0x04ad, B:172:0x04b7, B:176:0x04e4, B:179:0x04ec, B:183:0x04fe, B:186:0x0506, B:190:0x051a, B:191:0x052b, B:195:0x0538, B:206:0x0561, B:208:0x05e8, B:209:0x0602, B:198:0x0541, B:194:0x0534, B:205:0x0555, B:182:0x04fa, B:175:0x04de, B:112:0x02c0, B:211:0x0631, B:212:0x0638, B:102:0x024d, B:105:0x0253, B:94:0x0208, B:95:0x0220, B:93:0x01ff, B:45:0x00f9, B:47:0x010c, B:49:0x0112, B:56:0x0121, B:61:0x0133, B:64:0x0145, B:65:0x0153, B:67:0x0159, B:69:0x0169, B:71:0x0173, B:73:0x0184, B:80:0x0190, B:83:0x019d, B:60:0x012a, B:44:0x00f0, B:19:0x0080, B:16:0x007a), top: B:245:0x0068, outer: #2 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized void w(android.content.Context r25, java.lang.String r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhey.w(android.content.Context, java.lang.String, int, int):void");
    }

    final synchronized void x(Context context) {
        dhks dhksVarB = dhks.b(context);
        this.b = B(context);
        for (int i = 0; i < this.b; i++) {
            try {
                try {
                    SubscriptionInfo activeSubscriptionInfoForSimSlotIndex = dhksVarB.a.getActiveSubscriptionInfoForSimSlotIndex(i);
                    dhja.d(a, "Slot#%d: SubscriptionInfo=%s", Integer.valueOf(i), dhiz.GENERIC.c(activeSubscriptionInfoForSimSlotIndex));
                    if (activeSubscriptionInfoForSimSlotIndex == null) {
                        this.j.put(i, new dhex(i, -1, 0, 0, null, "ABSENT"));
                    } else {
                        String str = "";
                        try {
                            TelephonyManager telephonyManagerE = dhkv.g(context).e(activeSubscriptionInfoForSimSlotIndex.getSubscriptionId());
                            str = (telephonyManagerE == null || telephonyManagerE.getSimState() != 5) ? "ABSENT" : "LOADED";
                        } catch (dhkf unused) {
                            dhja.h(a, "Permission is required for TelephonyManager", new Object[0]);
                        }
                        this.j.put(i, new dhex(i, activeSubscriptionInfoForSimSlotIndex.getSubscriptionId(), activeSubscriptionInfoForSimSlotIndex.getMcc(), activeSubscriptionInfoForSimSlotIndex.getMnc(), activeSubscriptionInfoForSimSlotIndex.getIccId(), str));
                    }
                } catch (SecurityException e) {
                    throw new dhkf("READ_PHONE_STATE permission is missing.", e);
                }
            } catch (dhkf unused2) {
                dhja.h(a, "Permission is required for SubscriptionManager", new Object[0]);
                return;
            }
        }
    }

    public final synchronized void y(Context context, int i, int i2, String str) {
        if (i < 0) {
            dhja.h(a, "Invalid slotId %d", Integer.valueOf(i));
            return;
        }
        if (this.b > 1 && "LOADED".equals(str)) {
            x(context);
            if (i2 < 0) {
                SparseArray sparseArray = this.j;
                if (sparseArray.get(i) != null) {
                    i2 = ((dhex) sparseArray.get(i)).b;
                }
            }
        }
        int i3 = i2;
        dhex dhexVarF = F(i3);
        if (dhexVarF != null) {
            this.j.delete(dhexVarF.a);
            if ("NOT_READY".equals(str) && "LOADED".equals(dhexVarF.f)) {
                dhja.l(a, "Unexpected SIM_NOT_READY.", new Object[0]);
                str = "ABSENT";
            }
        }
        this.j.put(i, new dhex(i, i3, 0, 0, null, str));
    }

    public final synchronized boolean z() {
        for (int i = 0; i < this.b; i++) {
            SparseArray sparseArray = this.j;
            if (sparseArray.get(i) == null) {
                return false;
            }
            String str = ((dhex) sparseArray.get(i)).f;
            if (!"ABSENT".equals(str) && !"LOADED".equals(str) && !"LOCKED".equals(str)) {
                return false;
            }
        }
        return true;
    }
}
