package defpackage;

import android.text.TextWatcher;
import android.view.View;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpbn implements dngc {
    private final eigp a;
    private final egvh b;

    public dpbn(eigp eigpVar, egvh egvhVar) {
        eigpVar.getClass();
        this.a = eigpVar;
        this.b = egvhVar;
    }

    @Override // defpackage.dngc
    public final View.OnClickListener a(String str, View.OnClickListener onClickListener) {
        return new eifs(this.a, "", "", 0, str, onClickListener);
    }

    @Override // defpackage.dngc
    public final View.OnLongClickListener b(String str, View.OnLongClickListener onLongClickListener) {
        return new eign(this.a, "", "", 0, str, onLongClickListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // defpackage.dngc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, defpackage.fdap r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dpbl
            if (r0 == 0) goto L13
            r0 = r7
            dpbl r0 = (defpackage.dpbl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpbl r0 = new dpbl
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r5 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L44
        L29:
            r6 = move-exception
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r7)
            eieu r5 = defpackage.eiiy.h(r5)
            r0.d = r5     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L29
            if (r7 == r1) goto L49
        L44:
            r6 = 0
            defpackage.fczl.a(r5, r6)
            return r7
        L49:
            return r1
        L4a:
            throw r6     // Catch: java.lang.Throwable -> L4b
        L4b:
            r7 = move-exception
            defpackage.fczl.a(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpbn.c(java.lang.String, fdap, fcxy):java.lang.Object");
    }

    @Override // defpackage.dngc
    public final Object d(String str, fdae fdaeVar) throws IOException {
        eieu eieuVarH = eiiy.h(str);
        try {
            Object objInvoke = fdaeVar.invoke();
            fczl.a(eieuVarH, null);
            return objInvoke;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // defpackage.dngc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, defpackage.fdap r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dpbm
            if (r0 == 0) goto L13
            r0 = r7
            dpbm r0 = (defpackage.dpbm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dpbm r0 = new dpbm
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L47
        L29:
            r6 = move-exception
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.fctl.b(r7)
            eigp r7 = r4.a
            eieh r5 = r7.a(r5)
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L47
            return r1
        L47:
            r6 = 0
            defpackage.fczl.a(r5, r6)
            return r7
        L4c:
            throw r6     // Catch: java.lang.Throwable -> L4d
        L4d:
            r7 = move-exception
            defpackage.fczl.a(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpbn.e(java.lang.String, fdap, fcxy):java.lang.Object");
    }

    @Override // defpackage.dngc
    public final Object f(String str, fdae fdaeVar) throws IOException {
        eieh eiehVarA = this.a.a(str);
        try {
            Object objInvoke = fdaeVar.invoke();
            fczl.a(eiehVarA, null);
            return objInvoke;
        } finally {
        }
    }

    @Override // defpackage.dngc
    public final fcyh g(ScheduledExecutorService scheduledExecutorService) {
        return this.b.a(scheduledExecutorService);
    }

    @Override // defpackage.dngc
    public final TextWatcher h(TextWatcher textWatcher) {
        return new eigi(this.a, textWatcher, "", "", 0, "EditTextDraftTextController#textWatcher");
    }
}
