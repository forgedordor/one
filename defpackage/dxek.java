package defpackage;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxek implements dxfe {
    private final dxej a;

    public dxek(dxej dxejVar) {
        this.a = dxejVar;
    }

    @Override // defpackage.dxfe
    public final HttpURLConnection a(String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = this.a.a.openConnection(new URL(str));
        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
            return (HttpURLConnection) uRLConnectionOpenConnection;
        }
        throw new IOException("Cronet connection is not an HttpURLConnection");
    }

    @Override // defpackage.dxfe
    public final void d(HttpURLConnection httpURLConnection, int i) {
        if (httpURLConnection instanceof fghh) {
            ((fghh) httpURLConnection).b(i);
        } else {
            TrafficStats.setThreadStatsTag(i);
        }
    }

    @Override // defpackage.dxfe
    public final void b() {
    }

    @Override // defpackage.dxfe
    public final void c() {
    }

    @Override // defpackage.dxfe
    public final /* synthetic */ void e() {
    }
}
