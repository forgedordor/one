package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecnh extends ecnj implements CancellationSignal.OnCancelListener {
    private final CancellationSignal b;

    public ecnh(ecni ecniVar) {
        super(ecniVar);
        this.b = new CancellationSignal();
    }

    @Override // defpackage.eooi, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.b.cancel();
        return super.cancel(z);
    }

    @Override // defpackage.ecnj
    protected final void d(ecni ecniVar) throws IOException {
        try {
            CancellationSignal cancellationSignal = this.b;
            cancellationSignal.setOnCancelListener(this);
            Cursor cursorA = ecniVar.a(cancellationSignal);
            try {
                if (!isCancelled() && cursorA != null) {
                    cursorA.getCount();
                }
                if (set(cursorA)) {
                    return;
                }
                eceh.a(cursorA);
            } catch (Throwable th) {
                try {
                    setException(th);
                    if (set(cursorA)) {
                        return;
                    }
                    eceh.a(cursorA);
                } catch (Throwable th2) {
                    if (!set(cursorA)) {
                        eceh.a(cursorA);
                    }
                    throw th2;
                }
            }
        } catch (OperationCanceledException unused) {
            super.cancel(true);
        }
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        super.cancel(true);
    }
}
