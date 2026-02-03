package defpackage;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qy {
    private final EditText a;
    private final lra b;

    public qy(EditText editText) {
        this.a = editText;
        this.b = new lra(editText);
    }

    static final boolean c(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    static final KeyListener d(KeyListener keyListener) {
        if (c(keyListener) && !(keyListener instanceof lrf)) {
            if (keyListener == null) {
                return null;
            }
            if (!(keyListener instanceof NumberKeyListener)) {
                return new lrf(keyListener);
            }
        }
        return keyListener;
    }

    final InputConnection a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return !(inputConnection instanceof lrc) ? new lrc(this.b.a, inputConnection, editorInfo) : inputConnection;
    }

    final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, kt.j, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            lrl lrlVar = this.b.b;
            if (lrlVar.c != z) {
                if (lrlVar.b != null) {
                    lpz lpzVarC = lpz.c();
                    lpu lpuVar = lrlVar.b;
                    lcg.j(lpuVar, "initCallback cannot be null");
                    lpzVarC.c.writeLock().lock();
                    try {
                        ArrayList arrayList = new ArrayList();
                        Set set = lpzVarC.d;
                        csr csrVar = new csr((css) set);
                        while (csrVar.hasNext()) {
                            lpx lpxVar = (lpx) csrVar.next();
                            if (lpxVar.a == lpuVar) {
                                arrayList.add(lpxVar);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            set.remove((lpx) it.next());
                        }
                    } finally {
                        lpzVarC.c.writeLock().unlock();
                    }
                }
                lrlVar.c = z;
                if (z) {
                    lrl.a(lrlVar.a, lpz.c().b());
                }
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
