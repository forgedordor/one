package defpackage;

import android.text.Spannable;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class loo {
    public final lov a;
    public final boolean b;
    public final int[] c;
    private final lof d;

    public loo(lov lovVar, lof lofVar, boolean z, int[] iArr) {
        this.a = lovVar;
        this.d = lofVar;
        this.b = z;
        this.c = iArr;
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
            boolean r2 = f(r7, r1)
            if (r2 != 0) goto L47
            java.lang.Class<lop> r2 = defpackage.lop.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            lop[] r1 = (defpackage.lop[]) r1
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.loo.b(android.text.Editable, android.view.KeyEvent, boolean):boolean");
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.loo.c(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static final void e(Spannable spannable, lol lolVar, int i, int i2) {
        spannable.setSpan(new low(lolVar), i, i2, 33);
    }

    private static boolean f(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public final lol a(CharSequence charSequence) {
        lon lonVar = new lon(this.a.c, this.b, this.c);
        int length = charSequence.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            if (lonVar.a(iCodePointAt) != 2) {
                return null;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        if (lonVar.d()) {
            return lonVar.b();
        }
        return null;
    }

    public final boolean d(CharSequence charSequence, int i, int i2, lol lolVar) {
        if (lolVar.c == 0) {
            lof lofVar = this.d;
            plh plhVarD = lolVar.d();
            int iB = plhVarD.b(8);
            if (iB != 0) {
                plhVarD.b.getShort(iB + plhVarD.a);
            }
            ThreadLocal threadLocal = lom.a;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = ((lom) lofVar).b;
            String string = sb.toString();
            int i3 = kzd.a;
            lolVar.c = true != textPaint.hasGlyph(string) ? 1 : 2;
        }
        return lolVar.c == 2;
    }
}
