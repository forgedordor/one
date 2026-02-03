package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbhd implements fbhb {
    public static final eaci a;
    public static final eaci b;
    public static final eaci c;

    static {
        eadc eadcVar = fbgz.a;
        a = eacj.f("45352879", new eabn() { // from class: fbhc
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (eyjv) evsn.parseFrom(eyjv.a, (byte[]) obj);
            }
        }, "CAASNXByaW1lcy9mZWRlcmF0ZWRfcXVlcnkvJVBBQ0tBR0VfTkFNRSUvZGlyZWN0b3J5X3BhdGhzGiEvcHJpbWVzL2FuYWx5dGljc19kaXJlY3RvcnlfcGF0aHM", "com.google.android.libraries.performance.primes", eadcVar);
        b = eacj.f("45352881", new eabn() { // from class: fbhc
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (eyjv) evsn.parseFrom(eyjv.a, (byte[]) obj);
            }
        }, "CAASOHByaW1lcy9mZWRlcmF0ZWRfcXVlcnkvJVBBQ0tBR0VfTkFNRSUvZXhjZXB0aW9uX21lc3NhZ2VzGiQvcHJpbWVzL2FuYWx5dGljc19leGNlcHRpb25fbWVzc2FnZXM", "com.google.android.libraries.performance.primes", eadcVar);
        c = eacj.f("45352880", new eabn() { // from class: fbhc
            @Override // defpackage.eabn
            public final Object a(Object obj) {
                return (eyjv) evsn.parseFrom(eyjv.a, (byte[]) obj);
            }
        }, "CAASL3ByaW1lcy9mZWRlcmF0ZWRfcXVlcnkvJVBBQ0tBR0VfTkFNRSUvcnBjX3BhdGhzGhsvcHJpbWVzL2FuYWx5dGljc19ycGNfcGF0aHM", "com.google.android.libraries.performance.primes", eadcVar);
    }

    @Override // defpackage.fbhb
    public final eyjv a(Context context) {
        return (eyjv) a.gX(context);
    }

    @Override // defpackage.fbhb
    public final eyjv b(Context context) {
        return (eyjv) b.gX(context);
    }

    @Override // defpackage.fbhb
    public final eyjv c(Context context) {
        return (eyjv) c.gX(context);
    }
}
