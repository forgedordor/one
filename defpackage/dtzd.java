package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtzd extends dtzm {
    public ejwi a = ejud.a;
    private Uri b;
    private String c;
    private dtzl d;
    private int e;
    private ekgb f;
    private evqe g;
    private byte h;

    @Override // defpackage.dtzm
    public final dtzn a() {
        Uri uri;
        String str;
        dtzl dtzlVar;
        ekgb ekgbVar;
        evqe evqeVar;
        if (this.h == 1 && (uri = this.b) != null && (str = this.c) != null && (dtzlVar = this.d) != null && (ekgbVar = this.f) != null && (evqeVar = this.g) != null) {
            return new dtze(uri, str, dtzlVar, this.e, ekgbVar, this.a, evqeVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" fileUri");
        }
        if (this.c == null) {
            sb.append(" urlToDownload");
        }
        if (this.d == null) {
            sb.append(" downloadConstraints");
        }
        if (this.h == 0) {
            sb.append(" trafficTag");
        }
        if (this.f == null) {
            sb.append(" extraHttpHeaders");
        }
        if (this.g == null) {
            sb.append(" customDownloaderMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dtzm
    public final ejwi b() {
        return this.a;
    }

    @Override // defpackage.dtzm
    public final String c() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"urlToDownload\" has not been set");
    }

    @Override // defpackage.dtzm
    public final void d(evqe evqeVar) {
        if (evqeVar == null) {
            throw new NullPointerException("Null customDownloaderMetadata");
        }
        this.g = evqeVar;
    }

    @Override // defpackage.dtzm
    public final void e(dtzl dtzlVar) {
        if (dtzlVar == null) {
            throw new NullPointerException("Null downloadConstraints");
        }
        this.d = dtzlVar;
    }

    @Override // defpackage.dtzm
    public final void f(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null extraHttpHeaders");
        }
        this.f = ekgbVar;
    }

    @Override // defpackage.dtzm
    public final void g(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null fileUri");
        }
        this.b = uri;
    }

    @Override // defpackage.dtzm
    public final void h(int i) {
        this.e = i;
        this.h = (byte) 1;
    }

    @Override // defpackage.dtzm
    public final void i(String str) {
        if (str == null) {
            throw new NullPointerException("Null urlToDownload");
        }
        this.c = str;
    }
}
