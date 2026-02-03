package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eych implements eycg {
    @Override // defpackage.eycg
    public final HttpURLConnection a(String str) {
        return (HttpURLConnection) new URL(str).openConnection();
    }
}
