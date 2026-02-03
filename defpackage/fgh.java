package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgh implements InputConnection {
    public kew a;
    public int b;
    public boolean c;
    private final boolean e;
    private final faj f;
    private final fmx g;
    private final jou h;
    private int i;
    private final fge k;
    private final List j = new ArrayList();
    public boolean d = true;

    public fgh(kew kewVar, fge fgeVar, boolean z, faj fajVar, fmx fmxVar, jou jouVar) {
        this.k = fgeVar;
        this.e = z;
        this.f = fajVar;
        this.g = fmxVar;
        this.h = jouVar;
        this.a = kewVar;
    }

    private final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    private final void d() {
        this.i++;
    }

    public final void a(kdm kdmVar) {
        d();
        try {
            this.j.add(kdmVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.i - 1;
        this.i = i;
        if (i == 0) {
            List list = this.j;
            if (!list.isEmpty()) {
                this.k.a.b.invoke(fcva.aq(list));
                list.clear();
            }
        }
        return this.i > 0;
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
        this.j.clear();
        this.i = 0;
        this.d = false;
        List list = this.k.a.i;
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
        return b();
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
        return fgi.a(this.a);
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
                    c(277);
                    break;
                case R.id.copy:
                    c(278);
                    break;
                case R.id.paste:
                    c(279);
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
        this.k.a.c.invoke(new kdw(i2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        juo juoVar;
        long jI;
        int i;
        int iIntValue;
        int i2;
        int iB;
        fda fdaVarD;
        jyi jyiVar;
        int iB2;
        fda fdaVarD2;
        jyi jyiVar2;
        jyi jyiVar3;
        if (Build.VERSION.SDK_INT >= 34) {
            faj fajVar = this.f;
            fmx fmxVar = this.g;
            jou jouVar = this.h;
            fdap fdapVar = new fdap() { // from class: fgg
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    this.a.a((kdm) obj);
                    return fctx.a;
                }
            };
            final int iA = 3;
            if (fajVar != null && (juoVar = fajVar.h) != null) {
                fda fdaVarD3 = fajVar.d();
                if (fdbq.f(juoVar, (fdaVarD3 == null || (jyiVar3 = fdaVarD3.a) == null) ? null : jyiVar3.a.a)) {
                    if (fgh$$ExternalSyntheticApiModelOutline0.m$7(handwritingGesture)) {
                        SelectGesture selectGestureM468m = fgh$$ExternalSyntheticApiModelOutline0.m468m((Object) handwritingGesture);
                        long jC = ffr.c(fajVar, ikh.e(selectGestureM468m.getSelectionArea()), ffp.e(selectGestureM468m.getGranularity()), jye.b);
                        if (jyo.i(jC)) {
                            iA = ffp.a(selectGestureM468m, fdapVar);
                        } else {
                            ffp.d(jC, fmxVar, fdapVar);
                            iA = 1;
                        }
                    } else if (fgh$$ExternalSyntheticApiModelOutline0.m$6(handwritingGesture)) {
                        DeleteGesture deleteGestureM463m = fgh$$ExternalSyntheticApiModelOutline0.m463m((Object) handwritingGesture);
                        int iE = ffp.e(deleteGestureM463m.getGranularity());
                        long jC2 = ffr.c(fajVar, ikh.e(deleteGestureM463m.getDeletionArea()), iE, jye.b);
                        if (jyo.i(jC2)) {
                            iA = ffp.a(deleteGestureM463m, fdapVar);
                        } else {
                            ffp.b(jC2, juoVar, jyb.a(iE, 1), fdapVar);
                            iA = 1;
                        }
                    } else if (fgh$$ExternalSyntheticApiModelOutline0.m$8(handwritingGesture)) {
                        SelectRangeGesture selectRangeGestureM469m = fgh$$ExternalSyntheticApiModelOutline0.m469m((Object) handwritingGesture);
                        long jD = ffr.d(fajVar, ikh.e(selectRangeGestureM469m.getSelectionStartArea()), ikh.e(selectRangeGestureM469m.getSelectionEndArea()), ffp.e(selectRangeGestureM469m.getGranularity()), jye.b);
                        if (jyo.i(jD)) {
                            iA = ffp.a(selectRangeGestureM469m, fdapVar);
                        } else {
                            ffp.d(jD, fmxVar, fdapVar);
                            iA = 1;
                        }
                    } else if (fgh$$ExternalSyntheticApiModelOutline0.m$9(handwritingGesture)) {
                        DeleteRangeGesture deleteRangeGestureM464m = fgh$$ExternalSyntheticApiModelOutline0.m464m((Object) handwritingGesture);
                        int iE2 = ffp.e(deleteRangeGestureM464m.getGranularity());
                        long jD2 = ffr.d(fajVar, ikh.e(deleteRangeGestureM464m.getDeletionStartArea()), ikh.e(deleteRangeGestureM464m.getDeletionEndArea()), iE2, jye.b);
                        if (jyo.i(jD2)) {
                            iA = ffp.a(deleteRangeGestureM464m, fdapVar);
                        } else {
                            ffp.b(jD2, juoVar, jyb.a(iE2, 1), fdapVar);
                            iA = 1;
                        }
                    } else if (fgh$$ExternalSyntheticApiModelOutline0.m$5(handwritingGesture)) {
                        JoinOrSplitGesture joinOrSplitGestureM466m = fgh$$ExternalSyntheticApiModelOutline0.m466m((Object) handwritingGesture);
                        if (jouVar == null || (iB2 = ffr.b(fajVar, ffr.e(joinOrSplitGestureM466m.getJoinOrSplitPoint()), jouVar)) == -1 || ((fdaVarD2 = fajVar.d()) != null && (jyiVar2 = fdaVarD2.a) != null && ffr.f(jyiVar2, iB2))) {
                            iA = ffp.a(joinOrSplitGestureM466m, fdapVar);
                        } else {
                            int iCharCount = iB2;
                            while (iCharCount > 0) {
                                int iCodePointBefore = Character.codePointBefore(juoVar, iCharCount);
                                if (!ffr.h(iCodePointBefore)) {
                                    break;
                                } else {
                                    iCharCount -= Character.charCount(iCodePointBefore);
                                }
                            }
                            while (iB2 < juoVar.a()) {
                                int iCodePointAt = Character.codePointAt(juoVar, iB2);
                                if (!ffr.h(iCodePointAt)) {
                                    break;
                                } else {
                                    iB2 += Character.charCount(iCodePointAt);
                                }
                            }
                            long jA = jyp.a(iCharCount, iB2);
                            if (jyo.i(jA)) {
                                ffp.c(jyo.e(jA), " ", fdapVar);
                            } else {
                                ffp.b(jA, juoVar, false, fdapVar);
                            }
                            iA = 1;
                        }
                    } else if (fgh$$ExternalSyntheticApiModelOutline0.m$10(handwritingGesture)) {
                        InsertGesture insertGestureM465m = fgh$$ExternalSyntheticApiModelOutline0.m465m((Object) handwritingGesture);
                        if (jouVar == null || (iB = ffr.b(fajVar, ffr.e(insertGestureM465m.getInsertionPoint()), jouVar)) == -1 || ((fdaVarD = fajVar.d()) != null && (jyiVar = fdaVarD.a) != null && ffr.f(jyiVar, iB))) {
                            iA = ffp.a(insertGestureM465m, fdapVar);
                        } else {
                            ffp.c(iB, insertGestureM465m.getTextToInsert(), fdapVar);
                            iA = 1;
                        }
                    } else if (fgh$$ExternalSyntheticApiModelOutline0.m$11(handwritingGesture)) {
                        RemoveSpaceGesture removeSpaceGestureM467m = fgh$$ExternalSyntheticApiModelOutline0.m467m((Object) handwritingGesture);
                        fda fdaVarD4 = fajVar.d();
                        jyi jyiVar4 = fdaVarD4 != null ? fdaVarD4.a : null;
                        long jE = ffr.e(removeSpaceGestureM467m.getStartPoint());
                        long jE2 = ffr.e(removeSpaceGestureM467m.getEndPoint());
                        ivy ivyVarE = fajVar.e();
                        if (jyiVar4 == null || ivyVarE == null) {
                            jI = jyo.a;
                        } else {
                            long jM = ivyVarE.m(jE);
                            long jM2 = ivyVarE.m(jE2);
                            jvc jvcVar = jyiVar4.b;
                            int iA2 = ffr.a(jvcVar, jM, jouVar);
                            int iA3 = ffr.a(jvcVar, jM2, jouVar);
                            if (iA2 == -1) {
                                if (iA3 == -1) {
                                    jI = jyo.a;
                                } else {
                                    iA2 = iA3;
                                }
                            } else if (iA3 != -1) {
                                iA2 = Math.min(iA2, iA3);
                            }
                            int i3 = (int) (jM2 >> 32);
                            int i4 = (int) (jM >> 32);
                            float fE = (jyiVar4.e(iA2) + jyiVar4.b(iA2)) / 2.0f;
                            jI = jvcVar.i(new ihu(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3)), (-0.1f) + fE, Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i3)), fE + 0.1f), 0, jye.a);
                        }
                        if (jyo.i(jI)) {
                            iA = ffp.a(removeSpaceGestureM467m, fdapVar);
                        } else {
                            final fdcg fdcgVar = new fdcg();
                            fdcgVar.a = -1;
                            final fdcg fdcgVar2 = new fdcg();
                            fdcgVar2.a = -1;
                            String string = juoVar.subSequence(jyo.d(jI), jyo.c(jI)).b;
                            fdgl fdglVar = new fdgl("\\s+");
                            fdap fdapVar2 = new fdap() { // from class: ffo
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj) {
                                    fdcg fdcgVar3 = fdcgVar;
                                    fdgd fdgdVar = (fdgd) obj;
                                    if (fdcgVar3.a == -1) {
                                        fdcgVar3.a = fdgdVar.b().a;
                                    }
                                    fdcgVar2.a = fdgdVar.b().b + 1;
                                    return "";
                                }
                            };
                            string.getClass();
                            fdgd fdgdVarF = fdglVar.f(string);
                            if (fdgdVarF == null) {
                                i = 1;
                            } else {
                                int length = string.length();
                                i = 1;
                                StringBuilder sb = new StringBuilder(length);
                                fdgd fdgdVar = fdgdVarF;
                                int i5 = 0;
                                while (true) {
                                    sb.append((CharSequence) string, i5, fdgdVar.b().f().intValue());
                                    fdgd fdgdVar2 = fdgdVar;
                                    sb.append((CharSequence) fdapVar2.invoke(fdgdVar2));
                                    iIntValue = fdgdVar2.b().e().intValue() + 1;
                                    fdgd fdgdVarC = fdgdVar2.c();
                                    if (iIntValue >= length || fdgdVarC == null) {
                                        break;
                                    }
                                    fdgdVar = fdgdVarC;
                                    i5 = iIntValue;
                                }
                                if (iIntValue < length) {
                                    sb.append((CharSequence) string, iIntValue, length);
                                }
                                string = sb.toString();
                            }
                            int i6 = fdcgVar.a;
                            if (i6 == -1 || (i2 = fdcgVar2.a) == -1) {
                                iA = ffp.a(removeSpaceGestureM467m, fdapVar);
                            } else {
                                int iE3 = jyo.e(jI) + i6;
                                int iE4 = jyo.e(jI);
                                String strSubstring = string.substring(i6, string.length() - (jyo.b(jI) - fdcgVar2.a));
                                strSubstring.getClass();
                                kdm[] kdmVarArr = new kdm[2];
                                kdmVarArr[0] = new ket(iE3, iE4 + i2);
                                iA = i;
                                kdmVarArr[iA] = new kde(strSubstring, iA);
                                fdapVar.invoke(new ffq(kdmVarArr));
                            }
                        }
                    } else {
                        iA = 2;
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new Runnable() { // from class: fet
                    @Override // java.lang.Runnable
                    public final void run() {
                        intConsumer.accept(iA);
                    }
                });
            } else {
                intConsumer.accept(iA);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture r7, android.os.CancellationSignal r8) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            if (r0 < r1) goto Le1
            faj r0 = r6.f
            fmx r1 = r6.g
            if (r0 == 0) goto Le1
            juo r3 = r0.h
            if (r3 != 0) goto L12
            return r2
        L12:
            fda r4 = r0.d()
            r5 = 0
            if (r4 == 0) goto L22
            jyi r4 = r4.a
            if (r4 == 0) goto L22
            jyh r4 = r4.a
            juo r4 = r4.a
            goto L23
        L22:
            r4 = r5
        L23:
            boolean r3 = defpackage.fdbq.f(r3, r4)
            if (r3 != 0) goto L2a
            return r2
        L2a:
            boolean r3 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m$7(r7)
            if (r3 == 0) goto L54
            android.view.inputmethod.SelectGesture r7 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m468m(r7)
            if (r1 == 0) goto L51
            android.graphics.RectF r2 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m456m(r7)
            ihu r2 = defpackage.ikh.e(r2)
            int r7 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m(r7)
            int r7 = defpackage.ffp.e(r7)
            jyf r3 = defpackage.jye.b
            long r2 = defpackage.ffr.c(r0, r2, r7, r3)
            r1.r(r2)
            goto Ld5
        L51:
            r1 = r5
            goto Ld5
        L54:
            boolean r3 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m$6(r7)
            if (r3 == 0) goto L7a
            android.view.inputmethod.DeleteGesture r7 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m463m(r7)
            if (r1 == 0) goto L51
            android.graphics.RectF r2 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m454m(r7)
            ihu r2 = defpackage.ikh.e(r2)
            int r7 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m(r7)
            int r7 = defpackage.ffp.e(r7)
            jyf r3 = defpackage.jye.b
            long r2 = defpackage.ffr.c(r0, r2, r7, r3)
            r1.o(r2)
            goto Ld5
        L7a:
            boolean r3 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m$8(r7)
            if (r3 == 0) goto La8
            android.view.inputmethod.SelectRangeGesture r7 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m469m(r7)
            if (r1 == 0) goto L51
            android.graphics.RectF r2 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m457m(r7)
            ihu r2 = defpackage.ikh.e(r2)
            android.graphics.RectF r3 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m$1(r7)
            ihu r3 = defpackage.ikh.e(r3)
            int r7 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m(r7)
            int r7 = defpackage.ffp.e(r7)
            jyf r4 = defpackage.jye.b
            long r2 = defpackage.ffr.d(r0, r2, r3, r7, r4)
            r1.r(r2)
            goto Ld5
        La8:
            boolean r3 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m$9(r7)
            if (r3 == 0) goto Le1
            android.view.inputmethod.DeleteRangeGesture r7 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m464m(r7)
            if (r1 == 0) goto L51
            android.graphics.RectF r2 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m455m(r7)
            ihu r2 = defpackage.ikh.e(r2)
            android.graphics.RectF r3 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m$1(r7)
            ihu r3 = defpackage.ikh.e(r3)
            int r7 = defpackage.fgh$$ExternalSyntheticApiModelOutline0.m(r7)
            int r7 = defpackage.ffp.e(r7)
            jyf r4 = defpackage.jye.b
            long r2 = defpackage.ffr.d(r0, r2, r3, r7, r4)
            r1.o(r2)
        Ld5:
            r7 = 1
            if (r8 == 0) goto Le0
            ffn r0 = new ffn
            r0.<init>()
            r8.setOnCancelListener(r0)
        Le0:
            return r7
        Le1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgh.previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture, android.os.CancellationSignal):boolean");
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
            fge r6 = r9.k
            fgf r6 = r6.a
            ffx r6 = r6.l
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgh.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (!this.d) {
            return false;
        }
        ((BaseInputConnection) this.k.a.j.a()).sendKeyEvent(keyEvent);
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
