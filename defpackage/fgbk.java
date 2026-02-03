package defpackage;

import android.net.http.HttpException;
import org.chromium.net.CronetException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgbk extends CronetException {
    public fgbk(HttpException httpException) {
        super(httpException.getMessage(), httpException);
    }
}
