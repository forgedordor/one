package defpackage;

import android.net.Uri;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atmu extends dqye {
    public atmu() {
        super("file_processing");
    }

    @Override // defpackage.dqye
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final atmt b() {
        ah();
        return new atmt(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(aubx aubxVar) {
        if (aubxVar == null) {
            this.a.putNull("content_type");
        } else {
            this.a.put("content_type", aubxVar.toByteArray());
        }
    }

    public final void d(eyfn eyfnVar) {
        if (eyfnVar == null) {
            this.a.putNull("encryption_metadata");
        } else {
            this.a.put("encryption_metadata", eyfnVar.toByteArray());
        }
    }

    public final void e(Uri uri) {
        if (uri == null) {
            this.a.putNull("file_uri");
        } else {
            this.a.put("file_uri", uri.toString());
        }
    }

    public final void f(epwc epwcVar) {
        int iIntValue = atmx.c().intValue();
        int iIntValue2 = atmx.c().intValue();
        if (iIntValue2 < 60700) {
            dqru.x("mls_file_metadata", iIntValue2);
        }
        if (iIntValue >= 60700) {
            if (epwcVar == null) {
                this.a.putNull("mls_file_metadata");
            } else {
                this.a.put("mls_file_metadata", epwcVar.toByteArray());
            }
        }
    }

    public final void g(String str) {
        dqru.v(this.a, "transfer_handle", str);
    }

    public final void h(aucj aucjVar) {
        if (aucjVar == null) {
            this.a.putNull("upload_result");
        } else {
            this.a.put("upload_result", aucjVar.toByteArray());
        }
    }

    public final void i(Function function) {
        String[] strArr = atmx.a;
        af(new atmv((atmw) function.apply(new atmw())));
    }
}
