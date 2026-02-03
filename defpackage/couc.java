package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.OptionalLong;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class couc extends cour {
    private Uri c;
    private Optional a = Optional.empty();
    private Optional b = Optional.empty();
    private Optional d = Optional.empty();
    private OptionalLong e = OptionalLong.empty();
    private Optional f = Optional.empty();
    private Optional g = Optional.empty();

    @Override // defpackage.cour
    public final cous a() {
        if (this.c != null) {
            return new coud(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        throw new IllegalStateException("Missing required properties: contentUri");
    }

    @Override // defpackage.cour
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.cour
    public final void c(Duration duration) {
        this.a = Optional.ofNullable(duration);
    }

    @Override // defpackage.cour
    public final void d(ContentType contentType) {
        this.b = Optional.ofNullable(contentType);
    }

    @Override // defpackage.cour
    public final void e(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null contentUri");
        }
        this.c = uri;
    }

    @Override // defpackage.cour
    public final void f(String str) {
        this.d = Optional.ofNullable(str);
    }

    @Override // defpackage.cour
    public final void g(long j) {
        this.e = OptionalLong.of(j);
    }

    @Override // defpackage.cour
    public final void h(ContentType contentType) {
        this.f = Optional.of(contentType);
    }

    @Override // defpackage.cour
    public final void i(evqs evqsVar) {
        this.g = Optional.of(evqsVar);
    }
}
