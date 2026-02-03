package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.function.Supplier;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abde implements eycg {
    private final aghv a;

    public abde(aghv aghvVar) {
        this.a = aghvVar;
    }

    @Override // defpackage.eycg
    public final HttpURLConnection a(String str) {
        return (HttpURLConnection) ((CronetEngine) this.a.a().orElseThrow(new Supplier() { // from class: abdd
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IOException("Unable to load cronet engine.");
            }
        })).openConnection(new URL(str));
    }
}
