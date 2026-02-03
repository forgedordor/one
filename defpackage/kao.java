package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kao implements kci {
    private final Context a;

    public kao(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.kci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.kbh r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.kan
            if (r0 == 0) goto L13
            r0 = r7
            kan r0 = (defpackage.kan) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kan r0 = new kan
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.fctl.b(r7)
            return r7
        L38:
            defpackage.fctl.b(r7)
            boolean r7 = r6 instanceof defpackage.kam
            if (r7 == 0) goto L4f
            kam r6 = (defpackage.kam) r6
            kal r7 = r6.a
            android.content.Context r2 = r5.a
            r0.d = r4
            java.lang.Object r6 = r7.b(r2, r6, r0)
            if (r6 != r1) goto L4e
            goto L78
        L4e:
            return r6
        L4f:
            boolean r7 = r6 instanceof defpackage.kcn
            if (r7 == 0) goto L86
            r7 = r6
            kcn r7 = (defpackage.kcn) r7
            android.content.Context r2 = r5.a
            r0.a = r6
            r0.d = r3
            fdiu r3 = new fdiu
            fcxy r0 = defpackage.fcym.c(r0)
            r3.<init>(r0, r4)
            r3.B()
            int r0 = r7.a
            kap r4 = new kap
            r4.<init>(r3, r7)
            defpackage.kyy.d(r2, r0, r4)
            java.lang.Object r7 = r3.m()
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            kcn r6 = (defpackage.kcn) r6
            kca r6 = r6.b
            android.content.Context r0 = r5.a
            android.graphics.Typeface r6 = defpackage.kcm.a(r7, r6, r0)
            return r6
        L86:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "Unknown font type: "
            java.lang.String r6 = r0.concat(r6)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kao.a(kbh, fcxy):java.lang.Object");
    }

    @Override // defpackage.kci
    public final /* bridge */ /* synthetic */ Object b(kbh kbhVar) {
        Object objA;
        Typeface typefaceA;
        if (kbhVar instanceof kam) {
            kam kamVar = (kam) kbhVar;
            return kamVar.a.a(this.a, kamVar);
        }
        if (!(kbhVar instanceof kcn)) {
            return null;
        }
        kcn kcnVar = (kcn) kbhVar;
        int i = kcnVar.c;
        if (kbv.a(0, 0)) {
            typefaceA = kaq.a(kcnVar, this.a);
        } else {
            if (!kbv.a(0, 1)) {
                if (kbv.a(0, 2)) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                String strB = kbv.b();
                Objects.toString(strB);
                throw new IllegalArgumentException("Unknown loading type ".concat(strB));
            }
            try {
                objA = kaq.a(kcnVar, this.a);
            } catch (Throwable th) {
                objA = fctl.a(th);
            }
            typefaceA = (Typeface) (true != (objA instanceof fctj) ? objA : null);
        }
        return kcm.a(typefaceA, kcnVar.b, this.a);
    }
}
