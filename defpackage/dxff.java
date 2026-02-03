package defpackage;

import android.net.TrafficStats;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxff implements dxfe {
    private final ffeq a;

    public dxff(feyy feyyVar) {
        this.a = new ffeq(feyyVar);
    }

    @Override // defpackage.dxfe
    public final HttpURLConnection a(String str) {
        return this.a.c(new URL(str));
    }

    @Override // defpackage.dxfe
    public final /* synthetic */ void b() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // defpackage.dxfe
    public final /* synthetic */ void c() {
        TrafficStats.clearThreadStatsUid();
    }

    @Override // defpackage.dxfe
    public final /* synthetic */ void d(HttpURLConnection httpURLConnection, int i) {
        TrafficStats.setThreadStatsTag(i);
    }

    @Override // defpackage.dxfe
    public final /* synthetic */ void e() {
    }
}
