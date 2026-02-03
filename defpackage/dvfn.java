package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvfn {
    public final ecev a;
    private final Executor b;

    public dvfn(Executor executor, ecev ecevVar) {
        this.b = executor;
        this.a = ecevVar;
    }

    public final ListenableFuture a(dvfh dvfhVar, int i) {
        final Uri uri = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Uri.parse(dvfhVar.g) : Uri.parse(dvfhVar.f) : Uri.parse(dvfhVar.e) : Uri.parse(dvfhVar.d) : Uri.parse(dvfhVar.c) : Uri.parse(dvfhVar.b);
        return eork.n(new eooy() { // from class: dvfm
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return eork.i((InputStream) this.a.a.c(uri, new echh()));
            }
        }, this.b);
    }
}
