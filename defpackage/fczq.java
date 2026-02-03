package defpackage;

import java.io.File;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fczq extends fcuc {
    final /* synthetic */ fczs a;
    private final ArrayDeque b;

    public fczq(fczs fczsVar) {
        this.a = fczsVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.b = arrayDeque;
        if (fczsVar.a.isDirectory()) {
            arrayDeque.push(new fczo(fczsVar.a));
        } else if (fczsVar.a.isFile()) {
            arrayDeque.push(new fczp(fczsVar.a));
        } else {
            b();
        }
    }

    @Override // defpackage.fcuc
    protected final void a() {
        File file;
        File fileA;
        while (true) {
            ArrayDeque arrayDeque = this.b;
            fczr fczrVar = (fczr) arrayDeque.peek();
            if (fczrVar == null) {
                file = null;
                break;
            }
            fileA = fczrVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else if (fdbq.f(fileA, fczrVar.a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(new fczo(fileA));
            }
        }
        file = fileA;
        if (file != null) {
            c(file);
        } else {
            b();
        }
    }
}
