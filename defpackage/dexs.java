package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dexs {
    public final emko a;
    private final dhes b;
    private final dfxx c;
    private final eosc d;
    private final dexw e;

    public dexs(dfxx dfxxVar, dhes dhesVar, emko emkoVar, eosc eoscVar, dexw dexwVar) {
        this.b = dhesVar;
        this.c = dfxxVar;
        this.a = emkoVar;
        this.d = eoscVar;
        this.e = dexwVar;
    }

    public final emkm K(Context context) {
        ewdo ewdoVar;
        ewfc ewfcVar;
        if (context == null) {
            dhja.q("Unable to create CarrierServices clearcut event. Context is null!", new Object[0]);
            return null;
        }
        dexw dexwVar = this.e;
        dhes dhesVar = this.b;
        if (dexwVar.e(dhesVar.k())) {
            return null;
        }
        emkm emkmVar = (emkm) emkr.a.createBuilder();
        int i = true != "com.google.android.apps.messaging".equals(context.getPackageName()) ? 3 : 2;
        emkmVar.copyOnWrite();
        emkr emkrVar = (emkr) emkmVar.instance;
        emkrVar.k = i - 1;
        emkrVar.b |= 256;
        emko emkoVar = this.a;
        emkmVar.copyOnWrite();
        emkr emkrVar2 = (emkr) emkmVar.instance;
        emkrVar2.j = emkoVar.e;
        emkrVar2.b |= 128;
        dfxx dfxxVar = this.c;
        String strB = dfxxVar.b();
        String strD = dfxxVar.d();
        String strC = dfxxVar.c();
        ewdn ewdnVar = (ewdn) ewdo.a.createBuilder();
        boolean zF = dfxxVar.f();
        ewdnVar.copyOnWrite();
        ewdo ewdoVar2 = (ewdo) ewdnVar.instance;
        ewdoVar2.b |= 16;
        ewdoVar2.g = zF;
        if (dfxxVar.a() == 0 && strB == null && strD == null && strC == null) {
            ewdoVar = (!((Boolean) dfog.o().a.H.a()).booleanValue() || dfog.o().M()) ? null : (ewdo) ewdnVar.build();
        } else {
            if (dfxxVar.a() >= 0) {
                int iA = dfxxVar.a();
                ewdnVar.copyOnWrite();
                ewdo ewdoVar3 = (ewdo) ewdnVar.instance;
                ewdoVar3.b |= 4;
                ewdoVar3.e = iA;
            }
            if (strB != null) {
                ewdnVar.copyOnWrite();
                ewdo ewdoVar4 = (ewdo) ewdnVar.instance;
                ewdoVar4.b |= 1;
                ewdoVar4.c = strB;
            }
            if (strD != null) {
                ewdnVar.copyOnWrite();
                ewdo ewdoVar5 = (ewdo) ewdnVar.instance;
                ewdoVar5.b |= 2;
                ewdoVar5.d = strD;
            }
            if (strC != null) {
                ewdnVar.copyOnWrite();
                ewdo ewdoVar6 = (ewdo) ewdnVar.instance;
                ewdoVar6.b |= 8;
                ewdoVar6.f = strC;
            }
            ewdoVar = (ewdo) ewdnVar.build();
        }
        if (ewdoVar != null) {
            emkmVar.copyOnWrite();
            emkr emkrVar3 = (emkr) emkmVar.instance;
            emkrVar3.i = ewdoVar;
            emkrVar3.b |= 64;
        }
        dexwVar.d(emkmVar, context);
        String strM = dhesVar.m();
        if (TextUtils.isEmpty(strM)) {
            dhja.o("Unable to retrieve SIM operator information for metrics!", new Object[0]);
            ewfcVar = null;
        } else {
            String strN = dhesVar.n();
            String strI = dhesVar.i();
            ewfb ewfbVar = (ewfb) ewfc.a.createBuilder();
            String strSubstring = strM.substring(0, 3);
            ewfbVar.copyOnWrite();
            ewfc ewfcVar2 = (ewfc) ewfbVar.instance;
            strSubstring.getClass();
            ewfcVar2.b = 1 | ewfcVar2.b;
            ewfcVar2.c = strSubstring;
            String strSubstring2 = strM.substring(3);
            ewfbVar.copyOnWrite();
            ewfc ewfcVar3 = (ewfc) ewfbVar.instance;
            strSubstring2.getClass();
            ewfcVar3.b |= 2;
            ewfcVar3.d = strSubstring2;
            boolean zT = dhesVar.t();
            ewfbVar.copyOnWrite();
            ewfc ewfcVar4 = (ewfc) ewfbVar.instance;
            ewfcVar4.b |= 16;
            ewfcVar4.g = zT;
            if (!TextUtils.isEmpty(strI)) {
                String strI2 = dhesVar.i();
                ewfbVar.copyOnWrite();
                ewfc ewfcVar5 = (ewfc) ewfbVar.instance;
                strI2.getClass();
                ewfcVar5.b |= 8;
                ewfcVar5.f = strI2;
            }
            if (!TextUtils.isEmpty(strN)) {
                ewfbVar.copyOnWrite();
                ewfc ewfcVar6 = (ewfc) ewfbVar.instance;
                strN.getClass();
                ewfcVar6.b |= 4;
                ewfcVar6.e = strN;
            }
            ewfcVar = (ewfc) ewfbVar.build();
        }
        if (ewfcVar != null) {
            emkmVar.copyOnWrite();
            emkr emkrVar4 = (emkr) emkmVar.instance;
            emkrVar4.d = ewfcVar;
            emkrVar4.c = 6;
        }
        dbho dbhoVar = dhhb.i;
        if (!TextUtils.isEmpty((String) dbhoVar.d())) {
            String str = (String) dbhoVar.d();
            emkmVar.copyOnWrite();
            emkr emkrVar5 = (emkr) emkmVar.instance;
            str.getClass();
            emkrVar5.b |= 512;
            emkrVar5.l = str;
        }
        return emkmVar;
    }

    public final void L(Callable callable, Function function) {
        eosc eoscVar = this.d;
        eork.r(eoqt.t(eoscVar.submit(callable)), new dexr(function), eoscVar);
    }

    public final void M(Context context, emkr emkrVar, ewqu ewquVar) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return;
        }
        this.e.c(context, emkrVar, ewquVar);
    }
}
