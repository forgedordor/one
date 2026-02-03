package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecey extends echp {
    private final Context a;
    private final echo b;
    private final echo c;
    private final Object d = new Object();
    private String e;

    public ecey(ecex ecexVar) {
        this.b = new ecfn(ecexVar.c);
        this.a = ecexVar.a;
        this.c = ecexVar.b;
    }

    private final void s() throws ecfr {
        if (this.c == null) {
            throw new ecfr("Android backend cannot perform remote operations without a remote backend");
        }
    }

    private final boolean t(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    @Override // defpackage.echp, defpackage.echo
    public final Pair b(Uri uri) throws ecfr {
        if (!t(uri)) {
            return this.b.b(q(uri));
        }
        s();
        return this.c.b(uri);
    }

    @Override // defpackage.echp, defpackage.echo
    public final File d(Uri uri) throws IOException {
        String str;
        if (t(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        Context context = this.a;
        File fileA = new ecfc(context).a(uri);
        if (!dqyw.h(context)) {
            synchronized (this.d) {
                if (this.e == null) {
                    this.e = ecez.a(context).getAbsolutePath();
                }
                str = this.e;
            }
            if (!fileA.getAbsolutePath().startsWith(str)) {
                throw new ecfr("Cannot access credential-protected data from direct boot");
            }
        }
        return fileA;
    }

    @Override // defpackage.echp, defpackage.echo
    public final InputStream e(Uri uri) throws ecfr {
        if (!t(uri)) {
            return this.b.e(q(uri));
        }
        s();
        return this.c.e(uri);
    }

    @Override // defpackage.echo
    public final String i() {
        return "android";
    }

    @Override // defpackage.echp, defpackage.echo
    public final boolean n(Uri uri) throws ecfr {
        if (!t(uri)) {
            return this.b.n(q(uri));
        }
        s();
        return this.c.n(uri);
    }

    @Override // defpackage.echp
    protected final Uri p(Uri uri) throws ecge {
        try {
            Context context = this.a;
            Pattern pattern = ecfb.a;
            ecfa ecfaVar = new ecfa(context);
            ecfaVar.b(uri.getPath());
            return ecfaVar.a();
        } catch (IllegalArgumentException e) {
            throw new ecge(e);
        }
    }

    @Override // defpackage.echp
    protected final Uri q(Uri uri) throws ecge {
        if (t(uri)) {
            throw new ecge("Operation across authorities is not allowed.");
        }
        File fileD = d(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ecfk.b(fileD, builderPath);
        return ecfk.a(builderPath, ekfwVar);
    }

    @Override // defpackage.echp
    protected final echo r() {
        return this.b;
    }
}
