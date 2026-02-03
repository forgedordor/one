package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiau implements eiar {
    public final fcsu a;
    public final String b;
    private final Boolean c;
    private final eosc d;
    private final ehro e;

    public eiau(Context context, Boolean bool, fcsu fcsuVar, eosc eoscVar, ehro ehroVar) {
        this.b = context.getPackageName();
        this.c = bool;
        this.a = fcsuVar;
        this.d = eoscVar;
        this.e = ehroVar;
    }

    @Override // defpackage.eiar
    public final ListenableFuture a(final ListenableFuture listenableFuture, ehwf ehwfVar, final long j) {
        final String strB = ehwfVar.b();
        return !this.c.booleanValue() ? eorv.a : eooq.f(this.e.a(), eiid.a(new ejvr() { // from class: eias
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                String str = strB;
                this.a.c(listenableFuture, j, str);
                return null;
            }
        }), this.d);
    }

    @Override // defpackage.eiar
    public final ListenableFuture b(final ehwf ehwfVar) {
        return !this.c.booleanValue() ? eorv.a : eooq.f(this.e.a(), eiid.a(new ejvr() { // from class: eiat
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                ehwf ehwfVar2 = ehwfVar;
                eiau eiauVar = this.a;
                ((ehsc) eiauVar.a.b()).a(eiauVar.b, ehwfVar2.b(), "attempt");
                return null;
            }
        }), this.d);
    }

    public final void c(ListenableFuture listenableFuture, double d, String str) {
        double d2;
        String str2;
        ehsc ehscVar = (ehsc) this.a.b();
        try {
            eork.q(listenableFuture);
            String str3 = this.b;
            ehscVar.a(str3, str, "success");
            d2 = d;
            str2 = str;
            try {
                ehscVar.b(d2, str3, str2, "success");
            } catch (CancellationException unused) {
                String str4 = this.b;
                ehscVar.a(str4, str2, "cancellation");
                ehscVar.b(d2, str4, str2, "cancellation");
            } catch (Exception unused2) {
                String str5 = this.b;
                ehscVar.a(str5, str2, "failure");
                ehscVar.b(d2, str5, str2, "failure");
            }
        } catch (CancellationException unused3) {
            d2 = d;
            str2 = str;
        } catch (Exception unused4) {
            d2 = d;
            str2 = str;
        }
    }
}
