package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfpo implements amsv {
    final /* synthetic */ FileInformation a;
    public final /* synthetic */ FileInformation b;

    public cfpo(FileInformation fileInformation, FileInformation fileInformation2) {
        this.a = fileInformation;
        this.b = fileInformation2;
    }

    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.amvr
    public final String b() {
        return h().toString();
    }

    @Override // defpackage.amsv
    public final Uri c() {
        return null;
    }

    @Override // defpackage.amsv
    public final Uri e() {
        return Uri.parse(this.a.i());
    }

    @Override // defpackage.amsv
    public final amyb fm() {
        return null;
    }

    @Override // defpackage.amsv
    public final /* synthetic */ athh fn() {
        return null;
    }

    @Override // defpackage.amsv
    public final /* synthetic */ boolean fr() {
        return amsu.a(this);
    }

    public final Uri g() {
        Uri uri;
        FileInformation fileInformation = this.b;
        if (fileInformation != null && (uri = Uri.parse(fileInformation.i())) != null) {
            return uri;
        }
        Uri uri2 = Uri.EMPTY;
        uri2.getClass();
        return uri2;
    }

    public final ContentType h() {
        return cqmr.c(this.a.b());
    }

    public final Instant i() {
        return this.a.d();
    }

    public final String j() {
        return (String) this.a.h().orElse("");
    }
}
