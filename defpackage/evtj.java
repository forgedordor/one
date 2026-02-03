package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class evtj extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public evtj(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public evtj(String str) {
        super(str);
    }

    public evtj(String str, IOException iOException) {
        super(str, iOException);
    }
}
