package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdlg extends fdjq implements Closeable, AutoCloseable {
    static {
        new fcxt(fdjq.l, new fdap() { // from class: fdlf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fcyf fcyfVar = (fcyf) obj;
                if (fcyfVar instanceof fdlg) {
                    return (fdlg) fcyfVar;
                }
                return null;
            }
        });
    }

    public abstract Executor g();
}
