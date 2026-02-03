package defpackage;

import android.text.TextPaint;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqg {
    public final lps a;
    private final lqn b;
    private lpt c;
    private final boolean d;
    private final int[] e;

    public lqg(lqn lqnVar, lps lpsVar, lpt lptVar, boolean z, int[] iArr, Set set) {
        this.a = lpsVar;
        this.b = lqnVar;
        this.c = lptVar;
        this.d = z;
        this.e = iArr;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr2 = (int[]) it.next();
            String str = new String(iArr2, 0, iArr2.length);
            a(str, 0, str.length(), 1, true, new lqe(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.text.Editable r6, android.view.KeyEvent r7, boolean r8) {
        /*
            int r7 = r7.getMetaState()
            boolean r7 = android.view.KeyEvent.metaStateHasNoModifiers(r7)
            r0 = 0
            if (r7 != 0) goto Lc
            goto L47
        Lc:
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            boolean r2 = e(r7, r1)
            if (r2 != 0) goto L47
            java.lang.Class<lqh> r2 = defpackage.lqh.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            lqh[] r1 = (defpackage.lqh[]) r1
            if (r1 == 0) goto L47
            int r2 = r1.length
            if (r2 <= 0) goto L47
            r3 = r0
        L28:
            if (r3 >= r2) goto L47
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L39
            if (r5 == r7) goto L42
            goto L3b
        L39:
            if (r4 == r7) goto L42
        L3b:
            if (r7 <= r5) goto L3f
            if (r7 < r4) goto L42
        L3f:
            int r3 = r3 + 1
            goto L28
        L42:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqg.b(android.text.Editable, android.view.KeyEvent, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007c, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c A[EDGE_INSN: B:90:0x009c->B:63:0x009c BREAK  A[LOOP:2: B:44:0x006a->B:54:0x007f], EDGE_INSN: B:91:0x009c->B:63:0x009c BREAK  A[LOOP:2: B:44:0x006a->B:54:0x007f, LOOP_LABEL: LOOP:2: B:44:0x006a->B:54:0x007f]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqg.c(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    private final boolean d(CharSequence charSequence, int i, int i2, lqq lqqVar) {
        if (lqqVar.c() == 0) {
            lpt lptVar = this.c;
            lqv lqvVarF = lqqVar.f();
            int iB = lqvVarF.b(8);
            if (iB != 0) {
                lqvVarF.b.getShort(iB + lqvVarF.a);
            }
            ThreadLocal threadLocal = lpo.a;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = ((lpo) lptVar).b;
            String string = sb.toString();
            int i3 = kzd.a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i4 = lqqVar.c & 4;
            lqqVar.c = zHasGlyph ? i4 | 2 : i4 | 1;
        }
        return lqqVar.c() == 2;
    }

    private static boolean e(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public final Object a(CharSequence charSequence, int i, int i2, int i3, boolean z, lqc lqcVar) {
        int iCharCount;
        char c;
        lqf lqfVar = new lqf(this.b.c, this.d, this.e);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        boolean zB = true;
        int i4 = 0;
        int iCharCount2 = i;
        loop0: while (true) {
            iCharCount = iCharCount2;
            while (iCharCount2 < i2 && i4 < i3 && zB) {
                lqm lqmVarA = lqfVar.b.a(iCodePointAt);
                if (lqfVar.a == 2) {
                    if (lqmVarA != null) {
                        lqfVar.b = lqmVarA;
                        lqfVar.e++;
                    } else {
                        if (iCodePointAt == 65038) {
                            lqfVar.e();
                        } else if (!lqf.c(iCodePointAt)) {
                            lqm lqmVar = lqfVar.b;
                            if (lqmVar.a != null) {
                                c = 3;
                                if (lqfVar.e != 1) {
                                    lqfVar.c = lqmVar;
                                    lqfVar.e();
                                } else if (lqfVar.d()) {
                                    lqfVar.c = lqfVar.b;
                                    lqfVar.e();
                                } else {
                                    lqfVar.e();
                                }
                            } else {
                                lqfVar.e();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (lqmVarA == null) {
                    lqfVar.e();
                    c = 1;
                } else {
                    lqfVar.a = 2;
                    lqfVar.b = lqmVarA;
                    lqfVar.e = 1;
                    c = 2;
                }
                lqfVar.d = iCodePointAt;
                if (c == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    iCharCount2 = iCharCount;
                } else if (c == 2) {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                } else if (z || !d(charSequence, iCharCount, iCharCount2, lqfVar.b())) {
                    i4++;
                    zB = lqcVar.b(charSequence, iCharCount, iCharCount2, lqfVar.b());
                }
            }
            break loop0;
        }
        if (lqfVar.a == 2 && lqfVar.b.a != null && ((lqfVar.e > 1 || lqfVar.d()) && i4 < i3 && zB && (z || !d(charSequence, iCharCount, iCharCount2, lqfVar.a())))) {
            lqcVar.b(charSequence, iCharCount, iCharCount2, lqfVar.a());
        }
        return lqcVar.a();
    }
}
