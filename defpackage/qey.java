package defpackage;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qey extends fdbr implements fdap {
    final /* synthetic */ qaq a;
    final /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ qfa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qey(qaq qaqVar, boolean z, String str, qfa qfaVar) {
        super(1);
        this.a = qaqVar;
        this.b = z;
        this.c = str;
        this.d = qfaVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
        String str;
        Throwable th = (Throwable) obj;
        if (th instanceof qei) {
            this.a.i(((qei) th).a);
        }
        if (this.b && (str = this.c) != null) {
            int iHashCode = this.d.a.hashCode();
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.endAsyncSection(plm.e(str), iHashCode);
            } else {
                String strE = plm.e(str);
                try {
                    if (plm.c == null) {
                        plm.c = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                    }
                    Method method = plm.c;
                    if (method == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    method.invoke(null, Long.valueOf(plm.a), strE, Integer.valueOf(iHashCode));
                } catch (Exception e) {
                    plm.d("asyncTraceEnd", e);
                }
            }
        }
        return fctx.a;
    }
}
