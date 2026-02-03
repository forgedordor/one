package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cldr {
    public static final cqce a = cqce.g("Bugle", "OtpUtils");
    public final ekgb b;
    public final eosc c;
    private final eosc d;

    public cldr(cczn ccznVar, Set set, eosc eoscVar, eosc eoscVar2) {
        ccznVar.a();
        this.b = ekgb.n(set);
        this.d = eoscVar;
        this.c = eoscVar2;
    }

    public final eiju a(String str, int i) {
        return TextUtils.isEmpty(str) ? eijx.e(false) : b(str, i, 0);
    }

    public final eiju b(final String str, final int i, final int i2) throws Throwable {
        Throwable th;
        eiju eijuVarI;
        eieu eieuVarK = eiiy.k("OtpUtils.processIfOtp");
        try {
            ekgb ekgbVar = this.b;
            if (i2 >= ekgbVar.size()) {
                try {
                    eijuVarI = eijx.e(false);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        eieuVarK.close();
                        throw th;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                        throw th;
                    }
                }
            } else {
                final cldq cldqVar = (cldq) ekgbVar.get(i2);
                try {
                    eijuVarI = eijx.g(new Callable() { // from class: cldo
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(cldqVar.f(str));
                        }
                    }, this.c).i(new eooz() { // from class: cldp
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            cldr cldrVar = this.a;
                            String str2 = str;
                            int i3 = i;
                            if (!zBooleanValue) {
                                return cldrVar.b(str2, i3, i2 + 1);
                            }
                            cldq cldqVar2 = cldqVar;
                            cldr.a.m("The message is an OTP");
                            return cldqVar2.ge(str2, i3).h(new ejvr() { // from class: cldn
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    return true;
                                }
                            }, cldrVar.c);
                        }
                    }, this.d);
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    eieuVarK.close();
                    throw th;
                }
            }
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
