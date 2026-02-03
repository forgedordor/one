package defpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyck implements eycc {
    private final eycg a;
    private final Executor b;

    public eyck(eycg eycgVar, Executor executor) {
        this.a = eycgVar;
        this.b = executor;
    }

    @Override // defpackage.eycc
    public final eycv a(String str, String str2, eyce eyceVar, eycb eycbVar) {
        try {
            return new eycj(this.a.a(str), str2, eyceVar, eycbVar, this.b);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Url is malformed.", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Http connection could not be created.", e2);
        }
    }

    public eyck() {
        this(new eych(), null);
    }
}
