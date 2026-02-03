package defpackage;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public final class keq implements InputConnection {
    public kew a;
    public int b;
    public boolean c;
    private final boolean e;
    private int f;
    private final kfc h;
    private final List g = new ArrayList();
    public boolean d = true;

    public keq(kew kewVar, kfc kfcVar, boolean z) {
        this.h = kfcVar;
        this.e = z;
        this.a = kewVar;
    }

    private final void a(kdm kdmVar) {
        d();
        try {
            this.g.add(kdmVar);
        } finally {
            c();
        }
    }

    private final void b(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    private final boolean c() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            List list = this.g;
            if (!list.isEmpty()) {
                this.h.a.c.invoke(fcva.aq(list));
                list.clear();
            }
        }
        return this.f > 0;
    }

    private final void d() {
        this.f++;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if (!this.d) {
            return false;
        }
        d();
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.g.clear();
        this.f = 0;
        this.d = false;
        List list = this.h.a.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (fdbq.f(((WeakReference) list.get(i)).get(), this)) {
                list.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        if (this.d) {
            return this.e;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.d;
        if (z) {
            a(new kde(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        if (!this.d) {
            return false;
        }
        a(new kdk(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (!this.d) {
            return false;
        }
        a(new kdl(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (!this.d) {
            return false;
        }
        a(new kds());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.a.a(), jyo.d(this.a.c), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        int i2 = i & 1;
        this.c = 1 == i2;
        if (i2 != 0) {
            this.b = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return keb.a(this.a);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (jyo.i(this.a.c)) {
            return null;
        }
        return kex.a(this.a).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return kex.b(this.a, i).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return kex.c(this.a, i).b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        if (this.d) {
            switch (i) {
                case R.id.selectAll:
                    a(new ket(0, this.a.a().length()));
                    break;
                case R.id.cut:
                    b(277);
                    break;
                case R.id.copy:
                    b(278);
                    break;
                case R.id.paste:
                    b(279);
                    break;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        if (!this.d) {
            return false;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 5;
                    break;
                default:
                    Log.w("RecordingIC", a.g(i, "IME sends unsupported Editor Action: "));
                    i2 = 1;
                    break;
            }
        } else {
            i2 = 1;
        }
        this.h.a.d.invoke(new kdw(i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        return this.d;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.d
            r1 = 0
            if (r0 == 0) goto L71
            r0 = r10 & 1
            r2 = r10 & 2
            r3 = 1
            if (r2 == 0) goto Le
            r2 = r3
            goto Lf
        Le:
            r2 = r1
        Lf:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4b
            r4 = r10 & 16
            if (r4 == 0) goto L1b
            r4 = r3
            goto L1c
        L1b:
            r4 = r1
        L1c:
            r5 = r10 & 8
            if (r5 == 0) goto L22
            r5 = r3
            goto L23
        L22:
            r5 = r1
        L23:
            r6 = r10 & 4
            if (r6 == 0) goto L29
            r6 = r3
            goto L2a
        L29:
            r6 = r1
        L2a:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 34
            if (r7 < r8) goto L35
            r10 = r10 & 32
            if (r10 == 0) goto L35
            r1 = r3
        L35:
            if (r4 != 0) goto L48
            if (r5 != 0) goto L48
            if (r6 != 0) goto L48
            if (r1 != 0) goto L48
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r8) goto L44
            r10 = r3
            r1 = r10
            goto L46
        L44:
            r10 = r1
            r1 = r3
        L46:
            r4 = r1
            goto L4d
        L48:
            r10 = r1
            r1 = r6
            goto L4e
        L4b:
            r10 = r1
            r4 = r3
        L4d:
            r5 = r4
        L4e:
            kfc r6 = r9.h
            kfh r6 = r6.a
            kdi r6 = r6.i
            java.lang.Object r7 = r6.a
            monitor-enter(r7)
            r6.d = r4     // Catch: java.lang.Throwable -> L6e
            r6.e = r5     // Catch: java.lang.Throwable -> L6e
            r6.f = r1     // Catch: java.lang.Throwable -> L6e
            r6.g = r10     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6a
            r6.c = r3     // Catch: java.lang.Throwable -> L6e
            kew r10 = r6.h     // Catch: java.lang.Throwable -> L6e
            if (r10 == 0) goto L6a
            r6.a()     // Catch: java.lang.Throwable -> L6e
        L6a:
            r6.b = r2     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r7)
            return r3
        L6e:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.keq.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (!this.d) {
            return false;
        }
        ((BaseInputConnection) this.h.a.h.a()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.d;
        if (z) {
            a(new ker(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.d;
        if (z) {
            a(new kes(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        if (!this.d) {
            return false;
        }
        a(new ket(i, i2));
        return true;
    }
}
