package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.dcfa;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dcfm<O extends dcfa> {
    private final dciv a;
    public final Context c;
    public final String d;
    public final dcns e;
    public final dcfe f;
    public final dcfa g;
    public final dcgl h;
    public final Looper i;
    public final int j;
    public final dcfq k;
    public final dchp l;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dcfm(android.content.Context r8, android.app.Activity r9, defpackage.dcfe r10, defpackage.dcfa r11, defpackage.dcfl r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcfm.<init>(android.content.Context, android.app.Activity, dcfe, dcfa, dcfl):void");
    }

    private final defn a(int i, dcja dcjaVar) {
        defr defrVar = new defr();
        int i2 = dcjaVar.d;
        dchp dchpVar = this.l;
        dchpVar.d(defrVar, i2, this);
        dcgh dcghVar = new dcgh(i, dcjaVar, defrVar, this.a);
        Handler handler = dchpVar.o;
        handler.sendMessage(handler.obtainMessage(4, new dcij(dcghVar, dchpVar.k.get(), this)));
        return defrVar.a;
    }

    public final dcib g(Object obj, String str) {
        return dcic.b(obj, this.i, str);
    }

    public final dckc h() {
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        dckc dckcVar = new dckc();
        dcfa dcfaVar = this.g;
        boolean z = dcfaVar instanceof dcey;
        Account accountA = null;
        if (z && (googleSignInAccountA2 = ((dcey) dcfaVar).a()) != null) {
            String str = googleSignInAccountA2.c;
            if (str != null) {
                accountA = new Account(str, "com.google");
            }
        } else if (dcfaVar instanceof dcex) {
            accountA = ((dcex) dcfaVar).a();
        }
        dckcVar.a = accountA;
        Set setA = (!z || (googleSignInAccountA = ((dcey) dcfaVar).a()) == null) ? Collections.EMPTY_SET : googleSignInAccountA.a();
        if (dckcVar.b == null) {
            dckcVar.b = new css();
        }
        dckcVar.b.addAll(setA);
        Context context = this.c;
        dckcVar.d = context.getClass().getName();
        dckcVar.c = context.getPackageName();
        return dckcVar;
    }

    public final defn i(dcja dcjaVar) {
        return a(2, dcjaVar);
    }

    public final defn j(dcja dcjaVar) {
        return a(0, dcjaVar);
    }

    public final defn k(dciq dciqVar) {
        dcik dcikVar = dciqVar.a;
        dclh.n(dcikVar.a(), "Listener has already been released.");
        defr defrVar = new defr();
        int i = dcikVar.d;
        dchp dchpVar = this.l;
        dchpVar.d(defrVar, i, this);
        dcgg dcggVar = new dcgg(new dcil(dcikVar, dciqVar.b, dciqVar.c), defrVar);
        Handler handler = dchpVar.o;
        handler.sendMessage(handler.obtainMessage(8, new dcij(dcggVar, dchpVar.k.get(), this)));
        return defrVar.a;
    }

    public final defn l(dchz dchzVar, int i) {
        defr defrVar = new defr();
        dchp dchpVar = this.l;
        dchpVar.d(defrVar, i, this);
        dcgi dcgiVar = new dcgi(dchzVar, defrVar);
        Handler handler = dchpVar.o;
        handler.sendMessage(handler.obtainMessage(13, new dcij(dcgiVar, dchpVar.k.get(), this)));
        return defrVar.a;
    }

    public final defn m(dcja dcjaVar) {
        return a(1, dcjaVar);
    }

    public final void n(int i, dcgp dcgpVar) {
        boolean z = true;
        if (!dcgpVar.g && !((Boolean) BasePendingResult.b.get()).booleanValue()) {
            z = false;
        }
        dcgpVar.g = z;
        dchp dchpVar = this.l;
        dcij dcijVar = new dcij(new dcgf(i, dcgpVar), dchpVar.k.get(), this);
        Handler handler = dchpVar.o;
        handler.sendMessage(handler.obtainMessage(4, dcijVar));
    }

    public dcfm(Context context, dcfe dcfeVar, dcfa dcfaVar, dcfl dcflVar) {
        this(context, null, dcfeVar, dcfaVar, dcflVar);
    }
}
