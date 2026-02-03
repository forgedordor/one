package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmye {
    private final Set a;

    public cmye(Set set) {
        set.getClass();
        this.a = set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r2 == false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:30:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0071 -> B:26:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r8, defpackage.cmxw r9, int r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.cmyd
            if (r0 == 0) goto L13
            r0 = r11
            cmyd r0 = (defpackage.cmyd) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            cmyd r0 = new cmyd
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.c
            int r9 = r0.g
            java.lang.Object r10 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r11)
            goto L75
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            defpackage.fctl.b(r11)
            java.util.Set r11 = r7.a
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L45
        L43:
            r3 = r4
            goto L87
        L45:
            java.util.Iterator r11 = r11.iterator()
            r6 = r9
            r9 = r8
            r8 = r11
            r11 = r10
            r10 = r6
        L4e:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r8.next()
            cmyf r2 = (defpackage.cmyf) r2
            boolean r5 = r2.a(r9)
            if (r5 == 0) goto L84
            r0.a = r9
            r0.b = r10
            r0.g = r11
            r0.c = r8
            r0.f = r4
            java.lang.Object r2 = r2.b(r9, r10, r11, r0)
            if (r2 != r1) goto L71
            return r1
        L71:
            r6 = r2
            r2 = r9
            r9 = r11
            r11 = r6
        L75:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L80
            r11 = r9
            r9 = r2
            goto L84
        L80:
            r11 = r9
            r9 = r2
            r2 = r3
            goto L85
        L84:
            r2 = r4
        L85:
            if (r2 != 0) goto L4e
        L87:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmye.a(com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData, cmxw, int, fcxy):java.lang.Object");
    }
}
