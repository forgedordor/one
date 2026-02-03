package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class echz extends ecji {
    public eclb a;
    private Uri b;
    private evuh c;
    private ejwi d = ejud.a;
    private ekfw e;
    private ekgb f;
    private boolean g;
    private byte h;

    @Override // defpackage.ecji
    public final ecjj a() {
        Uri uri;
        evuh evuhVar;
        eclb eclbVar;
        ekfw ekfwVar = this.e;
        if (ekfwVar != null) {
            this.f = ekfwVar.g();
        } else if (this.f == null) {
            int i = ekgb.d;
            this.f = ekoe.a;
        }
        if (this.h == 3 && (uri = this.b) != null && (evuhVar = this.c) != null && (eclbVar = this.a) != null) {
            return new ecia(uri, evuhVar, this.d, this.f, eclbVar, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" uri");
        }
        if (this.c == null) {
            sb.append(" schema");
        }
        if (this.a == null) {
            sb.append(" variantConfig");
        }
        if ((this.h & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.h & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ecji
    public final ekfw b() {
        if (this.e == null) {
            if (this.f == null) {
                int i = ekgb.d;
                this.e = new ekfw();
            } else {
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                this.e = ekfwVar;
                ekfwVar.j(this.f);
                this.f = null;
            }
        }
        return this.e;
    }

    @Override // defpackage.ecji
    public final void c() {
        this.h = (byte) (this.h | 2);
    }

    @Override // defpackage.ecji
    public final void d(ecic ecicVar) {
        this.d = ejwi.j(ecicVar);
    }

    @Override // defpackage.ecji
    public final void e(evuh evuhVar) {
        if (evuhVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.c = evuhVar;
    }

    @Override // defpackage.ecji
    public final void f(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.b = uri;
    }

    @Override // defpackage.ecji
    public final void g(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 1);
    }
}
